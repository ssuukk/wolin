//============================================
// Virtual asm pattern mattching. First matching pattern wins!
//============================================
/*

byte:
=====
value from memory:
lda src

value on SP(src):
lda src,x

value pointed by variable on SP(src):
lda (src,x)

value on other stacks Sx(src):
lda (pointer_to_Sx_on_ZP),y<-src


word:
=====
value from memory:
lda src
lda src+1

value on SP(src):
lda src,x
lda src+1,x

value pointed by variable on SP(src):
	lda (src,x)
    inc {src},x
    bne :+
    inc {src}+1,x
:
    lda (src,x)

value on other stacks Sx(src):
lda (pointer_to_Sx_on_ZP),y<-src
iny
lda (pointer_to_Sx_on_ZP),y

*/

//============================================
// funkcje startowe
//============================================

setup HEADER -> """
;**********************************************
;*
;* BASIC header
;*
;* compile with:
;* cl65.exe -o assembler.prg -t c64 -C c64-asm.cfg -g -Ln labels.txt assembler.s
;*
;**********************************************
            .org 2049
            .export LOADADDR = *
Bas10:      .word BasEnd
            .word 10
            .byte 158 ; sys
            .byte " 2064"
            .byte 0
BasEnd:     .word 0
            .word 0
            ;
"""



setup SPE = ?zp[ubyte], ?top[uword] -> """
; prepare exception stack
__wolin_spe := {zp} ; exception stack ptr
__wolin_spe_hi := {zp}+1 ; exception stack ptr



__wolin_spe_top := {top} ; exception stack top
__wolin_spe_top_hi := {top}+1 ; exception stack top
    lda #<__wolin_spe_top ; set exception stack top
    sta __wolin_spe
    lda #>__wolin_spe_top
    sta __wolin_spe+1"""



setup EXPTR = ?zp[ubyte] -> """
__wolin_exception_ptr := {zp} ; pointer to exception object on throw
__wolin_exception_ptr_hi := {zp}+1 ; pointer to exception object on throw
"""



setup CATCH = ?zp[ubyte] -> """
__wolin_spe_zp_vector := {zp}
__wolin_spe_zp_vector_hi := {zp}+1
"""



setup SPF = ?zp[ubyte], ?top[uword] -> """
; prepare function stack
__wolin_spf := {zp} ; function stack ptr
__wolin_spf_hi := {zp}+1 ; function stack ptr

__wolin_spf_top := {top} ; function stack top
__wolin_spf_top_hi := {top}+1 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1"""



setup SP = ?zp[ubyte] -> """
; prepare program stack
__wolin_sp_top := {zp} ; program stack top
__wolin_sp_top_hi := {zp}+1 ; program stack top
    ldx #__wolin_sp_top ; set program stack top"""



setup HEAP = ?zp[ubyte] -> """
__wolin_this_ptr := {zp}
__wolin_this_ptr_hi := {zp}+1
"""

//============================================
// Static variables
//============================================

alloc ?val[byte] -> """    .byte {val}"""
alloc ?val[ubyte] -> """    .byte {val}"""
alloc ?val[word] -> """    .word {val}"""
alloc ?val[uword] -> """    .word {val}"""
alloc ?val[float] -> """    .float {val}"""
alloc ?val[bool] -> """    .byte {val}"""
alloc ?val[ubyte*] -> """    .byte 1,2,3,4"""

//============================================
// SP, stos programowy oparty na X, wspiera dużo instrukcji, do 70 wordów
//============================================

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

let CPU.A[ubyte] = #?val[ubyte] -> """
    lda #{val}
"""

let ?d(?dummy)[unit] = ?s(?dummy2)[unit] -> """ """


// tablice z 8-bitowym indeksem
let SP(?dstSP)[ubyte*] = ?arrStart[ubyte*], SP(?srcSP)[ubyte] -> """
    ldy {srcSP},x
    lda {arrStart},y
    sta {dstSP},x"""

let SP(?dstSP)[ubyte*] = ?arrStart[ubyte*], ?var[ubyte] -> """
    ldy {var}
    lda {arrStart},y
    sta {dstSP},x"""

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
    sta {d},x"""

let SP(?d)[bool] = #0[bool] -> """
    lda #0
    sta {d},x"""

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


let ?dst[uword] = #?proc[uword] -> """
    lda #<{proc}
    sta {dst}
    lda #>{proc}
    sta {dst}+1
