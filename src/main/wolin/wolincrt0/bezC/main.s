 	.export _main
	.include        "zeropage.inc"
	.include        "wolin.inc"
	.forceimport __STARTUP__

_main:
	st_spf_byte 4, 69 ; return value
	lda #0
	sta 53280
	free_spf 4
	rts