; 1: setup HEADER 


;**********************************************
;*
;* BASIC header
;*
;* compile with:
;* cl65.exe -o assembler.prg -t c64 -C c64-asm.cfg -g -Ln assembler.lbl -l assembler.lst assembler.s
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


; 2: label __wolin_pl_qus_wolin_plot = 65520 

__wolin_pl_qus_wolin_plot = 65520

; 3: label __wolin_pl_qus_wolin_chrout = 65490 

__wolin_pl_qus_wolin_chrout = 65490

; 4: setup SPF = 251[ubyte] , 40959[uword] 


; prepare function stack
__wolin_spf := 251 ; function stack ptr
__wolin_spf_hi := 251+1 ; function stack ptr

__wolin_spf_top := 40959 ; function stack top
__wolin_spf_top_hi := 40959+1 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; 5: setup SP = 114[ubyte] 


; prepare program stack
__wolin_sp_top := 114 ; program stack top
__wolin_sp_top_hi := 114+1 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; 6: setup HEAP = 176[ubyte] 


__wolin_this_ptr := 176
__wolin_this_ptr_hi := 176+1


; 7: goto __wolin_pl_qus_wolin_main[uword] 

    jmp __wolin_pl_qus_wolin_main

; 8: function __wolin_pl_qus_wolin_main 

__wolin_pl_qus_wolin_main:

; 9: alloc SPF<__wolin_pl_qus_wolin_extPrint> , #2 


    sec
    lda __wolin_spf
    sbc #2
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 10: let SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] = #__wolin_lab_stringConst_0[uword] 


    lda #<__wolin_lab_stringConst_0
    ldy #0
    sta (__wolin_spf),y
    lda #>__wolin_lab_stringConst_0
    iny
    sta (__wolin_spf),y

; 11: call __wolin_pl_qus_wolin_extPrint[uword] 

    jsr __wolin_pl_qus_wolin_extPrint

; 12: endfunction 

    rts

; 13: string __wolin_lab_stringConst_0[uword] = $"dupa" 


__wolin_lab_stringConst_0:
    .asciiz {val}
    ;.byt 0


