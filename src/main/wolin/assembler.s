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

; allocSP<__wolin_reg3>,#1

    dex

; letSP(0)<__wolin_reg3>[ubyte]=__wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte]


    lda __wolin_pl_qus_wolin_test_b
    sta 0,x

; allocSP<__wolin_reg4>,#1

    dex

; letSP(0)<__wolin_reg4>[ubyte]=#5[ubyte]


    lda #5
    sta 0,x

; evallessSP(2)<__wolin_reg2>[bool]=SP(1)<__wolin_reg3>[ubyte],SP(0)<__wolin_reg4>[ubyte]


    lda #1 // mniejsze
    sta 2,x
    lda 1,x
    cmp 0,x
    bcc @__wolin_eq_label_cont
    lda #0 // jednak wieksze
    sta 2,x
@__wolin_eq_label_cont:

; freeSP<__wolin_reg4>,#1

    inx

; freeSP<__wolin_reg3>,#1

    inx

; let__wolin_pl_qus_wolin_test_x<pl.qus.wolin.test.x>[bool]=SP(0)<__wolin_reg2>[bool]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_x

; freeSP<__wolin_reg2>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_test_bo

__wolin_pl_qus_wolin_test_bo:

; alloc1[bool]

    .byte 1

; label__wolin_pl_qus_wolin_test_w

__wolin_pl_qus_wolin_test_w:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_test_y

__wolin_pl_qus_wolin_test_y:

; alloc1[bool]

    .byte 1

; label__wolin_pl_qus_wolin_test_x

__wolin_pl_qus_wolin_test_x:

; alloc1[bool]

    .byte 1

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

