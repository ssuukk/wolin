setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.i
alloc SP<__wolin_reg0>, #1 // for var pl.qus.wolin.i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg0: ubyte = 0 (for var pl.qus.wolin.i init expression) location = null, null
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg0>, #1 // for var pl.qus.wolin.i init expression
// inicjalizacja zmiennej pl.qus.wolin.chr
alloc SP<__wolin_reg1>, #1 // for var pl.qus.wolin.chr init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg1: ubyte = 0 (for var pl.qus.wolin.chr init expression) location = null, null
let __wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.chr
free SP<__wolin_reg1>, #1 // for var pl.qus.wolin.chr init expression
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[uword]
endfunction
// switchType to:uword by parse literal constant
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test(pl.qus.wolin.test.wart: ubyte = 0 () location = null, null):bool
// ****************************************
function __wolin_pl_qus_wolin_test
alloc SP<__wolin_reg3>, #1 // for expression
alloc SP<__wolin_reg4>, #1 // condition expression bool result
alloc SP<__wolin_reg5>, #2 // LEFT for >
let SP(0)<__wolin_reg5>[ubyte*] = *SPF(0)<pl.qus.wolin.test.wart>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.wart
// top type already set: __wolin_reg5: ubyte* = 0 (LEFT for >) location = null, null
alloc SP<__wolin_reg6>, #1 // RIGHT for >
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #10[ubyte] // atomic ex
// top type already set: __wolin_reg6: ubyte = 0 (RIGHT for >) location = null, null
evalless &SP(3)<__wolin_reg4>[bool] = &SP(0)<__wolin_reg6>[ubyte], &SP(1)<__wolin_reg5>[ubyte*]
free SP<__wolin_reg6>, #1 // RIGHT for >
free SP<__wolin_reg5>, #2 // LEFT for >
// top type already set: __wolin_reg4: bool = 0 (condition expression bool result) location = null, null
alloc SP<__wolin_reg7>, #1 // for value when if assigned
bne SP(1)<__wolin_reg4>[bool] = #1[bool], __wolin_lab_afterIfExpression_1<label_DO_else>[uword]
//  body dla true
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg7>[bool] = #1[bool] // atomic ex
let SPF(1)<pl.qus.wolin.test.__returnValue>[bool] = &SP(0)<__wolin_reg7>[bool] // przez sprawdzacz typow - jump expression
// TODO!!! Jump to END of function, before dealloc
// switchType to:bool by return expression
goto __wolin_lab_afterWholeIf_1[uword]
label __wolin_lab_afterIfExpression_1 // miejsce C
//  body dla false/else
alloc SP<__wolin_reg8>, #1 // condition expression bool result
alloc SP<__wolin_reg9>, #2 // LEFT for >
let SP(0)<__wolin_reg9>[ubyte*] = *SPF(0)<pl.qus.wolin.test.wart>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.wart
// top type already set: __wolin_reg9: ubyte* = 0 (LEFT for >) location = null, null
alloc SP<__wolin_reg10>, #1 // RIGHT for >
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg10>[ubyte] = #5[ubyte] // atomic ex
// top type already set: __wolin_reg10: ubyte = 0 (RIGHT for >) location = null, null
evalless &SP(3)<__wolin_reg8>[bool] = &SP(0)<__wolin_reg10>[ubyte], &SP(1)<__wolin_reg9>[ubyte*]
free SP<__wolin_reg10>, #1 // RIGHT for >
free SP<__wolin_reg9>, #2 // LEFT for >
// top type already set: __wolin_reg8: bool = 0 (condition expression bool result) location = null, null
alloc SP<__wolin_reg11>, #1 // for value when if assigned
bne SP(1)<__wolin_reg8>[bool] = #1[bool], __wolin_lab_afterIfExpression_2<label_po_if>[uword]
//  body dla true
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg11>[bool] = #0[bool] // atomic ex
let SPF(1)<pl.qus.wolin.test.__returnValue>[bool] = &SP(0)<__wolin_reg11>[bool] // przez sprawdzacz typow - jump expression
// TODO!!! Jump to END of function, before dealloc
// switchType to:bool by return expression
//  label po if
label __wolin_lab_afterIfExpression_2 // miejsce B
label __wolin_lab_afterWholeIf_2 // miejsce A
free SP<__wolin_reg11>, #1 // for value when if assigned
free SP<__wolin_reg8>, #1 // condition expression bool result
label __wolin_lab_afterWholeIf_1 // miejsce A
free SP<__wolin_reg7>, #1 // for value when if assigned
free SP<__wolin_reg4>, #1 // condition expression bool result
// top type already set: __wolin_reg3: bool = 0 (for expression) location = null, null
free SP<__wolin_reg3>, #1 // for expression
alloc SP<__wolin_reg12>, #2 // for expression
let SP(0)<__wolin_reg12>[uword*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword], #1[uword] // simple id
// switchType to:uword by ++ operator
// top type already set: __wolin_reg12: uword* = 0 (for expression) location = null, null
free SP<__wolin_reg12>, #2 // for expression
alloc SP<__wolin_reg13>, #1 // for expression
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg13>[bool] = #1[bool] // atomic ex
let SPF(1)<pl.qus.wolin.test.__returnValue>[bool] = &SP(0)<__wolin_reg13>[bool] // przez sprawdzacz typow - jump expression
// TODO!!! Jump to END of function, before dealloc
// switchType to:bool by return expression
// top type already set: __wolin_reg13: bool = 0 (for expression) location = null, null
free SP<__wolin_reg13>, #1 // for expression
free SPF<pl.qus.wolin.test.__fnargs>, #1 // free fn arguments and locals for pl.qus.wolin.test
// ***** fnDeclFreeStackAndRet usuwanie zwrotki pl.qus.wolin.test ze stosu
// freeing call stack
// return from function body
endfunction

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
alloc SP<__wolin_reg15>, #1 // for expression
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.test ========
alloc SPF, #2
// == FN_CALL: ARG #0 (5) pl.qus.wolin.test
alloc SP<__wolin_reg16>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 5
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg16>[ubyte] = #5[ubyte] // atomic ex
// po visit value
let SPF(0)[ubyte] = SP(0)<__wolin_reg16>[ubyte]
free SP<__wolin_reg16>, #1 // for call argument 0, type = ubyte
// switchType to:bool by function return type 2
// switchType to:bool by function call
call __wolin_pl_qus_wolin_test[uword]

