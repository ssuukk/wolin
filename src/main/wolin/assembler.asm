setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #2
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[uword]
ret
// switchType to:uword by parse literal constant
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
alloc SP<__wolin_reg1>, #1 // for declaration vala=4
alloc SP<__wolin_reg2>, #1 // for var pl.qus.wolin.main..a init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg2>[ubyte] = #4[ubyte] // atomic ex
// top type already set: __wolin_reg2: ubyte = 0 (for var pl.qus.wolin.main..a init expression) location = null, null
let SPF(1)<pl.qus.wolin.main..a>[ubyte] = SP(0)<__wolin_reg2>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.main..a
free SP<__wolin_reg2>, #1 // for var pl.qus.wolin.main..a init expression
// top type already set: __wolin_reg1: ubyte = 0 (for declaration vala=4) location = null, null
free SP<__wolin_reg1>, #1 // for declaration vala=4
alloc SP<__wolin_reg3>, #1 // for declaration valb=8
alloc SP<__wolin_reg4>, #1 // for var pl.qus.wolin.main..b init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte] = #8[ubyte] // atomic ex
// top type already set: __wolin_reg4: ubyte = 0 (for var pl.qus.wolin.main..b init expression) location = null, null
let SPF(0)<pl.qus.wolin.main..b>[ubyte] = SP(0)<__wolin_reg4>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.main..b
free SP<__wolin_reg4>, #1 // for var pl.qus.wolin.main..b init expression
// top type already set: __wolin_reg3: ubyte = 0 (for declaration valb=8) location = null, null
free SP<__wolin_reg3>, #1 // for declaration valb=8
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
alloc SP<__wolin_reg7>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg7: ubyte* = 0 (ASSIGNMENT value) location = null, null)
alloc SP<__wolin_reg8>, #2 // LEFT adding operator
let SP(0)<__wolin_reg8>[ubyte*] = *SPF(1)<pl.qus.wolin.main..a>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.main..a
// top type already set: __wolin_reg8: ubyte* = 0 (LEFT adding operator) location = null, null
alloc SP<__wolin_reg9>, #2 // RIGHT adding operator
let SP(0)<__wolin_reg9>[ubyte*] = *SPF(0)<pl.qus.wolin.main..b>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.main..b
// top type already set: __wolin_reg9: ubyte* = 0 (RIGHT adding operator) location = null, null
add &SP(4)<__wolin_reg7>[ubyte*] = &SP(2)<__wolin_reg8>[ubyte*], &SP(0)<__wolin_reg9>[ubyte*]
free SP<__wolin_reg9>, #2 // RIGHT adding operator
free SP<__wolin_reg8>, #2 // LEFT adding operator
// top type already set: __wolin_reg7: ubyte* = 0 (ASSIGNMENT value) location = null, null
let &SP(2)<__wolin_reg6>[ubyte*] = &SP(0)<__wolin_reg7>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg7>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg6>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg5: unit = 65535 (for expression) location = null, null
free SPF<pl.qus.wolin.main.__fnargs>, #2 // free fn arguments and locals for pl.qus.wolin.main
// freeing call stack
// return from function body
ret



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
