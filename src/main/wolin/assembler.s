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

; function__wolin_pl_qus_wolin_rasterProc

__wolin_pl_qus_wolin_rasterProc:

; let53280[ubyte]=#7[ubyte]


    lda #7
    sta 53280

; let__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte]=#0[ubyte]


    lda #0
    sta __wolin_pl_qus_wolin_i

; allocSP<__wolin_reg7>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; add__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte],#1[ubyte]


    inc __wolin_pl_qus_wolin_i

; evallessSP(0)<__wolin_reg7>[bool]=__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte],#100[ubyte]


    lda #1 ; mniejsze
    sta 0,x
    lda __wolin_pl_qus_wolin_i
    cmp #100
    bcc :+
    lda #0 ; jednak wieksze
    sta 0,x
:


; beqSP(0)<__wolin_reg7>[bool]=#1[bool],__wolin_lab_loopStart_1<label_po_if>[uword]


    lda 0,x
    bne __wolin_lab_loopStart_1

; label__wolin_lab_loopEnd_1

__wolin_lab_loopEnd_1:

; freeSP<__wolin_reg7>,#1

    inx

; let53280[ubyte]=#0[ubyte]


    lda #0
    sta 53280

; let53273[ubyte]=#0[ubyte]


    lda #0
    sta 53273

; reti

   rti

; function__wolin_pl_qus_wolin_main

__wolin_pl_qus_wolin_main:

; let56333[ubyte]=#127[ubyte]


    lda #127
    sta 56333

; let53265[ubyte]=#27[ubyte]


    lda #27
    sta 53265

; let53266[ubyte]=#210[ubyte]


    lda #210
    sta 53266

; let788[uword]=__wolin_pl_qus_wolin_rasterProc[uword]


    lda #<__wolin_pl_qus_wolin_rasterProc
    sta 788
    lda #>__wolin_pl_qus_wolin_rasterProc
    sta 788+1


; let53274[ubyte]=#1[ubyte]


    lda #1
    sta 53274

; ret

    rts

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_i

__wolin_pl_qus_wolin_i:

; alloc0[ubyte]

    .byte 0