"""



let SP(?d)[word] = #?s[ubyte] -> """
    lda #{s}
    sta {d},x
    lda #0
    sta {d}+1,x"""

// adr -> SP

let SP(?d)[word] = ?label[word] -> """
    lda {label}
    sta {d},x
    lda {label}+1
    sta {d}+1,x"""

let SP(?d)[uword] = ?label[uword] -> """
    lda {label}
    sta {d},x
    lda {label}+1
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
    sec
    lda __wolin_spf
    sbc #{count}
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:"""

free SPF, #0 -> """ """

free SPF, #?count -> """
    clc
    lda __wolin_spf
    adc #{count}
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:"""

let ?dst[bool] = SPF(?src)[bool] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dst}
"""

let SPF(?d)[ubyte] = #?val[ubyte] -> """
    ldy #{d}
    lda #{val}
    sta (__wolin_spf),y"""

let SPF(?d)[uword] = #?val[uword] -> """
    ldy #{d}
    lda #<{val}
    sta (__wolin_spf),y
    iny
    lda #>{val}
    sta (__wolin_spf),y"""

// for function call
let SPF(?d)[byte] = SP(?s)[byte] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y"""

// for function call
let SPF(?d)[ubyte] = SP(?s)[ubyte] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y"""

// for function call
let SPF(?d)[word] = SP(?s)[word] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y
    lda {s}+1,x
    iny
    sta (__wolin_spf),y"""

// for function call
let SPF(?d)[uword] = SP(?s)[uword] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y
    lda {s}+1,x
    iny
    sta (__wolin_spf),y"""

// function return value from function stack to program stack
let SP(?dest)[byte] = SPF(?src)[byte] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
"""

// function return value from function stack to program stack
let SP(?dest)[ubyte] = SPF(?src)[ubyte] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
"""

// function return value from function stack to program stack
let SP(?dest)[word] = SPF(?src)[word] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
    iny
    lda (__wolin_spf),y
    sta {dest}+1,x
"""

// function return value from function stack to program stack
let SP(?dest)[uword] = SPF(?src)[uword] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dest},x
    iny
    lda (__wolin_spf),y
    sta {dest}+1,x
"""

let ?adr[ubyte] = SPF(?src)[ubyte] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {adr}
"""

let ?adr[uword] = SPF(?src)[uword] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {adr}
    iny
    lda (__wolin_spf),y
    sta {adr}+1
"""

let SPF(?dst)[uword]=?adr[uword] -> """
    lda {adr}
    ldy #{dst}
    sta (__wolin_spf),y
    iny
    lda {adr}+1
    sta (__wolin_spf),y
"""


//============================================
// SPE, exception stack, Y based
//============================================

alloc SPE, #0 -> """ """

alloc SPE, #?count -> """
    sec
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

// save 6502 SP to SPE
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

// restore 6502 SP from SPE
let SPC[ubyte] = SPE(?s)[ubyte] -> """
    txa
    pha
    ldy #{s}
    lda (__wolin_spe),y
    tax
    txs
    pla
    tax"""

// SP -> SPE
let SPE(?d)[ubyte] = SP[ubyte] -> """
    ldy #{d}
    stx (__wolin_spe),y"""

// restore SP from SPE
let SP[ubyte] = SPE(?s)[ubyte] -> """
    ldy #{s}
    ldx (__wolin_spe),y"""

// catch end address -> SPE
let SPE(?d)[uword] = SP(?s)[uword] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spe),y
    lda {s}+1,x
    iny
    sta (__wolin_spe),y"""

// SPE -> catch jump vector
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

// for setting this pointer when in method
point HEAP = this -> """
    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1"""

point HEAP = SPF(?src)[uword] -> """
    ldy #{src} ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1"""

point HEAP = SPF(?src)[any*] -> """
    ldy #{src} ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1"""

point HEAP = SP(?src)[any*] -> """
    lda {src},x
    sta __wolin_this_ptr
    lda {src}+1,x
    sta __wolin_this_ptr+1"""


let SP(?dest)[ubyte] = HEAP(?src)[ubyte] -> """
    ldy #{src} ; assuming this ZP is set!
    lda (__wolin_this_ptr),y
    sta {dest},x"""

