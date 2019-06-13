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

; letSP(0)<__wolin_reg2>[ubyte]=#43[ubyte]


    lda #43
    sta 0,x

; let53281[ubyte]=SP(0)<__wolin_reg2>[ubyte]


    lda 0,x
    sta 53281


; freeSP<__wolin_reg2>,#1

    inx

; allocSP<__wolin_reg5>,#2


    dex
    dex

; letSP(0)<__wolin_reg5>[ptr]=__wolin_lambda_function_0[adr]


    lda #<__wolin_lambda_function_0
    sta 0,x
    lda #>__wolin_lambda_function_0
    sta 0+1,x

; let__wolin_pl_qus_wolin_test_suma<pl.qus.wolin.test.suma>[ptr]=SP(0)<__wolin_reg5>[ptr]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_suma
    lda 0+1,x
    sta __wolin_pl_qus_wolin_test_suma+1

; freeSP<__wolin_reg5>,#2


    inx
    inx

; allocSP<__wolin_reg9>,#1

    dex

; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    lda __wolin_spf+1
    sbc #0
    sta __wolin_spf+1

; allocSP<__wolin_reg10>,#1

    dex

; letSP(0)<__wolin_reg10>[ubyte]=#1[ubyte]


    lda #1
    sta 0,x

; letSPF(1)[ubyte]=SP(0)<__wolin_reg10>[ubyte]


    lda 0,x
    ldy #1
    sta (__wolin_spf),y

; freeSP<__wolin_reg10>,#1

    inx

; allocSP<__wolin_reg11>,#1

    dex

; letSP(0)<__wolin_reg11>[ubyte]=#2[ubyte]


    lda #2
    sta 0,x

; letSPF(0)[ubyte]=SP(0)<__wolin_reg11>[ubyte]


    lda 0,x
    ldy #0
    sta (__wolin_spf),y

; freeSP<__wolin_reg11>,#1

    inx

; call__wolin_pl_qus_wolin_test_suma[ptr]


    lda __wolin_pl_qus_wolin_test_suma
    sta __wolin_indirect_jsr+1
    lda __wolin_pl_qus_wolin_test_suma+1
    sta __wolin_indirect_jsr+2
    jsr __wolin_indirect_jsr

; letSP(0)<__wolin_reg9>[ubyte]=SPF(0)<returnValue>[ubyte]


    ldy #0
    lda (__wolin_spf),y
    sta 0,x


; freeSPF<ubyte>,#1

  clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; let53281[ubyte]=SP(0)<__wolin_reg9>[ubyte]


    lda 0,x
    sta 53281


; freeSP<__wolin_reg9>,#1

    inx

; ret

    rts

; label__wolin_lambda_function_0

__wolin_lambda_function_0:

; allocSP<__wolin_reg12>,#1

    dex

; letSP(0)<__wolin_reg12>[ubyte]=SPF(1)<lambda_function_0.a>[ubyte]


    ldy #1
    lda (__wolin_spf),y
    sta 0,x


; allocSP<__wolin_reg13>,#1

    dex

; letSP(0)<__wolin_reg13>[ubyte]=SPF(0)<lambda_function_0.b>[ubyte]


    ldy #0
    lda (__wolin_spf),y
    sta 0,x


; addSP(1)<__wolin_reg12>[ubyte]=SP(1)<__wolin_reg12>[ubyte],SP(0)<__wolin_reg13>[ubyte]


    clc
    lda 1,x
    adc 0,x
    sta 1,x

; freeSP<__wolin_reg13>,#1

    inx

; letSPF(2)<returnValue>[ubyte]=SP(0)<__wolin_reg12>[ubyte]


    lda 0,x
    ldy #2
    sta (__wolin_spf),y

; freeSP<__wolin_reg12>,#1

    inx

; freeSPF,#2

  clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_test_dst

__wolin_pl_qus_wolin_test_dst:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_test_lam

__wolin_pl_qus_wolin_test_lam:

; alloc0[ptr]

    .word 0

; label__wolin_pl_qus_wolin_test_src

__wolin_pl_qus_wolin_test_src:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_test_suma

__wolin_pl_qus_wolin_test_suma:

; alloc0[ptr]

    .word 0

