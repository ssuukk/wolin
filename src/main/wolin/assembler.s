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
    lda #0
    sta __wolin_pl_qus_wolin_i+1

; let__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte]=#0[ubyte]


    lda #0
    sta __wolin_pl_qus_wolin_znak

; allocSPF,#0

 

; call__wolin_pl_qus_wolin_main[adr]

    jsr __wolin_pl_qus_wolin_main

; freeSPF<unit>,#0

 

; ret

    rts

; label__wolin_pl_qus_wolin_suma

__wolin_pl_qus_wolin_suma:

; allocSP<__wolin_reg3>,#2


    dex
    dex

; letSP(0)<__wolin_reg3>[ubyte*]=*SPF(1)<pl.qus.wolin.suma.a>[ubyte]


    clc
    lda __wolin_spf
    adc #1
    sta 0,x
    lda __wolin_spf+1
    adc #0
    sta 0+1,x

; add&SP(0)<__wolin_reg3>[ubyte*]=&SP(0)<__wolin_reg3>[ubyte*],SPF(0)<pl.qus.wolin.suma.b>[ubyte]


    clc
    lda (0,x)
    ldy #0
    adc (__wolin_spf), y
    sta (0,x)


; letSPF(2)<returnValue>[ubyte]=&SP(0)<__wolin_reg3>[ubyte*]


    lda (0,x)
    ldy #2
    sta (__wolin_spf),y


; freeSP<__wolin_reg3>,#2


    inx
    inx

; freeSPF,#2


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

; allocSP<__wolin_reg7>,#2


    dex
    dex

; letSP(0)<__wolin_reg7>[ubyte*]=53280[ubyte*]


    lda #<53280
    sta 0,x
    lda #>53280
    sta 0+1,x

; allocSP<__wolin_reg8>,#1

    dex

; allocSPF,#3


    clc
    lda __wolin_spf
    sbc #3
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:

; letSPF(1)[ubyte]=#2[ubyte]


    ldy #1
    lda #2
    sta (__wolin_spf),y

; letSPF(0)[ubyte]=#2[ubyte]


    ldy #0
    lda #2
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_suma[adr]

    jsr __wolin_pl_qus_wolin_suma

; letSP(0)<__wolin_reg8>[ubyte]=SPF(0)<returnValue>[ubyte]


    ldy #0
    lda (__wolin_spf),y
    sta 0,x


; freeSPF<ubyte>,#1


    clc
    lda __wolin_spf
    adc #1
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:

; let&SP(1)<__wolin_reg7>[ubyte*]=SP(0)<__wolin_reg8>[ubyte]


    lda 0,x
    sta (1,x)

; freeSP<__wolin_reg8>,#1

    inx

; freeSP<__wolin_reg7>,#2


    inx
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

