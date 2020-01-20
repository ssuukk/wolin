# Wolin
A modern, minimal Kotlin-like language compiler for MOS 6502 / 6510

# Features

Currently supporting:

- functional programming (lambdas)
- exception handling
- if/else if
- do...while
- when (switch/case on steroids)
- some introductory OO - classes with constructors and methods
- variables at fixed memory locations like `var border: ubyte^53280`
- variables fixed to CPU registers like `var maskInterrupts: bool^CPU.I`
- functions at fixed memory locations with native arguments like `fun setLfs^0xffba(lfn: ubyte^CPU.A, channel: ubyte^CPU.Y, dev: ubyte^CPU.X)`
- getting values from long / fast (1-byte index, 1-byte element) arrays


Wolin generates assembler code for ca65 with memory config for Commodore 64, it is very easy, though, to port it to other architectures via intermediate code to native code templates

# TODOs

- code optimizer
- a lot of other language features
- writing elements to all kinds of arrays
- add a pass for gathering symbols so they can be used before they get declared

# Architecture

First the compiler translates Wolin code to intermediate virtual machine assembler that has the following syntax:

```mnemonic destination[type] = arg1[type], arg2[type]```


So for example "b++" becomes:

```add pl.qus.wolin.test.main..b[word] = pl.qus.wolin.test.main..b[word], #1[byte]```


And then there's "template" file that describes how each "mnemonic type = type,type" combination gets translated into 6510 asm, by matching some patterns:

```
add ?dest[word] = ?src[word], #?val[byte] -> """
    clc
    lda {src}
    adc #{val}
    sta {dest}
    lda {src}+1
    adc #0
    sta {dest}+1
"""
```

which in this case becomes:

```
    clc
    lda pl_qus_wolin_test_main__b
    adc #1
    sta pl_qus_wolin_test_main__b
    lda pl_qus_wolin_test_main__b+1
    adc #0
    sta pl_qus_wolin_test_main__b+1
```

# Example code

```
package pl.qus.wolin

// raster interrupt colour band taken from:
// https://gist.github.com/bremensaki/8f33cd7d67b78377881c7eb7147c0f32

var interruptRoutineVector: uword^0x314 // this is C64 raster interrupt vector
var cia1InerruptCtrlReg: ubyte^0xDC0D
var vicScreenCtrlReg1: ubyte^0xD011
var vicRasterLine: ubyte^0xD012
var vicInterruptStatusReg: ubyte^0xd019
var vicInterruptCtrlReg: ubyte^0xd01a
var vicBorder: ubyte^53280
var i: ubyte
var maskInterrupts: bool^CPU.I

fun clearScreen^0xe544()

interrupt fun backgroundToBlue() {
    interruptRoutineVector = backgroundToWhite
    vicRasterLine = 140
    vicBorder = 6
    vicInterruptStatusReg = 0xff
    return@0xea31
}

interrupt fun backgroundToWhite() {
    interruptRoutineVector = backgroundToBlue
    vicRasterLine = 160
    vicBorder = 1
    vicInterruptStatusReg = 0xff
    return@0xea31
}

fun main() {
    clearScreen()
    vicBorder = 6                                    // Init screen and border to blue
    maskInterrupts = true                            // Suspend interrupts during init
    cia1InerruptCtrlReg = 0x7f                       // Disable CIA
    vicInterruptCtrlReg := 1                         // Enable raster interrupts
    vicScreenCtrlReg1 &= 0x7f                        // High bit of raster line cleared, we're only working within single byte ranges
    vicRasterLine = 140                              // We want an interrupt at the top line
    interruptRoutineVector = backgroundToBlue        // IRQ vector addresses
    maskInterrupts = false                           // Enable interrupts again

    do {} while (true)                               // Eternal do-nothing loop, we're done.
}
```

# New syntax

Syntax different from Kotlin:

- `variable := 3` set bits 1 and 3 (variable must be readable)
- `variable .= 127` clear bit 7 (variable must be readable)
- `variable & variable` bitwise AND
- `variable | variable` bitwise OR
- `variable &= 3` bitwise in-place AND (variable doesn't have to be readable)
- `variable |= 3` bitwise in-place OR (variable doesn't have to be readable)
- `interrupt fun()` denotes interrupt routine function that can RTI instead of RTS
- `fun xxx^location()` function attached to some address (usually ROM functions)
- `var a:type^location` variable attached to some address (I/O registers)

# Let's talk

Criticise, discuss, watch progress here: http://forum.6502.org/viewtopic.php?f=2&t=5622