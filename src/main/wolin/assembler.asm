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

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg2>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg2: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg2>[ubyte*] = *53269[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesOn
// top type already set: __wolin_reg2: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg3>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg3: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg3>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg2>[ubyte*] = SP(0)<__wolin_reg3>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg2>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg1: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg5>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg5: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg5>[ubyte*] = *53277[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesFat
// top type already set: __wolin_reg5: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg6>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg6: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg5>[ubyte*] = SP(0)<__wolin_reg6>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg6>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg5>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg4: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg8>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg8: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg8>[ubyte*] = *53271[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesTall
// top type already set: __wolin_reg8: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg9>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg9: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg8>[ubyte*] = SP(0)<__wolin_reg9>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg9>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg8>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg7: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg11>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg11: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg11>[ubyte*] = *53248[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0X
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
let SP(0)<__wolin_reg14>[ubyte*] = *53249[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0Y
// top type already set: __wolin_reg14: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg15>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg15: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg15>[ubyte] = #100[ubyte] // atomic ex
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
// (do assignLeftSideVar przypisano __wolin_reg17: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg17>[ubyte*] = *53287[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0Color
// top type already set: __wolin_reg17: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg18>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg18: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg18>[ubyte] = #2[ubyte] // atomic ex
let &SP(1)<__wolin_reg17>[ubyte*] = SP(0)<__wolin_reg18>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg18>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg17>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg16: unit = 65535 (for expression)
alloc SP<__wolin_reg19>, #1 // for expression
label __wolin_lab_loopStart_1
// FORCE TOP: __wolin_reg19: bool = 0 (for expression) -> bool
alloc SP<__wolin_reg21>, #2 // for expression
let SP(0)<__wolin_reg21>[ubyte*] = *53248[ubyte] // przez sprawdzacz typow - operator ++
add 53248[ubyte] = 53248[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg21: ubyte* = 0 (for expression)
free SP<__wolin_reg21>, #2 // for expression
alloc SP<__wolin_reg22>, #2 // for expression
let SP(0)<__wolin_reg22>[ubyte*] = *53249[ubyte] // przez sprawdzacz typow - operator ++
add 53249[ubyte] = 53249[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg22: ubyte* = 0 (for expression)
free SP<__wolin_reg22>, #2 // for expression
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg19>[bool] = #1[bool] // atomic ex
beq SP(0)<__wolin_reg19>[bool] = #1[bool], __wolin_lab_loopStart_1<label_po_if>[uword]
label __wolin_lab_loopEnd_1
// top type already set: __wolin_reg19: bool = 0 (for expression)
free SP<__wolin_reg19>, #1 // for expression
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