let HEAP(?dest)[ubyte] = SP(?src)[ubyte] -> """
    lda {src},x
    ldy #{dest}
    sta (__wolin_this_ptr),y"""

let HEAP(?dest)[ubyte] = #?val[ubyte] -> """
    lda #{val}
    ldy #{dest}
    sta (__wolin_this_ptr),y"""


//============================================
// Memory
//============================================
let ?dst[uword] = #?val[ubyte] -> """
    lda #<{val}
    sta {dst}
    lda #0
    sta {dst}+1"""

let ?dst[ubyte] = #?val[ubyte] -> """
    lda #{val}
    sta {dst}"""

//============================================
// kondiszjonalsy
//============================================

// jump if catch block exists
bne SPE = ?value, ?dest[uword] -> """
    lda __wolin_spe
    cmp #<{value}
    bne {dest}
    lda __wolin_spe+1
    cmp #>{value}
    bne {dest}"""

// skocz jeśli s == 1 (bne)
bne SP(?s)[bool] = #1[bool], ?dest[uword] -> """
    lda {s},x
    beq {dest}"""

// skocz jeśli s != 1 czyli == 0 (beq))
beq SP(?s)[bool] = #1[bool], ?dest[uword] -> """
    lda {s},x
    bne {dest}"""

// skocz jeśli s == 0 (beq)
bne SP(?s)[bool] = #0[bool], ?dest[uword] -> """
    lda {s},x
    bne {dest}"""

// skocz jeśli s != 0 czyli 1 (bne)
beq SP(?s)[bool] = #0[bool], ?dest[uword] -> """
    lda {s},x
    beq {dest}"""

evalneq SP(?dest)[bool] = SPF(?left)[ubyte], #0[ubyte] -> """
    lda #1 ; rozne
    sta {dest},x
    ldy #{left}
    lda (__wolin_spf), y
    bne :+
    lda #0 ; jednak rowne
    sta {dest},x
"""

evalneq SP(?dest)[bool] = ?left[ubyte], #?right[ubyte] -> """
    lda #1 ; rozne
    sta {dest},x
    lda {left}
    cmp #{right}
    bne :+
    lda #0 ; jednak rowne
    sta {dest},x
:"""

evaleq SP(?dest)[bool] = SP(?left)[ubyte], SP(?right)[ubyte] -> """
    lda #1 ; rowne
    sta {dest},x
    lda {left},x
    cmp {right},x
    beq :+
    lda #0 ; jednak rozne
    sta {dest},x
:"""

evaleq SP(?dest)[bool] = SP(?left)[uword], SP(?right)[uword] -> """
    lda #0 ; rozne
    sta {dest},x
    lda {left},x
    cmp {right},x
    bne :+
    lda {left}+1
    cmp {right}+1
    bne :+
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
:
"""

evalless SP(?dest)[bool] = SP(?left)[ubyte], SP(?right)[ubyte] -> """
    lda #1 ; mniejsze
    sta {dest},x
    lda {left},x
    cmp {right},x
    bcc :+
    lda #0 ; jednak wieksze
    sta {dest},x
:
"""

evalless SP(?dest)[bool] = SP(?left)[ubyte], #?val[ubyte] -> """
    lda #1 ; mniejsze
    sta {dest},x
    lda {left},x
    cmp #{val}
    bcc :+
    lda #0 ; jednak wieksze
    sta {dest},x
:
"""

evalless SP(?dest)[bool] = ?left[ubyte], #?val[ubyte] -> """
    lda #1 ; mniejsze
    sta {dest},x
    lda {left}
    cmp #{val}
    bcc :+
    lda #0 ; jednak wieksze
    sta {dest},x
:
"""


evalless SP(?dest)[bool] = ?adr[uword], #?val[uword] -> """
    lda #1 ; mniejsze
    sta {dest},x
    lda {adr}+1
    cmp #>{val}
    bcc :+ ; mniejsze
    lda {adr}
    cmp #<{val}
    bcc :+ ; mniejsze
    lda #0 ; jednak wieksze
    sta {dest},x
:
"""

evalless SP(?dest)[bool] = SP(?left)[uword], SP(?right)[uword] -> """
    lda #1 ; mniejsze
    sta {dest},x
    lda {left}+1,x
    cmp {right}+1,x
    bcc :+
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
// nowe adresy
//============================================

