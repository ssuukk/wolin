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

 

; call__wolin_pl_qus_wolin_main[adr]

    jsr __wolin_pl_qus_wolin_main

; ret

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg4>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; bneSP(0)<__wolin_reg4>[bool]=#1[bool],__wolin_lab_loopEnd_1<label_po_if>[adr]


    lda 0,x
    beq __wolin_lab_loopEnd_1

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

; label__wolin_pl_qus_wolin_chr

__wolin_pl_qus_wolin_chr:

; alloc0[ubyte]

    .byte 0

