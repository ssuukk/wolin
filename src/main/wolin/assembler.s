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

; allocSP<__wolin_reg3>,#1

    dex

; label__wolin_lab_loop_start_1

__wolin_lab_loop_start_1:

; allocSP<__wolin_reg7>,#2


    dex
    dex

; letSP(0)<__wolin_reg7>[ubyte*]=#1024[uword]


    lda #<1024
    sta 0,x
    lda #>1024
    sta 0+1,x

; addSP(0)<__wolin_reg7>[ubyte*]=SP(0)<__wolin_reg7>[ubyte*],__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]


    clc
    lda 0,x
    adc __wolin_pl_qus_wolin_i
    sta 0,x
    lda 0+1,x
    adc __wolin_pl_qus_wolin_i+1
    sta 0+1,x

; freeSP<__wolin_reg7>,#2


    inx
    inx

; let&SP(-2)<__wolin_reg7>[ubyte*]=__wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte]


    lda __wolin_pl_qus_wolin_chr
    sta (-2,x)

; add__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword],#1[uword]


    clc
    lda __wolin_pl_qus_wolin_i
    adc #<1
    sta __wolin_pl_qus_wolin_i
    lda __wolin_pl_qus_wolin_i+1
    adc #>1
    sta __wolin_pl_qus_wolin_i+1


; add__wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte]=__wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte],#1[ubyte]


    inc __wolin_pl_qus_wolin_chr

; evallessSP(0)<__wolin_reg3>[bool]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword],#1000[uword]


    lda #1 ; mniejsze
    sta 0,x
    lda __wolin_pl_qus_wolin_i+1
    cmp #>1000
    bcc :+ ; mniejsze
    lda __wolin_pl_qus_wolin_i
    cmp #<1000
    bcc :+ ; mniejsze
    lda #0 ; jednak wieksze
    sta 0,x
:


; beqSP(0)<__wolin_reg3>[bool]=#1[bool],__wolin_lab_loop_start_1<label_po_if>[uword]


    lda 0,x
    bne __wolin_lab_loop_start_1

; label__wolin_lab_loop_end_1

__wolin_lab_loop_end_1:

; freeSP<__wolin_reg3>,#1

    inx

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

; allocSPF,#1


    sec
    lda __wolin_spf
    sbc #1
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

