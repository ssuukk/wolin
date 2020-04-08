; 1: setup HEADER 


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


; 2: setup SPF = 251[ubyte] , 40959[uword] 


; prepare function stack
__wolin_spf := 251 ; function stack ptr
__wolin_spf_hi := 251+1 ; function stack ptr

__wolin_spf_top := 40959 ; function stack top
__wolin_spf_top_hi := 40959+1 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; 3: setup SP = 114[ubyte] 


; prepare program stack
__wolin_sp_top := 114 ; program stack top
__wolin_sp_top_hi := 114+1 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; 4: setup HEAP = 176[ubyte] 


__wolin_this_ptr := 176
__wolin_this_ptr_hi := 176+1


; 5: call __wolin_pl_qus_wolin_main[uword] 

    jsr __wolin_pl_qus_wolin_main

; 6: endfunction 

    rts

; 7: function __wolin_pl_qus_wolin_printAt 

__wolin_pl_qus_wolin_printAt:

; 8: let CPU.C[bool] = #1[bool] 


    sec


; 9: save SP 


    txa
    pha

; 10: save SPF(3)<pl.qus.wolin.printAt.x>[ubyte] 


    ldy #3
    lda (__wolin_spf),y
    pha


; 11: save SPF(2)<pl.qus.wolin.printAt.y>[ubyte] 


    ldy #2
    lda (__wolin_spf),y
    pha


; 12: restore CPU.Y[ubyte] 


    pla
    tay

; 13: restore CPU.X[ubyte] 


    pla
    tax

; 14: call 65520[uword] 

    jsr 65520

; 15: restore SP 


    pla
    tax

; 16: alloc SPF , #5 


    sec
    lda __wolin_spf
    sbc #5
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 18: call __wolin_pl_qus_wolin_print[uword] 

    jsr __wolin_pl_qus_wolin_print

; 19: free SPF<pl.qus.wolin.printAt.__fnargs> , #4 


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 20: endfunction 

    rts

; 21: function __wolin_pl_qus_wolin_print 

__wolin_pl_qus_wolin_print:

; 22: let SPF(2)<pl.qus.wolin.print..i>[ubyte] = #0[ubyte] 


    ldy #2
    lda #0
    sta (__wolin_spf),y

; 23: alloc SP<__wolin_reg14> , #2 


    dex
    dex

; 25: free SP<__wolin_reg14> , #1 

    inx

; 26: label __wolin_lab_loop_start_1 

__wolin_lab_loop_start_1:

; 28: bne SP(0)<__wolin_reg18>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 


    lda 0,x
    beq __wolin_lab_loop_end_1

; 29: save SP 


    txa
    pha

; 30: save SPF(0)<pl.qus.wolin.print..char>[ubyte*] 


    ldy #0
    lda (__wolin_spf),y
    pha
    iny
    lda (__wolin_spf),y
    pha


; 31: restore CPU.A[ubyte] 


    pla

; 32: call 65490[uword] 

    jsr 65490

; 33: restore SP 


    pla
    tax

; 34: add SPF(2)<pl.qus.wolin.print..i>[ubyte] = SPF(2)<pl.qus.wolin.print..i>[ubyte] , #1[ubyte] 


    clc
    ldy #2
    lda #1
    adc (__wolin_spf),y
    sta (__wolin_spf),y


; 35: alloc SP<__wolin_reg27> , #2 


    dex
    dex

; 37: free SP<__wolin_reg27> , #2 


    inx
    inx

; 38: goto __wolin_lab_loop_start_1[uword] 

    jmp __wolin_lab_loop_start_1

; 39: label __wolin_lab_loop_end_1 

__wolin_lab_loop_end_1:

; 40: free SP<__wolin_reg18> , #1 

    inx

; 41: free SPF<pl.qus.wolin.print.__fnargs> , #5 


    clc
    lda __wolin_spf
    adc #5
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 42: endfunction 

    rts

; 43: function __wolin_pl_qus_wolin_main 

__wolin_pl_qus_wolin_main:

; 44: alloc SPF , #5 


    sec
    lda __wolin_spf
    sbc #5
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 45: let SPF(3)[ubyte*] = #__wolin_lab_stringConst_0[uword] 


    lda #<__wolin_lab_stringConst_0
    ldy #3
    sta (__wolin_spf),y
    lda #>__wolin_lab_stringConst_0
    iny
    sta (__wolin_spf),y

; 46: call __wolin_pl_qus_wolin_print[uword] 

    jsr __wolin_pl_qus_wolin_print

; 47: endfunction 

    rts

; 48: string __wolin_lab_stringConst_0[uword] = $"dupa" 


__wolin_lab_stringConst_0:
    .asciiz {val}
    ;.byt 0


