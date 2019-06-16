; setupSPF=251[ubyte],40959[uword]


; prepare function stack
__wolin_spf = 251 ; function stack ptr
__wolin_spf_top = 40959 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; setupSP=142[ubyte]


; prepare program stack
__wolin_sp_top = 142 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; goto__wolin_pl_qus_wolin_test_main[adr]

    jmp __wolin_pl_qus_wolin_test_main

; label__wolin_pl_qus_wolin_test_main

__wolin_pl_qus_wolin_test_main:

; allocSP<__wolin_reg1>,#1

    dex

; allocSP<__wolin_reg2>,#1

    dex

; allocSP<__wolin_reg3>,#1

    dex

; letSP(0)<__wolin_reg3>[ubyte]=#5[ubyte]


    lda #5
    sta 0,x

; letSP(1)<__wolin_reg2>[ubyte]=pl.qus.wolin.test.oneByteSmallArray[ptr],SP(0)<__wolin_reg3>[ubyte]


    lda 0,x
    tay
    lda pl.qus.wolin.test.oneByteSmallArray,y
    sta 1,x

; freeSP<__wolin_reg3>,#1

    inx

; let__wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte]=SP(0)<__wolin_reg2>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_b


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

; label__wolin_pl_qus_wolin_test_twoBytesBigArray

__wolin_pl_qus_wolin_test_twoBytesBigArray:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_test_oneByteBigArray

__wolin_pl_qus_wolin_test_oneByteBigArray:

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

; label__wolin_pl_qus_wolin_test_oneByteSmallArray

__wolin_pl_qus_wolin_test_oneByteSmallArray:

; alloc0[ptr]

    .word 0

