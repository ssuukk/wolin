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

 

; call__wolin_pl_qus_wolin_main[adr]

    jsr __wolin_pl_qus_wolin_main

; ret

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSPF,#1


    clc
    lda __wolin_spf
    sbc #1
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; saveSP


    txa
    pha

; save#65[ubyte]


    lda #65
    pha


; restoreCPU.A[ubyte]


    pla

; call65490[adr]

    jsr 65490

; restoreSP


    pla
    tax

; allocSPF,#1


    clc
    lda __wolin_spf
    sbc #1
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; saveSP


    txa
    pha

; save#66[ubyte]


    lda #66
    pha


; restoreCPU.A[ubyte]


    pla

; call65490[adr]

    jsr 65490

; letSPF(0)<pl.qus.wolin.chrout.__returnValue>[bool]=CPU.C[bool]


    ldy #0
    lda #1
    bcs :+
    lda #0
:
    sta (__wolin_spf),y



; restoreSP


    pla
    tax

; let__wolin_pl_qus_wolin_wynik<pl.qus.wolin.wynik>[bool]=SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool]


    ldy #0
    lda (__wolin_spf),y
    sta __wolin_pl_qus_wolin_wynik


; freeSPF<pl.qus.wolin.chrout.__returnValue>,#1


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; freeSPF<pl.qus.wolin.chrout.__returnValue>,#1


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_wynik

__wolin_pl_qus_wolin_wynik:

; alloc0[bool]

    .byte 0

