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
// switchType to:ubyte by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:uword by parse literal constant
// switchType to:ubyte by parse literal constant
// switchType to:uword by parse literal constant
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
// (do assignLeftSideVar przypisano __wolin_reg2: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg2>[bool*] = 53269:0[bool*] // przez sprawdzacz typow - simple id from var
// switchType to:bool* by type from pl.qus.wolin.sprite0On
// top type already set: __wolin_reg2: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg3>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg3: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg3>[bool] = #1[bool] // atomic ex
let &SP(1)<__wolin_reg2>[bool*] = SP(0)<__wolin_reg3>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg2>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg1: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg5>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg5: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg5>[ubyte*] = 53248[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.sprite0X
// top type already set: __wolin_reg5: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg6>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg6: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #100[ubyte] // atomic ex
let &SP(1)<__wolin_reg5>[ubyte*] = SP(0)<__wolin_reg6>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg6>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg5>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg4: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg8>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg8: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg8>[bool*] = 53264:0[bool*] // przez sprawdzacz typow - simple id from var
// switchType to:bool* by type from pl.qus.wolin.sprite0Xh
// top type already set: __wolin_reg8: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg9>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg9: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg9>[bool] = #0[bool] // atomic ex
let &SP(1)<__wolin_reg8>[bool*] = SP(0)<__wolin_reg9>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg9>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg8>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg7: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg11>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg11: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg11>[ubyte*] = 53249[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.sprite0Y
// top type already set: __wolin_reg11: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg12>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg12: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg12>[ubyte] = #100[ubyte] // atomic ex
let &SP(1)<__wolin_reg11>[ubyte*] = SP(0)<__wolin_reg12>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg12>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg11>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg10: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg14>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg14: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg14>[ubyte*] = 53287[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.sprite0Color
// top type already set: __wolin_reg14: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg15>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg15: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg15>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg14>[ubyte*] = SP(0)<__wolin_reg15>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg15>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg14>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg13: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg17>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg17: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg17>[bool*] = *__wolin_pl_qus_wolin_test<pl.qus.wolin.test>[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.test
// top type already set: __wolin_reg17: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg18>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg18: bool* = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg18>[bool*] = 53269:0[bool*] // przez sprawdzacz typow - simple id from var
// switchType to:bool* by type from pl.qus.wolin.sprite0On
let &SP(2)<__wolin_reg17>[bool*] = &SP(0)<__wolin_reg18>[bool*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg18>, #2 // ASSIGNMENT value, type = bool*
free SP<__wolin_reg17>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg16: unit = 65535 (for expression)
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
label __wolin_pl_qus_wolin_test
alloc 0[bool]  // pl.qus.wolin.test
