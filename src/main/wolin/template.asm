//============================================
// Virtual asm pattern mattching. First matching pattern wins!
//============================================


//============================================
// funkcje startowe
//============================================

setup HEADER -> """
;**********************************************
;*
;* BASIC header
;*
;* compile with:
;* cl65.exe -o assembler.prg -t c64 -C c64-asm.cfg assembler.s
;*
;**********************************************
            .org 2049
            .export LOADADDR = *
Bas10:      .word BasEnd
            .word 10
            .byte 158 ; sys
            .byte ' 2064'
            .byte 0
BasEnd:     .word 0
            .word 0
            ;
"""

setup SPE = ?zp[ubyte], ?top[uword] -> """
; prepare exception stack
__wolin_spe = {zp} ; exception stack ptr
__wolin_spe_top = {top} ; exception stack top
    lda #<__wolin_spe_top ; set exception stack top
    sta __wolin_spe
    lda #>__wolin_spe_top
    sta __wolin_spe+1"""

setup EXPTR = ?zp[ubyte] -> """
__wolin_exception_ptr = {zp} ; pointer to exception object on throw
"""

setup CATCH =?zp[ubyte] -> """
__wolin_spe_zp_vector = {zp}
"""

setup SPF = ?zp[ubyte], ?top[uword] -> """
; prepare function stack
__wolin_spf = {zp} ; function stack ptr
__wolin_spf_top = {top} ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1"""

setup SP = ?zp[ubyte] -> """
; prepare program stack
__wolin_sp_top = {zp} ; program stack top
    ldx #__wolin_sp_top ; set program stack top"""

setup HEAP = ?zp[ubyte] -> """
__wolin_this_ptr = {zp}
"""

//============================================
// SP, stos programowy oparty na X, wspiera dużo instrukcji, do 70 wordów
//============================================

alloc ?val[byte] -> """    .byte {val}"""
alloc ?val[ubyte] -> """    .byte {val}"""
alloc ?val[word] -> """    .word {val}"""
alloc ?val[uword] -> """    .word {val}"""
alloc ?val[float] -> """    .float {val}"""
alloc ?val[bool] -> """    .byte {val}"""
alloc ?val[ptr] -> """    .word {val}"""

alloc SP, #0 -> """ """

alloc SP, #1 -> """    dex"""

alloc SP, #2 -> """
    dex
    dex"""

alloc SP, #3 -> """
    dex
    dex
    dex"""

alloc SP, #4 -> """
    dex
    dex
    dex
    dex"""

alloc SP, #?count -> """
    txa
    sec
    sbc #{count}
    tax"""

free SP, #0 -> """ """

free SP, #1 -> """    inx"""

free SP, #2 -> """
    inx
    inx"""

free SP, #3 -> """
    inx
    inx
    inx"""

free SP, #4 -> """
    inx
    inx
    inx
    inx"""

free SP, #?count -> """
    txa
    clc
    adc #{count}
    tax"""

// SP -> SP

let ?d(?dummy)[unit] = ?s(?dummy2)[unit] -> """ """

let SP(?d)[uword] = SP(?s)[uword] -> """
    lda {s},x
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x"""

let SP(?d)[word] = SP(?s)[word] -> """
    lda {s},x
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x"""

let SP(?d)[uword] = SP(?s)[uword] -> """
    lda {s},x
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x"""


let SP(?d)[byte] = SP(?s)[byte] -> """
    lda {s},x
    sta {d},x"""

let SP(?d)[ubyte] = SP(?s)[ubyte] -> """
    lda {s},x
    sta {d},x"""

// # -> SP

let SP(?d)[bool] = #1[bool] -> """
    lda #1
    sta{d},x"""

let SP(?d)[bool] = #0[bool] -> """
    lda #0
    sta{d},x"""

let SP(?d)[bool] = ?addr[bool] -> """
    lda {addr}
    sta {d},x"""

let ?addr[bool] = SP(?s)[bool] -> """
    lda {s},x
    sta {addr}"""


let SP(?d)[byte] = #?val[byte] -> """
    lda #{val}
    sta {d},x"""

let SP(?d)[ubyte] = #?val[ubyte] -> """
    lda #{val}
    sta {d},x"""

let SP(?d)[uword] = #?val[ubyte] -> """
    lda #{val}
    sta {d},x
    lda #0
    sta {d}+1,x"""

let SP(?d)[word] = #?val[word] -> """
    lda #<{val}
    sta {d},x
    lda #>{val}
    sta {d}+1,x"""

let SP(?d)[uword] = #?val[uword] -> """
    lda #<{val}
    sta {d},x
    lda #>{val}
    sta {d}+1,x"""

let SP(?d)[word] = #?s[ubyte] -> """
    lda #{s}
    sta {d},x
    lda #0
    sta {d}+1,x"""

// adr -> SP

let SP(?d)[word] = ?label[word] -> """
    lda #<{label}
    sta {d},x
    lda #>{label}
    sta {d}+1,x"""

let SP(?d)[uword] = ?label[uword] -> """
    lda #<{label}
    sta {d},x
    lda #>{label}
    sta {d}+1,x"""

let SP(?d)[ubyte] = ?addr[ubyte] -> """
    lda {addr}
    sta {d},x"""

// SP -> adr

let ?label[ubyte] = SP(?s)[ubyte] -> """
    lda {s},x
    sta {label}
