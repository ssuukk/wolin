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

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg2>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg2: bool* = 0 (ASSIGNMENT target) null null)
let SP(0)<__wolin_reg2>[bool*] = *__wolin_pl_qus_wolin_wynik<pl.qus.wolin.wynik>[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.wynik
// top type already set: __wolin_reg2: bool* = 0 (ASSIGNMENT target) null null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg3>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg3: bool = 0 (ASSIGNMENT value) null null)
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.save ========
alloc SPF, #1
// Arg: 0: pl.qus.wolin.save.zpPointerToStart: ubyte = 0 () CPU.A null
// Arg: 1: pl.qus.wolin.save.endAddr: uword = 0 () CPU.XY null
save SP
// == FN_CALL: ARG #0 (10) pl.qus.wolin.save
alloc SP<__wolin_reg4>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 10
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte] = #10[ubyte] // atomic ex
// po visit value
save SP(0)<__wolin_reg4>[ubyte] // CPU.A
free SP<__wolin_reg4>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (12345) pl.qus.wolin.save
alloc SP<__wolin_reg5>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 12345
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg5>[uword] = #12345[uword] // atomic ex
// po visit value
save SP(0)<__wolin_reg5>[uword] // CPU.XY
free SP<__wolin_reg5>, #2 // for call argument 1, type = uword
// switchType to:bool by function return type 2
restore CPU.XY[uword]
restore CPU.A[ubyte]
// switchType to:bool by function call
call 65496[adr] // pl.qus.wolin.save

let SPF(0)<pl.qus.wolin.save.__returnValue>[bool] = CPU.C[bool] // lokacja wartości zwrotnej
restore SP
let SP(0)<__wolin_reg3>[bool] = SPF(0)<pl.qus.wolin.save.__returnValue>[bool] // przez sprawdzacz typow - copy return parameter
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.save ========
// 
let &SP(1)<__wolin_reg2>[bool*] = SP(0)<__wolin_reg3>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg2>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg1: unit = 65535 (for expression) null null
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.save ze stosu
free SPF <pl.qus.wolin.save.__returnValue>, #1 // free return value of pl.qus.wolin.save from call stack
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
