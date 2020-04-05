setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[uword]
endfunction
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
alloc SP<__wolin_reg3>, #1 // for declaration valznak=what[i]
alloc SP<__wolin_reg4>, #1 // for var pl.qus.wolin.print..znak init expression
alloc SP<__wolin_reg5>, #1 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
// Short array
let SP(0)<__wolin_reg5>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg5: ubyte = 0 /* arr_deref */ -> ubyte
//  fast array - no additional op
// **ARRAY Changing current type to prevReg type __wolin_reg5: ubyte = 0 /* arr_deref */
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  allocated fast array, changing top reg to ptr
let SP(1)<__wolin_reg4>[ubyte] = &SPF(2)<pl.qus.wolin.print.what>[ubyte*], &SP(0)<__wolin_reg5>[ubyte]
free SP<__wolin_reg5>, #1 // arr_deref
// top type already set: __wolin_reg4: ubyte = 0 /* for var pl.qus.wolin.print..znak init expression */
let SPF(0)<pl.qus.wolin.print..znak>[ubyte] = SP(0)<__wolin_reg4>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..znak
free SP<__wolin_reg4>, #1 // for var pl.qus.wolin.print..znak init expression
// top type already set: __wolin_reg3: ubyte = 0 /* for declaration valznak=what[i] */
free SP<__wolin_reg3>, #1 // for declaration valznak=what[i]
alloc SP<__wolin_reg6>, #1 // for blockLevel expression
alloc SP<__wolin_reg7>, #1 // for while condition
label __wolin_lab_loop_start_1
alloc SP<__wolin_reg8>, #2 // LEFT equality check: evalneq
let SP(0)<__wolin_reg8>[ubyte*] = *SPF(0)<pl.qus.wolin.print..znak>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..znak
// top type already set: __wolin_reg8: ubyte* = 0 /* LEFT equality check: evalneq */
alloc SP<__wolin_reg9>, #1 // RIGHT equality check: evalneq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg9: ubyte = 0 /* RIGHT equality check: evalneq */
evalneq &SP(3)<__wolin_reg7>[bool] = &SP(1)<__wolin_reg8>[ubyte*], &SP(0)<__wolin_reg9>[ubyte] // two sides
free SP<__wolin_reg9>, #1 // RIGHT equality check: evalneq
free SP<__wolin_reg8>, #2 // LEFT equality check: evalneq
// top type already set: __wolin_reg7: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg7>[bool] = #1[bool], __wolin_lab_loop_end_1<label_po_if>[uword]
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 /*  */
save SP
// == FN_CALL: ARG #0 (znak) pl.qus.wolin.chrout
alloc SP<__wolin_reg12>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru znak
let SP(0)<__wolin_reg12>[ubyte*] = *SPF(0)<pl.qus.wolin.print..znak>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..znak
// po visit value
save &SP(0)<__wolin_reg12>[ubyte*] // CPU.A
free SP<__wolin_reg12>, #2 // for call argument 0, type = ubyte
// switchType to:unit by function return type 2
restore CPU.A[ubyte]
// switchType to:unit by function call
call 65490[uword] // pl.qus.wolin.chrout

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// 
// top type already set: __wolin_reg11: unit = 65535 /* for blockLevel expression */
alloc SP<__wolin_reg13>, #2 // for blockLevel expression
let SP(0)<__wolin_reg13>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg13: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg13>, #2 // for blockLevel expression
alloc SP<__wolin_reg14>, #1 // for declaration valznak=what[i]
alloc SP<__wolin_reg15>, #1 // for var pl.qus.wolin.print..znak init expression
alloc SP<__wolin_reg16>, #1 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
// Short array
let SP(0)<__wolin_reg16>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg16: ubyte = 0 /* arr_deref */ -> ubyte
//  fast array - no additional op
// **ARRAY Changing current type to prevReg type __wolin_reg16: ubyte = 0 /* arr_deref */
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  allocated fast array, changing top reg to ptr
let SP(1)<__wolin_reg15>[ubyte] = &SPF(2)<pl.qus.wolin.print.what>[ubyte*], &SP(0)<__wolin_reg16>[ubyte]
free SP<__wolin_reg16>, #1 // arr_deref
// top type already set: __wolin_reg15: ubyte = 0 /* for var pl.qus.wolin.print..znak init expression */
let SPF(0)<pl.qus.wolin.print..znak>[ubyte] = SP(0)<__wolin_reg15>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..znak
free SP<__wolin_reg15>, #1 // for var pl.qus.wolin.print..znak init expression
// top type already set: __wolin_reg14: ubyte = 0 /* for declaration valznak=what[i] */
free SP<__wolin_reg14>, #1 // for declaration valznak=what[i]
goto __wolin_lab_loop_start_1[uword]
label __wolin_lab_loop_end_1
free SP<__wolin_reg7>, #1 // for while condition
// top type already set: __wolin_reg6: ubyte = 0 /* for blockLevel expression */
free SP<__wolin_reg6>, #1 // for blockLevel expression
free SPF<pl.qus.wolin.print.__fnargs>, #4 // free fn arguments and locals for pl.qus.wolin.print
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
alloc SPF, #4
// == FN_CALL: ARG #0 ("dupa") pl.qus.wolin.print
alloc SP<__wolin_reg19>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg19>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(2)[ubyte*] = SP(0)<__wolin_reg19>[ubyte*]
free SP<__wolin_reg19>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_print[uword]

// == FN_CALL END: pl.qus.wolin.print ========
// 
// top type already set: __wolin_reg18: unit = 65535 /* for blockLevel expression */
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