"""

let ?label[word] = SP(?s)[word] -> """
    lda {s},x
    sta {label}
    lda {s}+1,x
    sta {label}+1
"""

let ?label[uword] = SP(?s)[uword] -> """
    lda {s},x
    sta {label}
    lda {s}+1,x
    sta {label}+1
"""

// TODO zamienić arg na adres
let SP(?d)[float] = ?label[float] -> """
    lda {label}
    sta {d},x
    lda {label}+1
    sta {d}+1,x
    lda {label}+2
    sta {d}+2,x
    lda {label}+3
    sta {d}+3,x
    lda {label}+4
    sta {d}+4,x
"""

let ?label[float] = SP(?s)[float] -> """
    lda {s},x
    sta {label}
    lda {s}+1,x
    sta {label}+1
    lda {s}+2,x
    sta {label}+2
    lda {s}+3,x
    sta {label}+3
    lda {s}+4,x
    sta {label}+4
"""

//============================================
// SP - zmienna
//============================================

let ?dest[uword] = SP(?src)[ubyte] -> """
    lda {src},x
    sta {dest}
    lda #0
    sta {dest}+1
"""

//============================================
// SPF, stos procedurowy, przy wejściu do procedur, oparty na Y
//============================================

alloc SPF, #0 -> """ """

alloc SPF, #?count -> """
    clc
    lda __wolin_spf
    sbc #{count}
    sta __wolin_spf
    lda __wolin_spf+1
    sbc #0
    sta __wolin_spf+1"""

free SPF, #0 -> """ """

free SPF, #?count -> """
    clc
    lda __wolin_spf
    adc #{count}
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1"""


let SPF(?d)[uword] = #?val[uword] -> """
    ldy #{d}
    lda #<{val}
    sta (__wolin_spf),y
    iny
    lda #>{val}
    sta (__wolin_spf),y"""

// TYLKO dla konstuktora?
let SPF(?d)[ptr] = SP(?s)[uword] -> """
    ldy #{d}
    lda {s},x
    sta (__wolin_spf),y
    iny
    lda {s}+1,x
    sta (__wolin_spf),y"""

// dla wywołania funkcji
let SPF(?d)[byte] = SP(?s)[byte] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y"""

// dla wywołania funkcji
let SPF(?d)[ubyte] = SP(?s)[ubyte] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y"""

// dla wywołania funkcji
let SPF(?d)[word] = SP(?s)[word] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y
    lda {s}+1,x
    iny
    sta (__wolin_spf),y"""

// dla wywołania funkcji
let SPF(?d)[uword] = SP(?s)[uword] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y
    lda {s}+1,x
    iny
    sta (__wolin_spf),y"""

// przy powrocie z funkcji, wartość zwrotna stos funkcji -> stos programowy
let SP(?dest)[byte] = SPF(?src)[byte] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
"""

let SP(?dest)[ubyte] = SPF(?src)[ubyte] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
"""


// przy powrocie z funkcji, wartość zwrotna stos funkcji -> stos programowy
let SP(?dest)[word] = SPF(?src)[word] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
    iny
    lda (__wolin_spf),y
    sta {dest}+1,x
"""

