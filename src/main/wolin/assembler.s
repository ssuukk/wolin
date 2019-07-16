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

; goto__wolin_pl_qus_wolin_test_main[adr]

    jmp __wolin_pl_qus_wolin_test_main

; label__wolin_pl_qus_wolin_test_main

__wolin_pl_qus_wolin_test_main:

; allocSP<__wolin_reg0>,#2


    dex
    dex

; allocSP<__wolin_reg1>,#1

    dex

; allocSP<__wolin_reg2>,#2


    dex
    dex

; label__wolin_lab_whenLabel_0

__wolin_lab_whenLabel_0:

; letSP(0)<__wolin_reg2>[uword]=#1[ubyte]


    lda #1
    sta 0,x
    lda #0
    sta 0+1,x

; bneSP(1)<__wolin_reg1>[bool]=#1[bool],__wolin_lab_whenLabel_1[adr]


    lda 1,x
    cmp #1
    bne __wolin_lab_whenLabel_1

; goto__wolin_lab_whenEndLabel_0[adr]

    jmp __wolin_lab_whenEndLabel_0

; label__wolin_lab_whenLabel_1

__wolin_lab_whenLabel_1:

; letSP(0)<__wolin_reg2>[ubyte]=#2[ubyte]


    lda #2
    sta 0,x

; evaleqSP(2)<__wolin_reg1>[bool]=SP(3)<__wolin_reg0>[uword],SP(0)<__wolin_reg2>[uword]


    lda #0 // rozne
    sta 2,x
    lda 3,x
    cmp 0,x
    bne +
    lda 3+1
    cmp 0+1
    bne +
    lda #1
    sta 2,x
:

; bneSP(2)<__wolin_reg1>[bool]=#1[bool],__wolin_lab_whenLabel_2[adr]


    lda 2,x
    cmp #1
    bne __wolin_lab_whenLabel_2

; goto__wolin_lab_whenEndLabel_0[adr]

    jmp __wolin_lab_whenEndLabel_0

; label__wolin_lab_whenLabel_2

__wolin_lab_whenLabel_2:

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

; let__wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword]=SP(0)<__wolin_reg4>[uword]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_c
    lda 0+1,x
    sta __wolin_pl_qus_wolin_test_c+1


; freeSP<__wolin_reg4>,#2


    inx
    inx

; freeSP<__wolin_reg3>,#2


    inx
    inx

; label__wolin_lab_whenEndLabel_0

__wolin_lab_whenEndLabel_0:

; freeSP<__wolin_reg2>,#2


    inx
    inx

; freeSP<__wolin_reg1>,#1

    inx

; freeSP<__wolin_reg0>,#2


    inx
    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_test_twoBytesLongArray

__wolin_pl_qus_wolin_test_twoBytesLongArray:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_test_c

__wolin_pl_qus_wolin_test_c:

; alloc0[uword]

    .word 0

; label__wolin_pl_qus_wolin_test_b

__wolin_pl_qus_wolin_test_b:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_test_d

__wolin_pl_qus_wolin_test_d:

; alloc0[uword]

    .word 0

; label__wolin_pl_qus_wolin_test_oneByteLongArray

__wolin_pl_qus_wolin_test_oneByteLongArray:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_test_fastArray

__wolin_pl_qus_wolin_test_fastArray:

; alloc0[ptr]

    .word 0

