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
// switchType to:uword by parse literal constant
// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.onRasterGoto(pl.qus.wolin.onRasterGoto.line: ubyte = 0 (), pl.qus.wolin.onRasterGoto.proc: uword = 0 ()):unit
// ****************************************
function __wolin_pl_qus_wolin_onRasterGoto
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
// (do assignRightSideFinalVar przypisano __wolin_reg3: uword* = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg3>[uword*] = *SPF(0)<pl.qus.wolin.onRasterGoto.proc>[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.onRasterGoto.proc
let &SP(2)<__wolin_reg2>[uword*] = &SP(0)<__wolin_reg3>[uword*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #2 // ASSIGNMENT value, type = uword*
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
alloc SP<__wolin_reg6>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg6: ubyte* = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg6>[ubyte*] = *SPF(2)<pl.qus.wolin.onRasterGoto.line>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.onRasterGoto.line
let &SP(2)<__wolin_reg5>[ubyte*] = &SP(0)<__wolin_reg6>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg6>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg5>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg4: unit = 65535 (for expression)
free SPF<pl.qus.wolin.onRasterGoto.__fnargs>, #3 // free fn arguments and locals for pl.qus.wolin.onRasterGoto
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.backgroundToBlue():unit
// ****************************************
function __wolin_pl_qus_wolin_backgroundToBlue
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.onRasterGoto ========
alloc SPF, #3
// == FN_CALL: ARG #0 (140) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg9>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 140
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #140[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg9>[ubyte]
free SP<__wolin_reg9>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (backgroundToWhite) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg10>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru backgroundToWhite
let SP(0)<__wolin_reg10>[uword] = #__wolin_pl_qus_wolin_backgroundToWhite[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
// po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg10>[uword]
free SP<__wolin_reg10>, #2 // for call argument 1, type = uword
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_onRasterGoto[adr]

// == FN_CALL END: pl.qus.wolin.onRasterGoto ========
// 
// top type already set: __wolin_reg8: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg12>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg12: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg12>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg12: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg13>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg13: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg13>[ubyte] = #6[ubyte] // atomic ex
let &SP(1)<__wolin_reg12>[ubyte*] = SP(0)<__wolin_reg13>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg13>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg12>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg11: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg15>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg15: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg15>[ubyte*] = *53281[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBackground
// top type already set: __wolin_reg15: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg16>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg16: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg16>[ubyte] = #6[ubyte] // atomic ex
let &SP(1)<__wolin_reg15>[ubyte*] = SP(0)<__wolin_reg16>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg16>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg15>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg14: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg18>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg18: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg18>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg18: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg19>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg19: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg19>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg18>[ubyte*] = SP(0)<__wolin_reg19>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg19>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg18>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg17: unit = 65535 (for expression)
alloc SP<__wolin_reg20>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg20: uword = 0 (for expression)
free SP<__wolin_reg20>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.backgroundToWhite():unit
// ****************************************
function __wolin_pl_qus_wolin_backgroundToWhite
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.onRasterGoto ========
alloc SPF, #3
// == FN_CALL: ARG #0 (160) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg23>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 160
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg23>[ubyte] = #160[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg23>[ubyte]
free SP<__wolin_reg23>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (backgroundToBlue) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg24>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru backgroundToBlue
let SP(0)<__wolin_reg24>[uword] = #__wolin_pl_qus_wolin_backgroundToBlue[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
// po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg24>[uword]
free SP<__wolin_reg24>, #2 // for call argument 1, type = uword
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_onRasterGoto[adr]

// == FN_CALL END: pl.qus.wolin.onRasterGoto ========
// 
// top type already set: __wolin_reg22: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg26>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg26: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg26>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg26: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg27>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg27: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg27>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg26>[ubyte*] = SP(0)<__wolin_reg27>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg27>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg26>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg25: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg29>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg29: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg29>[ubyte*] = *53281[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBackground
// top type already set: __wolin_reg29: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg30>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg30: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg30>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg29>[ubyte*] = SP(0)<__wolin_reg30>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg30>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg29>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg28: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg32>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg32: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg32>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg32: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg33>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg33: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg33>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg32>[ubyte*] = SP(0)<__wolin_reg33>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg33>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg32>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg31: unit = 65535 (for expression)
alloc SP<__wolin_reg34>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg34: uword = 0 (for expression)
free SP<__wolin_reg34>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.rasterBar():unit
// ****************************************
function __wolin_pl_qus_wolin_rasterBar
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg37>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg37: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg37>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg37: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg38>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg38: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg38>[ubyte] = #6[ubyte] // atomic ex
let &SP(1)<__wolin_reg37>[ubyte*] = SP(0)<__wolin_reg38>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg38>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg37>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg36: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg40>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg40: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg40>[ubyte*] = *53281[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBackground
// top type already set: __wolin_reg40: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg41>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg41: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg41>[ubyte] = #6[ubyte] // atomic ex
let &SP(1)<__wolin_reg40>[ubyte*] = SP(0)<__wolin_reg41>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg41>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg40>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg39: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg43>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg43: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg43>[ubyte*] = *53274[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptCtrlReg
// top type already set: __wolin_reg43: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg44>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg44: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg44>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg43>[ubyte*] = SP(0)<__wolin_reg44>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg44>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg43>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg42: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg46>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg46: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg46>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg46: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg47>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg47: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg47>[ubyte] = #128[ubyte] // atomic ex
bit &SP(1)<__wolin_reg46>[ubyte*] = SP(0)<__wolin_reg47>[ubyte], #0[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg47>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg46>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg45: unit = 65535 (for expression)
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.onRasterGoto ========
alloc SPF, #3
// == FN_CALL: ARG #0 (140) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg49>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 140
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg49>[ubyte] = #140[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg49>[ubyte]
free SP<__wolin_reg49>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (backgroundToBlue) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg50>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru backgroundToBlue
let SP(0)<__wolin_reg50>[uword] = #__wolin_pl_qus_wolin_backgroundToBlue[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
// po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg50>[uword]
free SP<__wolin_reg50>, #2 // for call argument 1, type = uword
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_onRasterGoto[adr]

// == FN_CALL END: pl.qus.wolin.onRasterGoto ========
// 
// top type already set: __wolin_reg48: unit = 65535 (for expression)
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.topRoutine():unit
// ****************************************
function __wolin_pl_qus_wolin_topRoutine
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
let SP(0)<__wolin_reg54>[ubyte] = #8[ubyte] // atomic ex
bit &SP(1)<__wolin_reg53>[ubyte*] = SP(0)<__wolin_reg54>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg54>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg53>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg52: unit = 65535 (for expression)
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.onRasterGoto ========
alloc SPF, #3
// == FN_CALL: ARG #0 (0xf9) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg56>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 0xf9
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg56>[ubyte] = #249[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg56>[ubyte]
free SP<__wolin_reg56>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (bottomRoutine) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg57>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru bottomRoutine
let SP(0)<__wolin_reg57>[uword] = #__wolin_pl_qus_wolin_bottomRoutine[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
// po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg57>[uword]
free SP<__wolin_reg57>, #2 // for call argument 1, type = uword
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_onRasterGoto[adr]

// == FN_CALL END: pl.qus.wolin.onRasterGoto ========
// 
// top type already set: __wolin_reg55: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg59>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg59: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg59>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg59: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg60>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg60: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg60>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg59>[ubyte*] = SP(0)<__wolin_reg60>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg60>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg59>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg58: unit = 65535 (for expression)
alloc SP<__wolin_reg61>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg61: uword = 0 (for expression)
free SP<__wolin_reg61>, #2 // for expression
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
alloc SP<__wolin_reg64>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg64: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg64>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg64: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg65>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg65: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg65>[ubyte] = #8[ubyte] // atomic ex
bit &SP(1)<__wolin_reg64>[ubyte*] = SP(0)<__wolin_reg65>[ubyte], #0[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg65>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg64>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg63: unit = 65535 (for expression)
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.onRasterGoto ========
alloc SPF, #3
// == FN_CALL: ARG #0 (0xff) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg67>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 0xff
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg67>[ubyte] = #255[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg67>[ubyte]
free SP<__wolin_reg67>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (topRoutine) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg68>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru topRoutine
let SP(0)<__wolin_reg68>[uword] = #__wolin_pl_qus_wolin_topRoutine[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
// po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg68>[uword]
free SP<__wolin_reg68>, #2 // for call argument 1, type = uword
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_onRasterGoto[adr]

// == FN_CALL END: pl.qus.wolin.onRasterGoto ========
// 
// top type already set: __wolin_reg66: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg70>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg70: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg70>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg70: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg71>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg71: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg71>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg70>[ubyte*] = SP(0)<__wolin_reg71>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg71>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg70>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg69: unit = 65535 (for expression)
alloc SP<__wolin_reg72>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg72: uword = 0 (for expression)
free SP<__wolin_reg72>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.openBorder():unit
// ****************************************
function __wolin_pl_qus_wolin_openBorder
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg75>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg75: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg75>[ubyte*] = *53269[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesOn
// top type already set: __wolin_reg75: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg76>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg76: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg76>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg75>[ubyte*] = SP(0)<__wolin_reg76>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg76>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg75>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg74: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg78>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg78: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg78>[ubyte*] = *53277[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesFat
// top type already set: __wolin_reg78: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg79>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg79: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg79>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg78>[ubyte*] = SP(0)<__wolin_reg79>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg79>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg78>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg77: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg81>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg81: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg81>[ubyte*] = *53271[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.spritesTall
// top type already set: __wolin_reg81: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg82>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg82: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg82>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg81>[ubyte*] = SP(0)<__wolin_reg82>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg82>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg81>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg80: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg84>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg84: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg84>[ubyte*] = *53248[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0X
// top type already set: __wolin_reg84: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg85>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg85: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg85>[ubyte] = #100[ubyte] // atomic ex
let &SP(1)<__wolin_reg84>[ubyte*] = SP(0)<__wolin_reg85>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg85>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg84>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg83: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg87>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg87: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg87>[ubyte*] = *53249[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0Y
// top type already set: __wolin_reg87: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg88>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg88: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg88>[ubyte] = #30[ubyte] // atomic ex
let &SP(1)<__wolin_reg87>[ubyte*] = SP(0)<__wolin_reg88>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg88>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg87>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg86: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg90>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg90: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg90>[ubyte*] = *53287[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sprite0Color
// top type already set: __wolin_reg90: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg91>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg91: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg91>[ubyte] = #2[ubyte] // atomic ex
let &SP(1)<__wolin_reg90>[ubyte*] = SP(0)<__wolin_reg91>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg91>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg90>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg89: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg93>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg93: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg93>[ubyte*] = *53281[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBackground
// top type already set: __wolin_reg93: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg94>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg94: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg94>[ubyte] = #0[ubyte] // atomic ex
let &SP(1)<__wolin_reg93>[ubyte*] = SP(0)<__wolin_reg94>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg94>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg93>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg92: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg96>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg96: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg96>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// top type already set: __wolin_reg96: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg97>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg97: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg97>[ubyte] = #0[ubyte] // atomic ex
let &SP(1)<__wolin_reg96>[ubyte*] = SP(0)<__wolin_reg97>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg97>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg96>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg95: unit = 65535 (for expression)
alloc SP<__wolin_reg98>, #1 // for expression
label __wolin_lab_loopStart_1
// FORCE TOP: __wolin_reg98: bool = 0 (for expression) -> bool
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg101>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg101: ubyte* = 0 (ASSIGNMENT target))
alloc SP<__wolin_reg102>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte* by type from pl.qus.wolin.realSprite
//  PRAWA strona array access, czyli indeks w nawiasach
// Short array
let SP(0)<__wolin_reg102>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// FORCE TOP: __wolin_reg102: ubyte* = 0 (arr_deref) -> ubyte*
//  fast array - no additional op
// **ARRAY Changing current type to prevReg type __wolin_reg102: ubyte* = 0 (arr_deref)
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  fixed fast array, changing top reg to ptr
let SP(2)<__wolin_reg101>[ubyte*] = 12288[ubyte*], &SP(0)<__wolin_reg102>[ubyte*]
free SP<__wolin_reg102>, #2 // arr_deref
// top type already set: __wolin_reg101: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg103>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg103: ubyte* = 0 (ASSIGNMENT value))
alloc SP<__wolin_reg104>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte* by type from pl.qus.wolin.spriteData
//  PRAWA strona array access, czyli indeks w nawiasach
// Short array
let SP(0)<__wolin_reg104>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// FORCE TOP: __wolin_reg104: ubyte* = 0 (arr_deref) -> ubyte*
//  fast array - no additional op
// **ARRAY Changing current type to prevReg type __wolin_reg104: ubyte* = 0 (arr_deref)
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  allocated fast array, changing top reg to ptr
let SP(2)<__wolin_reg103>[ubyte*] = __wolin_pl_qus_wolin_spriteData[ubyte*], &SP(0)<__wolin_reg104>[ubyte*]
free SP<__wolin_reg104>, #2 // arr_deref
let &SP(2)<__wolin_reg101>[ubyte*] = &SP(0)<__wolin_reg103>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg103>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg101>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg100: unit = 65535 (for expression)
alloc SP<__wolin_reg105>, #2 // for expression
let SP(0)<__wolin_reg105>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg105: ubyte* = 0 (for expression)
free SP<__wolin_reg105>, #2 // for expression
alloc SP<__wolin_reg106>, #2 // LEFT for <
let SP(0)<__wolin_reg106>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// top type already set: __wolin_reg106: ubyte* = 0 (LEFT for <)
alloc SP<__wolin_reg107>, #1 // RIGHT for <
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg107>[ubyte] = #64[ubyte] // atomic ex
// top type already set: __wolin_reg107: ubyte = 0 (RIGHT for <)
evalless SP(3)<__wolin_reg98>[bool] = &SP(1)<__wolin_reg106>[ubyte*], SP(0)<__wolin_reg107>[ubyte]
free SP<__wolin_reg107>, #1 // RIGHT for <
free SP<__wolin_reg106>, #2 // LEFT for <
// top type already set: __wolin_reg98: bool = 0 (for expression)
beq SP(0)<__wolin_reg98>[bool] = #1[bool], __wolin_lab_loopStart_1<label_po_if>[uword]
label __wolin_lab_loopEnd_1
// top type already set: __wolin_reg98: bool = 0 (for expression)
free SP<__wolin_reg98>, #1 // for expression
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg109>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg109: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg109>[ubyte*] = *53274[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptCtrlReg
// top type already set: __wolin_reg109: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg110>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg110: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg110>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg109>[ubyte*] = SP(0)<__wolin_reg110>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg110>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg109>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg108: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg112>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg112: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg112>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg112: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg113>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg113: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg113>[ubyte] = #128[ubyte] // atomic ex
bit &SP(1)<__wolin_reg112>[ubyte*] = SP(0)<__wolin_reg113>[ubyte], #0[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg113>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg112>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg111: unit = 65535 (for expression)
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.onRasterGoto ========
alloc SPF, #3
// == FN_CALL: ARG #0 (0xf9) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg115>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 0xf9
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg115>[ubyte] = #249[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg115>[ubyte]
free SP<__wolin_reg115>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (bottomRoutine) pl.qus.wolin.onRasterGoto
alloc SP<__wolin_reg116>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru bottomRoutine
let SP(0)<__wolin_reg116>[uword] = #__wolin_pl_qus_wolin_bottomRoutine[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
// po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg116>[uword]
free SP<__wolin_reg116>, #2 // for call argument 1, type = uword
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_onRasterGoto[adr]

// == FN_CALL END: pl.qus.wolin.onRasterGoto ========
// 
// top type already set: __wolin_reg114: unit = 65535 (for expression)
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
alloc SP<__wolin_reg119>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg119: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg119>[bool*] = *CPU.I[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.maskInterrupts
// top type already set: __wolin_reg119: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg120>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg120: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg120>[bool] = #1[bool] // atomic ex
let &SP(1)<__wolin_reg119>[bool*] = SP(0)<__wolin_reg120>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg120>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg119>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg118: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg122>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg122: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg122>[ubyte*] = *56333[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.cia1InerruptCtrlReg
// top type already set: __wolin_reg122: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg123>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg123: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg123>[ubyte] = #127[ubyte] // atomic ex
let &SP(1)<__wolin_reg122>[ubyte*] = SP(0)<__wolin_reg123>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg123>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg122>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg121: unit = 65535 (for expression)
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.openBorder ========
alloc SPF, #0
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_openBorder[adr]

// == FN_CALL END: pl.qus.wolin.openBorder ========
// 
// top type already set: __wolin_reg124: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg126>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg126: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg126>[bool*] = *CPU.I[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.maskInterrupts
// top type already set: __wolin_reg126: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg127>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg127: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg127>[bool] = #0[bool] // atomic ex
let &SP(1)<__wolin_reg126>[bool*] = SP(0)<__wolin_reg127>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg127>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg126>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg125: unit = 65535 (for expression)
alloc SP<__wolin_reg128>, #1 // for expression
label __wolin_lab_loopStart_2
// FORCE TOP: __wolin_reg128: bool = 0 (for expression) -> bool
alloc SP<__wolin_reg130>, #2 // for expression
let SP(0)<__wolin_reg130>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg130: ubyte* = 0 (for expression)
free SP<__wolin_reg130>, #2 // for expression
alloc SP<__wolin_reg131>, #2 // LEFT for <
let SP(0)<__wolin_reg131>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// top type already set: __wolin_reg131: ubyte* = 0 (LEFT for <)
alloc SP<__wolin_reg132>, #1 // RIGHT for <
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg132>[ubyte] = #255[ubyte] // atomic ex
// top type already set: __wolin_reg132: ubyte = 0 (RIGHT for <)
evalless SP(3)<__wolin_reg128>[bool] = &SP(1)<__wolin_reg131>[ubyte*], SP(0)<__wolin_reg132>[ubyte]
free SP<__wolin_reg132>, #1 // RIGHT for <
free SP<__wolin_reg131>, #2 // LEFT for <
// top type already set: __wolin_reg128: bool = 0 (for expression)
beq SP(0)<__wolin_reg128>[bool] = #1[bool], __wolin_lab_loopStart_2<label_po_if>[uword]
label __wolin_lab_loopEnd_2
// top type already set: __wolin_reg128: bool = 0 (for expression)
free SP<__wolin_reg128>, #1 // for expression
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
label __wolin_pl_qus_wolin_spriteData
alloc 0[ubyte*]  // pl.qus.wolin.spriteData
label __wolin_pl_qus_wolin_i
alloc 0[ubyte]  // pl.qus.wolin.i
