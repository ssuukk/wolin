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

; setupSP=143[ubyte]


; prepare program stack
__wolin_sp_top := 143 ; program stack top
__wolin_sp_top_hi := 143+1 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; setupHEAP=176[ubyte]


__wolin_this_ptr := 176
__wolin_this_ptr_hi := 176+1


; let__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=#0[ubyte]


    lda #<0
    sta __wolin_pl_qus_wolin_i
    lda #>0
    sta __wolin_pl_qus_wolin_i+1

; let__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte]=#0[ubyte]


    lda 0
    sta __wolin_pl_qus_wolin_znak

; allocSPF,#0

 

; call__wolin_pl_qus_wolin_main[adr]

    jsr __wolin_pl_qus_wolin_main

; freeSPF<unit>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; label__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg4>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; evallessSP(0)<__wolin_reg4>[bool]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword],#1000[uword]


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


; bneSP(0)<__wolin_reg4>[bool]=#1[bool],__wolin_lab_loopEnd_1<label_po_if>[adr]


    lda 0,x
    beq __wolin_lab_loopEnd_1

; allocSP<__wolin_reg9>,#2


    dex
    dex

; allocSP<__wolin_reg10>,#2


    dex
    dex

; letSP(0)<__wolin_reg10>[ubyte*]=1024[ubyte*]


    lda #<1024
    sta 0,x
    lda #>1024
    sta 0+1,x

; add__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword],#1[uword]


    clc
    lda __wolin_pl_qus_wolin_i
    adc #<1
    sta __wolin_pl_qus_wolin_i
    lda __wolin_pl_qus_wolin_i+1
    adc #>1
    sta __wolin_pl_qus_wolin_i+1


; addSP(0)<__wolin_reg10>[ubyte*]=SP(0)<__wolin_reg10>[ubyte*],__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword]


    clc
    lda 0,x
    adc __wolin_pl_qus_wolin_i
    sta 0,x
    lda 0+1,x
    adc __wolin_pl_qus_wolin_i+1
    sta 0+1,x

; letSP(2)<__wolin_reg9>[ubyte*]=SP(0)<__wolin_reg10>[ubyte*]


    lda 0,x
    sta 2,x
    lda 0+1,x
    sta 2+1,x

; freeSP<__wolin_reg10>,#2


    inx
    inx

; add__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte]=__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte],#1[ubyte]


    inc __wolin_pl_qus_wolin_znak

; let&SP(0)<__wolin_reg9>[ubyte*]=__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte]


    lda __wolin_pl_qus_wolin_znak
    sta (0,x)

; freeSP<__wolin_reg9>,#2


    inx
    inx

; goto__wolin_lab_loopStart_1[adr]

    jmp __wolin_lab_loopStart_1

; label__wolin_lab_loopEnd_1

__wolin_lab_loopEnd_1:

; freeSP<__wolin_reg4>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_i

__wolin_pl_qus_wolin_i:

; alloc0[uword]

    .word 0

; label__wolin_pl_qus_wolin_znak

__wolin_pl_qus_wolin_znak:

; alloc0[ubyte]

    .byte 0

