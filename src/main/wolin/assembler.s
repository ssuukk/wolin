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


; allocSPF,#2


    clc
    lda __wolin_spf
    sbc #2
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; call__wolin_pl_qus_wolin_main[uword]

    jsr __wolin_pl_qus_wolin_main

; ret

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; letSPF(1)<pl.qus.wolin.main..a>[ubyte]=#4[ubyte]


    ldy #1
    lda #4
    sta (__wolin_spf),y

; letSPF(0)<pl.qus.wolin.main..b>[ubyte]=#8[ubyte]


    ldy #0
    lda #8
    sta (__wolin_spf),y

; allocSP<__wolin_reg6>,#2


    dex
    dex

; letSP(0)<__wolin_reg6>[ubyte*]=*53280[ubyte]


    lda #<53280
    sta 0,x
    lda #>53280
    sta 0+1,x

; allocSP<__wolin_reg7>,#2


    dex
    dex

; let&SP(2)<__wolin_reg6>[ubyte*]=&SP(0)<__wolin_reg7>[ubyte*]


    lda (0,x)
    sta (2,x)


; freeSP<__wolin_reg7>,#4


    inx
    inx
    inx
    inx

; freeSPF<pl.qus.wolin.main.__fnargs>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

