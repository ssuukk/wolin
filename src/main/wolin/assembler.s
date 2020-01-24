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

; function__wolin_pl_qus_wolin_onRasterGoto

__wolin_pl_qus_wolin_onRasterGoto:

; let788[uword]=SPF(0)<pl.qus.wolin.onRasterGoto.proc>[uword]


    ldy #0
    lda (__wolin_spf),y
    sta 788
    iny
    lda (__wolin_spf),y
    sta 788+1


; let53266[ubyte]=SPF(2)<pl.qus.wolin.onRasterGoto.line>[ubyte]


    ldy #2
    lda (__wolin_spf),y
    sta 53266


; freeSPF<pl.qus.wolin.onRasterGoto.__fnargs>,#3


    clc
    lda __wolin_spf
    adc #3
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; ret

    rts

; function__wolin_pl_qus_wolin_backgroundToBlue

__wolin_pl_qus_wolin_backgroundToBlue:

; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)[ubyte]=#140[ubyte]


    ldy #2
    lda #140
    sta (__wolin_spf),y

; letSPF(0)[uword]=#__wolin_pl_qus_wolin_backgroundToWhite[uword]


    ldy #0
    lda #<__wolin_pl_qus_wolin_backgroundToWhite
    sta (__wolin_spf),y
    iny
    lda #>__wolin_pl_qus_wolin_backgroundToWhite
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_onRasterGoto[adr]

    jsr __wolin_pl_qus_wolin_onRasterGoto

; let53280[ubyte]=#6[ubyte]


    lda #6
    sta 53280

; let53281[ubyte]=#6[ubyte]


    lda #6
    sta 53281

; let53273[ubyte]=#255[ubyte]


    lda #255
    sta 53273

; goto59953[adr]

    jmp 59953

; function__wolin_pl_qus_wolin_backgroundToWhite

__wolin_pl_qus_wolin_backgroundToWhite:

; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)[ubyte]=#160[ubyte]


    ldy #2
    lda #160
    sta (__wolin_spf),y

; letSPF(0)[uword]=#__wolin_pl_qus_wolin_backgroundToBlue[uword]


    ldy #0
    lda #<__wolin_pl_qus_wolin_backgroundToBlue
    sta (__wolin_spf),y
    iny
    lda #>__wolin_pl_qus_wolin_backgroundToBlue
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_onRasterGoto[adr]

    jsr __wolin_pl_qus_wolin_onRasterGoto

; let53280[ubyte]=#1[ubyte]


    lda #1
    sta 53280

; let53281[ubyte]=#1[ubyte]


    lda #1
    sta 53281

; let53273[ubyte]=#255[ubyte]


    lda #255
    sta 53273

; goto59953[adr]

    jmp 59953

; function__wolin_pl_qus_wolin_rasterBar

__wolin_pl_qus_wolin_rasterBar:

; let53280[ubyte]=#6[ubyte]


    lda #6
    sta 53280

; let53281[ubyte]=#6[ubyte]


    lda #6
    sta 53281

; bit53274[ubyte]=#1[ubyte],#1[bool]


    lda 53274
    ora #1
    sta 53274


; bit53265[ubyte]=#128[ubyte],#0[bool]


    lda 53265
    and #$ff-128
    sta 53265


; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)[ubyte]=#140[ubyte]


    ldy #2
    lda #140
    sta (__wolin_spf),y

; letSPF(0)[uword]=#__wolin_pl_qus_wolin_backgroundToBlue[uword]


    ldy #0
    lda #<__wolin_pl_qus_wolin_backgroundToBlue
    sta (__wolin_spf),y
    iny
    lda #>__wolin_pl_qus_wolin_backgroundToBlue
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_onRasterGoto[adr]

    jsr __wolin_pl_qus_wolin_onRasterGoto

; ret

    rts

; function__wolin_pl_qus_wolin_topRoutine

__wolin_pl_qus_wolin_topRoutine:

; bit53265[ubyte]=#8[ubyte],#1[bool]


    lda 53265
    ora #8
    sta 53265


; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)[ubyte]=#249[ubyte]


    ldy #2
    lda #249
    sta (__wolin_spf),y

; letSPF(0)[uword]=#__wolin_pl_qus_wolin_bottomRoutine[uword]


    ldy #0
    lda #<__wolin_pl_qus_wolin_bottomRoutine
    sta (__wolin_spf),y
    iny
    lda #>__wolin_pl_qus_wolin_bottomRoutine
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_onRasterGoto[adr]

    jsr __wolin_pl_qus_wolin_onRasterGoto

; let53273[ubyte]=#255[ubyte]


    lda #255
    sta 53273

; goto59953[adr]

    jmp 59953

; function__wolin_pl_qus_wolin_bottomRoutine

__wolin_pl_qus_wolin_bottomRoutine:

; bit53265[ubyte]=#8[ubyte],#0[bool]


    lda 53265
    and #$ff-8
    sta 53265


; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)[ubyte]=#255[ubyte]


    ldy #2
    lda #255
    sta (__wolin_spf),y