let SP(?dst)[any*] = SPF(?src)[any*] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dst},x
    iny
    lda (__wolin_spf),y
    sta {dst}+1,x"""

bit ?dst[ubyte] = #?val[ubyte], #1[bool] -> """
    lda {dst}
    ora #{val}
    sta {dst}
"""

bit ?dst[ubyte] = #?val[ubyte], #0[bool] -> """
    lda {dst}
    and #$ff-{val}
    sta {dst}
"""

bit &SP(?dst)[ubyte*] = #?val[ubyte], #1[bool] -> """
    lda ({dst},x)
    ora #{val}
    sta ({dst},x)"""

bit &SP(?dst)[ubyte*] = #?val[ubyte], #0[bool] -> """
    lda #$ff-{val}
    and ({dst},x)
    sta ({dst},x)"""


let &SP(?dst)[ubyte*] = #?val[ubyte] -> """
    lda #{val}
    sta ({dst},x)"""

let &SP(?dst)[ubyte*] = SP(?src)[ubyte] -> """
    lda {src},x
    sta ({dst},x)"""

// let &SP(0)<__wolin_reg16>[ubyte*] = SPF(2)<returnValue>[ubyte]
let &SP(?dst)[ubyte*] = SPF(?src)[ubyte] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta ({dst},x)
"""

// load addr of fnstack reg into SP
let SP(?dst)[ubyte*] = *SPF(?src)[ubyte] -> """
    clc
    lda __wolin_spf
    adc #{src}
    sta {dst},x
    lda __wolin_spf+1
    adc #0
    sta {dst}+1,x"""


let SP(?dst)[ubyte*] = *HEAP(?src)[ubyte] -> """
    clc
    lda __wolin_this_ptr
    adc #{src}
    sta {dst},x
    lda __wolin_this_ptr+1
    adc #0
    sta {dst}+1,x"""


// load val pointed by SP into fnstack reg
let SPF(?dst)[ubyte] = &SP(?src)[ubyte*] -> """
    lda ({src},x)
    ldy #{dst}
    sta (__wolin_spf),y
"""

let SPF(?dst)[any*] = SPF(?src)[uword] -> """
    ldy #{src}
    lda (__wolin_spf),y
    ldy #{dst}
    sta (__wolin_spf),y
    ldy #{src}+1
    lda (__wolin_spf),y
    ldy #{dst}+1
    sta (__wolin_spf),y
"""

let &SP(?dst)[ubyte*] = ?adr[ubyte] -> """
    lda {adr}
    sta ({dst},x)"""

let SP(?dst)[?dummy *] = ?val[?dummy*] -> """
    lda #<{val}
    sta {dst},x
    lda #>{val}
    sta {dst}+1,x"""

let SP(?dst)[?dummy *] = *?src[?dummy] -> """
    lda #<{src}
    sta {dst},x
    lda #>{src}
    sta {dst}+1,x"""

let SP(?dst)[?dummy *] = SP(?src)[?dummy *] -> """
    lda {src},x
    sta {dst},x
    lda {src}+1,x
    sta {dst}+1,x"""

// bajt pod adresem zapisanym na SP dst = bajt pod adresem zapisanym na SP src
let &SP(?dst)[ubyte*] = &SP(?src)[ubyte*] -> """
    lda ({src},x)
    sta ({dst},x)
"""

let SP(?dst)[ubyte*] = #?val[uword] -> """
    lda #<{val}
    sta {dst},x
    lda #>{val}
    sta {dst}+1,x"""



// dla konstruktora
let SP(?dst)[any*] = #?val[uword] -> """
    lda #<{val}
    sta {dst},x
    lda #>{val}
    sta {dst}+1,x"""

let SPF(?d)[any*] = SP(?s)[any*] -> """
    lda {s},x
    ldy #{d}
    sta (__wolin_spf),y
    lda {s}+1,x
    iny
    sta (__wolin_spf),y"""

let SP(?d)[uword] = SPF(?s)[uword] -> """
    ldy #{s}
    lda (__wolin_spf),y
    sta {d},x
    iny
    lda (__wolin_spf),y
    sta {d}+1,x"""

/*
let SP(?d)[uword] = SPF(?s)[uword] -> """
    ; warning - assuming SP should be set to actual address of src var, this is not simple copy!
    clc
    lda __wolin_spf
    adc #{s}
    sta {d},x
    lda _wolin_spf+1
    sta {d}+1,x
    bcc :+
    inc {d}+1,x
