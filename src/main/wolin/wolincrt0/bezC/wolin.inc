;
; SSUUKK 20.6.2020
;
; Push arguments and call main()
;

.macro lda_spf_lo idx
	ldy #idx
	lda (__wolin_spf),y
.endmacro

.macro lda_spf_hi
	iny
	lda (__wolin_spf),y
.endmacro

.macro st_spf_word idx,word
    ldy #<idx
    lda #<word
    sta (__wolin_spf),y
    iny
    lda #>word
    sta (__wolin_spf),y
.endmacro

.macro st_spf_byte idx,byt
    ldy #<idx
    lda #<byt
    sta (__wolin_spf),y
.endmacro

.macro sta_sp idx
	sta idx, x
.endmacro

.macro allocsp_byte
	dex
.endmacro

.macro allocsp_word
	dex
	dex
.endmacro

.macro freesp_word
	inx
	inx
.endmacro


.macro alloc_spf count
    sec
    lda __wolin_spf
    sbc #count
    sta __wolin_spf
    bcs :+
    dec __wolin_spf+1
:
.endmacro

.macro free_spf count
    clc
    lda __wolin_spf
    adc #count
    sta __wolin_spf
    bcc :+
    inc __wolin_spf+1
:
.endmacro
