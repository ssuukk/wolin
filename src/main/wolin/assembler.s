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

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; allocSP<__wolin_reg2>,#2


    dex
    dex

; letSP(0)<__wolin_reg2>[ubyte*]=53269[ubyte*]


    lda #<53269
    sta 0,x
    lda #>53269
    sta 0+1,x

; bit&SP(0)<__wolin_reg2>[ubyte*]=#1[ubyte],#1[bool]


    lda (0,x)
    ora #1
    sta (0,x)


; freeSP<__wolin_reg2>,#2


    inx
    inx

; allocSP<__wolin_reg5>,#2


    dex
    dex

; letSP(0)<__wolin_reg5>[ubyte*]=53264[ubyte*]


    lda #<53264
    sta 0,x
    lda #>53264
    sta 0+1,x

; bit&SP(0)<__wolin_reg5>[ubyte*]=#1[ubyte],#0[bool]


    lda #1
    eor #$ff
    and (0,x)
    sta (0,x)


; freeSP<__wolin_reg5>,#2


    inx
    inx

; allocSP<__wolin_reg8>,#2


    dex
    dex

; letSP(0)<__wolin_reg8>[ubyte*]=53248[ubyte*]


    lda #<53248
    sta 0,x
    lda #>53248
    sta 0+1,x

; let&SP(0)<__wolin_reg8>[ubyte*]=#100[ubyte]


    lda #100
    sta (0,x)

; freeSP<__wolin_reg8>,#2


    inx
    inx

; allocSP<__wolin_reg11>,#2


    dex
    dex

; letSP(0)<__wolin_reg11>[ubyte*]=53249[ubyte*]


    lda #<53249
    sta 0,x
    lda #>53249
    sta 0+1,x

; let&SP(0)<__wolin_reg11>[ubyte*]=#100[ubyte]


    lda #100
    sta (0,x)

; freeSP<__wolin_reg11>,#2


    inx
    inx

; allocSP<__wolin_reg14>,#2


    dex
    dex

; letSP(0)<__wolin_reg14>[ubyte*]=53287[ubyte*]


    lda #<53287
    sta 0,x
    lda #>53287
    sta 0+1,x

; let&SP(0)<__wolin_reg14>[ubyte*]=#1[ubyte]


    lda #1
    sta (0,x)

; freeSP<__wolin_reg14>,#2


    inx
    inx

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