:
"""
*/

let SP(?d)[uword] = SP(?s)[uword] -> """
    lda {s},x
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x"""

// pointer pod adresem = inny pointer pod adresem
let ?adr[uword] = ?adr2[uword] -> """
    lda {adr2} ; UWAGA ptr -> ptr
    sta {adr}
    lda {adr+1}
    sta {adr2+1}
"""

let SP(?d)[adr] = ?s[adr] -> """
    lda #<{s}
    sta {d},x
    lda #>{s}
    sta {d}+1,x"""



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

reti -> """   rti"""

call ?a[uword] -> """    jsr {a}"""

call ?a[uword*] -> """
    lda {a}
    sta :+1
    lda {a}+1
    sta :+2
:
    jsr 65535"""

goto ?a[uword] -> """    jmp {a}"""

goto ?a[uword*] -> """    jmp ({a})"""

crash -> """    brk"""

label ?a = ?b -> """{a} = {b}"""

label ?a -> """{a}:"""

function ?a -> """{a}:"""

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

save SP -> """
    txa
    pha"""

restore SP -> """
    pla
    tax"""

save CPU.X[ubyte] -> """
    txa
    pha"""

restore CPU.X[ubyte] -> """
    pla
    tax"""

save CPU.Y -> """
    tya
    pha"""

restore CPU.Y -> """
    pla
    tay"""

save CPU.A[ubyte] -> """
    pha"""

restore CPU.A[ubyte] -> """
    pla"""

restore CPU.XY[uword] -> """
    pla
    tay
    pla
    tax
"""

restore CPU.YX[uword] -> """
    pla
    tax
    pla
    tay
"""

save SPF(?src)[ubyte] -> """
    ldy #{src}
    lda (__wolin_spf),y
    pha
"""

save SP(?src)[ubyte] -> """
    lda {src},x
    pha
"""

save SP(?src)[uword] -> """
    lda {src},x
    pha
    lda {src}+1,x
    pha
"""

save #?val[ubyte] -> """
    lda #{val}
    pha
"""

save #?val[uword] -> """
    lda #<{val}
    pha
    lda #>{val}
    pha
"""



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

and ?dst[ubyte] = #?val[ubyte] -> """
    lda {dst}
    and #{val}
    sta {dst}
"""

or ?dst[ubyte] = #?val[ubyte] -> """
    lda {dst}
    ora #{val}
    sta {dst}
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

add SP(?dummya)[?dummyb] = ?dummyc[?dummyd*], #0[?dummye] -> """"""

add SPF(?d)[ubyte] = SPF(?c1)[ubyte],SPF(?c2)[ubyte] -> """
    clc
    ldy #{c1}
    lda (__wolin_spf), y
    ldy #{c2}
    adc (__wolin_spf), y
    ldy #{d}
    sta (__wolin_spf), y
"""

add SP(?d)[ubyte*] = ?adr[ubyte*], ?idx[ubyte] -> """
    clc
    lda #<{adr}
    adc {idx}
    sta {d},x
    lda #>{adr}
    adc #0
    sta {d}+1,x
"""

add &SP(?d)[ubyte*] = &SP(?d)[ubyte*], SPF(?s)[ubyte] -> """
    clc
    lda ({d},x)
    ldy #{s}
    adc (__wolin_spf), y
    sta ({d},x)
"""

add &SP(?d)[ubyte*] = &SP(?d)[ubyte*], HEAP(?s)[ubyte] -> """
    clc
    lda ({d},x)
    ldy #{s}
    adc (__wolin_this_ptr), y
    sta ({d},x)
"""


// add SP(2)<__wolin_reg15>[adr] = SP(2)<__wolin_reg15>[adr], SP(0)<__wolin_reg16>[uword]
add SP(?d)[uword] = SP(?s1)[uword], SP(?s2)[uword] -> """
    clc
    lda {s1},x
    adc {s2},x
    sta {d},x
    lda {s1}+1,x
    adc {s2}+1,x
    sta {d}+1,x"""

add SP(?d)[?dummy *] = SP(?s)[?dummy *], ?adr[uword] -> """
    clc
    lda {s},x
    adc {adr}
    sta {d},x
    lda {s}+1,x
    adc {adr}+1
    sta {d}+1,x"""

