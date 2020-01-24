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

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.backgroundToBlue():unit
// ****************************************
function __wolin_pl_qus_wolin_backgroundToBlue
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg2>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg2: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg2>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg2: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg3>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg3: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg3>[uword] = #__wolin_pl_qus_wolin_backgroundToWhite[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg2>[uword*] = SP(0)<__wolin_reg3>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #2 // ASSIGNMENT value, type = uword
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
let SP(0)<__wolin_reg5>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg5: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg6>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg6: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #140[ubyte] // atomic ex
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
// (do assignLeftSideVar przypisano __wolin_reg8: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg8>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg8: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg9>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg9: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #6[ubyte] // atomic ex
let &SP(1)<__wolin_reg8>[ubyte*] = SP(0)<__wolin_reg9>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg9>, #1 // ASSIGNMENT value, type = ubyte
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
let SP(0)<__wolin_reg11>[ubyte*] = *53281[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBackground
// top type already set: __wolin_reg11: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg12>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg12: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg12>[ubyte] = #6[ubyte] // atomic ex
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
let SP(0)<__wolin_reg14>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg14: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg15>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg15: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg15>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg14>[ubyte*] = SP(0)<__wolin_reg15>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg15>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg14>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg13: unit = 65535 (for expression)
alloc SP<__wolin_reg16>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg16: uword = 0 (for expression)
free SP<__wolin_reg16>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.backgroundToWhite():unit
// ****************************************
function __wolin_pl_qus_wolin_backgroundToWhite
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg19>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg19: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg19>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg19: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg20>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg20: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg20>[uword] = #__wolin_pl_qus_wolin_backgroundToBlue[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg19>[uword*] = SP(0)<__wolin_reg20>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg20>, #2 // ASSIGNMENT value, type = uword
free SP<__wolin_reg19>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg18: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg22>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg22: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg22>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg22: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg23>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg23: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg23>[ubyte] = #160[ubyte] // atomic ex
let &SP(1)<__wolin_reg22>[ubyte*] = SP(0)<__wolin_reg23>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg23>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg22>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg21: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg25>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg25: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg25>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg25: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg26>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg26: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg26>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg25>[ubyte*] = SP(0)<__wolin_reg26>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg26>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg25>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg24: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg28>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg28: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg28>[ubyte*] = *53281[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBackground
// top type already set: __wolin_reg28: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg29>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg29: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg29>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg28>[ubyte*] = SP(0)<__wolin_reg29>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg29>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg28>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg27: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg31>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg31: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg31>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg31: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg32>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg32: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg32>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg31>[ubyte*] = SP(0)<__wolin_reg32>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg32>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg31>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg30: unit = 65535 (for expression)
alloc SP<__wolin_reg33>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg33: uword = 0 (for expression)
free SP<__wolin_reg33>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.topRoutine():unit
// ****************************************
function __wolin_pl_qus_wolin_topRoutine
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg36>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg36: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg36>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg36: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg37>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg37: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg37>[ubyte] = #8[ubyte] // atomic ex
bit &SP(1)<__wolin_reg36>[ubyte*] = SP(0)<__wolin_reg37>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg37>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg36>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg35: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg39>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg39: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg39>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg39: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg40>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg40: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg40>[ubyte] = #0[ubyte] // atomic ex
let &SP(1)<__wolin_reg39>[ubyte*] = SP(0)<__wolin_reg40>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg40>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg39>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg38: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg42>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg42: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg42>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg42: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg43>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg43: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg43>[uword] = #__wolin_pl_qus_wolin_bottomRoutine[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg42>[uword*] = SP(0)<__wolin_reg43>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg43>, #2 // ASSIGNMENT value, type = uword
free SP<__wolin_reg42>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg41: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg45>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg45: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg45>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg45: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg46>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg46: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg46>[ubyte] = #249[ubyte] // atomic ex
let &SP(1)<__wolin_reg45>[ubyte*] = SP(0)<__wolin_reg46>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg46>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg45>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg44: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg48>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg48: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg48>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg48: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg49>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg49: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg49>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg48>[ubyte*] = SP(0)<__wolin_reg49>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg49>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg48>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg47: unit = 65535 (for expression)
alloc SP<__wolin_reg50>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg50: uword = 0 (for expression)
free SP<__wolin_reg50>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.bottomRoutine():unit
// ****************************************
function __wolin_pl_qus_wolin_bottomRoutine
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg53>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg53: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg53>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg53: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg54>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg54: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg54>[ubyte] = #247[ubyte] // atomic ex
and &SP(1)<__wolin_reg53>[ubyte*] = SP(0)<__wolin_reg54>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg54>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg53>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by &= op
// top type already set: __wolin_reg52: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg56>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg56: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg56>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg56: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg57>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg57: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg57>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg56>[ubyte*] = SP(0)<__wolin_reg57>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg57>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg56>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg55: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg59>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg59: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg59>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg59: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg60>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg60: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg60>[uword] = #__wolin_pl_qus_wolin_topRoutine[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg59>[uword*] = SP(0)<__wolin_reg60>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg60>, #2 // ASSIGNMENT value, type = uword
free SP<__wolin_reg59>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg58: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg62>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg62: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg62>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg62: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg63>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg63: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg63>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg62>[ubyte*] = SP(0)<__wolin_reg63>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg63>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg62>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg61: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg65>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg65: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg65>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg65: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg66>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg66: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg66>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg65>[ubyte*] = SP(0)<__wolin_reg66>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg66>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg65>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg64: unit = 65535 (for expression)
alloc SP<__wolin_reg67>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg67: uword = 0 (for expression)
free SP<__wolin_reg67>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.onRasterGoto(pl.qus.wolin.onRasterGoto.line: ubyte = 0 (), pl.qus.wolin.onRasterGoto.proc: uword = 0 ()):unit
// ****************************************
function __wolin_pl_qus_wolin_onRasterGoto
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg70>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg70: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg70>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg70: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg71>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg71: uword* = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg71>[uword*] = *SPF(0)<pl.qus.wolin.onRasterGoto.proc>[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.onRasterGoto.proc
let &SP(2)<__wolin_reg70>[uword*] = &SP(0)<__wolin_reg71>[uword*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg71>, #2 // ASSIGNMENT value, type = uword*
free SP<__wolin_reg70>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg69: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg73>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg73: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg73>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg73: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg74>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg74: ubyte* = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg74>[ubyte*] = *SPF(2)<pl.qus.wolin.onRasterGoto.line>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.onRasterGoto.line
let &SP(2)<__wolin_reg73>[ubyte*] = &SP(0)<__wolin_reg74>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg74>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg73>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg72: unit = 65535 (for expression)
free SPF<pl.qus.wolin.onRasterGoto.__fnargs>, #3 // free fn arguments and locals for pl.qus.wolin.onRasterGoto
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.rasterBar():unit
// ****************************************
function __wolin_pl_qus_wolin_rasterBar
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg77>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg77: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg77>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg77: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg78>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg78: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg78>[ubyte] = #6[ubyte] // atomic ex
let &SP(1)<__wolin_reg77>[ubyte*] = SP(0)<__wolin_reg78>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg78>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg77>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg76: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg80>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg80: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg80>[ubyte*] = *53281[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBackground
// top type already set: __wolin_reg80: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg81>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg81: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg81>[ubyte] = #6[ubyte] // atomic ex
let &SP(1)<__wolin_reg80>[ubyte*] = SP(0)<__wolin_reg81>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg81>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg80>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg79: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg83>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg83: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg83>[ubyte*] = *53274[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptCtrlReg
// top type already set: __wolin_reg83: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg84>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg84: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg84>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg83>[ubyte*] = SP(0)<__wolin_reg84>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg84>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg83>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg82: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg86>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg86: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg86>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg86: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg87>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg87: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg87>[ubyte] = #128[ubyte] // atomic ex
bit &SP(1)<__wolin_reg86>[ubyte*] = SP(0)<__wolin_reg87>[ubyte], #0[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg87>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg86>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg85: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg89>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg89: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg89>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg89: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg90>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg90: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg90>[ubyte] = #140[ubyte] // atomic ex
let &SP(1)<__wolin_reg89>[ubyte*] = SP(0)<__wolin_reg90>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg90>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg89>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg88: unit = 65535 (for expression)
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.onRasterGoto ========
alloc SPF, #3
// == FN_CALL: ARG #0 (140) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg92>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 140
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg92>[ubyte] = #140[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg92>[ubyte]
free SP<__wolin_reg92>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (backgroundToBlue) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg93>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru backgroundToBlue
let SP(0)<__wolin_reg93>[uword] = #__wolin_pl_qus_wolin_backgroundToBlue[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
// po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg93>[uword]
free SP<__wolin_reg93>, #2 // for call argument 1, type = uword
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_onRasterGoto[adr]

// == FN_CALL END: pl.qus.wolin.onRasterGoto ========
// 
// top type already set: __wolin_reg91: unit = 65535 (for expression)
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.openBorder():unit
// ****************************************
function __wolin_pl_qus_wolin_openBorder
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg96>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg96: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg96>[ubyte*] = *53269[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesOn
// top type already set: __wolin_reg96: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg97>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg97: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg97>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg96>[ubyte*] = SP(0)<__wolin_reg97>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg97>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg96>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg95: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg99>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg99: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg99>[ubyte*] = *53277[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesFat
// top type already set: __wolin_reg99: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg100>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg100: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg100>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg99>[ubyte*] = SP(0)<__wolin_reg100>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg100>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg99>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg98: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg102>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg102: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg102>[ubyte*] = *53271[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesTall
// top type already set: __wolin_reg102: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg103>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg103: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg103>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg102>[ubyte*] = SP(0)<__wolin_reg103>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg103>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg102>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg101: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg105>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg105: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg105>[ubyte*] = *53248[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0X
// top type already set: __wolin_reg105: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg106>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg106: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg106>[ubyte] = #100[ubyte] // atomic ex
let &SP(1)<__wolin_reg105>[ubyte*] = SP(0)<__wolin_reg106>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg106>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg105>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg104: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg108>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg108: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg108>[ubyte*] = *53249[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0Y
// top type already set: __wolin_reg108: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg109>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg109: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg109>[ubyte] = #30[ubyte] // atomic ex
let &SP(1)<__wolin_reg108>[ubyte*] = SP(0)<__wolin_reg109>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg109>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg108>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg107: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg111>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg111: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg111>[ubyte*] = *53287[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0Color
// top type already set: __wolin_reg111: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg112>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg112: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg112>[ubyte] = #2[ubyte] // atomic ex
let &SP(1)<__wolin_reg111>[ubyte*] = SP(0)<__wolin_reg112>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg112>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg111>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg110: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg114>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg114: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg114>[ubyte*] = *53274[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptCtrlReg
// top type already set: __wolin_reg114: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg115>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg115: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg115>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg114>[ubyte*] = SP(0)<__wolin_reg115>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg115>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg114>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg113: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg117>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg117: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg117>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg117: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg118>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg118: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg118>[ubyte] = #128[ubyte] // atomic ex
bit &SP(1)<__wolin_reg117>[ubyte*] = SP(0)<__wolin_reg118>[ubyte], #0[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg118>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg117>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg116: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg120>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg120: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg120>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg120: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg121>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg121: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg121>[ubyte] = #249[ubyte] // atomic ex
let &SP(1)<__wolin_reg120>[ubyte*] = SP(0)<__wolin_reg121>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg121>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg120>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg119: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg123>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg123: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg123>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg123: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg124>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg124: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg124>[uword] = #__wolin_pl_qus_wolin_bottomRoutine[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg123>[uword*] = SP(0)<__wolin_reg124>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg124>, #2 // ASSIGNMENT value, type = uword
free SP<__wolin_reg123>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg122: unit = 65535 (for expression)
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret

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
// top type already set: __wolin_reg126: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg128>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg128: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg128>[bool*] = *CPU.I[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.maskInterrupts
// top type already set: __wolin_reg128: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg129>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg129: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg129>[bool] = #1[bool] // atomic ex
let &SP(1)<__wolin_reg128>[bool*] = SP(0)<__wolin_reg129>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg129>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg128>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg127: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg131>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg131: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg131>[ubyte*] = *56333[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.cia1InerruptCtrlReg
// top type already set: __wolin_reg131: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg132>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg132: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg132>[ubyte] = #127[ubyte] // atomic ex
let &SP(1)<__wolin_reg131>[ubyte*] = SP(0)<__wolin_reg132>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg132>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg131>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg130: unit = 65535 (for expression)
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.rasterBar ========
alloc SPF, #0
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_rasterBar[adr]

// == FN_CALL END: pl.qus.wolin.rasterBar ========
// 
// top type already set: __wolin_reg133: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg135>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg135: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg135>[bool*] = *CPU.I[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.maskInterrupts
// top type already set: __wolin_reg135: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg136>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg136: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg136>[bool] = #0[bool] // atomic ex
let &SP(1)<__wolin_reg135>[bool*] = SP(0)<__wolin_reg136>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg136>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg135>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg134: unit = 65535 (for expression)
alloc SP<__wolin_reg137>, #1 // for expression
label __wolin_lab_loopStart_1
// FORCE TOP: __wolin_reg137: bool = 0 (for expression) -> bool
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg137>[bool] = #1[bool] // atomic ex
beq SP(0)<__wolin_reg137>[bool] = #1[bool], __wolin_lab_loopStart_1<label_po_if>[uword]
label __wolin_lab_loopEnd_1
// top type already set: __wolin_reg137: bool = 0 (for expression)
free SP<__wolin_reg137>, #1 // for expression
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
