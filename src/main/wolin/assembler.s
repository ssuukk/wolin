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

; 8: function __wolin_pl_qus_wolin_strLen 

__wolin_pl_qus_wolin_strLen:

; 9: let SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = #0[ubyte] 


    ldy #0
    lda #0
    sta (__wolin_spf),y

; 10: alloc SP<__wolin_reg4> , #1 

    dex

; 11: label __wolin_lab_loop_start_1 

__wolin_lab_loop_start_1:

; 12: alloc SP<__wolin_reg6> , #2 


    dex
    dex

; 14: free SP<__wolin_reg6> , #2 


    inx
    inx

; 16: bne SP(0)<__wolin_reg4>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_1

; 17: add SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = SPF(0)<pl.qus.wolin.strLen..len>[ubyte] , #1[ubyte] 


    clc
    ldy #0
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; 18: goto __wolin_lab_loop_start_1[uword] 

    jmp __wolin_lab_loop_start_1

; 19: label __wolin_lab_loop_end_1 

__wolin_lab_loop_end_1:

; 20: free SP<__wolin_reg4> , #1 

    inx

; 22: free SPF<__wolin_pl_qus_wolin_strLen> , #3 


    clc
    lda __wolin_spf
    adc #3
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 23: endfunction 

    rts

; 24: function __wolin_pl_qus_wolin_printAt 

__wolin_pl_qus_wolin_printAt:

; 25: let CPU.C[bool] = #0[bool] 


    clc


; 26: save SP 


    txa
    pha

; 27: save SPF(3)<pl.qus.wolin.printAt.x>[ubyte] 


    ldy #3
    lda (__wolin_spf),y
    pha


; 28: save SPF(2)<pl.qus.wolin.printAt.y>[ubyte] 


    ldy #2
    lda (__wolin_spf),y
    pha


; 29: restore CPU.Y[ubyte] 


    pla
    tay

; 30: restore CPU.X[ubyte] 


    pla
    tax

; 31: call __wolin_pl_qus_wolin_plot[uword] 

    jsr __wolin_pl_qus_wolin_plot

; 32: restore SP 


    pla
    tax

; 33: alloc SPF<__wolin_pl_qus_wolin_print> , #4 


    sec
    lda __wolin_spf
    sbc #4
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 34: let SPF(2)<pl.qus.wolin.print.what>[ubyte*] = SPF(4)<pl.qus.wolin.printAt.what>[ubyte*] 


    ldy #4
    lda (__wolin_spf),y
    ldy #2
    sta (__wolin_spf),y
    ldy #4+1
    lda (__wolin_spf),y
    ldy #2+1
    sta (__wolin_spf),y


; 35: call __wolin_pl_qus_wolin_print[uword] 

    jsr __wolin_pl_qus_wolin_print

; 36: free SPF<__wolin_pl_qus_wolin_printAt> , #4 


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 37: endfunction 

    rts

; 38: function __wolin_pl_qus_wolin_print 

__wolin_pl_qus_wolin_print:

; 39: let SPF(1)<pl.qus.wolin.print..i>[ubyte] = #0[ubyte] 


    ldy #1
    lda #0
    sta (__wolin_spf),y

; 40: add SPF(0)<pl.qus.wolin.print..char>[ubyte] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] , SPF(1)<pl.qus.wolin.print..i>[ubyte] 


    dex
    dex
    clc
    ldy #2
    lda (__wolin_spf), y
    ldy #1
    adc (__wolin_spf), y
    sta 0,x
    ldy #2+1
    lda (__wolin_spf), y
    adc #0
    sta 1,x
    ldy #0
    lda (0,x)
    sta (__wolin_spf), y
    inx
    inx


; 41: alloc SP<__wolin_reg31> , #1 

    dex

; 42: label __wolin_lab_loop_start_2 

__wolin_lab_loop_start_2:

; 43: evalneq SP(0)<__wolin_reg31>[bool] = SPF(0)<pl.qus.wolin.print..char>[ubyte] , #0[ubyte] 


    lda #1 ; rozne
    sta 0,x
    ldy #0
    lda (__wolin_spf), y
    bne :+
    lda #0 ; jednak rowne
    sta 0,x
:

; 44: bne SP(0)<__wolin_reg31>[bool] = #1[bool] , __wolin_lab_loop_end_2<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_2

; 45: save SP 


    txa
    pha

; 46: save SPF(0)<pl.qus.wolin.print..char>[ubyte] 


    ldy #0
    lda (__wolin_spf),y
    pha


; 47: restore CPU.A[ubyte] 


    pla

; 48: call __wolin_pl_qus_wolin_chrout[uword] 

    jsr __wolin_pl_qus_wolin_chrout

; 49: restore SP 


    pla
    tax

; 50: add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte] , #1[ubyte] 


    clc
    ldy #1
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; 51: add SPF(0)<pl.qus.wolin.print..char>[ubyte] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] , SPF(1)<pl.qus.wolin.print..i>[ubyte] 


    dex
    dex
    clc
    ldy #2
    lda (__wolin_spf), y
    ldy #1
    adc (__wolin_spf), y
    sta 0,x
    ldy #2+1
    lda (__wolin_spf), y
    adc #0
    sta 1,x
    ldy #0
    lda (0,x)
    sta (__wolin_spf), y
    inx
    inx


; 52: goto __wolin_lab_loop_start_2[uword] 

    jmp __wolin_lab_loop_start_2

; 53: label __wolin_lab_loop_end_2 

__wolin_lab_loop_end_2:

; 54: free SP<__wolin_reg31> , #1 

    inx

; 55: free SPF<__wolin_pl_qus_wolin_print> , #4 


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 56: endfunction 

    rts

; 57: function __wolin_pl_qus_wolin_main 

__wolin_pl_qus_wolin_main:

; 58: alloc SPF<__wolin_pl_qus_wolin_printAt> , #4 


    sec
    lda __wolin_spf
    sbc #4
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 59: let SPF(3)<pl.qus.wolin.printAt.x>[ubyte] = #20[ubyte] 


    ldy #3
    lda #20
    sta (__wolin_spf),y

; 60: let SPF(2)<pl.qus.wolin.printAt.y>[ubyte] = #20[ubyte] 


    ldy #2
    lda #20
    sta (__wolin_spf),y

; 61: let SPF(0)<pl.qus.wolin.printAt.what>[ubyte*] = #__wolin_lab_stringConst_0[uword] 


    lda #<__wolin_lab_stringConst_0
    ldy #0
    sta (__wolin_spf),y
    lda #>__wolin_lab_stringConst_0
    iny
    sta (__wolin_spf),y

; 62: call __wolin_pl_qus_wolin_printAt[uword] 

    jsr __wolin_pl_qus_wolin_printAt

; 63: endfunction 

    rts

; 64: string __wolin_lab_stringConst_0[uword] = $"dupa" 


__wolin_lab_stringConst_0:
    .asciiz {val}
    ;.byt 0


