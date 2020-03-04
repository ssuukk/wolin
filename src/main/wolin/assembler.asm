setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[uword]
ret
// switchType to:uword by parse literal constant
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.suma(pl.qus.wolin.suma.a: ubyte = 0 () location = null, null, pl.qus.wolin.suma.b: ubyte = 0 () location = null, null):ubyte
// ****************************************
function __wolin_pl_qus_wolin_suma
alloc SP<__wolin_reg1>, #1 // for expression
alloc SP<__wolin_reg2>, #2 // LEFT adding operator
let SP(0)<__wolin_reg2>[ubyte*] = *SPF(1)<pl.qus.wolin.suma.a>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.suma.a
// top type already set: __wolin_reg2: ubyte* = 0 (LEFT adding operator) location = null, null
alloc SP<__wolin_reg3>, #2 // RIGHT adding operator
let SP(0)<__wolin_reg3>[ubyte*] = *SPF(0)<pl.qus.wolin.suma.b>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.suma.b
// top type already set: __wolin_reg3: ubyte* = 0 (RIGHT adding operator) location = null, null
add &SP(4)<__wolin_reg1>[ubyte] = &SP(2)<__wolin_reg2>[ubyte*], &SP(0)<__wolin_reg3>[ubyte*]
free SP<__wolin_reg3>, #2 // RIGHT adding operator
free SP<__wolin_reg2>, #2 // LEFT adding operator
// top type already set: __wolin_reg1: ubyte = 0 (for expression) location = null, null
let SPF(2)<pl.qus.wolin.suma.__returnValue>[ubyte] = &SP(0)<__wolin_reg1>[ubyte] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
// top type already set: __wolin_reg1: ubyte = 0 (for expression) location = null, null
free SP<__wolin_reg1>, #1 // for expression
free SPF<pl.qus.wolin.suma.__fnargs>, #2 // free fn arguments and locals for pl.qus.wolin.suma
// ***** fnDeclFreeStackAndRet usuwanie zwrotki pl.qus.wolin.suma ze stosu
// freeing call stack
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg6>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg6: ubyte* = 0 (ASSIGNMENT target) location = null, null)
let SP(0)<__wolin_reg6>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.border
// top type already set: __wolin_reg6: ubyte* = 0 (ASSIGNMENT target) location = null, null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg7>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg7: ubyte = 0 (ASSIGNMENT value) location = null, null)
// switchType to:ubyte by function return type 1
// 
// == FN_CALL: pl.qus.wolin.suma ========
alloc SPF, #3
// == FN_CALL: ARG #0 (4) pl.qus.wolin.suma
alloc SP<__wolin_reg8>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 4
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg8>[ubyte] = #4[ubyte] // atomic ex
// po visit value
let SPF(1)[ubyte] = SP(0)<__wolin_reg8>[ubyte]
free SP<__wolin_reg8>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (6) pl.qus.wolin.suma
alloc SP<__wolin_reg9>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 6
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #6[ubyte] // atomic ex
// po visit value
let SPF(0)[ubyte] = SP(0)<__wolin_reg9>[ubyte]
free SP<__wolin_reg9>, #1 // for call argument 1, type = ubyte
// switchType to:ubyte by function return type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_suma[uword]

let SP(0)<__wolin_reg7>[ubyte] = SPF(0)<pl.qus.wolin.suma.__returnValue>[ubyte] // przez sprawdzacz typow - copy return parameter
// == FN_CALL END: pl.qus.wolin.suma ========
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.suma ze stosu
free SPF <pl.qus.wolin.suma.__returnValue>, #1 // free return value of pl.qus.wolin.suma from call stack
// 
let &SP(1)<__wolin_reg6>[ubyte*] = &SP(0)<__wolin_reg7>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg7>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg6>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg5: unit = 65535 (for expression) location = null, null
// freeing call stack
// return from function body
ret



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
