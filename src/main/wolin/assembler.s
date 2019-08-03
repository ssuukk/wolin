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

; let__wolin_pl_qus_wolin_d<pl.qus.wolin.d>[uword]=SP(0)<__wolin_reg0>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_d
    lda #0
    sta __wolin_pl_qus_wolin_d+1


; freeSP<__wolin_reg0>,#1

    inx

; label__wolin_pl_qus_wolin_localTest

__wolin_pl_qus_wolin_localTest:

; allocSP<__wolin_reg4>,#1

    dex

; allocSP<__wolin_reg5>,#1

    dex

; letSP(0)<__wolin_reg5>[ubyte]=SPF(3)<pl.qus.wolin.localTest.a>[ubyte]


    ldy #3
    lda (__wolin_spf),y
    sta 0,x


; allocSP<__wolin_reg6>,#1

    dex

; letSP(0)<__wolin_reg6>[ubyte]=SPF(2)<pl.qus.wolin.localTest.b>[ubyte]


    ldy #2
    lda (__wolin_spf),y
    sta 0,x


; addSP(1)<__wolin_reg5>[ubyte]=SP(1)<__wolin_reg5>[ubyte],SP(0)<__wolin_reg6>[ubyte]


    clc
    lda 1,x
    adc 0,x
    sta 1,x

; freeSP<__wolin_reg6>,#1

    inx

; letSPF(1)<pl.qus.wolin.localTest..suma>[ubyte]=SP(0)<__wolin_reg5>[ubyte]


    lda 0,x
    ldy #1
    sta (__wolin_spf),y

; freeSP<__wolin_reg5>,#1

    inx

; freeSP<__wolin_reg4>,#1

    inx

; allocSP<__wolin_reg7>,#1

    dex

; letSP(0)<__wolin_reg7>[ubyte]=SPF(1)<pl.qus.wolin.localTest..suma>[ubyte]


    ldy #1
    lda (__wolin_spf),y
    sta 0,x


; letSPF(6)<returnValue>[ubyte]=SP(0)<__wolin_reg7>[ubyte]


    lda 0,x
    ldy #6
    sta (__wolin_spf),y

; freeSP<__wolin_reg7>,#1

    inx

; freeSPF,#6


    clc
    lda __wolin_spf
    adc #6
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; ret

    rts

; label__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg10>,#1

    dex

; allocSP<__wolin_reg11>,#1

    dex

; allocSPF,#7


    clc
    lda __wolin_spf
    sbc #7
    sta __wolin_spf
    lda __wolin_spf+1
    sbc #0
    sta __wolin_spf+1

; allocSP<__wolin_reg12>,#1

    dex

; letSP(0)<__wolin_reg12>[ubyte]=#4[ubyte]


    lda #4
    sta 0,x

; letSPF(3)[ubyte]=SP(0)<__wolin_reg12>[ubyte]


    lda 0,x
    ldy #3
    sta (__wolin_spf),y

; freeSP<__wolin_reg12>,#1

    inx

; allocSP<__wolin_reg13>,#1

    dex

; letSP(0)<__wolin_reg13>[ubyte]=#3[ubyte]


    lda #3
    sta 0,x

; letSPF(2)[ubyte]=SP(0)<__wolin_reg13>[ubyte]


    lda 0,x
    ldy #2
    sta (__wolin_spf),y

; freeSP<__wolin_reg13>,#1

    inx

; call__wolin_pl_qus_wolin_localTest[adr]

    jsr __wolin_pl_qus_wolin_localTest

; letSP(0)<__wolin_reg11>[ubyte]=SPF(0)<returnValue>[ubyte]


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

; let53280[ubyte]=SP(0)<__wolin_reg11>[ubyte]


    lda 0,x
    sta 53280


; freeSP<__wolin_reg11>,#1

    inx

; freeSP<__wolin_reg10>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_d

__wolin_pl_qus_wolin_d:

; alloc0[uword]

    .word 0

