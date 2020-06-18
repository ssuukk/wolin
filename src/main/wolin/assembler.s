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

; 8: import _clrscr 


    .import _clrscr

; 9: import _wherex 


    .import _wherex

; 10: function __wolin_pl_qus_wolin_main 

__wolin_pl_qus_wolin_main:

; 11: save SP 


    txa
    pha

; 12: call _clrscr[uword] 

    jsr _clrscr

; 13: restore SP 


    pla
    tax

; 14: alloc SPF<_wherex> , #1 


    sec
    lda __wolin_spf
    sbc #1
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; 15: save SP 


    txa
    pha

; 16: call _wherex[uword] 

    jsr _wherex

; 17: let SPF(0)<pl.qus.wolin.wherex.__returnValue>[ubyte] = CPU.A 


    ldy #0
    sta (__wolin_spf),y


; 18: restore SP 


    pla
    tax

; 19: free SPF<pl.qus.wolin.wherex.__returnValue> , #1 


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 21: free SPF<__wolin_pl_qus_wolin_main> , #1 


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; 22: endfunction 

    rts

