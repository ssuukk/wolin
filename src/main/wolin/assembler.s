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


; call__wolin_pl_qus_wolin_main[uword]

    jsr __wolin_pl_qus_wolin_main

; endfunction

    rts

; function__wolin_pl_qus_wolin_printAt

__wolin_pl_qus_wolin_printAt:

; letCPU.C[bool]=#1[bool]


    sec


; saveSP


    txa
    pha

; saveSPF(3)<pl.qus.wolin.printAt.x>[ubyte]


    ldy #3
    lda (__wolin_spf),y
    pha


; saveSPF(2)<pl.qus.wolin.printAt.y>[ubyte]


    ldy #2
    lda (__wolin_spf),y
    pha


; restoreCPU.Y[ubyte]


    pla
    tay

; restoreCPU.X[ubyte]


    pla
    tax

; call65520[uword]

    jsr 65520

; restoreSP


    pla
    tax

; allocSPF,#5


    sec
    lda __wolin_spf
    sbc #5
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; call__wolin_pl_qus_wolin_print[uword]

    jsr __wolin_pl_qus_wolin_print

; freeSPF<pl.qus.wolin.printAt.__fnargs>,#4


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; endfunction

    rts

; function__wolin_pl_qus_wolin_print

__wolin_pl_qus_wolin_print:

; letSPF(2)<pl.qus.wolin.print..i>[ubyte]=#0[ubyte]


    ldy #2
    lda #0
    sta (__wolin_spf),y

; allocSP<__wolin_reg14>,#2


    dex
    dex

; freeSP<__wolin_reg14>,#1

    inx

; label__wolin_lab_loop_start_1

__wolin_lab_loop_start_1:

; bneSP(0)<__wolin_reg18>[bool]=#1[bool],__wolin_lab_loop_end_1<label_po_if>[uword]


    lda 0,x
    beq __wolin_lab_loop_end_1

; saveSP


    txa
    pha

; saveSPF(0)<pl.qus.wolin.print..char>[ubyte*]


    ldy #0
    lda (__wolin_spf),y
    pha
    iny
    lda (__wolin_spf),y
    pha


; restoreCPU.A[ubyte]


    pla

; call65490[uword]

    jsr 65490

; restoreSP


    pla
    tax

; addSPF(2)<pl.qus.wolin.print..i>[ubyte]=SPF(2)<pl.qus.wolin.print..i>[ubyte],#1[ubyte]


    clc
    ldy #2
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; allocSP<__wolin_reg27>,#2


    dex
    dex

; freeSP<__wolin_reg27>,#2


    inx
    inx

; goto__wolin_lab_loop_start_1[uword]

    jmp __wolin_lab_loop_start_1

; label__wolin_lab_loop_end_1

__wolin_lab_loop_end_1:

; freeSP<__wolin_reg18>,#1

    inx

; freeSPF<pl.qus.wolin.print.__fnargs>,#5


    clc
    lda __wolin_spf
    adc #5
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; endfunction

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSPF,#5


    sec
    lda __wolin_spf
    sbc #5
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(3)[ubyte*]=#__wolin_lab_stringConst_0[uword]


    lda #<__wolin_lab_stringConst_0
    ldy #3
    sta (__wolin_spf),y
    lda #>__wolin_lab_stringConst_0
    iny
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_print[uword]

    jsr __wolin_pl_qus_wolin_print

; endfunction

    rts

; string__wolin_lab_stringConst_0[uword]=$"dupa"


__wolin_lab_stringConst_0:
    .asciiz {val}
    ;.byt 0


