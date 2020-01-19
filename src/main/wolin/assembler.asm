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
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg2: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg3>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg3: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg3>[ubyte] = #7[ubyte] // atomic ex
let &SP(1)<__wolin_reg2>[ubyte*] = SP(0)<__wolin_reg3>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #1 // ASSIGNMENT value, type = ubyte
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
let SP(0)<__wolin_reg5>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// top type already set: __wolin_reg5: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg6>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg6: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #0[ubyte] // atomic ex
let &SP(1)<__wolin_reg5>[ubyte*] = SP(0)<__wolin_reg6>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg6>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg5>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg4: unit = 65535 (for expression)
alloc SP<__wolin_reg7>, #1 // for expression
label __wolin_lab_loopStart_1
// FORCE TOP: __wolin_reg7: bool = 0 (for expression) -> bool
alloc SP<__wolin_reg9>, #2 // for expression
let SP(0)<__wolin_reg9>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg9: ubyte* = 0 (for expression)
free SP<__wolin_reg9>, #2 // for expression
alloc SP<__wolin_reg10>, #2 // LEFT for <
let SP(0)<__wolin_reg10>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// top type already set: __wolin_reg10: ubyte* = 0 (LEFT for <)
alloc SP<__wolin_reg11>, #1 // RIGHT for <
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg11>[ubyte] = #100[ubyte] // atomic ex
// top type already set: __wolin_reg11: ubyte = 0 (RIGHT for <)
evalless SP(3)<__wolin_reg7>[bool] = &SP(1)<__wolin_reg10>[ubyte*], SP(0)<__wolin_reg11>[ubyte]
free SP<__wolin_reg11>, #1 // RIGHT for <
free SP<__wolin_reg10>, #2 // LEFT for <
// top type already set: __wolin_reg7: bool = 0 (for expression)
beq SP(0)<__wolin_reg7>[bool] = #1[bool], __wolin_lab_loopStart_1<label_po_if>[uword]
label __wolin_lab_loopEnd_1
// top type already set: __wolin_reg7: bool = 0 (for expression)
free SP<__wolin_reg7>, #1 // for expression
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg13>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg13: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg13>[ubyte*] = *53280[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicBorder
// top type already set: __wolin_reg13: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg14>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg14: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg14>[ubyte] = #0[ubyte] // atomic ex
let &SP(1)<__wolin_reg13>[ubyte*] = SP(0)<__wolin_reg14>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg14>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg13>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg12: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg16>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg16: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg16>[ubyte*] = *53273[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptStatusReg
// top type already set: __wolin_reg16: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg17>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg17: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg17>[ubyte] = #0[ubyte] // atomic ex
let &SP(1)<__wolin_reg16>[ubyte*] = SP(0)<__wolin_reg17>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg17>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg16>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg15: unit = 65535 (for expression)
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
reti

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg20>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg20: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg20>[ubyte*] = *56333[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.cia1InerruptCtrlReg
// top type already set: __wolin_reg20: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg21>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg21: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg21>[ubyte] = #127[ubyte] // atomic ex
let &SP(1)<__wolin_reg20>[ubyte*] = SP(0)<__wolin_reg21>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg21>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg20>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg19: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg23>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg23: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg23>[ubyte*] = *53265[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicScreenCtrlReg1
// top type already set: __wolin_reg23: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg24>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg24: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg24>[ubyte] = #27[ubyte] // atomic ex
let &SP(1)<__wolin_reg23>[ubyte*] = SP(0)<__wolin_reg24>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg24>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg23>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg22: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg26>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg26: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg26>[ubyte*] = *53266[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicRasterLine
// top type already set: __wolin_reg26: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg27>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg27: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg27>[ubyte] = #210[ubyte] // atomic ex
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
// (do assignLeftSideVar przypisano __wolin_reg29: uword* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg29>[uword*] = *788[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.interruptRoutineVector
// top type already set: __wolin_reg29: uword* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg30>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg30: uword = 0 (ASSIGNMENT value))
let SP(0)<__wolin_reg30>[uword] = __wolin_pl_qus_wolin_rasterProc[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by function pointer
let &SP(2)<__wolin_reg29>[uword*] = SP(0)<__wolin_reg30>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg30>, #2 // ASSIGNMENT value, type = uword
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
let SP(0)<__wolin_reg32>[ubyte*] = *53274[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.vicInterruptCtrlReg
// top type already set: __wolin_reg32: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg33>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg33: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg33>[ubyte] = #1[ubyte] // atomic ex
let &SP(1)<__wolin_reg32>[ubyte*] = SP(0)<__wolin_reg33>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg33>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg32>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg31: unit = 65535 (for expression)
alloc SP<__wolin_reg34>, #1 // for expression
label __wolin_lab_loopStart_2
// FORCE TOP: __wolin_reg34: bool = 0 (for expression) -> bool
alloc SP<__wolin_reg36>, #2 // LEFT equality check: evalneq
let SP(0)<__wolin_reg36>[ubyte*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.i
// top type already set: __wolin_reg36: ubyte* = 0 (LEFT equality check: evalneq)
alloc SP<__wolin_reg37>, #1 // RIGHT equality check: evalneq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg37>[ubyte] = #200[ubyte] // atomic ex
// top type already set: __wolin_reg37: ubyte = 0 (RIGHT equality check: evalneq)
evalneq SP(3)<__wolin_reg34>[bool] = &SP(1)<__wolin_reg36>[ubyte*], SP(0)<__wolin_reg37>[ubyte] // two sides
free SP<__wolin_reg37>, #1 // RIGHT equality check: evalneq
free SP<__wolin_reg36>, #2 // LEFT equality check: evalneq
// top type already set: __wolin_reg34: bool = 0 (for expression)
beq SP(0)<__wolin_reg34>[bool] = #1[bool], __wolin_lab_loopStart_2<label_po_if>[uword]
label __wolin_lab_loopEnd_2
// top type already set: __wolin_reg34: bool = 0 (for expression)
free SP<__wolin_reg34>, #1 // for expression
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
