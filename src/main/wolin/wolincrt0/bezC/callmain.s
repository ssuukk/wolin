;
; SSUUKK 20.6.2020
;
; Push arguments and call main()
;


        .export         callmain
        .export         __argc, __argv

        .import         _main, pushax
        .include        "zeropage.inc"
        .include        "wolin.inc"

;---------------------------------------------------------------------------
; Setup the stack for main(), then jump to it
; DON'T USE X REGISTER BEYOND THIS PROC ENTRY, IT'S ALREADY SET FOR WOLIN STACK!
.proc   callmain
        alloc_spf   5           ; prepare stack for calling _main
        st_spf_word 2, __argc   ; store argc above return value
        st_spf_word 0, __argv   ; store argv above argc
        jmp     _main

.endproc

;---------------------------------------------------------------------------
; Data

.data
__argc:         .word   0
__argv:         .addr   0




