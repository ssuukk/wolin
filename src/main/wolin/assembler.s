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


; allocSPF,#0

 

; call__wolin_pl_qus_wolin_main[uword]

    jsr __wolin_pl_qus_wolin_main

; endfunction

    rts

; function__wolin_pl_qus_wolin_print

__wolin_pl_qus_wolin_print:

; freeSPF<pl.qus.wolin.print.__fnargs>,#3


    clc
    lda __wolin_spf
    adc #3
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; endfunction

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSPF,#3


    sec
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(1)[ubyte*]=#__wolin_lab_stringConst_0[uword]


    lda #<__wolin_lab_stringConst_0
    ldy #1
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
    .str {val}
    .byt 0


