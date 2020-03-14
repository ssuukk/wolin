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
restore CPU.XY[ubyte]
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
// funkcja: fun pl.qus.wolin.test(pl.qus.wolin.test.wart: ubyte = 0 () location = null, null):unit
// ****************************************
function __wolin_pl_qus_wolin_test
alloc SP<__wolin_reg11>, #1 // for blockLevel expression
// When expression start
alloc SP<__wolin_reg12>, #2 // for evaluating when top expression
let SP(0)<__wolin_reg12>[ubyte*] = *SPF(0)<pl.qus.wolin.test.wart>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.wart
// top type already set: __wolin_reg12: ubyte* = 0 (for evaluating when top expression) location = null, null
alloc SP<__wolin_reg13>, #1 // for bool result of each condition
// normal when condition
// warunek
label __wolin_lab_when_branch_0
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg14>[unit] = #1[ubyte] // atomic ex
evaleq SP(0)<__wolin_reg13>[bool] = SP(1)<__wolin_reg12>[ubyte*], SP(0)<__wolin_reg14>[unit]
bne SP(0)<__wolin_reg13>[bool] = #1[bool], __wolin_lab_when_branch_1[uword]
// when operacja
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg15>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg15: ubyte* = 0 (ASSIGNMENT target) location = null, null)
let SP(0)<__wolin_reg15>[ubyte*] = #1024[uword] // simple id - fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.screen
// top type already set: __wolin_reg15: ubyte* = 0 (ASSIGNMENT target) location = null, null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg16>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg16: ubyte = 0 (ASSIGNMENT value) location = null, null)
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg16>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg15>[ubyte*] = &SP(0)<__wolin_reg16>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg16>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg15>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
goto __wolin_lab_when_end_1[uword]
// normal when condition
// warunek
label __wolin_lab_when_branch_1
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg14>[unit] = #2[ubyte] // atomic ex
evaleq SP(0)<__wolin_reg13>[bool] = SP(1)<__wolin_reg12>[ubyte*], SP(0)<__wolin_reg14>[unit]
bne SP(0)<__wolin_reg13>[bool] = #1[bool], __wolin_lab_when_branch_2[uword]
// when operacja
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg17>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg17: ubyte* = 0 (ASSIGNMENT target) location = null, null)
let SP(0)<__wolin_reg17>[ubyte*] = #1024[uword] // simple id - fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.screen
// top type already set: __wolin_reg17: ubyte* = 0 (ASSIGNMENT target) location = null, null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg18>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg18: ubyte = 0 (ASSIGNMENT value) location = null, null)
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg18>[ubyte] = #2[ubyte] // atomic ex
let &SP(1)<__wolin_reg17>[ubyte*] = &SP(0)<__wolin_reg18>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg18>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg17>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
goto __wolin_lab_when_end_1[uword]
// last when condition
// warunek
label __wolin_lab_when_branch_2
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg14>[unit] = #3[ubyte] // atomic ex
evaleq SP(0)<__wolin_reg13>[bool] = SP(1)<__wolin_reg12>[ubyte*], SP(0)<__wolin_reg14>[unit]
bne SP(0)<__wolin_reg13>[bool] = #1[bool], __wolin_lab_when_end_1[uword]
// when operacja
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg19>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg19: ubyte* = 0 (ASSIGNMENT target) location = null, null)
let SP(0)<__wolin_reg19>[ubyte*] = #1024[uword] // simple id - fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.screen
// top type already set: __wolin_reg19: ubyte* = 0 (ASSIGNMENT target) location = null, null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg20>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg20: ubyte = 0 (ASSIGNMENT value) location = null, null)
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg20>[ubyte] = #3[ubyte] // atomic ex
let &SP(1)<__wolin_reg19>[ubyte*] = &SP(0)<__wolin_reg20>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg20>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg19>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// When expression end
label __wolin_lab_when_end_1
free SP<__wolin_reg13>, #1 // for bool result of each condition
free SP<__wolin_reg12>, #2 // for evaluating when top expression
// top type already set: __wolin_reg11: ubyte = 0 (for blockLevel expression) location = null, null
free SP<__wolin_reg11>, #1 // for blockLevel expression
free SPF<pl.qus.wolin.test.__fnargs>, #1 // free fn arguments and locals for pl.qus.wolin.test
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
alloc SP<__wolin_reg23>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 15
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg23>[ubyte] = #15[ubyte] // atomic ex
// po visit value
let SPF(3)[ubyte] = SP(0)<__wolin_reg23>[ubyte]
free SP<__wolin_reg23>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (8) pl.qus.wolin.openCommandChannel
alloc SP<__wolin_reg24>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 8
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg24>[ubyte] = #8[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg24>[ubyte]
free SP<__wolin_reg24>, #1 // for call argument 1, type = ubyte
// == FN_CALL: ARG #2 (nazwa) pl.qus.wolin.openCommandChannel
alloc SP<__wolin_reg25>, #2 // for call argument 2
// Prze visit vALUE
//  obliczenia dla parametru nazwa
let SP(0)<__wolin_reg25>[ubyte*] = *__wolin_pl_qus_wolin_nazwa<pl.qus.wolin.nazwa>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.nazwa
// po visit value
let SPF(0)[ubyte*] = SP(0)<__wolin_reg25>[ubyte*]
free SP<__wolin_reg25>, #2 // for call argument 2, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_openCommandChannel[uword]

// == FN_CALL END: pl.qus.wolin.openCommandChannel ========
// 
// top type already set: __wolin_reg22: unit = 65535 (for blockLevel expression) location = null, null
// freeing call stack
// return from function body
endfunction



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
label __wolin_pl_qus_wolin_nazwa
alloc 0[ubyte*]  // pl.qus.wolin.nazwa
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
label __wolin_pl_qus_wolin_chr
alloc 0[ubyte]  // pl.qus.wolin.chr