// przy powrocie z funkcji, wartość zwrotna stos funkcji -> stos programowy
let SP(?dest)[uword] = SPF(?src)[uword] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
    iny
    lda (__wolin_spf),y
    sta {dest}+1,x
"""



//============================================
// SPE, stos wyjątków, oparty na Y
//============================================

alloc SPE, #0 -> """ """

alloc SPE, #?count -> """
    clc
    lda __wolin_spe
    sbc #{count}
    sta __wolin_spe
    lda __wolin_spe+1
    sbc #0
    sta __wolin_spe+1"""

free SPE, #0 -> """ """

free SPE, #?count -> """
    clc
    lda __wolin_spe
    adc #{count}
    sta __wolin_spe
    lda __wolin_spe+1
    adc #0
    sta __wolin_spe+1"""



// wkaźnik stosu 6502 -> zapis w SPE
let SPE(?d)[ubyte] = SPC[ubyte] -> """
    txa
    pha
    tsx
    txa
    ldy #{d}
    sta (__wolin_spe),y
    pla
    tax
  """

// zapisany w SPE wskaźnik stosu 6502 -> wskaźnik stosu 6502
let SPC[ubyte] = SPE(?s)[ubyte] -> """
    txa
    pha
    ldy #{s}
    lda (__wolin_spe),y
    tax
    txs
    pla
    tax"""

// wskaźnik stosu SP -> SPE
let SPE(?d)[ubyte] = SP[ubyte] -> """
    ldy #{d}
    stx (__wolin_spe),y"""

// zapisany w SPE wskaźnik SP -> wskaźnik SP
let SP[ubyte] = SPE(?s)[ubyte] -> """
    ldy #{s}
    ldx (__wolin_spe),y"""

// np. adres końca catch -> SPE
let SPE(?d)[uword] = SP(?s)[uword] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spe),y
    lda {s}+1,x
    iny
    sta (__wolin_spe),y"""

// SPE -> wektor skoku dla catch
let ?addr[uword] = SPE(?s)[uword] -> """
    ldy #{s}
    lda (__wolin_spe),y
    sta {addr}
    iny
    lda (__wolin_spe),y
    sta {addr}+1"""

//============================================
// Sterta
//============================================
setup HEAP = this -> """
    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1"""

let SP(?dest)[ubyte] = HEAP(?src)[ubyte] -> """
    ldy #{src} ; assuming this ZP is set!
    lda (__wolin_this_ptr),y
    sta {dest},x"""



//============================================
// kondiszjonalsy
//============================================

bne SPE = ?value, ?dest -> """
    lda __wolin_spe
    cmp #<{value}
    bne {dest}
    lda __wolin_spe+1
    cmp #>{value}
    bne {dest}"""

bne SP(?s)[bool] = #1[bool], ?dest[adr] -> """
    lda {s},x
    beq {dest}"""

beq SP(?s)[bool] = #1[bool], ?dest[adr] -> """
    lda {s},x
    bne {dest}"""

bne SP(?s)[bool] = #0[bool], ?dest[adr] -> """
    lda {s},x
    bne {dest}"""

beq SP(?s)[bool] = #0[bool], ?dest[adr] -> """
    lda {s},x
    beq {dest}"""


evaleq SP(?dest)[bool] = SP(?left)[ubyte], SP(?right)[ubyte] -> """
    lda #1 ; rowne
    sta {dest},x
    lda {left},x
    cmp {right},x
    beq +:
    lda #0 ; jednak rozne
    sta {dest},x
:"""

evaleq SP(?dest)[bool] = SP(?left)[uword], SP(?right)[uword] -> """
    lda #0 ; rozne
    sta {dest},x
    lda {left},x
    cmp {right},x
    bne +:
    lda {left}+1
    cmp {right}+1
    bne +:
    lda #1
    sta {dest},x
:"""

evaleq SP(?dest)[bool] = SP(?left)[uword], SP(?right)[ubyte] -> """
    lda #0 ; rozne
    sta {dest},x
    lda {left}+1,x
    bne :+
    lda {left},x
    cmp {right},x
    bne :+
    lda #1 ; rowne
    sta {dest},x
