; setupHEADER


;**********************************************
;*
;* BASIC header
;*
;* compile with:
;* cl65.exe -o assembler.prg -t c64 -C c64-asm.cfg -g -Ln labels.txt assembler.s
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
__wolin_spf := 251 ; function stack ptr
__wolin_spf_hi := 251+1 ; function stack ptr

__wolin_spf_top := 40959 ; function stack top
__wolin_spf_top_hi := 40959+1 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; setupSP=114[ubyte]


; prepare program stack
__wolin_sp_top := 114 ; program stack top
__wolin_sp_top_hi := 114+1 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; setupHEAP=176[ubyte]


__wolin_this_ptr := 176
__wolin_this_ptr_hi := 176+1


; let__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=#0[ubyte]


    lda #<0
    sta __wolin_pl_qus_wolin_i
    lda #0
    sta __wolin_pl_qus_wolin_i+1

; let__wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte]=#0[ubyte]


    lda #0
    sta __wolin_pl_qus_wolin_chr

; allocSPF,#0

 

; call__wolin_pl_qus_wolin_main[uword]

    jsr __wolin_pl_qus_wolin_main

; endfunction

    rts

; function__wolin_pl_qus_wolin_test

__wolin_pl_qus_wolin_test:

; allocSP<__wolin_reg4>,#1

    dex

; bneSP(0)<__wolin_reg4>[bool]=#1[bool],__wolin_lab_afterIfExpression_1<label_DO_else>[uword]


    lda 0,x
    beq __wolin_lab_afterIfExpression_1

; goto__wolin_lab_afterWholeIf_1[uword]

    jmp __wolin_lab_afterWholeIf_1

; label__wolin_lab_afterIfExpression_1

__wolin_lab_afterIfExpression_1:

; allocSP<__wolin_reg8>,#1

    dex

; bneSP(0)<__wolin_reg8>[bool]=#1[bool],__wolin_lab_afterIfExpression_2<label_po_if>[uword]


    lda 0,x
    beq __wolin_lab_afterIfExpression_2

; label__wolin_lab_afterIfExpression_2

__wolin_lab_afterIfExpression_2:

; label__wolin_lab_afterWholeIf_2

__wolin_lab_afterWholeIf_2:

; freeSP<__wolin_reg8>,#1

    inx

; label__wolin_lab_afterWholeIf_1

__wolin_lab_afterWholeIf_1:

; freeSP<__wolin_reg4>,#1

    inx

; add__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword],#1[uword]


    clc
    lda __wolin_pl_qus_wolin_i
    adc #<1
    sta __wolin_pl_qus_wolin_i
    lda __wolin_pl_qus_wolin_i+1
    adc #>1
    sta __wolin_pl_qus_wolin_i+1


; freeSPF<pl.qus.wolin.test.__fnargs>,#1


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; endfunction

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSPF,#2


    sec
    lda __wolin_spf
    sbc #2
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(0)[ubyte]=#5[ubyte]


    ldy #0
    lda #5
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_test[uword]

    jsr __wolin_pl_qus_wolin_test

; allocSPF<pl.qus.wolin.test.__returnValue>,#1


    sec
    lda __wolin_spf
    sbc #1
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(0)[ubyte]=#10[ubyte]


    ldy #0
    lda #10
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_test[uword]

    jsr __wolin_pl_qus_wolin_test

; freeSPF<pl.qus.wolin.test.__returnValue>,#1


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; endfunction

    rts

; label__wolin_pl_qus_wolin_i

__wolin_pl_qus_wolin_i:

; alloc0[uword]

    .word 0

; label__wolin_pl_qus_wolin_chr

__wolin_pl_qus_wolin_chr:

; alloc0[ubyte]

    .byte 0

