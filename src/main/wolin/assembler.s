; setupHEADER


;**********************************************
;*
;* BASIC header
;*
;* compile with:
;* cl65.exe -o assembler.prg -t c64 -C c64-asm.cfg assembler.s
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
__wolin_spf = 251 ; function stack ptr
__wolin_spf_top = 40959 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; setupSP=143[ubyte]


; prepare program stack
__wolin_sp_top = 143 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; goto__wolin_pl_qus_wolin_main[adr]

    jmp __wolin_pl_qus_wolin_main

; allocSP<__wolin_reg0>,#1

    dex

; letSP(0)<__wolin_reg0>[ubyte]=#0[ubyte]


    lda #0
    sta 0,x

; let__wolin_pl_qus_wolin_d<pl.qus.wolin.d>[uword]=SP(0)<__wolin_reg0>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_d
    lda #0
    sta __wolin_pl_qus_wolin_d+1


; freeSP<__wolin_reg0>,#1

    inx

; label__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg1>,#1

    dex

; allocSP<__wolin_reg2>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; allocSP<__wolin_reg3>,#1

    dex

; letSP(0)<__wolin_reg3>[ubyte]=53280[ubyte]


    lda 53280
    sta 0,x

; allocSP<__wolin_reg4>,#1

    dex

; letSP(0)<__wolin_reg4>[ubyte]=#255[ubyte]


    lda #255
    sta 0,x

; evallessSP(2)<__wolin_reg2>[bool]=SP(1)<__wolin_reg3>[ubyte],SP(0)<__wolin_reg4>[ubyte]


    lda #1 ; mniejsze
    sta 2,x
    lda 1,x
    cmp 0,x
    bcc :+
    lda #0 ; jednak wieksze
    sta 2,x
:

; freeSP<__wolin_reg4>,#1

    inx

; freeSP<__wolin_reg3>,#1

    inx

; bneSP(0)<__wolin_reg2>[bool]=#1[bool],__wolin_lab_loopEnd_1<label_po_if>[adr]


    lda 0,x
    beq __wolin_lab_loopEnd_1

; add53280[ubyte]=53280[ubyte],#1[ubyte]


    inc 53280

; goto__wolin_lab_loopStart_1[adr]

    jmp __wolin_lab_loopStart_1

; label__wolin_lab_loopEnd_1

__wolin_lab_loopEnd_1:

; freeSP<__wolin_reg2>,#1

    inx

; freeSP<__wolin_reg1>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_d

__wolin_pl_qus_wolin_d:

; alloc0[uword]

    .word 0

