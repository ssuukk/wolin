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

; call__wolin_pl_qus_wolin_main[adr]

    jsr __wolin_pl_qus_wolin_main

; ret

    rts

; function__wolin_pl_qus_wolin_allocMem

__wolin_pl_qus_wolin_allocMem:

; letSPF(4)<pl.qus.wolin.allocMem.__returnValue>[uword]=#30000[uword]


    ldy #4
    lda #<30000
    sta (__wolin_spf),y
    iny
    lda #>30000
    sta (__wolin_spf),y

; freeSPF<pl.qus.wolin.allocMem.__fnargs>,#4


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; function__wolin_pl_qus_wolin_SummingClass

__wolin_pl_qus_wolin_SummingClass:

; allocSPF,#6


    clc
    lda __wolin_spf
    sbc #6
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)<pl.qus.wolin.allocMem.size>[uword]=#3[uword]


    ldy #2
    lda #<3
    sta (__wolin_spf),y
    iny
    lda #>3
    sta (__wolin_spf),y

; letSPF(0)<pl.qus.wolin.allocMem.count>[uword]=#1[uword]


    ldy #0
    lda #<1
    sta (__wolin_spf),y
    iny
    lda #>1
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_allocMem[adr]

    jsr __wolin_pl_qus_wolin_allocMem

; letSPF(2)<pl.qus.wolin.SummingClass.__returnValue>[any*]=SPF(0)<pl.qus.wolin.allocMem.__returnValue>[uword]


    ldy #0
    lda (__wolin_spf),y
    ldy #2
    sta (__wolin_spf),y
    ldy #0+1
    lda (__wolin_spf),y
    ldy #2+1
    sta (__wolin_spf),y


; pointHEAP=SPF(0)<pl.qus.wolin.allocMem.__returnValue>[uword]


    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1

; freeSPF<pl.qus.wolin.allocMem.__returnValue>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; letHEAP(2)<pl.qus.wolin.SummingClass.x>[ubyte]=#1[ubyte]


    lda #1
    ldy #2
    sta (__wolin_this_ptr),y

; letHEAP(1)<pl.qus.wolin.SummingClass.y>[ubyte]=#1[ubyte]


    lda #1
    ldy #1
    sta (__wolin_this_ptr),y

; ret

    rts

; function__wolin_pl_qus_wolin_SummingClass_sum

__wolin_pl_qus_wolin_SummingClass_sum:

; pointHEAP=this


    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1

; freeSPF<pl.qus.wolin.SummingClass.sum.__fnargs>,#2


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

; allocSP<__wolin_reg11>,#2


    dex
    dex

; letSP(0)<__wolin_reg11>[any*]=SPF(0)<pl.qus.wolin.main..obj>[any*]


    ldy #0
    lda (__wolin_spf),y
    sta 0,x
    iny
    lda (__wolin_spf),y
    sta 0+1,x

; allocSPF,#2


    clc
    lda __wolin_spf
    sbc #2
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; call__wolin_pl_qus_wolin_SummingClass[adr]

    jsr __wolin_pl_qus_wolin_SummingClass

; freeSPF<pl.qus.wolin.SummingClass.__returnValue>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; freeSP<__wolin_reg11>,#2


    inx
    inx

; pointHEAP=SPF(0)<pl.qus.wolin.main..obj>[any*]


    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1

; let&SP(0)<__wolin_reg14>[ubyte*]=#2[ubyte]


    lda #2
    sta (0,x)

; pointHEAP=SPF(0)<pl.qus.wolin.main..obj>[any*]


    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1

; let&SP(0)<__wolin_reg19>[ubyte*]=#4[ubyte]


    lda #4
    sta (0,x)

; pointHEAP=SPF(0)<pl.qus.wolin.main..obj>[any*]


    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1

; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(0)[any*]=SPF(0)<pl.qus.wolin.main..obj>[any*]


    ldy #0
    lda (__wolin_spf),y
    ldy #0
    sta (__wolin_spf),y
    ldy #0
    iny
    lda (__wolin_spf),y
    ldy #0
    iny
    sta (__wolin_spf),y


; call__wolin_pl_qus_wolin_SummingClass_sum[adr]

    jsr __wolin_pl_qus_wolin_SummingClass_sum

; freeSPF<pl.qus.wolin.SummingClass.sum.__returnValue>,#1


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; let53280[ubyte]=SPF(0)<pl.qus.wolin.SummingClass.sum.__returnValue>[ubyte]


    ldy #0
    lda (__wolin_spf),y
    sta 53280


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

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

