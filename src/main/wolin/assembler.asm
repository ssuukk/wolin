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
alloc SP<__wolin_reg2>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg2>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] = SP(0)<__wolin_reg2>[ubyte*]
free SP<__wolin_reg2>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_extPrint[uword]

// == FN_CALL END: pl.qus.wolin.extPrint ========
// 
// top type already set: __wolin_reg1: unit = 65535 /* for blockLevel expression */
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
