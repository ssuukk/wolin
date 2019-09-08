; setupHEADER


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


; setupSPF=251[ubyte],40959[uword]


; prepare function stack
__wolin_spf := 251 ; function stack ptr
__wolin_spf_hi := 251+1 ; function stack ptr

__wolin_spf_top := 40959 ; function stack top
__wolin_spf_top_hi := 40959+1 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; setupSP=143[ubyte]


; prepare program stack
__wolin_sp_top := 143 ; program stack top
__wolin_sp_top_hi := 143+1 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; setupHEAP=176[ubyte]


__wolin_this_ptr := 176
__wolin_this_ptr_hi := 176+1


; allocSP<__wolin_reg0>,#1

    dex

; letSP(0)<__wolin_reg0>[ubyte]=#0[ubyte]


    lda #0
    sta 0,x

; let__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte]=SP(0)<__wolin_reg0>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_znak


; freeSP<__wolin_reg0>,#1

    inx

; allocSP<__wolin_reg1>,#1

    dex

; letSP(0)<__wolin_reg1>[ubyte]=#2[ubyte]


    lda #2
    sta 0,x

; let__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]=SP(0)<__wolin_reg1>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_b


; freeSP<__wolin_reg1>,#1

    inx

; allocSP<__wolin_reg2>,#1

    dex

; letSP(0)<__wolin_reg2>[ubyte]=#1[ubyte]


    lda #1
    sta 0,x

; let__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte]=SP(0)<__wolin_reg2>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_a


; freeSP<__wolin_reg2>,#1

    inx

; allocSP<__wolin_reg3>,#1

    dex

; letSP(0)<__wolin_reg3>[ubyte]=#0[ubyte]


    lda #0
    sta 0,x

; let__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=SP(0)<__wolin_reg3>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_i
    lda #0
    sta __wolin_pl_qus_wolin_i+1


; freeSP<__wolin_reg3>,#1

    inx

; allocSPF,#0

 

; call__wolin_pl_qus_wolin_main[adr]

    jsr __wolin_pl_qus_wolin_main

; freeSPF<unit>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; label__wolin_pl_qus_wolin_allocMem

__wolin_pl_qus_wolin_allocMem:

; allocSP<__wolin_reg5>,#2


    dex
    dex

; letSP(0)<__wolin_reg5>[uword]=#30000[uword]


    lda #<30000
    sta 0,x
    lda #>30000
    sta 0+1,x

; letSPF(4)<returnValue>[uword]=SP(0)<__wolin_reg5>[uword]


    lda 0,x
    ldy #4
    sta (__wolin_spf),y
    lda 0+1,x
    iny
    sta (__wolin_spf),y

; freeSP<__wolin_reg5>,#2


    inx
    inx

; freeSPF,#4


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; label__wolin_pl_qus_wolin_Test

__wolin_pl_qus_wolin_Test:

; allocSP<__wolin_reg6>,#2


    dex
    dex

; allocSPF,#6


    clc
    lda __wolin_spf
    sbc #6
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)[uword]=#3[uword]


    ldy #2
    lda #<3
    sta (__wolin_spf),y
    iny
    lda #>3
    sta (__wolin_spf),y

; letSPF(0)[uword]=#1[uword]


    ldy #0
    lda #<1
    sta (__wolin_spf),y
    iny
    lda #>1
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_allocMem[adr]

    jsr __wolin_pl_qus_wolin_allocMem

; freeSPF<uword>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; letSPF(0)<pl.qus.wolin.Test.returnValue>[any*]=SP(0)<__wolin_reg6>[any*]


    lda 0,x
    ldy #0
    sta (__wolin_spf),y
    lda 0+1,x
    iny
    sta (__wolin_spf),y

; freeSP<__wolin_reg6>,#2


    inx
    inx

; allocSP<__wolin_reg7>,#1

    dex

; letSP(0)<__wolin_reg7>[ubyte]=#3[ubyte]


    lda #3
    sta 0,x

; letHEAP(2)<pl.qus.wolin.Test.x>[ubyte]=SP(0)<__wolin_reg7>[ubyte]


    lda 0,x
    ldy #2
    sta (__wolin_this_ptr),y

; freeSP<__wolin_reg7>,#1

    inx

; allocSP<__wolin_reg8>,#1

    dex

; letSP(0)<__wolin_reg8>[ubyte]=#7[ubyte]


    lda #7
    sta 0,x

; letHEAP(1)<pl.qus.wolin.Test.y>[ubyte]=SP(0)<__wolin_reg8>[ubyte]


    lda 0,x
    ldy #1
    sta (__wolin_this_ptr),y

; freeSP<__wolin_reg8>,#1

    inx

; ret

    rts

; label__wolin_pl_qus_wolin_Test_suma

__wolin_pl_qus_wolin_Test_suma:

; setupHEAP=this


    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1

; allocSP<__wolin_reg10>,#1

    dex

; letSP(0)<__wolin_reg10>[ubyte]=*HEAP(2)<pl.qus.wolin.Test.x>[ubyte]


    ldy #2 ; assuming this ZP is set!
    lda (__wolin_this_ptr),y
    sta 0,x

; allocSP<__wolin_reg11>,#1

    dex

; letSP(0)<__wolin_reg11>[ubyte]=*HEAP(1)<pl.qus.wolin.Test.y>[ubyte]


    ldy #1 ; assuming this ZP is set!
    lda (__wolin_this_ptr),y
    sta 0,x

; addSP(1)<__wolin_reg10>[ubyte]=SP(1)<__wolin_reg10>[ubyte],SP(0)<__wolin_reg11>[ubyte]


    clc
    lda 1,x
    adc 0,x
    sta 1,x

; freeSP<__wolin_reg11>,#1

    inx

; letSPF(2)<returnValue>[ubyte]=SP(0)<__wolin_reg10>[ubyte]


    lda 0,x
    ldy #2
    sta (__wolin_spf),y

; freeSP<__wolin_reg10>,#1

    inx

; freeSPF,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; label__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg14>,#1

    dex

; letSP(0)<__wolin_reg14>[ubyte]=*__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte]


    lda __wolin_pl_qus_wolin_a
    sta 0,x

; allocSP<__wolin_reg15>,#1

    dex

; letSP(0)<__wolin_reg15>[ubyte]=*__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]


    lda __wolin_pl_qus_wolin_b
    sta 0,x

; let&SP(1)<__wolin_reg14>[ubyte]=&SP(0)<__wolin_reg15>[ubyte]


    lda 0,x
    sta 1,x

; freeSP<__wolin_reg15>,#1

    inx

; freeSP<__wolin_reg14>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_znak

__wolin_pl_qus_wolin_znak:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_b

__wolin_pl_qus_wolin_b:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_a

__wolin_pl_qus_wolin_a:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_i

__wolin_pl_qus_wolin_i:

; alloc0[uword]

    .word 0