add SPF(?dest)[ubyte] = SPF(?dest)[ubyte], #1[ubyte] -> """
    ldy #{dest}
    inc (__wolin_spf),y
"""

add ?dest[ubyte] = ?dest[ubyte], #1[ubyte] -> """
    inc {dest}"""

sub ?dest[ubyte] = ?dest[ubyte], #1[ubyte] -> """
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
    bcc :+
    inc {a}+1
:
"""

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

add SP(?d)[ubyte*] = ?adr[ubyte*], ?idx[ubyte] -> """
    clc
    lda #<{adr}
    adc {idx}
    sta {d},x
    lda #>{adr}
    adc #0
    sta {d}+1,x
"""

add &SP(?d)[ubyte*] = &SP(?d)[ubyte*], SPF(?s)[ubyte] -> """
    clc
    lda ({d},x)
    ldy #{s}
    adc (__wolin_spf), y
    sta ({d},x)
"""

add &SP(?d)[ubyte*] = &SP(?d)[ubyte*], HEAP(?s)[ubyte] -> """
    clc
    lda ({d},x)
    ldy #{s}
    adc (__wolin_this_ptr), y
    sta ({d},x)
"""

// add SP(2)<__wolin_reg15>[adr] = SP(2)<__wolin_reg15>[adr], SP(0)<__wolin_reg16>[uword]
add SP(?d)[adr] = SP(?s1)[adr], SP(?s2)[uword] -> """
    clc
    lda {s1},x
    adc {s2},x
    sta {d},x
    lda {s1}+1,x
    adc {s2}+1,x
    sta {d}+1,x"""

add SP(?d)[?dummy *] = SP(?s)[?dummy *], ?adr[uword] -> """
    clc
    lda {s},x
    adc {adr}
    sta {d},x
    lda {s}+1,x
    adc {adr}+1
    sta {d}+1,x"""


//============================================
// Wskaźniki
//============================================

let &SP(?dst)[any*]=&SP(?src)[any*] -> """
    ; take value that is located at address stored in {src}
    lda ({src},x)
    ; store it at address stored in {dst}
    sta ({dst},x)

    inc {src},x
    bne :+
    inc {src}+1,x
:
    lda ({src},x)
    sta ({dst},x)
"""

let SPF(?dst)[any*]=SPF(?src)[any*] -> """
    ldy #{src}
    lda (__wolin_spf),y
    ldy #{dst}
    sta (__wolin_spf),y
    ldy #{src}
    iny
    lda (__wolin_spf),y
    ldy #{dst}
    iny
    sta (__wolin_spf),y
"""

let SPF(?dst)[bool] = CPU.C[bool] -> """
    ldy #{dst}
    lda #1
    bcs :+
    lda #0
:
    sta (__wolin_spf),y

"""

let SP(?dst)[any*] = SPF(?src)[uword] -> """
    ldy #{src}
    lda (__wolin_spf),y
    sta {dst},x
    iny
    lda (__wolin_spf),y
    sta {dst}+1,x
"""

// set reg to address of SPF variable
let SP(?dst)[any*] = &SPF(0)[?dummy] -> """
    lda __wolin_spf
    sta {dst},x
    lda __wolin_spf+1
    sta {dst}+1,x"""

let SP(?dst)[any*] = &SPF(?src)[?dummy] -> """
    clc
    lda __wolin_spf
    adc #{src}
    sta {dst},x
    lda __wolin_spf+1
    adc #0
    sta {dst}+1,x"""



// set value pointed by to value
let SP(?d)[deref] = SP(?s)[adr] -> """
    lda {s},x
    sta ({d},x)
    inc {d},x
    bne :+
    inc {d}+1,x
:
    lda {s}+1,x
    sta ({d},x)
"""

let SP(?d)[deref] = SP(?s)[uword] -> """
    lda {s},x
    sta ({d},x)
    inc {d},x
    bne :+
    inc {d}+1,x
:
    lda {s}+1,x
    sta ({d},x)
"""

// zmienna pod adresem dst = wartość
let SP(?dst)[deref] = SP(?src)[ubyte] -> """
    lda {src},x
    sta ({dst},x)