let SP(0)<__wolin_reg15>[bool] = SPF(0)<pl.qus.wolin.test.__returnValue>[bool] // przez sprawdzacz typow - copy return parameter
// == FN_CALL END: pl.qus.wolin.test ========
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.test ze stosu
free SPF <pl.qus.wolin.test.__returnValue>, #1 // free return value of pl.qus.wolin.test from call stack
// 
// top type already set: __wolin_reg15: bool = 0 (for expression) location = null, null
free SP<__wolin_reg15>, #1 // for expression
alloc SP<__wolin_reg17>, #1 // for expression
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.test ========
alloc SPF, #2
// == FN_CALL: ARG #0 (10) pl.qus.wolin.test
alloc SP<__wolin_reg18>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 10
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg18>[ubyte] = #10[ubyte] // atomic ex
// po visit value
let SPF(0)[ubyte] = SP(0)<__wolin_reg18>[ubyte]
free SP<__wolin_reg18>, #1 // for call argument 0, type = ubyte
// switchType to:bool by function return type 2
// switchType to:bool by function call
call __wolin_pl_qus_wolin_test[uword]

let SP(0)<__wolin_reg17>[bool] = SPF(0)<pl.qus.wolin.test.__returnValue>[bool] // przez sprawdzacz typow - copy return parameter
// == FN_CALL END: pl.qus.wolin.test ========
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.test ze stosu
free SPF <pl.qus.wolin.test.__returnValue>, #1 // free return value of pl.qus.wolin.test from call stack
// 
// top type already set: __wolin_reg17: bool = 0 (for expression) location = null, null
free SP<__wolin_reg17>, #1 // for expression
// freeing call stack
// return from function body
endfunction



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
label __wolin_pl_qus_wolin_chr
alloc 0[ubyte]  // pl.qus.wolin.chr