:"""

evalless SP(?dest)[bool] = SP(?left)[ubyte], SP(?right)[ubyte] -> """
    lda #1 ; mniejsze
    sta {dest},x
    lda {left},x
    cmp {right},x
    bcc :+
    lda #0 ; jednak wieksze
    sta {dest},x
:"""

evalgteq SP(?dest)[bool] = SP(?left)[ubyte], SP(?right)[ubyte] -> """
    lda #1 ; wieksze badz rowne
    sta {dest},x
    lda {left},x
    cmp {right},x
    bcs :+
    lda #0 ; jednak mniejsze
    sta {dest},x
:"""

//============================================
// Wskaźniki
//============================================

// tablice z 8-bitowym indeksem
//let SP(2)<__wolin_reg2>[ubyte] = 4096(0)[ptr]
// znaczy:
// - indeks znajduje się w SP0
// - pobierz dane z arrStart,SP0
// - zapisz je w SP2
let SP(?dstSP)[ubyte] = ?arrStart[ptr], SP(?srcSP)[ubyte] -> """
    ldy {srcSP},x
    lda {arrStart},y
    sta {dstSP},x"""

// kiedy juz optymizator bedzie dzialac, to powyzsze bedzie wygladac tak:
let ?dstVar[ubyte] = ?arrStart[ptr], #?idx -> """
    ldy #{idx}
    lda {arrStart},y
    sta {dstVar}"""

//let SP(?dstSP)[ptr] = #?val[ubyte]

// let SP(2)<r.temp6>[ptr] = SP(0)<r.temp7>[word] // powinno znaczyć: ustaw zmienną pod adresem znajdującym się w SP(2) na wartość
// czyli powinniśmy:
// lda #mlodszy
// ldy #0
// sta (miejsce na stosie),y
// lda #starszy
// iny
// sta (miejsce na stosie),y

//let ?adr[ptr] = #?val[uword] -> """
//    lda #<{val}
//    sta {adr}
//    lda #>{val}
//    sta {adr}+1"""

// wartosc na opStacku = wartosc pobrana z pointera
// na 65816 jest tryb
// lda (0,x)
// sta 0,x
let SP(?dst)[ubyte] = SP(?src)[ptr] -> """
    lda ({src},x)
    sta {dst},x"""

// zmienna pod adresem dst = wartość
let SP(?dst)[ptr] = SP(?src)[ubyte] -> """
    lda {src},x
    sta ({dst},x)
"""

// zmienna pod adresem dst = wartość
let SP(?dst)[ptr] = SP(?src)[uword] -> """
    lda {src},x
    sta ({dst},x)
    inc {dst},x
    bne :+
    inc {dst}+1,x
:
    lda {src}+1,x
    sta ({dst},x)
"""


let SP(?dst)[uword] = SP(?src)[ptr] -> """
    lda ({src},x)
    sta {dst},x
    inc {src},x
    bne :+
    inc {src}+1,x
:
    lda ({src},x)
    sta {dst}+1,x"""

let SP(?src)[uword] = SP(?src)[ptr] -> """
    ; don't know how to address this:
    ; SP[uword] = SP[ptr] when src==dst
"""

let SP(?dst)[ubyte] = SP(?src)[ptr] -> """
    lda ({src},x)
    sta {dst},x"""

// do arytmetyki wskaznikow
let SP(?dst)[uword] = ?src[ptr] -> """
    lda #<{src}
    sta {dst},x
    lda #>{src}
    sta {dst}+1,x"""

let SP(?dst)[ptr] = SPF(?src)[ptr] -> """
     ldy #{src}
     lda (__wolin_spf),y
     sta {dst},x
     iny
     lda (__wolin_spf),y
     sta {dst}+1,x"""

let SPF(?dst)[ptr] = SP(?src)[ptr] -> """
    ldy #{dst}
    lda {src},x
    sta (__wolin_spf),y
    iny
    lda {src}+1,x
    sta (__wolin_spf),y"""

// pointer pod adresem = inny pointer pod adresem
let ?adr[ptr] = ?adr2[ptr] -> """
    lda {adr2}
    sta {adr}
    lda {adr+1}
    sta {adr2+1}
"""

// pointer na stosie = inny pointer na stosie
let SP(?d)[ptr] = SP(?s)[ptr] -> """
    lda {s},x
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x
"""



