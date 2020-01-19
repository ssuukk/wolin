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
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// ****************************************
// funkcja: fun pl.qus.wolin.clearScreen():unit
// ****************************************
function __wolin_pl_qus_wolin_clearScreen

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.clearScreen ========
alloc SPF, #0
// switchType to:unit by function return type 2
// switchType to:unit by function call
call 58692[adr] // pl.qus.wolin.clearScreen

// == FN_CALL END: pl.qus.wolin.clearScreen ========
// 
// top type already set: __wolin_reg1: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg3>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg3: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg3>[bool*] = *null[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.maskInterrupts
// top type already set: __wolin_reg3: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg4>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg4: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg4>[bool] = #1[bool] // atomic ex
let &SP(1)<__wolin_reg3>[bool*] = SP(0)<__wolin_reg4>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg4>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg3>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg2: unit = 65535 (for expression)
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
label __wolin_pl_qus_wolin_i
alloc 0[ubyte]  // pl.qus.wolin.i
