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
Bas10:      .word BasEnd ; 2049
            .word 10     ; 2051
            .byte 158 ; sys ;2053
            .byte ' 2064' ; 2054
            .byte 0 ; 2059
BasEnd:     .word 0 ; 2060
            .word 0 ; 2061
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

; evaleqSP(3)<__wolin_reg4>[bool]=SP(1)<__wolin_reg5>[uword],SP(0)<__wolin_reg6>[ubyte]


    lda #0 ; rozne
    sta 3,x
    lda 1+1,x
    bne :+
    lda 1,x
    cmp 0,x
    bne :+
    lda #1 ; rowne
    sta 3,x
:

; freeSP<__wolin_reg6>,#1

    inx

; freeSP<__wolin_reg5>,#2


    inx
    inx

; allocSP<__wolin_reg7>,#1

    dex

; bneSP(1)<__wolin_reg4>[bool]=#1[bool],__wolin_lab_afterIfExpression_0<label_DO_else>[adr]


    lda 1,x
    beq __wolin_lab_afterIfExpression_0

; letSP(0)<__wolin_reg7>[ubyte]=#6[ubyte]


    lda #6
    sta 0,x

; goto__wolin_lab_afterWholeIf_0[adr]

    jmp __wolin_lab_afterWholeIf_0

; label__wolin_lab_afterIfExpression_0

__wolin_lab_afterIfExpression_0:

; letSP(0)<__wolin_reg7>[ubyte]=#9[ubyte]


    lda #9
    sta 0,x

; label__wolin_lab_afterWholeIf_0

__wolin_lab_afterWholeIf_0:

; letSP(2)<__wolin_reg3>[ubyte]=SP(0)<__wolin_reg7>[ubyte]


    lda 0,x
    sta 2,x

; freeSP<__wolin_reg7>,#1

    inx

; freeSP<__wolin_reg4>,#1

    inx

; let53280[ubyte]=SP(0)<__wolin_reg3>[ubyte]


    lda 0,x
    sta 53280


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

; label__wolin_pl_qus_wolin_d

__wolin_pl_qus_wolin_d:

; alloc0[uword]

    .word 0

