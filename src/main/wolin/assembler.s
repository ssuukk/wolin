; 1: setup HEADER 


;**********************************************
;*
;* BASIC header
;*
;* compile with:
;* cl65.exe -o assembler.prg -WaU -t c64 -C c64-asm.cfg -g -Ln assembler.lbl -l assembler.lst assembler.s
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

; 8: function __wolin_pl_qus_wolin_print 

__wolin_pl_qus_wolin_print:

; 9: let SPF(1)<pl.qus.wolin.print..i>[ubyte] = #0[ubyte] 


    ldy #1
    lda #0
    sta (__wolin_spf),y

; 11: alloc SP<__wolin_reg9> , #1 

    dex

; 13: label __wolin_lab_loop_start_1 

__wolin_lab_loop_start_1:

; 14: evalneq SP(2)<__wolin_reg9>[bool] = SPF(0)<pl.qus.wolin.print..char>[ubyte] , #0[ubyte] 


    lda #1 ; rozne
    sta 2,x
    ldy #0
    lda (__wolin_spf), y
    bne :+
    lda #0 ; jednak rowne
    sta 2,x
:

; 15: bne SP(0)<__wolin_reg9>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_1

; 16: save SP 


    txa
    pha

; 17: save SPF(0)<pl.qus.wolin.print..char>[ubyte] 


    ldy #0
    lda (__wolin_spf),y
    pha


; 18: restore CPU.A[ubyte] 


    pla

; 19: call __wolin_pl_qus_wolin_chrout[uword] 

    jsr __wolin_pl_qus_wolin_chrout

; 20: restore SP 


    pla
    tax

; 21: add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte] , #1[ubyte] 


    clc
    ldy #1
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; 22: alloc SP<__wolin_reg18> , #2 


    dex
    dex

; 24: let SPF(0)<pl.qus.wolin.print..char>[ubyte] = &SP(0)<__wolin_reg18>[ubyte*] 


    lda (0,x)
    ldy #0
    sta (__wolin_spf),y


; 25: free SP<__wolin_reg18> , #2 


    inx
    inx

; 26: goto __wolin_lab_loop_start_1[uword] 

    jmp __wolin_lab_loop_start_1

; 28: label __wolin_lab_loop_end_1 

__wolin_lab_loop_end_1:

; 29: free SP<__wolin_reg9> , #1 

    inx

; 30: free SPF<__wolin_pl_qus_wolin_print> , #4 


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 31: endfunction 

    rts

; 32: function __wolin_pl_qus_wolin_main 

__wolin_pl_qus_wolin_main:

; 33: alloc SPF<__wolin_pl_qus_wolin_print> , #4 


    sec
    lda __wolin_spf
    sbc #4
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 34: let SPF(2)<pl.qus.wolin.print.what>[ubyte*] = #__wolin_lab_stringConst_0[uword] 


    lda #<__wolin_lab_stringConst_0
    ldy #2
    sta (__wolin_spf),y
    lda #>__wolin_lab_stringConst_0
    iny
    sta (__wolin_spf),y

; 35: call __wolin_pl_qus_wolin_print[uword] 

    jsr __wolin_pl_qus_wolin_print

; 36: endfunction 

    rts

; 37: string __wolin_lab_stringConst_0[uword] = $"dupa" 


__wolin_lab_stringConst_0:
    .asciiz "dupa"


