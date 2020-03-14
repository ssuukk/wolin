setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.i
alloc SP<__wolin_reg0>, #1 // for var pl.qus.wolin.i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg0: ubyte = 0 (for var pl.qus.wolin.i init expression) location = null, null
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg0>, #1 // for var pl.qus.wolin.i init expression
// inicjalizacja zmiennej pl.qus.wolin.chr
alloc SP<__wolin_reg1>, #1 // for var pl.qus.wolin.chr init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg1: ubyte = 0 (for var pl.qus.wolin.chr init expression) location = null, null
let __wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.chr
free SP<__wolin_reg1>, #1 // for var pl.qus.wolin.chr init expression
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[uword]
endfunction
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.openCommandChannel(pl.qus.wolin.openCommandChannel.lfn: ubyte = 0 () location = null, null, pl.qus.wolin.openCommandChannel.device: ubyte = 0 () location = null, null, pl.qus.wolin.openCommandChannel.command: ubyte* = 0 () location = null, null):unit
// ****************************************
function __wolin_pl_qus_wolin_openCommandChannel
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.setlfs ========
alloc SPF, #0
// Arg: 0: pl.qus.wolin.setlfs.lfn: ubyte = 0 () location = CPU.A, null
// Arg: 1: pl.qus.wolin.setlfs.device: ubyte = 0 () location = CPU.X, null
// Arg: 2: pl.qus.wolin.setlfs.sa: ubyte = 0 () location = CPU.Y, null
save SP
// == FN_CALL: ARG #0 (lfn) pl.qus.wolin.setlfs
alloc SP<__wolin_reg4>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru lfn
let SP(0)<__wolin_reg4>[ubyte*] = *SPF(3)<pl.qus.wolin.openCommandChannel.lfn>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.openCommandChannel.lfn
// po visit value
save &SP(0)<__wolin_reg4>[ubyte*] // CPU.A
free SP<__wolin_reg4>, #2 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (device) pl.qus.wolin.setlfs
alloc SP<__wolin_reg5>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru device
let SP(0)<__wolin_reg5>[ubyte*] = *SPF(2)<pl.qus.wolin.openCommandChannel.device>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.openCommandChannel.device
// po visit value
save &SP(0)<__wolin_reg5>[ubyte*] // CPU.X
free SP<__wolin_reg5>, #2 // for call argument 1, type = ubyte
// == FN_CALL: ARG #2 (15) pl.qus.wolin.setlfs
alloc SP<__wolin_reg6>, #1 // for call argument 2
// Prze visit vALUE
//  obliczenia dla parametru 15
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #15[ubyte] // atomic ex
// po visit value
save &SP(0)<__wolin_reg6>[ubyte] // CPU.Y
free SP<__wolin_reg6>, #1 // for call argument 2, type = ubyte
// switchType to:unit by function return type 2
restore CPU.Y[ubyte]
restore CPU.X[ubyte]
restore CPU.A[ubyte]
// switchType to:unit by function call
call 65466[uword] // pl.qus.wolin.setlfs

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.setlfs ========
// 
// top type already set: __wolin_reg3: unit = 65535 (for blockLevel expression) location = null, null
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.setnam ========
alloc SPF, #0
// Arg: 0: pl.qus.wolin.setnam.fnameLen: ubyte = 0 () location = CPU.A, null
// Arg: 1: pl.qus.wolin.setnam.name: ubyte* = 0 () location = CPU.XY, null
save SP
// == FN_CALL: ARG #0 (10) pl.qus.wolin.setnam
alloc SP<__wolin_reg8>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 10
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg8>[ubyte] = #10[ubyte] // atomic ex
// po visit value
save &SP(0)<__wolin_reg8>[ubyte] // CPU.A
free SP<__wolin_reg8>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (command) pl.qus.wolin.setnam
alloc SP<__wolin_reg9>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru command
let SP(0)<__wolin_reg9>[ubyte*] = *SPF(0)<pl.qus.wolin.openCommandChannel.command>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.openCommandChannel.command
// po visit value
save &SP(0)<__wolin_reg9>[ubyte*] // CPU.XY
free SP<__wolin_reg9>, #2 // for call argument 1, type = ubyte*
// switchType to:unit by function return type 2
restore CPU.XY[ubyte*]
restore CPU.A[ubyte]
// switchType to:unit by function call
call 65469[uword] // pl.qus.wolin.setnam

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.setnam ========
// 
// top type already set: __wolin_reg7: unit = 65535 (for blockLevel expression) location = null, null
free SPF<pl.qus.wolin.openCommandChannel.__fnargs>, #4 // free fn arguments and locals for pl.qus.wolin.openCommandChannel
// freeing call stack
// return from function body
endfunction

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.openCommandChannel ========
alloc SPF, #4
// == FN_CALL: ARG #0 (15) pl.qus.wolin.openCommandChannel
alloc SP<__wolin_reg12>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 15
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg12>[ubyte] = #15[ubyte] // atomic ex
// po visit value
let SPF(3)[ubyte] = SP(0)<__wolin_reg12>[ubyte]
free SP<__wolin_reg12>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (8) pl.qus.wolin.openCommandChannel
alloc SP<__wolin_reg13>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 8
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg13>[ubyte] = #8[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg13>[ubyte]
free SP<__wolin_reg13>, #1 // for call argument 1, type = ubyte
// == FN_CALL: ARG #2 ("DUPA") pl.qus.wolin.openCommandChannel
alloc SP<__wolin_reg14>, #2 // for call argument 2
// Prze visit vALUE
//  obliczenia dla parametru "DUPA"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg14>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(0)[ubyte*] = SP(0)<__wolin_reg14>[ubyte*]
free SP<__wolin_reg14>, #2 // for call argument 2, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_openCommandChannel[uword]

// == FN_CALL END: pl.qus.wolin.openCommandChannel ========
// 
// top type already set: __wolin_reg11: unit = 65535 (for blockLevel expression) location = null, null
// freeing call stack
// return from function body
endfunction



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
label __wolin_pl_qus_wolin_chr
alloc 0[ubyte]  // pl.qus.wolin.chr
string __wolin_lab_stringConst_0[uword] = $"DUPA"
