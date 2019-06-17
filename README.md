# Wolin
A modern, minimal Kotlin-like language compiler for MOS 6502 / 6510

# Features

Currently supporting:

- functional programming (lambdas)
- exception handling
- if/else if
- do...while
- some introductory OO - classes with constructors and methods
- variables at fixed memory locations like `var border: ubyte^53280`
- variables fixed to CPU registers like `var maskInterrupts: bool^CPU.I`
- functions at fixed memory locations with native arguments like `fun setLfs^0xffba(lfn: ubyte^CPU.A, channel: ubyte^CPU.Y, dev: ubyte^CPU.X)
`

Wolin generates assembler code for ca65 with memory config for Commodore 64, it is very easy, though, to port it to other architectures via intermediate code to native code templates

# TODOs

- code optimizer
- a lot of other language features

# Architecture

First the compiler translates Wolin code to intermediate virtual machine assembler that has the following syntax:

Code:
mnemonic destination[type] = arg1[type], arg2[type]


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
    lda pl.qus.wolin.test.main..b
    adc #1
    sta pl.qus.wolin.test.main..b
    lda pl.qus.wolin.test.main..b+1
    adc #0
    sta pl.qus.wolin.test.main..b+1
```

# Example code

See `wolin/working.ktk` in this repo.

