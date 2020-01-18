setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
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
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.rasterProc():unit
// ****************************************
function __wolin_pl_qus_wolin_rasterProc
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg2>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg2: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg2>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.border
// top type already set: __wolin_reg2: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg3>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg3: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg3>[ubyte] = #5[ubyte] // atomic ex
let &SP(1)<__wolin_reg2>[ubyte*] = SP(0)<__wolin_reg3>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg2>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg1: unit = 65535 (for expression)
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
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
// (do assignLeftSideVar przypisano __wolin_reg6: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg6>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.rasterVector
// top type already set: __wolin_reg6: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg7>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg7: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg7>[uword] = __wolin_pl_qus_wolin_rasterProc[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg6>[uword*] = SP(0)<__wolin_reg7>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg7>, #2 // ASSIGNMENT value, type = uword
free SP<__wolin_reg6>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg5: unit = 65535 (for expression)
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
