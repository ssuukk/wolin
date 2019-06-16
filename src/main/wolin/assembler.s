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

; allocSP<__wolin_reg2>,#1

    dex

; allocSP<__wolin_reg3>,#2


    dex
    dex

; letSP(0)<__wolin_reg3>[ptr]=__wolin_pl_qus_wolin_test_array<pl.qus.wolin.test.array>[ptr]


    lda #<__wolin_pl_qus_wolin_test_array
    sta 0,x
    lda #>__wolin_pl_qus_wolin_test_array
    sta 0+1,x

; allocSP<__wolin_reg4>,#2


    dex
    dex

; letSP(0)<__wolin_reg4>[uword]=#5[ubyte]


    lda #5
    sta 0,x
    lda #0
    sta 0+1,x

; addSP(2)<__wolin_reg3>[ptr]=SP(2)<__wolin_reg3>[ptr],SP(0)<__wolin_reg4>[uword]


    clc
    lda 2,x
    adc 0,x
    sta 2,x
    lda 2+1,x
    adc 0+1,x
    sta 2+1,x

; freeSP<__wolin_reg4>,#2


    inx
    inx

; letSP(2)<__wolin_reg2>[ubyte]=SP(0)<__wolin_reg3>[ptr]


    lda (0,x)
    sta 2,x

; freeSP<__wolin_reg3>,#2


    inx
    inx

; let__wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte]=SP(0)<__wolin_reg2>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_b


; freeSP<__wolin_reg2>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_test_array

__wolin_pl_qus_wolin_test_array:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_test_b

__wolin_pl_qus_wolin_test_b:

; alloc0[ubyte]

    .byte 0