"""




/*
// only in constructor?
let SPF(?d)[deref] = SP(?s)[uword] -> """
    ldy #{d}
    lda {s},x
    sta (__wolin_spf),y
    iny
    lda {s}+1,x
    sta (__wolin_spf),y"""

// pointer to pointer
let SP(?dest)[deref] = HEAP(?src)[deref] -> """
    ldy #{src} ; UWAGA ptr -> ptr
    lda (__wolin_this_ptr),y
    sta {dest},x
    iny
    lda (__wolin_this_ptr),y
    sta {dest}+1,x"""

setup HEAP = ?heap[deref] -> """
    lda #<{heap}
    sta __wolin_this_ptr
    lda #>{heap}
    sta __wolin_this_ptr+1"""

// any other value to pointer - get address of the value
let SP(?dest)[deref] = HEAP(?src)[?dummy] -> """
    clc
    lda __wolin_this_ptr
    adc {src}
    sta {dest},x
    lda __wolin_this_ptr+1
    adc #0
    sta {dest}+1,x"""


// kiedy juz optymizator bedzie dzialac, to powyzsze bedzie wygladac tak:
let ?dstVar[ubyte] = ?arrStart[deref], #?idx -> """
    ldy #{idx}
    lda {arrStart},y
    sta {dstVar}"""


// wartosc na opStacku = wartosc pobrana z pointera
// na 65816 jest tryb
// lda (0,x)
// sta 0,x
let SP(?dst)[ubyte] = SP(?src)[ubyte*] -> """
    lda ({src},x)
    sta {dst},x"""


// zmienna pod adresem dst = wartość
let SP(?dst)[deref] = SP(?src)[uword] -> """
    lda {src},x
    sta ({dst},x)
    inc {dst},x
    bne :+
    inc {dst}+1,x
:
    lda {src}+1,x
    sta ({dst},x)
"""

let SP(?dst)[uword] = SP(?src)[deref] -> """
    lda ({src},x)
    sta {dst},x
    inc {src},x
    bne :+
    inc {src}+1,x
:
    lda ({src},x)
    sta {dst}+1,x"""

let SP(?src)[uword] = SP(?src)[deref] -> """
    ; don't know how to address this:
    ; SP[uword] = SP[deref] when src==dst
"""

let SP(?dst)[ubyte] = SP(?src)[deref] -> """
    lda ({src},x)
    sta {dst},x"""

// do arytmetyki wskaznikow
let SP(?dst)[uword] = ?src[deref] -> """
    lda #<{src}
    sta {dst},x
    lda #>{src}
    sta {dst}+1,x"""

let SPF(?dst)[deref] = SP(?src)[deref] -> """
    ldy #{dst} ; UWAGA ptr -> ptr
    lda {src},x
    sta (__wolin_spf),y
    iny
    lda {src}+1,x
    sta (__wolin_spf),y"""

// pointer na stosie = inny pointer na stosie
let SP(?d)[deref] = SP(?s)[deref] -> """
    lda {s},x ; UWAGA ptr -> ptr
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x
"""

let SP(?d)[deref] = SP(?s)[deref] -> """
    lda {s},x ; UWAGA ptr -> ptr
    sta {d},x
    lda {s}+1,x
    sta {d}+1,x"""

let ?d[deref] = SP(?s)[deref] -> """
    lda {s},x ; UWAGA ptr -> ptr
    sta {d}
    lda {s}+1,x
    sta {d}+1"""

// dowolny adres na null
let ?adr[deref] = #0[?dummy] -> """
    lda #0
    sta {adr}
    sta {adr}+1"""

let ?dst[deref] = SP(?src)[deref] -> """
    lda {src},x  ; UWAGA ptr -> ptr
    sta {dst}
    lda {src}+1,x
    sta {dst}+1 """

let SP(?dst)[deref] = ?adr[deref] -> """
    lda #<{adr} ; UWAGA ptr -> ptr
    sta {dst},x
    lda #>{adr}
    sta {dst}+1,x"""

let SP(?dst)[deref] = SP(?src)[adr] -> """
    lda {src},x
    sta ({dst},x)
    inc {dst},x
    bne :+
    inc {dst}+1,x
:
    lda {src}+1,x
    sta ({dst},x)
"""

add SP(?d)[deref] = SP(?s1)[deref],SP(?s2)[uword] -> """
    clc
    lda {s1},x
    adc {s2},x
    sta {d},x
    lda {s1}+1,x
    adc {s2}+1,x
    sta {d}+1,x"""


*/