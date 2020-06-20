;
; Ullrich von Bassewitz, 26.05.2002
;
; CC65 runtime: zeropage usage
;

.include        "zeropage.inc"

; ------------------------------------------------------------------------

.zeropage
__wolin_sp_bottom:   .res    1

.segment "ZERO_WORD"
__wolin_this_ptr:	.res	2   ; 176-177

.segment "ZERO_WORDSA"
__wolin_esp:	.res	2	; 155-156
__wolin_exception_ptr:	.res	2   ; 178-179

.segment "ZERO_WORDSB"
__wolin_spf:	.res	2   ; 251-252
__wolin_spe_zp_vector:	.res	2   ; 253-254
