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


; allocSP<__wolin_reg0>,#1

    dex

; letSP(0)<__wolin_reg0>[ubyte]=#2[ubyte]


    lda #2
    sta 0,x

; let__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]=SP(0)<__wolin_reg0>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_b


; freeSP<__wolin_reg0>,#1

    inx

; allocSP<__wolin_reg1>,#1

    dex

; letSP(0)<__wolin_reg1>[ubyte]=#1[ubyte]


    lda #1
    sta 0,x

; let__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte]=SP(0)<__wolin_reg1>[ubyte]


    lda 0,x
    sta __wolin_pl_qus_wolin_a


; freeSP<__wolin_reg1>,#1

    inx

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

; allocSP<__wolin_reg4>,#2


    dex
    dex

; letSP(0)<__wolin_reg4>[ubyte*]=*__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte]


    lda #<__wolin_pl_qus_wolin_a
    sta 0,x
    lda #>__wolin_pl_qus_wolin_a
    sta 0+1,x


; allocSP<__wolin_reg5>,#2


    dex
    dex

; letSP(0)<__wolin_reg5>[ubyte*]=*__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte]


    lda #<__wolin_pl_qus_wolin_b
    sta 0,x
    lda #>__wolin_pl_qus_wolin_b
    sta 0+1,x


; let&SP(2)<__wolin_reg4>[ubyte*]=&SP(0)<__wolin_reg5>[ubyte*]


    lda (0,x)
    sta (2,x)


; freeSP<__wolin_reg5>,#2


    inx
    inx

; freeSP<__wolin_reg4>,#2


    inx
    inx

; allocSP<__wolin_reg7>,#2


    dex
    dex

; letSP(0)<__wolin_reg7>[ubyte*]=53280[ubyte*]


    lda #<53280
    sta 0,x
    lda #>53280
    sta 0+1,x


; allocSP<__wolin_reg8>,#2


    dex
    dex

; letSP(0)<__wolin_reg8>[ubyte*]=*__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte]


    lda #<__wolin_pl_qus_wolin_a
    sta 0,x
    lda #>__wolin_pl_qus_wolin_a
    sta 0+1,x


; let&SP(2)<__wolin_reg7>[ubyte*]=&SP(0)<__wolin_reg8>[ubyte*]


    lda (0,x)
    sta (2,x)


; freeSP<__wolin_reg8>,#2


    inx
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

; label__wolin_pl_qus_wolin_b

__wolin_pl_qus_wolin_b:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_a

__wolin_pl_qus_wolin_a:

; alloc0[ubyte]

    .byte 0

