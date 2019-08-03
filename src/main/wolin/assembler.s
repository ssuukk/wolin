; setupHEADER


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
            .byte " 2064"
            .byte 0
BasEnd:     .word 0
            .word 0
            ;


; setupSPF=251[ubyte],40959[uword]


; prepare function stack
__wolin_spf = 251 ; function stack ptr
__wolin_spf_top = 40959 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; setupSP=143[ubyte]


; prepare program stack
__wolin_sp_top = 143 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; goto__wolin_pl_qus_wolin_main[adr]

    jmp __wolin_pl_qus_wolin_main

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

; label__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg3>,#2


    dex
    dex

; allocSP<__wolin_reg4>,#2


    dex
    dex

; letSP(0)<__wolin_reg4>[uword]=#0[ubyte]


    lda #0
    sta 0,x
    lda #0
    sta 0+1,x

; let__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=SP(0)<__wolin_reg4>[uword]


    lda 0,x
    sta __wolin_pl_qus_wolin_i
    lda 0+1,x
    sta __wolin_pl_qus_wolin_i+1


; freeSP<__wolin_reg4>,#2


    inx
    inx

; freeSP<__wolin_reg3>,#2


    inx
    inx

; allocSP<__wolin_reg6>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; allocSP<__wolin_reg7>,#2


    dex
    dex

; letSP(0)<__wolin_reg7>[uword]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]


    lda __wolin_pl_qus_wolin_i
    sta 0,x
    lda __wolin_pl_qus_wolin_i+1
    sta 0+1,x

; allocSP<__wolin_reg8>,#2


    dex
    dex

; letSP(0)<__wolin_reg8>[uword]=#1000[uword]


    lda #<1000
    sta 0,x
    lda #>1000
    sta 0+1,x

; evallessSP(4)<__wolin_reg6>[bool]=SP(2)<__wolin_reg7>[uword],SP(0)<__wolin_reg8>[uword]


    lda #1 ; mniejsze
    sta 4,x
    lda 2+1,x
    cmp 0+1,x
    bcc :+
    lda 2,x
    cmp 0,x
    bcc :+
    lda #0 ; jednak wieksze
    sta 4,x
:

; freeSP<__wolin_reg8>,#2


    inx
    inx

; freeSP<__wolin_reg7>,#2


    inx
    inx

; bneSP(0)<__wolin_reg6>[bool]=#1[bool],__wolin_lab_loopEnd_1<label_po_if>[adr]


    lda 0,x
    beq __wolin_lab_loopEnd_1

; allocSP<__wolin_reg11>,#2


    dex
    dex

; allocSP<__wolin_reg12>,#2


    dex
    dex

; letSP(0)<__wolin_reg12>[ptr]=1024[ptr]


    lda #<1024
    sta 0,x
    lda #>1024
    sta 0+1,x

; allocSP<__wolin_reg13>,#2


    dex
    dex

; letSP(0)<__wolin_reg13>[uword]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]


    lda __wolin_pl_qus_wolin_i
    sta 0,x
    lda __wolin_pl_qus_wolin_i+1
    sta 0+1,x

; add__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword],#1[uword]


    clc
    lda __wolin_pl_qus_wolin_i
    adc #<1
    sta __wolin_pl_qus_wolin_i
    lda __wolin_pl_qus_wolin_i+1
    adc #>1
    sta __wolin_pl_qus_wolin_i+1


; addSP(2)<__wolin_reg12>[ptr]=SP(2)<__wolin_reg12>[ptr],SP(0)<__wolin_reg13>[uword]


    clc
    lda 2,x
    adc 0,x
    sta 2,x
    lda 2+1,x
    adc 0+1,x
    sta 2+1,x

; freeSP<__wolin_reg13>,#2


    inx
    inx

; letSP(2)<__wolin_reg11>[ptr]=SP(0)<__wolin_reg12>[ptr]


    lda 0,x
    sta 2,x
    lda 0+1,x
    sta 2+1,x


; freeSP<__wolin_reg12>,#2


    inx
    inx

; allocSP<__wolin_reg14>,#1

    dex

; letSP(0)<__wolin_reg14>[ubyte]=__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte]


    lda __wolin_pl_qus_wolin_znak
    sta 0,x

; add__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte]=__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte],#1[ubyte]


    inc __wolin_pl_qus_wolin_znak

; letSP(1)<__wolin_reg11>[ptr]=SP(0)<__wolin_reg14>[ubyte]


    lda 0,x
    sta (1,x)


; freeSP<__wolin_reg14>,#1

    inx

; freeSP<__wolin_reg11>,#2


    inx
    inx

; goto__wolin_lab_loopStart_1[adr]

    jmp __wolin_lab_loopStart_1

; label__wolin_lab_loopEnd_1

__wolin_lab_loopEnd_1:

; freeSP<__wolin_reg6>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_i

__wolin_pl_qus_wolin_i:

; alloc0[uword]

    .word 0

; label__wolin_pl_qus_wolin_znak

__wolin_pl_qus_wolin_znak:

; alloc0[ubyte]

    .byte 0

