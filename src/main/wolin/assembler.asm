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
// funkcja: fun pl.qus.wolin.print(pl.qus.wolin.print.what: ubyte* = 0 /*  */):unit
// ****************************************
function __wolin_pl_qus_wolin_print
alloc SP<__wolin_reg1>, #1 // for declaration vali=0
alloc SP<__wolin_reg2>, #1 // for var pl.qus.wolin.print..i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg2>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg2: ubyte = 0 /* for var pl.qus.wolin.print..i init expression */
let SPF(1)<pl.qus.wolin.print..i>[ubyte] = SP(0)<__wolin_reg2>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..i
free SP<__wolin_reg2>, #1 // for var pl.qus.wolin.print..i init expression
// top type already set: __wolin_reg1: ubyte = 0 /* for declaration vali=0 */
free SP<__wolin_reg1>, #1 // for declaration vali=0
alloc SP<__wolin_reg3>, #2 // for declaration varchar:ubyte=what[i]
alloc SP<__wolin_reg4>, #2 // for var pl.qus.wolin.print..char init expression
alloc SP<__wolin_reg5>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg6>, #2 // array variable
let SP(0)<__wolin_reg6>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg7>, #2 // For calculating index
let SP(0)<__wolin_reg7>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg7: uword = 0 /* For calculating index */ -> uword
add SP(4)<__wolin_reg5>[ubyte*] = SP(2)<__wolin_reg6>[ubyte*], SP(0)<__wolin_reg7>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg7>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg6: ubyte* = 0 /* array variable */
//  after index
// dereference value at topRegister
free SP<__wolin_reg6>, #2 // array variable
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg4>[ubyte*] = SP(0)<__wolin_reg5>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg5>, #2 // arr_deref
// top type already set: __wolin_reg4: ubyte* = 0 /* for var pl.qus.wolin.print..char init expression */
let SPF(0)<pl.qus.wolin.print..char>[ubyte] = SP(0)<__wolin_reg4>[ubyte*] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..char
free SP<__wolin_reg4>, #2 // for var pl.qus.wolin.print..char init expression
// top type already set: __wolin_reg3: ubyte* = 0 /* for declaration varchar:ubyte=what[i] */
free SP<__wolin_reg3>, #2 // for declaration varchar:ubyte=what[i]
alloc SP<__wolin_reg9>, #1 // for while condition
_scope_ loop,1
label __wolin_lab_loop_start_1
alloc SP<__wolin_reg10>, #2 // LEFT equality check: evalneq
let SP(0)<__wolin_reg10>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// top type already set: __wolin_reg10: ubyte* = 0 /* LEFT equality check: evalneq */
alloc SP<__wolin_reg11>, #1 // RIGHT equality check: evalneq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg11>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg11: ubyte = 0 /* RIGHT equality check: evalneq */
evalneq SP(3)<__wolin_reg9>[bool] = &SP(1)<__wolin_reg10>[ubyte*], SP(0)<__wolin_reg11>[ubyte] // two sides
free SP<__wolin_reg11>, #1 // RIGHT equality check: evalneq
free SP<__wolin_reg10>, #2 // LEFT equality check: evalneq
// top type already set: __wolin_reg9: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg9>[bool] = #1[bool], __wolin_lab_loop_end_1<label_po_if>[uword]
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 /*  */
save SP
// == FN_CALL: ARG #0 (char) pl.qus.wolin.chrout
alloc SP<__wolin_reg14>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru char
let SP(0)<__wolin_reg14>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// po visit value
save &SP(0)<__wolin_reg14>[ubyte*] // CPU.A
free SP<__wolin_reg14>, #2 // for call argument 0, type = ubyte
// switchType to:unit by function return type 2
restore CPU.A[ubyte]
// switchType to:unit by function call
call __wolin_pl_qus_wolin_chrout[uword]

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// 
// top type already set: __wolin_reg13: unit = 65535 /* for blockLevel expression */
alloc SP<__wolin_reg15>, #2 // for blockLevel expression
let SP(0)<__wolin_reg15>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg15: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg15>, #2 // for blockLevel expression
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg17>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg17: ubyte* = 0 /* ASSIGNMENT target */)
let SP(0)<__wolin_reg17>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// top type already set: __wolin_reg17: ubyte* = 0 /* ASSIGNMENT target */
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg18>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg18: ubyte* = 0 /* ASSIGNMENT value */)
alloc SP<__wolin_reg19>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg20>, #2 // array variable
let SP(0)<__wolin_reg20>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg21>, #2 // For calculating index
let SP(0)<__wolin_reg21>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg21: uword = 0 /* For calculating index */ -> uword
add SP(4)<__wolin_reg19>[ubyte*] = SP(2)<__wolin_reg20>[ubyte*], SP(0)<__wolin_reg21>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg21>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg20: ubyte* = 0 /* array variable */
//  after index
// dereference value at topRegister
free SP<__wolin_reg20>, #2 // array variable
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg18>[ubyte*] = SP(0)<__wolin_reg19>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg19>, #2 // arr_deref
let &SP(2)<__wolin_reg17>[ubyte*] = &SP(0)<__wolin_reg18>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg18>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg17>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg16: unit = 65535 /* for blockLevel expression */
goto __wolin_lab_loop_start_1[uword]
_endscope_ loop,1
label __wolin_lab_loop_end_1
free SP<__wolin_reg9>, #1 // for while condition
// top type already set: __wolin_reg8: unit = 65535 /* for blockLevel expression */
free SPF<__wolin_pl_qus_wolin_print>, #4 // free fn arguments and locals for pl.qus.wolin.print
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
alloc SPF<__wolin_pl_qus_wolin_print>, #4
// == FN_CALL: ARG #0 ("dupa") pl.qus.wolin.print
alloc SP<__wolin_reg24>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg24>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(2)<pl.qus.wolin.print.what>[ubyte*] = SP(0)<__wolin_reg24>[ubyte*]
free SP<__wolin_reg24>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_print[uword]

// == FN_CALL END: pl.qus.wolin.print ========
// 
// top type already set: __wolin_reg23: unit = 65535 /* for blockLevel expression */
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
