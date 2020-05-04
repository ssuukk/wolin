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

; 8: import __wolin_pl_qus_wolin_extPrint 


    .import __wolin_pl_qus_wolin_extPrint

; 9: function __wolin_pl_qus_wolin_scopeTest 

__wolin_pl_qus_wolin_scopeTest:

; 10: alloc SP<__wolin_reg2> , #1 

    dex

; 12: label __wolin_lab_loop_start_1 

__wolin_lab_loop_start_1:

; 14: bne SP(0)<__wolin_reg2>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_1

; 16: alloc SP<__wolin_reg11> , #1 

    dex

; 18: label __wolin_lab_loop_start_2 

__wolin_lab_loop_start_2:

; 20: bne SP(0)<__wolin_reg11>[bool] = #1[bool] , __wolin_lab_loop_end_2<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_2

; 21: add SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] , #1[ubyte] 


    clc
    ldy #4
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; 22: goto __wolin_lab_loop_start_2[uword] 

    jmp __wolin_lab_loop_start_2

; 24: label __wolin_lab_loop_end_2 

__wolin_lab_loop_end_2:

; 25: free SP<__wolin_reg11> , #1 

    inx

; 26: goto __wolin_lab_if_end_1[uword] 

    jmp __wolin_lab_if_end_1

; 27: label __wolin_lab_else_branch_1 

__wolin_lab_else_branch_1:

; 28: alloc SP<__wolin_reg18> , #1 

    dex

; 30: label __wolin_lab_loop_start_3 

__wolin_lab_loop_start_3:

; 32: bne SP(0)<__wolin_reg18>[bool] = #1[bool] , __wolin_lab_loop_end_3<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_3

; 33: add SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] = SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] , #1[ubyte] 


    clc
    ldy #3
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; 34: goto __wolin_lab_loop_start_3[uword] 

    jmp __wolin_lab_loop_start_3

; 36: label __wolin_lab_loop_end_3 

__wolin_lab_loop_end_3:

; 37: free SP<__wolin_reg18> , #1 

    inx

; 38: label __wolin_lab_if_end_1 

__wolin_lab_if_end_1:

; 39: goto __wolin_lab_loop_start_1[uword] 

    jmp __wolin_lab_loop_start_1

; 41: label __wolin_lab_loop_end_1 

__wolin_lab_loop_end_1:

; 42: free SP<__wolin_reg2> , #1 

    inx

; 43: free SPF<__wolin_pl_qus_wolin_scopeTest> , #5 


    clc
    lda __wolin_spf
    adc #5
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 44: endfunction 

    rts

; 45: function __wolin_pl_qus_wolin_main 

__wolin_pl_qus_wolin_main:

; 46: alloc SPF<__wolin_pl_qus_wolin_extPrint> , #2 


    sec
    lda __wolin_spf
    sbc #2
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 47: let SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] = #__wolin_lab_stringConst_0[uword] 


    lda #<__wolin_lab_stringConst_0
    ldy #0
    sta (__wolin_spf),y
    lda #>__wolin_lab_stringConst_0
    iny
    sta (__wolin_spf),y

; 48: call __wolin_pl_qus_wolin_extPrint[uword] 

    jsr __wolin_pl_qus_wolin_extPrint

; 49: endfunction 

    rts

; 50: string __wolin_lab_stringConst_0[uword] = $"dupa" 


__wolin_lab_stringConst_0:
    .asciiz "dupa"


