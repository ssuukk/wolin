setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[uword]
endfunction
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.print(pl.qus.wolin.print.what: ubyte* = 0 /*  */):unit
// ****************************************
function __wolin_pl_qus_wolin_print
// top type already set: __wolin_reg1: unit = 65535 /* for declaration valfromArray:ubyte */
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg3>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg3: ubyte* = 0 /* ASSIGNMENT target */)
let SP(0)<__wolin_reg3>[ubyte*] = *SPF(0)<pl.qus.wolin.print..fromArray>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..fromArray
// top type already set: __wolin_reg3: ubyte* = 0 /* ASSIGNMENT target */
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg4>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg4: ubyte = 0 /* ASSIGNMENT value */)
alloc SP<__wolin_reg5>, #1 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
// Short array
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[ubyte*] = #3[ubyte] // atomic ex
// FORCE TOP: __wolin_reg5: ubyte = 0 /* arr_deref */ -> ubyte
//  fast array - no additional op
// **ARRAY Changing current type to prevReg type __wolin_reg5: ubyte = 0 /* arr_deref */
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  allocated fast array, changing top reg to ptr
let SP(1)<__wolin_reg4>[ubyte] = SPF(1)<pl.qus.wolin.print.what>[ubyte*], &SP(0)<__wolin_reg5>[ubyte]
free SP<__wolin_reg5>, #1 // arr_deref
let &SP(1)<__wolin_reg3>[ubyte*] = &SP(0)<__wolin_reg4>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg4>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg3>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg2: unit = 65535 /* for blockLevel expression */
free SPF<pl.qus.wolin.print.__fnargs>, #3 // free fn arguments and locals for pl.qus.wolin.print
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
// == FN_CALL: pl.qus.wolin.print ========
alloc SPF, #3
// == FN_CALL: ARG #0 ("dupa") pl.qus.wolin.print
alloc SP<__wolin_reg8>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg8>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(1)[ubyte*] = SP(0)<__wolin_reg8>[ubyte*]
free SP<__wolin_reg8>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_print[uword]

// == FN_CALL END: pl.qus.wolin.print ========
// 
// top type already set: __wolin_reg7: unit = 65535 /* for blockLevel expression */
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
