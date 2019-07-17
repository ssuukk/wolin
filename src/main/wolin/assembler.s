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

; letSP(0)<__wolin_reg0>[ubyte]=#2[ubyte]


    lda #2
    sta 0,x

; let__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]=SP(0)<__wolin_reg0>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_b


; freeSP<__wolin_reg0>,#1

    inx

; label__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg1>,#1

    dex

; allocSP<__wolin_reg2>,#1

    dex

; letSP(0)<__wolin_reg2>[ubyte]=__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]


    lda __wolin_pl_qus_wolin_b
    sta 0,x

; allocSP<__wolin_reg3>,#1

    dex

; allocSP<__wolin_reg4>,#1

    dex

; label__wolin_lab_whenLabel_0

__wolin_lab_whenLabel_0:

; letSP(0)<__wolin_reg4>[ubyte]=#1[ubyte]


    lda #1
    sta 0,x

; evaleqSP(1)<__wolin_reg3>[bool]=SP(2)<__wolin_reg2>[ubyte],SP(0)<__wolin_reg4>[ubyte]


    lda #1 // rowne
    sta 1,x
    lda 2,x
    cmp 0,x
    beq +
    lda #0 // jednak rozne
    sta 1,x
:

; bneSP(1)<__wolin_reg3>[bool]=#1[bool],__wolin_lab_whenLabel_1[adr]


    lda 1,x
    cmp #1
    bne __wolin_lab_whenLabel_1

; add__wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword]=__wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword],#1[uword]


    clc
    lda __wolin_pl_qus_wolin_c
    adc #<1
    sta __wolin_pl_qus_wolin_c
    lda __wolin_pl_qus_wolin_c+1
    adc #>1
    sta __wolin_pl_qus_wolin_c+1


; goto__wolin_lab_whenEndLabel_0[adr]

    jmp __wolin_lab_whenEndLabel_0

; label__wolin_lab_whenLabel_1

__wolin_lab_whenLabel_1:

; letSP(0)<__wolin_reg4>[ubyte]=#2[ubyte]


    lda #2
    sta 0,x

; evaleqSP(1)<__wolin_reg3>[bool]=SP(2)<__wolin_reg2>[ubyte],SP(0)<__wolin_reg4>[ubyte]


    lda #1 // rowne
    sta 1,x
    lda 2,x
    cmp 0,x
    beq +
    lda #0 // jednak rozne
    sta 1,x
:

; bneSP(1)<__wolin_reg3>[bool]=#1[bool],__wolin_lab_whenLabel_2[adr]


    lda 1,x
    cmp #1
    bne __wolin_lab_whenLabel_2

; sub__wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword]=__wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword],#1[uword]


    sec
    lda __wolin_pl_qus_wolin_c
    sbc #<1
    sta __wolin_pl_qus_wolin_c
    lda __wolin_pl_qus_wolin_c+1
    sbc #>1
    sta __wolin_pl_qus_wolin_c+1


; goto__wolin_lab_whenEndLabel_0[adr]

    jmp __wolin_lab_whenEndLabel_0

; label__wolin_lab_whenLabel_2

__wolin_lab_whenLabel_2:

; allocSP<__wolin_reg5>,#2


    dex
    dex

; allocSP<__wolin_reg6>,#2


    dex
    dex

; letSP(0)<__wolin_reg6>[uword]=#0[ubyte]


    lda #0
    sta 0,x
    lda #0
    sta 0+1,x

; let__wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword]=SP(0)<__wolin_reg6>[uword]


    lda 0,x
    sta __wolin_pl_qus_wolin_c
    lda 0+1,x
    sta __wolin_pl_qus_wolin_c+1


; freeSP<__wolin_reg6>,#2


    inx
    inx

; freeSP<__wolin_reg5>,#2


    inx
    inx

; label__wolin_lab_whenEndLabel_0

__wolin_lab_whenEndLabel_0:

; freeSP<__wolin_reg4>,#1

    inx

; freeSP<__wolin_reg3>,#1

    inx

; freeSP<__wolin_reg2>,#1

    inx

; freeSP<__wolin_reg1>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_oneByteLongArray

__wolin_pl_qus_wolin_oneByteLongArray:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_fastArray

__wolin_pl_qus_wolin_fastArray:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_twoBytesLongArray

__wolin_pl_qus_wolin_twoBytesLongArray:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_b

__wolin_pl_qus_wolin_b:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_c

__wolin_pl_qus_wolin_c:

; alloc0[uword]

    .word 0

; label__wolin_pl_qus_wolin_d

__wolin_pl_qus_wolin_d:

; alloc0[uword]

    .word 0

