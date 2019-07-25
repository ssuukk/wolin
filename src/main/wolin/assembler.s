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

; allocSP<__wolin_reg2>,#1

    dex

; allocSP<__wolin_reg3>,#1

    dex

; allocSP<__wolin_reg4>,#1

    dex

; allocSP<__wolin_reg5>,#2


    dex
    dex

; letSP(0)<__wolin_reg5>[uword]=__wolin_pl_qus_wolin_d<pl.qus.wolin.d>[uword]


    lda #<__wolin_pl_qus_wolin_d
    sta 0,x
    lda #>__wolin_pl_qus_wolin_d
    sta 0+1,x

; allocSP<__wolin_reg6>,#1

    dex

; letSP(0)<__wolin_reg6>[ubyte]=#0[ubyte]


    lda #0
    sta 0,x

; freeSP<__wolin_reg6>,#1

    inx

; freeSP<__wolin_reg5>,#2


    inx
    inx

; allocSP<__wolin_reg7>,#1

    dex

; letSP(0)<__wolin_reg7>[ubyte]=#6[ubyte]


    lda #6
    sta 0,x

; let__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]=SP(0)<__wolin_reg7>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_b


; freeSP<__wolin_reg7>,#1

    inx

; label__wolin_lab_afterIfExpression_0

__wolin_lab_afterIfExpression_0:

; allocSP<__wolin_reg8>,#1

    dex

; letSP(0)<__wolin_reg8>[ubyte]=#9[ubyte]


    lda #9
    sta 0,x

; let__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]=SP(0)<__wolin_reg8>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_b


; freeSP<__wolin_reg8>,#1

    inx

; label__wolin_lab_afterWholeIf_0

__wolin_lab_afterWholeIf_0:

; freeSP<__wolin_reg4>,#1

    inx

; let__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]=SP(0)<__wolin_reg3>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_b


; freeSP<__wolin_reg3>,#1

    inx

; freeSP<__wolin_reg2>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

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

