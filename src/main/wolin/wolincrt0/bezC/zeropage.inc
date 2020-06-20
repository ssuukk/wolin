;
; zeropage.inc
;
; (C) Copyright 2002-2012, Ullrich von Bassewitz (uz@cc65.org)
;

; Assembler include file that imports the runtime zero page locations used
; by the compiler, ready for usage in asm code.

		.globalzp		__wolin_sp_bottom, __wolin_esp, __wolin_this_ptr, __wolin_exception_ptr, __wolin_spf, __wolin_spe_zp_vector

; The total amount of zero page space used, preserved on startup
zpspace         = 141