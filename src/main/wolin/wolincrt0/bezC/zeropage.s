;
; Ullrich von Bassewitz, 26.05.2002
;
; CC65 runtime: zeropage usage
;

.include        "zeropage.inc"

; ------------------------------------------------------------------------

.zeropage

__wolin_zp:		.res	142 ; 2-142
__wolin_sp_top  .res    1   ; 143
nix1:			.res	11  ; 
__wolin_esp:	.res	2	; 155-156
nix2:			.res	19  ; 
__wolin_this_ptr:	.res	2   ; 176-177
__wolin_exception_ptr:	.res	2   ; 178-179
nix3:			.res	71  ;
__wolin_spf:	.res	2   ; 251-252
__wolin_spe_zp_vector:	.res	2   ; 253-254


;sp:             .res    2       ; Stack pointer
;sreg:           .res    2       ; Secondary register/high 16 bit for longs
;regsave:        .res    4       ; Slot to save/restore (E)AX into
;ptr1:           .res    2
;ptr2:           .res    2
;ptr3:           .res    2
;ptr4:           .res    2
;tmp1:           .res    1
;tmp2:           .res    1
;tmp3:           .res    1
;tmp4:           .res    1
;regbank:        .res    regbanksize     ; Register bank
