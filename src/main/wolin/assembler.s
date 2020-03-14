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

; function__wolin_pl_qus_wolin_openCommandChannel

__wolin_pl_qus_wolin_openCommandChannel:

; allocSPF,#0

 

; saveSP


    txa
    pha

; saveSPF(3)<pl.qus.wolin.openCommandChannel.lfn>[ubyte]


    ldy #3
    lda (__wolin_spf),y
    pha


; saveSPF(2)<pl.qus.wolin.openCommandChannel.device>[ubyte]


    ldy #2
    lda (__wolin_spf),y
    pha


; save#15[ubyte]


    lda #15
    pha


; restoreCPU.Y[ubyte]


    pla
    tay

; restoreCPU.X[ubyte]


    pla
    tax

; restoreCPU.A[ubyte]


    pla

; call65466[uword]

    jsr 65466

; restoreSP


    pla
    tax

; allocSPF,#0

 

; saveSP


    txa
    pha

; save#10[ubyte]


    lda #10
    pha


; saveSPF(0)<pl.qus.wolin.openCommandChannel.command>[ubyte*]


    ldy #0
    lda (__wolin_spf),y
    pha
    ldy #0+1
    lda (__wolin_spf),y
    pha


; restoreCPU.XY[ubyte*]


    pla
    tay
    pla
    tax


; restoreCPU.A[ubyte]


    pla

; call65469[uword]

    jsr 65469

; restoreSP


    pla
    tax

; freeSPF<pl.qus.wolin.openCommandChannel.__fnargs>,#4


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; endfunction

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSPF,#4


    sec
    lda __wolin_spf
    sbc #4
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(3)[ubyte]=#15[ubyte]


    ldy #3
    lda #15
    sta (__wolin_spf),y

; letSPF(2)[ubyte]=#8[ubyte]


    ldy #2
    lda #8
    sta (__wolin_spf),y

; letSPF(0)[ubyte*]=#__wolin_lab_stringConst_0[uword]


    lda #<__wolin_lab_stringConst_0
    ldy #0
    sta (__wolin_spf),y
    lda #>__wolin_lab_stringConst_0
    iny
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_openCommandChannel[uword]

    jsr __wolin_pl_qus_wolin_openCommandChannel

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

; string__wolin_lab_stringConst_0[uword]=$"DUPA"


__wolin_lab_stringConst_0:
    .str {val}


