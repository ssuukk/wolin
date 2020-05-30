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
// funkcja: fun pl.qus.wolin.extPrint(pl.qus.wolin.extPrint.what: ubyte* = 0 /*  */):ubyte
// ****************************************
function __wolin_pl_qus_wolin_extPrint
alloc SP<__wolin_reg1>, #2 // for blockLevel expression
alloc SP<__wolin_reg2>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg3>, #2 // array variable
let SP(0)<__wolin_reg3>[ubyte*] = SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.extPrint.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg4>, #2 // For calculating index
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[uword] = #0[ubyte] // atomic ex
// FORCE TOP: __wolin_reg4: uword = 0 /* For calculating index */ -> uword
add SP(4)<__wolin_reg2>[ubyte*] = SP(2)<__wolin_reg3>[ubyte*], &SP(0)<__wolin_reg4>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg4>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg3: ubyte* = 0 /* array variable */
//  after index
// dereference value at topRegister
free SP<__wolin_reg3>, #2 // array variable
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg1>[ubyte*] = SP(0)<__wolin_reg2>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg2>, #2 // arr_deref
let SPF(2)<pl.qus.wolin.extPrint.__returnValue>[ubyte] = &SP(0)<__wolin_reg1>[ubyte*] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
free SP<__wolin_reg1>, #2 // for blockLevel expression
free SPF<__wolin_pl_qus_wolin_extPrint>, #2 // free fn arguments and locals for pl.qus.wolin.extPrint
// ***** fnDeclFreeStackAndRet usuwanie zwrotki pl.qus.wolin.extPrint ze stosu
// freeing call stack
// return from function body
endfunction

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
alloc SP<__wolin_reg6>, #1 // for blockLevel expression
// switchType to:ubyte by function return type 1
// 
// == FN_CALL: pl.qus.wolin.extPrint ========
alloc SPF<__wolin_pl_qus_wolin_extPrint>, #3
// == FN_CALL: ARG #0 ("dupa") pl.qus.wolin.extPrint
alloc SP<__wolin_reg7>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg7>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] = SP(0)<__wolin_reg7>[ubyte*]
free SP<__wolin_reg7>, #2 // for call argument 0, type = ubyte*
// switchType to:ubyte by function return type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_extPrint[uword]

let SP(0)<__wolin_reg6>[ubyte] = SPF(0)<pl.qus.wolin.extPrint.__returnValue>[ubyte] // przez sprawdzacz typow - copy return parameter
// == FN_CALL END: pl.qus.wolin.extPrint ========
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.extPrint ze stosu
free SPF <pl.qus.wolin.extPrint.__returnValue>, #1 // free return value of pl.qus.wolin.extPrint from call stack
// 
// top type already set: __wolin_reg6: ubyte = 0 /* for blockLevel expression */
free SP<__wolin_reg6>, #1 // for blockLevel expression
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
