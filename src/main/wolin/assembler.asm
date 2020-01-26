setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
ret
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
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
alloc SP<__wolin_reg1>, #1 // for expression
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
alloc SPF, #1
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 () CPU.A null
save SP
// == FN_CALL: ARG #0 (65) pl.qus.wolin.chrout
alloc SP<__wolin_reg2>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 65
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg2>[ubyte] = #65[ubyte] // atomic ex
// po visit value
save SP(0)<__wolin_reg2>[ubyte] // CPU.A
free SP<__wolin_reg2>, #1 // for call argument 0, type = ubyte
// switchType to:bool by function return type 2
restore CPU.A[ubyte]
// switchType to:bool by function call
call 65490[adr] // pl.qus.wolin.chrout

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.chrout ze stosu
free SPF <pl.qus.wolin.chrout.__returnValue>, #1 // free return value of pl.qus.wolin.chrout from call stack
// 
// top type already set: __wolin_reg1: bool = 0 (for expression) null null
free SP<__wolin_reg1>, #1 // for expression
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg4>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg4: bool* = 0 (ASSIGNMENT target) null null)
let SP(0)<__wolin_reg4>[bool*] = *__wolin_pl_qus_wolin_wynik<pl.qus.wolin.wynik>[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.wynik
// top type already set: __wolin_reg4: bool* = 0 (ASSIGNMENT target) null null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg5>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg5: bool = 0 (ASSIGNMENT value) null null)
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
alloc SPF, #1
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 () CPU.A null
save SP
// == FN_CALL: ARG #0 (66) pl.qus.wolin.chrout
alloc SP<__wolin_reg6>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 66
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #66[ubyte] // atomic ex
// po visit value
save SP(0)<__wolin_reg6>[ubyte] // CPU.A
free SP<__wolin_reg6>, #1 // for call argument 0, type = ubyte
// switchType to:bool by function return type 2
restore CPU.A[ubyte]
// switchType to:bool by function call
call 65490[adr] // pl.qus.wolin.chrout

let SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] = CPU.C[bool] // lokacja wartości zwrotnej
restore SP
let SP(0)<__wolin_reg5>[bool] = SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] // przez sprawdzacz typow - copy return parameter
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.chrout ze stosu
free SPF <pl.qus.wolin.chrout.__returnValue>, #1 // free return value of pl.qus.wolin.chrout from call stack
// 
let &SP(1)<__wolin_reg4>[bool*] = SP(0)<__wolin_reg5>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg5>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg4>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg3: unit = 65535 (for expression) null null
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
label __wolin_indirect_jsr
goto 65535[adr]
label __wolin_pl_qus_wolin_wynik
alloc 0[bool]  // pl.qus.wolin.wynik