let SP(?d)[ptr] = SP(?s)[ptr] -> """
    lda {s},x
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x"""

let ?d[ptr] = SP(?s)[ptr] -> """
    lda {s},x
    sta {d}
    lda {s}+1,x
    sta {d}+1"""

let SP(?d)[ptr] = ?s[adr] -> """
    lda #<{s}
    sta {d},x
    lda #>{s}
    sta {d}+1,x"""

// dowolny adres na null
let ?adr[ptr] = #0[?dummy] -> """
    lda #0
    sta {adr}
    sta {adr}+1"""

let ?dst[ptr] = SP(?src)[ptr] -> """
    lda {src},x
    sta {dst}
    lda {src}+1,x
    sta {dst}+1 """

let SP(?dst)[ptr] = ?adr[ptr] -> """
    lda #<{adr}
    sta {dst},x
    lda #>{adr}
    sta {dst}+1,x"""


//============================================
// rozmaite funkcje
//============================================

string ?label[uword] = ?val[?dummy] -> """
{label}:
    .str {val}
"""

float ?label[uword] = ?val[?dummy] -> """
{label}:
    .fvp {val}
"""

ret -> """    rts"""

call ?a[adr] -> """    jsr {a}"""

call ?a[ptr] -> """
    lda {a}
    sta __wolin_indirect_jsr+1
    lda {a}+1
    sta __wolin_indirect_jsr+2
    jsr __wolin_indirect_jsr"""

goto ?a[adr] -> """    jmp {a}"""

goto ?a[ptr] -> """    jmp ({a})"""

crash -> """    brk"""

label ?a = ?b -> """{a} = {b}"""

label ?a -> """{a}:"""

throw ?exception[uword] -> """
    lda #<{exception}
    sta __wolin_exception_ptr
    lda #>{exception}
    sta __wolin_exception_ptr+1
    jmp __wolin_throw_exception

"""

throw SP(?s)[uword] -> """
    lda {s},x
    sta __wolin_exception_ptr
    lda {s}+1,x
    sta __wolin_exception_ptr+1
    jmp __wolin_throw_exception

"""


//============================================
// CPU
//============================================

let SP(?dest)[bool] = CPU.Z[bool] -> """
    lda #1
    sta {dest},x
    beq :+
    lda #0
    sta {dest},x
:
"""

let CPU.I[bool] = SP(?dest)[bool] -> """
    lda {dest},x
    bne :+      ; dest != 0? goto skip
    cli         ; dest == 0? I = 0
    jmp :++
:   sei         ; I = 1
:
"""

let CPU.I[bool] = #1[bool] -> """
    sei
"""

let CPU.I[bool] = #0[bool] -> """
    cli
"""

let CPU.A[ubyte] = SP(?s)[ubyte] -> """
    lda {s},x
"""

let CPU.X[ubyte] = SP(?s)[ubyte] -> """
    lda {s},x
    tax
"""

let CPU.Y[ubyte] = SP(?s)[ubyte] -> """
    lda {s},x
    tay
"""

callasm CPU.A[ubyte] = #?v[ubyte] -> """
    lda #{v}
    sta __kotlin_call_stub :+ 1
"""

callasm CPU.X[ubyte] = #?v[ubyte] -> """
    lda #{v}
    sta __kotlin_call_stub :+ 3
"""

callasm CPU.Y[ubyte] = #?v[ubyte] -> """
    lda #{v}
    sta __kotlin_call_stub :+ 5
"""

callasm CPU.XY[adr] = ?v[adr] -> """
    lda #<{v}
    sta __kotlin_call_stub :+ 3
    lda #>{v}
    sta __kotlin_call_stub :+ 5
"""

callasm ?adr[adr] -> """
    txa
    pha
    lda #<{adr}
    sta __kotlin_call_stub :+ 7
    lda #>{adr}
    sta __kotlin_call_stub :+ 8
    jsr __kotlin_call_stub
    pla
    tax
"""

save CPU.X -> """
    txa
    pha"""

restore CPU.X -> """
    pla
    tax"""

save CPU.Y -> """
    tya
    pha"""

restore CPU.Y -> """
    pla
    tay"""

save CPU.A -> """
    pha"""

restore CPU.A -> """
    pla"""

//============================================
// arytmetyka
//============================================

or SP(?d)[bool] = SP(?d)[bool], SP(?s)[bool] -> """
    lda {s},x
    beq :+
    sta {d},x