; letSPF(0)[uword]=#__wolin_pl_qus_wolin_topRoutine[uword]


    ldy #0
    lda #<__wolin_pl_qus_wolin_topRoutine
    sta (__wolin_spf),y
    iny
    lda #>__wolin_pl_qus_wolin_topRoutine
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_onRasterGoto[adr]

    jsr __wolin_pl_qus_wolin_onRasterGoto

; let53273[ubyte]=#255[ubyte]


    lda #255
    sta 53273

; goto59953[adr]

    jmp 59953

; function__wolin_pl_qus_wolin_openBorder

__wolin_pl_qus_wolin_openBorder:

; bit53269[ubyte]=#1[ubyte],#1[bool]


    lda 53269
    ora #1
    sta 53269


; bit53277[ubyte]=#1[ubyte],#1[bool]


    lda 53277
    ora #1
    sta 53277


; bit53271[ubyte]=#1[ubyte],#1[bool]


    lda 53271
    ora #1
    sta 53271


; let53248[ubyte]=#100[ubyte]


    lda #100
    sta 53248

; let53249[ubyte]=#30[ubyte]


    lda #30
    sta 53249

; let53287[ubyte]=#2[ubyte]


    lda #2
    sta 53287

; let53281[ubyte]=#0[ubyte]


    lda #0
    sta 53281

; let__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte]=#0[ubyte]


    lda #0
    sta __wolin_pl_qus_wolin_i

; allocSP<__wolin_reg98>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; allocSP<__wolin_reg101>,#2


    dex
    dex

; letSP(0)<__wolin_reg101>[ubyte*]=12288[ubyte*],__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte]


    ldy __wolin_pl_qus_wolin_i
    lda 12288,y
    sta 0,x

; allocSP<__wolin_reg103>,#2


    dex
    dex

; letSP(0)<__wolin_reg103>[ubyte*]=__wolin_pl_qus_wolin_spriteData[ubyte*],__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte]


    ldy __wolin_pl_qus_wolin_i
    lda __wolin_pl_qus_wolin_spriteData,y
    sta 0,x

; let&SP(2)<__wolin_reg101>[ubyte*]=&SP(0)<__wolin_reg103>[ubyte*]


    lda (0,x)
    sta (2,x)


; freeSP<__wolin_reg103>,#2


    inx
    inx

; freeSP<__wolin_reg101>,#2


    inx
    inx

; add__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte],#1[ubyte]


    inc __wolin_pl_qus_wolin_i

; evallessSP(0)<__wolin_reg98>[bool]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte],#64[ubyte]


    lda #1 ; mniejsze
    sta 0,x
    lda __wolin_pl_qus_wolin_i
    cmp #64
    bcc :+
    lda #0 ; jednak wieksze
    sta 0,x
:


; beqSP(0)<__wolin_reg98>[bool]=#1[bool],__wolin_lab_loopStart_1<label_po_if>[uword]


    lda 0,x
    bne __wolin_lab_loopStart_1

; label__wolin_lab_loopEnd_1

__wolin_lab_loopEnd_1:

; freeSP<__wolin_reg98>,#1

    inx

; bit53274[ubyte]=#1[ubyte],#1[bool]


    lda 53274
    ora #1
    sta 53274


; bit53265[ubyte]=#128[ubyte],#0[bool]


    lda 53265
    and #$ff-128
    sta 53265


; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(2)[ubyte]=#249[ubyte]


    ldy #2
    lda #249
    sta (__wolin_spf),y

; letSPF(0)[uword]=#__wolin_pl_qus_wolin_bottomRoutine[uword]


    ldy #0
    lda #<__wolin_pl_qus_wolin_bottomRoutine
    sta (__wolin_spf),y
    iny
    lda #>__wolin_pl_qus_wolin_bottomRoutine
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_onRasterGoto[adr]

    jsr __wolin_pl_qus_wolin_onRasterGoto

; ret

    rts

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; letCPU.I[bool]=#1[bool]


    sei


; let56333[ubyte]=#127[ubyte]


    lda #127
    sta 56333

; allocSPF,#0

 

; call__wolin_pl_qus_wolin_openBorder[adr]

    jsr __wolin_pl_qus_wolin_openBorder

; letCPU.I[bool]=#0[bool]


    cli


; allocSP<__wolin_reg128>,#1

    dex

; label__wolin_lab_loopStart_2

__wolin_lab_loopStart_2:

; add__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte],#1[ubyte]


    inc __wolin_pl_qus_wolin_i

; evallessSP(0)<__wolin_reg128>[bool]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte],#255[ubyte]


    lda #1 ; mniejsze
    sta 0,x
    lda __wolin_pl_qus_wolin_i
    cmp #255
    bcc :+
    lda #0 ; jednak wieksze
    sta 0,x
:


; beqSP(0)<__wolin_reg128>[bool]=#1[bool],__wolin_lab_loopStart_2<label_po_if>[uword]


    lda 0,x
    bne __wolin_lab_loopStart_2

; label__wolin_lab_loopEnd_2

__wolin_lab_loopEnd_2:

; freeSP<__wolin_reg128>,#1

    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_spriteData

__wolin_pl_qus_wolin_spriteData:

; alloc0[ubyte*]

    .byte 1,2,3,4

; label__wolin_pl_qus_wolin_i

__wolin_pl_qus_wolin_i:

; alloc0[ubyte]

    .byte 0

