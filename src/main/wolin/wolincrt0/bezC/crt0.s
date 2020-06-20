;
; SSUUKK 20.6.2020
;
; Startup code for Wolin (C64 version)
;

        .export         _exit
        .export         __STARTUP__ : absolute = 1      ; Mark as startup

;        .import         initlib, donelib
        .import         zerobss, callmain
        .import         __MAIN_START__, __MAIN_SIZE__   ; Linker generated
        .import         __STACKSIZE__                   ; from configure file

        .include        "zeropage.inc"
        .include        "wolin.inc"
;        .include        "c64.inc"


; ------------------------------------------------------------------------
; Startup code

.segment        "STARTUP"

Start:

; Switch off the BASIC ROM.

        lda     $01
        sta     mmusave         ; Save the memory configuration
        and     #$F8
        ora     #$06            ; Enable Kernal+I/O, disable BASIC
        sta     $01

        tsx
        stx     spsave          ; Save the system stack ptr

; Save space by putting some of the start-up code in the ONCE segment,
; which can be re-used by the BSS segment, the heap and the C stack.

        jsr     init

; Clear the BSS data.

        jsr     zerobss

; Push the command-line arguments; and, call main().

		ldx		#__wolin_sp_bottom + zpspace	; set Wolin SP
        jsr     callmain

; Back from main() [this is also the exit() entry]. Run the module destructors.
_exit:  lda_spf_lo 0            ; get _main return value from SPF
        sta     $90             ; Place the program return code into BASICs status variable.
;        jsr     donelib

; Copy back the zero-page stuff.

        ldx     #zpspace
L2:     lda     zpsave,x
        sta     __wolin_sp_bottom,x
        dex
        bne     L2

; Restore the system stuff.

        ldx     spsave
        txs                     ; Restore stack pointer
        ldx     mmusave
        stx     $01             ; Restore memory configuration

; Back to BASIC.

        rts


; ------------------------------------------------------------------------

.segment        "ONCE"

init:

; Save the zero-page locations that we need.

        ldx     #zpspace
L1:     lda     __wolin_sp_bottom,x
        sta     zpsave,x
        dex
        bne     L1

; Set up the stack.

        lda     #<(__MAIN_START__ + __MAIN_SIZE__)
        ldx     #>(__MAIN_START__ + __MAIN_SIZE__)
        sta     __wolin_spf
        stx     __wolin_spf+1            ; Set argument stack ptr

; Call the module constructors.

;        jmp     initlib
        rts


; ------------------------------------------------------------------------
; Data

.segment        "INIT"

mmusave:.res    1
spsave: .res    1
zpsave: .res    zpspace