:
"""

and SP(?d)[bool] = SP(?d)[bool], SP(?s)[bool] -> """
    lda {s},x
    bne :+
    sta {d},x
:
"""

mul SP(?d)[ubyte] = SP(?d)[ubyte], #1 -> """ """

mul SP(?d)[uword] = SP(?d)[uword], #2 -> """   asl {d},x"""

mul SP(?d)[uword] = SP(?d)[uword], #1 -> """ """

div SP(?d)[ubyte] = SP(?d)[ubyte], #1 -> """ """

div SP(?d)[ubyte] = SP(?d)[ubyte], #2 -> """   lsr {d},x"""

div SP(?d)[ubyte] = SP(?d)[ubyte], #4 -> """
    lsr {d},x
    lsr {d},x"""

div SP(?d)[ubyte] = SP(?d)[ubyte], #8 -> """
    lsr {d},x
    lsr {d},x
    lsr {d},x"""
// itd dla ze znakiem jest inny lsr/asl

div SP(?d)[word] = SP(?dzielna)[word],SP(?dzielnik)[word] -> """  jsr stack_div"""

add ?dest[ubyte] = ?dest[ubyte], #1[byte] -> """
    inc {dest}"""

sub ?dest[ubyte] = ?dest[ubyte], #1[byte] -> """
    dec {dest}"""

add ?dest[ubyte] = ?src[ubyte], #?val[byte] -> """
    clc
    lda {src}
    adc #{val}
    sta {dest}"""

add ?dest[byte] = ?src[byte], #?val[byte] -> """
    clc
    lda {src}
    adc #{val}
    sta {dest}"""

add ?dest[uword] = ?src[uword], #?val[uword] -> """
    clc
    lda {src}
    adc #<{val}
    sta {dest}
    lda {src}+1
    adc #>{val}
    sta {dest}+1
"""

sub ?dest[uword] = ?src[uword], #?val[uword] -> """
    sec
    lda {src}
    sbc #<{val}
    sta {dest}
    lda {src}+1
    sbc #>{val}
    sta {dest}+1
"""



add ?dest[word] = ?src[word], #?val[byte] -> """
    clc
    lda {src}
    adc #{val}
    sta {dest}
    lda {src}+1
    adc #0
    sta {dest}+1"""

add ?dest[word] = ?a[word], ?b[uword] -> """
    clc
    lda {a}
    adc {b}
    sta {dest}
    lda {a}+1
    adc {b}+1
    sta {dest}+1"""

add SP(?d)[ubyte] = SP(?s1)[ubyte], SP(?s2)[ubyte] -> """
    clc
    lda {s1},x
    adc {s2},x
    sta {d},x"""

add SP(?d)[word] = SP(?s1)[word], SP(?s2)[word] -> """
    clc
    lda {s1},x
    adc {s2},x
    sta {d},x
    lda {s1}+1,x
    adc {s2}+1,x
    sta {d}+1,x"""

add SP(?d)[uword] = SP(?s1)[uword], SP(?s2)[uword] -> """
    clc
    lda {s1},x
    adc {s2},x
    sta {d},x
    lda {s1}+1,x
    adc {s2}+1,x
    sta {d}+1,x"""

add SP(?d)[ptr] = SP(?s1)[ptr],SP(?s2)[uword] -> """
    clc
    lda {s1},x
    adc {s2},x
    sta {d},x
    lda {s1}+1,x
    adc {s2}+1,x
    sta {d}+1,x"""

add SPE(?spesrc)[ubyte] = SPE(?spesrc)[ubyte],#?val[ubyte] -> """
    clc
    ldy #{spesrc}
    lda (__wolin_spe),y
    adc #{val}
    sta (__wolin_spe),y
"""

add SPE(?spedst)[ubyte] = SPE(?spesrc)[ubyte],#?val[ubyte] -> """
    clc
    ldy #{spesrc}
    lda (__wolin_spe),y
    adc #{val}
    ldy #{spedst}
    sta (__wolin_spe),y
"""
