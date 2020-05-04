setup HEADER
label __wolin_pl_qus_wolin_plot = 65520
label __wolin_pl_qus_wolin_chrout = 65490
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
goto __wolin_pl_qus_wolin_main[uword]
// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.extPrint(pl.qus.wolin.extPrint.what: ubyte* = 0 /*  */):unit
// ****************************************
import __wolin_pl_qus_wolin_extPrint

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.scopeTest(pl.qus.wolin.scopeTest.x: ubyte = 0 /*  */, pl.qus.wolin.scopeTest.y: ubyte = 0 /*  */, pl.qus.wolin.scopeTest.what: ubyte* = 0 /*  */, pl.qus.wolin.scopeTest.war: bool = 0 /*  */):unit
// ****************************************
function __wolin_pl_qus_wolin_scopeTest
alloc SP<__wolin_reg1>, #2 // for blockLevel expression
alloc SP<__wolin_reg2>, #1 // for while condition
_scope_ loop,1
label __wolin_lab_loop_start_1
alloc SP<__wolin_reg3>, #2 // LEFT for <
let SP(0)<__wolin_reg3>[ubyte*] = *SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.scopeTest.x
// top type already set: __wolin_reg3: ubyte* = 0 /* LEFT for < */
alloc SP<__wolin_reg4>, #1 // RIGHT for <
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte] = #100[ubyte] // atomic ex
// top type already set: __wolin_reg4: ubyte = 0 /* RIGHT for < */
evalless &SP(3)<__wolin_reg2>[bool] = &SP(1)<__wolin_reg3>[ubyte*], &SP(0)<__wolin_reg4>[ubyte]
free SP<__wolin_reg4>, #1 // RIGHT for <
free SP<__wolin_reg3>, #2 // LEFT for <
// top type already set: __wolin_reg2: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg2>[bool] = #1[bool], __wolin_lab_loop_end_1<label_po_if>[uword]
alloc SP<__wolin_reg6>, #2 // for blockLevel expression
alloc SP<__wolin_reg7>, #2 // condition expression bool result
let SP(0)<__wolin_reg7>[bool*] = *SPF(0)<pl.qus.wolin.scopeTest.war>[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.scopeTest.war
bne SP(0)<__wolin_reg7>[bool*] = #1[bool], __wolin_lab_else_branch_1<label_DO_else>[uword]
//  body dla true
alloc SP<__wolin_reg10>, #2 // for blockLevel expression
alloc SP<__wolin_reg11>, #1 // for while condition
_scope_ loop,2
label __wolin_lab_loop_start_2
alloc SP<__wolin_reg12>, #2 // LEFT for >
let SP(0)<__wolin_reg12>[ubyte*] = *SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.scopeTest.y
// top type already set: __wolin_reg12: ubyte* = 0 /* LEFT for > */
alloc SP<__wolin_reg13>, #1 // RIGHT for >
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg13>[ubyte] = #10[ubyte] // atomic ex
// top type already set: __wolin_reg13: ubyte = 0 /* RIGHT for > */
evalless &SP(3)<__wolin_reg11>[bool] = &SP(0)<__wolin_reg13>[ubyte], &SP(1)<__wolin_reg12>[ubyte*]
free SP<__wolin_reg13>, #1 // RIGHT for >
free SP<__wolin_reg12>, #2 // LEFT for >
// top type already set: __wolin_reg11: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg11>[bool] = #1[bool], __wolin_lab_loop_end_2<label_po_if>[uword]
alloc SP<__wolin_reg15>, #2 // for blockLevel expression
let SP(0)<__wolin_reg15>[ubyte*] = *SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg15: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg15>, #2 // for blockLevel expression
goto __wolin_lab_loop_start_2[uword]
_scope_ endloop,2
label __wolin_lab_loop_end_2
free SP<__wolin_reg11>, #1 // for while condition
// top type already set: __wolin_reg10: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg10>, #2 // for blockLevel expression
goto __wolin_lab_if_end_1[uword]
label __wolin_lab_else_branch_1 // miejsce C
//  body dla false/else
alloc SP<__wolin_reg17>, #2 // for blockLevel expression
alloc SP<__wolin_reg18>, #1 // for while condition
_scope_ loop,3
label __wolin_lab_loop_start_3
alloc SP<__wolin_reg19>, #2 // LEFT for <
let SP(0)<__wolin_reg19>[ubyte*] = *SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.scopeTest.x
// top type already set: __wolin_reg19: ubyte* = 0 /* LEFT for < */
alloc SP<__wolin_reg20>, #1 // RIGHT for <
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg20>[ubyte] = #20[ubyte] // atomic ex
// top type already set: __wolin_reg20: ubyte = 0 /* RIGHT for < */
evalless &SP(3)<__wolin_reg18>[bool] = &SP(1)<__wolin_reg19>[ubyte*], &SP(0)<__wolin_reg20>[ubyte]
free SP<__wolin_reg20>, #1 // RIGHT for <
free SP<__wolin_reg19>, #2 // LEFT for <
// top type already set: __wolin_reg18: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg18>[bool] = #1[bool], __wolin_lab_loop_end_3<label_po_if>[uword]
alloc SP<__wolin_reg22>, #2 // for blockLevel expression
let SP(0)<__wolin_reg22>[ubyte*] = *SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] = SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg22: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg22>, #2 // for blockLevel expression
goto __wolin_lab_loop_start_3[uword]
_scope_ endloop,3
label __wolin_lab_loop_end_3
free SP<__wolin_reg18>, #1 // for while condition
// top type already set: __wolin_reg17: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg17>, #2 // for blockLevel expression
label __wolin_lab_if_end_1 // miejsce A
free SP<__wolin_reg7>, #2 // condition expression bool result
// top type already set: __wolin_reg6: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg6>, #2 // for blockLevel expression
goto __wolin_lab_loop_start_1[uword]
_scope_ endloop,1
label __wolin_lab_loop_end_1
free SP<__wolin_reg2>, #1 // for while condition
// top type already set: __wolin_reg1: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg1>, #2 // for blockLevel expression
free SPF<__wolin_pl_qus_wolin_scopeTest>, #5 // free fn arguments and locals for pl.qus.wolin.scopeTest
// freeing call stack
// return from function body
endfunction

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.extPrint ========
alloc SPF<__wolin_pl_qus_wolin_extPrint>, #2
// == FN_CALL: ARG #0 ("dupa") pl.qus.wolin.extPrint
alloc SP<__wolin_reg25>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg25>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] = SP(0)<__wolin_reg25>[ubyte*]
free SP<__wolin_reg25>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_extPrint[uword]

// == FN_CALL END: pl.qus.wolin.extPrint ========
// 
// top type already set: __wolin_reg24: unit = 65535 /* for blockLevel expression */
// freeing call stack
// return from function body
endfunction



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
string __wolin_lab_stringConst_0[uword] = $"dupa"
