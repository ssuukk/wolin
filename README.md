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
- functions at fixed memory locations with native arguments like `fun setLfs^0xffba(lfn: ubyte^CPU.A, channel: ubyte^CPU.Y, dev: ubyte^CPU.X)
`

Wolin generates assembler code for ca65 with memory config for Commodore 64, it is very easy, though, to port it to other architectures via intermediate code to native code templates

# TODOs

- code optimizer
- a lot of other language features

# Example code

See `wolin/test.ktk` in this repo.

