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

; label__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg2>,#1

    dex

; allocSP<__wolin_reg3>,#2


    dex
    dex

; letSP(0)<__wolin_reg3>[ptr]=1024[ptr]


    lda #<1024
    sta 0,x
    lda #>1024
    sta 0+1,x

; allocSP<__wolin_reg4>,#2


    dex
    dex

; letSP(0)<__wolin_reg4>[uword]=#0[ubyte]


    lda #0
    sta 0,x
    lda #0
    sta 0+1,x

; addSP(2)<__wolin_reg3>[ptr]=SP(2)<__wolin_reg3>[ptr],SP(0)<__wolin_reg4>[uword]


    clc
    lda 2,x
    adc 0,x
    sta 2,x
    lda 2+1,x
    adc 0+1,x
    sta 2+1,x

; freeSP<__wolin_reg4>,#2


    inx
    inx

; letSP(2)<__wolin_reg2>[ptr]=SP(0)<__wolin_reg3>[ptr]


    lda 0,x
    sta 2,x
    lda 0+1,x
    sta 2+1,x


; freeSP<__wolin_reg3>,#2


    inx
    inx

; allocSP<__wolin_reg5>,#1

    dex

; letSP(0)<__wolin_reg5>[ubyte]=#65[ubyte]


    lda #65
    sta 0,x

; letSP(1)<__wolin_reg2>[ptr]=SP(0)<__wolin_reg5>[ubyte]


    lda 0,x
    sta (1,x)


; freeSP<__wolin_reg5>,#1

    inx

; freeSP<__wolin_reg2>,#2


    inx
    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

