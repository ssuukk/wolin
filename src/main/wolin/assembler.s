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


; allocSPF,#0

 

; call__wolin_pl_qus_wolin_main[uword]

    jsr __wolin_pl_qus_wolin_main

; ret

    rts

; function__wolin_pl_qus_wolin_suma

__wolin_pl_qus_wolin_suma:

; addSPF(2)<pl.qus.wolin.suma.__returnValue>[ubyte]=SPF(1)<pl.qus.wolin.suma.a>[ubyte],SPF(0)<pl.qus.wolin.suma.b>[ubyte]

	sec
	lda #10
	sta 1024
	lda #20
	adc 1024

    clc
    ldy #1
    lda (__wolin_spf), y
    ldy #0
    adc (__wolin_spf), y
    ldy #2
    sta (__wolin_spf), y


; freeSPF<pl.qus.wolin.suma.__fnargs>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(1)[ubyte]=#4[ubyte]


    ldy #1
    lda #4
    sta (__wolin_spf),y

; letSPF(0)[ubyte]=#6[ubyte]


    ldy #0
    lda #6
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_suma[uword]

    jsr __wolin_pl_qus_wolin_suma

; freeSPF<pl.qus.wolin.suma.__returnValue>,#1


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; let53280[ubyte]=SPF(0)<pl.qus.wolin.suma.__returnValue>[ubyte]


    ldy #0
    lda (__wolin_spf),y
    sta 53280


; ret

    rts

