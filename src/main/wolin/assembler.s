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

; allocSP<__wolin_reg2>,#1

    dex

; letSP(0)<__wolin_reg2>[ubyte]=#5[ubyte]


    lda #5
    sta 0,x

; letSP(1)<__wolin_reg1>[ptr]=pl.qus.wolin.test.fastArray[ptr],SP(0)<__wolin_reg2>[ubyte]


    lda #<pl.qus.wolin.test.fastArray
    sta 1,x
    lda #>pl.qus.wolin.test.fastArray
    sta 1+1,x

; freeSP<__wolin_reg2>,#1

    inx

; letSP(0)<__wolin_reg1>[ptr]=__wolin_pl_qus_wolin_test_fastArray<pl.qus.wolin.test.fastArray>[ptr]


    lda #<__wolin_pl_qus_wolin_test_fastArray
    sta 0,x
    lda #>__wolin_pl_qus_wolin_test_fastArray
    sta 0+1,x

; letSP(0)<__wolin_reg1>[ptr]=SP(0)<__wolin_reg3>[ptr]


    lda 0,x
    sta 0,x
    lda 0+1,x
    sta 0+1,x


; letSP(0)<__wolin_reg1>[ptr]=SP(0)<__wolin_reg3>[ptr]


    lda 0,x
    sta 0,x
    lda 0+1,x
    sta 0+1,x


; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

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

