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

; 9: alloc SP<__wolin_reg1> , #1 

    dex

; 10: alloc SP<__wolin_reg2> , #1 

    dex

; 11: let SP(0)<__wolin_reg2>[ubyte] = #0[ubyte] 


    lda #0
    sta 0,x

; 12: let SPF(1)<pl.qus.wolin.print..i>[ubyte] = SP(0)<__wolin_reg2>[ubyte] 


    lda 0,x
    ldy #1
    sta (__wolin_spf),y

; 13: free SP<__wolin_reg2> , #1 

    inx

; 14: free SP<__wolin_reg1> , #1 

    inx

; 15: alloc SP<__wolin_reg3> , #2 


    dex
    dex

; 16: alloc SP<__wolin_reg4> , #2 


    dex
    dex

; 17: alloc SP<__wolin_reg5> , #2 


    dex
    dex

; 18: alloc SP<__wolin_reg6> , #2 


    dex
    dex

; 19: let SP(0)<__wolin_reg6>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] 


    ldy #2
    lda (__wolin_spf),y
    sta 0,x
    iny
    lda (__wolin_spf),y
    sta 0+1,x

; 20: alloc SP<__wolin_reg7> , #2 


    dex
    dex

; 21: let SP(0)<__wolin_reg7>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] 


    clc
    lda __wolin_spf
    adc #1
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; 23: free SP<__wolin_reg7> , #2 


    inx
    inx

; 24: free SP<__wolin_reg6> , #2 


    inx
    inx

; 25: let SP(2)<__wolin_reg4>[ubyte*] = SP(0)<__wolin_reg5>[ubyte*] 


    lda 0,x
    sta 2,x
    lda 0+1,x
    sta 2+1,x

; 26: free SP<__wolin_reg5> , #2 


    inx
    inx

; 28: free SP<__wolin_reg4> , #2 


    inx
    inx

; 29: free SP<__wolin_reg3> , #2 


    inx
    inx

; 30: alloc SP<__wolin_reg9> , #1 

    dex

; 32: label __wolin_lab_loop_start_1 

__wolin_lab_loop_start_1:

; 33: alloc SP<__wolin_reg10> , #2 


    dex
    dex

; 34: let SP(0)<__wolin_reg10>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] 


    clc
    lda __wolin_spf
    adc #0
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; 35: alloc SP<__wolin_reg11> , #1 

    dex

; 36: let SP(0)<__wolin_reg11>[ubyte] = #0[ubyte] 


    lda #0
    sta 0,x

; 38: free SP<__wolin_reg11> , #1 

    inx

; 39: free SP<__wolin_reg10> , #2 


    inx
    inx

; 40: bne SP(0)<__wolin_reg9>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_1

; 41: save SP 


    txa
    pha

; 42: alloc SP<__wolin_reg14> , #2 


    dex
    dex

; 43: let SP(0)<__wolin_reg14>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] 


    clc
    lda __wolin_spf
    adc #0
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; 45: free SP<__wolin_reg14> , #2 


    inx
    inx

; 46: restore CPU.A[ubyte] 


    pla

; 47: call __wolin_pl_qus_wolin_chrout[uword] 

    jsr __wolin_pl_qus_wolin_chrout

; 48: restore SP 


    pla
    tax

; 49: alloc SP<__wolin_reg15> , #2 


    dex
    dex

; 50: let SP(0)<__wolin_reg15>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] 


    clc
    lda __wolin_spf
    adc #1
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; 51: add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte] , #1[ubyte] 


    clc
    ldy #1
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; 52: free SP<__wolin_reg15> , #2 


    inx
    inx

; 53: alloc SP<__wolin_reg17> , #2 


    dex
    dex

; 54: let SP(0)<__wolin_reg17>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] 


    clc
    lda __wolin_spf
    adc #0
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; 55: alloc SP<__wolin_reg18> , #2 


    dex
    dex

; 56: alloc SP<__wolin_reg19> , #2 


    dex
    dex

; 57: alloc SP<__wolin_reg20> , #2 


    dex
    dex

; 58: let SP(0)<__wolin_reg20>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] 


    ldy #2
    lda (__wolin_spf),y
    sta 0,x
    iny
    lda (__wolin_spf),y
    sta 0+1,x

; 59: alloc SP<__wolin_reg21> , #2 


    dex
    dex

; 60: let SP(0)<__wolin_reg21>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] 


    clc
    lda __wolin_spf
    adc #1
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; 62: free SP<__wolin_reg21> , #2 


    inx
    inx

; 63: free SP<__wolin_reg20> , #2 


    inx
    inx

; 64: let SP(2)<__wolin_reg18>[ubyte*] = SP(0)<__wolin_reg19>[ubyte*] 


    lda 0,x
    sta 2,x
    lda 0+1,x
    sta 2+1,x

; 65: free SP<__wolin_reg19> , #2 


    inx
    inx

; 66: let &SP(2)<__wolin_reg17>[ubyte*] = &SP(0)<__wolin_reg18>[ubyte*] 


    lda (0,x)
    sta (2,x)


; 67: free SP<__wolin_reg18> , #2 


    inx
    inx

; 68: free SP<__wolin_reg17> , #2 


    inx
    inx

; 69: goto __wolin_lab_loop_start_1[uword] 

    jmp __wolin_lab_loop_start_1

; 71: label __wolin_lab_loop_end_1 

__wolin_lab_loop_end_1:

; 72: free SP<__wolin_reg9> , #1 

    inx

; 73: free SPF<__wolin_pl_qus_wolin_print> , #4 


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 74: endfunction 

    rts

; 75: function __wolin_pl_qus_wolin_main 

__wolin_pl_qus_wolin_main:

; 76: alloc SPF<__wolin_pl_qus_wolin_print> , #4 


    sec
    lda __wolin_spf
    sbc #4
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 77: alloc SP<__wolin_reg24> , #2 


    dex
    dex

; 78: let SP(0)<__wolin_reg24>[ubyte*] = #__wolin_lab_stringConst_0[uword] 


    lda #<__wolin_lab_stringConst_0
    sta 0,x
    lda #>__wolin_lab_stringConst_0
    sta 0+1,x

; 80: free SP<__wolin_reg24> , #2 


    inx
    inx

; 81: call __wolin_pl_qus_wolin_print[uword] 

    jsr __wolin_pl_qus_wolin_print

; 82: endfunction 

    rts

; 83: string __wolin_lab_stringConst_0[uword] = $"dupa" 


__wolin_lab_stringConst_0:
    .asciiz "dupa"


