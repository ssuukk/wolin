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


; allocSPF,#0

 

; call__wolin_pl_qus_wolin_main[adr]

    jsr __wolin_pl_qus_wolin_main

; ret

    rts

; function__wolin_pl_qus_wolin_suma

__wolin_pl_qus_wolin_suma:

; allocSP<__wolin_reg1>,#2


    dex
    dex

; letSP(0)<__wolin_reg1>[ubyte*]=*SPF(1)<pl.qus.wolin.suma.a>[ubyte]


    clc
    lda __wolin_spf
    adc #1
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; add&SP(0)<__wolin_reg1>[ubyte*]=&SP(0)<__wolin_reg1>[ubyte*],SPF(0)<pl.qus.wolin.suma.b>[ubyte]


    clc
    lda (0,x)
    ldy #0
    adc (__wolin_spf), y
    sta (0,x)


; letSPF(2)<pl.qus.wolin.suma.__returnValue>[ubyte]=&SP(0)<__wolin_reg1>[ubyte*]


    lda (0,x)
    ldy #2
    sta (__wolin_spf),y


; freeSP<__wolin_reg1>,#2


    inx
    inx

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

; bit53269[ubyte]=#1[ubyte],#1[bool]


    lda 53269
    ora 1
    sta 53269


; bit53277[ubyte]=#1[ubyte],#1[bool]


    lda 53277
    ora 1
    sta 53277


; bit53271[ubyte]=#1[ubyte],#1[bool]


    lda 53271
    ora 1
    sta 53271


; let53248[ubyte]=#100[ubyte]


    lda #100
    sta 53248

; let53249[ubyte]=#100[ubyte]


    lda #100
    sta 53249

; let53287[ubyte]=#2[ubyte]


    lda #2
    sta 53287

; allocSP<__wolin_reg22>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; add53248[ubyte]=53248[ubyte],#1[ubyte]


    inc 53248

; add53249[ubyte]=53249[ubyte],#1[ubyte]


    inc 53249

; letSP(0)<__wolin_reg22>[bool]=#1[bool]


    lda #1
    sta 0,x

; beqSP(0)<__wolin_reg22>[bool]=#1[bool],__wolin_lab_loopStart_1<label_po_if>[uword]


    lda 0,x
    bne __wolin_lab_loopStart_1

; label__wolin_lab_loopEnd_1

__wolin_lab_loopEnd_1:

; freeSP<__wolin_reg22>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

