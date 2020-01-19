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
// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// ****************************************
// funkcja: fun pl.qus.wolin.clearScreen():unit
// ****************************************
function __wolin_pl_qus_wolin_clearScreen

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.blueBg():unit
// ****************************************
function __wolin_pl_qus_wolin_blueBg
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
let SP(0)<__wolin_reg3>[uword] = __wolin_pl_qus_wolin_whiteBg[uword] // przez sprawdzacz typow - simple id from var
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
let SP(0)<__wolin_reg11>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg11: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg12>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg12: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg12>[ubyte] = #255[ubyte] // atomic ex
let &SP(1)<__wolin_reg11>[ubyte*] = SP(0)<__wolin_reg12>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg12>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg11>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg10: unit = 65535 (for expression)
alloc SP<__wolin_reg13>, #2 // for expression
// switchType to:uword by parse literal constant
// top type already set: __wolin_reg13: uword = 0 (for expression)
free SP<__wolin_reg13>, #2 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
goto 59953[adr]

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.whiteBg():unit
// ****************************************
function __wolin_pl_qus_wolin_whiteBg
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
reti

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
// top type already set: __wolin_reg16: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg18>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg18: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg18>[bool*] = *CPU.I[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.maskInterrupts
// top type already set: __wolin_reg18: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg19>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg19: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg19>[bool] = #1[bool] // atomic ex
let &SP(1)<__wolin_reg18>[bool*] = SP(0)<__wolin_reg19>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg19>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg18>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg17: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg21>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg21: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg21>[ubyte*] = *56333[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.cia1InerruptCtrlReg
// top type already set: __wolin_reg21: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg22>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg22: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg22>[ubyte] = #127[ubyte] // atomic ex
let &SP(1)<__wolin_reg21>[ubyte*] = SP(0)<__wolin_reg22>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg22>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg21>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg20: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg24>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg24: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg24>[ubyte*] = *53274[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptCtrlReg
// top type already set: __wolin_reg24: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg25>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg25: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg25>[ubyte] = #1[ubyte] // atomic ex
bit &SP(1)<__wolin_reg24>[ubyte*] = SP(0)<__wolin_reg25>[ubyte], #1[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg25>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg24>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by bit op
// top type already set: __wolin_reg23: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg27>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg27: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg27>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg27: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg28>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg28: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg28>[ubyte] = #140[ubyte] // atomic ex
let &SP(1)<__wolin_reg27>[ubyte*] = SP(0)<__wolin_reg28>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg28>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg27>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg26: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg30>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg30: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg30>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg30: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg31>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg31: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg31>[uword] = __wolin_pl_qus_wolin_blueBg[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg30>[uword*] = SP(0)<__wolin_reg31>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg31>, #2 // ASSIGNMENT value, type = uword
free SP<__wolin_reg30>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg29: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg33>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg33: bool* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg33>[bool*] = *CPU.I[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.maskInterrupts
// top type already set: __wolin_reg33: bool* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg34>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg34: bool = 0 (ASSIGNMENT value))
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg34>[bool] = #0[bool] // atomic ex
let &SP(1)<__wolin_reg33>[bool*] = SP(0)<__wolin_reg34>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg34>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg33>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg32: unit = 65535 (for expression)
alloc SP<__wolin_reg35>, #1 // for expression
label __wolin_lab_loopStart_1
// FORCE TOP: __wolin_reg35: bool = 0 (for expression) -> bool
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg35>[bool] = #1[bool] // atomic ex
beq SP(0)<__wolin_reg35>[bool] = #1[bool], __wolin_lab_loopStart_1<label_po_if>[uword]
label __wolin_lab_loopEnd_1
// top type already set: __wolin_reg35: bool = 0 (for expression)
free SP<__wolin_reg35>, #1 // for expression
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
