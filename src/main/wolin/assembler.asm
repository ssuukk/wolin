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
// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.printAt(pl.qus.wolin.printAt.x: ubyte = 0 /*  */, pl.qus.wolin.printAt.y: ubyte = 0 /*  */, pl.qus.wolin.printAt.what: ubyte* = 0 /*  */):unit
// ****************************************
function __wolin_pl_qus_wolin_printAt
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg2>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg2: bool* = 0 /* ASSIGNMENT target */)
let SP(0)<__wolin_reg2>[bool*] = *CPU.C[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.carry
// top type already set: __wolin_reg2: bool* = 0 /* ASSIGNMENT target */
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg3>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg3: bool = 0 /* ASSIGNMENT value */)
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg3>[bool] = #1[bool] // atomic ex
let &SP(1)<__wolin_reg2>[bool*] = &SP(0)<__wolin_reg3>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg2>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg1: unit = 65535 /* for blockLevel expression */
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.plot ========
// Arg: 0: pl.qus.wolin.plot.x: ubyte = 0 /*  */
// Arg: 1: pl.qus.wolin.plot.y: ubyte = 0 /*  */
save SP
// == FN_CALL: ARG #0 (x) pl.qus.wolin.plot
alloc SP<__wolin_reg5>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru x
let SP(0)<__wolin_reg5>[ubyte*] = *SPF(3)<pl.qus.wolin.printAt.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.printAt.x
// po visit value
save &SP(0)<__wolin_reg5>[ubyte*] // CPU.X
free SP<__wolin_reg5>, #2 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (y) pl.qus.wolin.plot
alloc SP<__wolin_reg6>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru y
let SP(0)<__wolin_reg6>[ubyte*] = *SPF(2)<pl.qus.wolin.printAt.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.printAt.y
// po visit value
save &SP(0)<__wolin_reg6>[ubyte*] // CPU.Y
free SP<__wolin_reg6>, #2 // for call argument 1, type = ubyte
// switchType to:unit by function return type 2
restore CPU.Y[ubyte]
restore CPU.X[ubyte]
// switchType to:unit by function call
call 65520[uword] // pl.qus.wolin.plot

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.plot ========
// 
// top type already set: __wolin_reg4: unit = 65535 /* for blockLevel expression */
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.print ========
alloc SPF, #5
// == FN_CALL: ARG #0 (what) pl.qus.wolin.print
alloc SP<__wolin_reg8>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru what
let SP(0)<__wolin_reg8>[ubyte*] = SPF(5)<pl.qus.wolin.printAt.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.printAt.what
// po visit value
let SPF(3)[ubyte*] = SP(0)<__wolin_reg8>[ubyte*]
free SP<__wolin_reg8>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_print[uword]

// == FN_CALL END: pl.qus.wolin.print ========
// 
// top type already set: __wolin_reg7: unit = 65535 /* for blockLevel expression */
free SPF<pl.qus.wolin.printAt.__fnargs>, #4 // free fn arguments and locals for pl.qus.wolin.printAt
// freeing call stack
// return from function body
endfunction

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.print(pl.qus.wolin.print.what: ubyte* = 0 /*  */):unit
// ****************************************
function __wolin_pl_qus_wolin_print
alloc SP<__wolin_reg10>, #1 // for declaration vali=0
alloc SP<__wolin_reg11>, #1 // for var pl.qus.wolin.print..i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg11>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg11: ubyte = 0 /* for var pl.qus.wolin.print..i init expression */
let SPF(2)<pl.qus.wolin.print..i>[ubyte] = SP(0)<__wolin_reg11>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..i
free SP<__wolin_reg11>, #1 // for var pl.qus.wolin.print..i init expression
// top type already set: __wolin_reg10: ubyte = 0 /* for declaration vali=0 */
free SP<__wolin_reg10>, #1 // for declaration vali=0
alloc SP<__wolin_reg12>, #2 // for declaration valchar=what[i]
alloc SP<__wolin_reg13>, #2 // for var pl.qus.wolin.print..char init expression
alloc SP<__wolin_reg14>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg15>, #2 // array variable
let SP(0)<__wolin_reg15>[ubyte*] = SPF(3)<pl.qus.wolin.print.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg16>, #2 // For calculating index
let SP(0)<__wolin_reg16>[ubyte*] = *SPF(2)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg16: uword = 0 /* For calculating index */ -> uword
add SP(4)<__wolin_reg14>[ubyte*] = SP(2)<__wolin_reg15>[ubyte*], &SP(0)<__wolin_reg16>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg16>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg15: ubyte* = 0 /* array variable */
//  after index
// dereference value at topRegister
free SP<__wolin_reg15>, #2 // array variable
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg13>[ubyte*] = SP(0)<__wolin_reg14>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg14>, #2 // arr_deref
// top type already set: __wolin_reg13: ubyte* = 0 /* for var pl.qus.wolin.print..char init expression */
let SPF(0)<pl.qus.wolin.print..char>[ubyte*] = SP(0)<__wolin_reg13>[ubyte*] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..char
free SP<__wolin_reg13>, #2 // for var pl.qus.wolin.print..char init expression
// top type already set: __wolin_reg12: ubyte* = 0 /* for declaration valchar=what[i] */
free SP<__wolin_reg12>, #2 // for declaration valchar=what[i]
alloc SP<__wolin_reg17>, #2 // for blockLevel expression
alloc SP<__wolin_reg18>, #1 // for while condition
label __wolin_lab_loop_start_1
alloc SP<__wolin_reg19>, #2 // LEFT equality check: evalneq
let SP(0)<__wolin_reg19>[ubyte*] = SPF(0)<pl.qus.wolin.print..char>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print..char
// top type already set: __wolin_reg19: ubyte* = 0 /* LEFT equality check: evalneq */
alloc SP<__wolin_reg20>, #1 // RIGHT equality check: evalneq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg20>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg20: ubyte = 0 /* RIGHT equality check: evalneq */
evalneq &SP(3)<__wolin_reg18>[bool] = &SP(1)<__wolin_reg19>[ubyte*], &SP(0)<__wolin_reg20>[ubyte] // two sides
free SP<__wolin_reg20>, #1 // RIGHT equality check: evalneq
free SP<__wolin_reg19>, #2 // LEFT equality check: evalneq
// top type already set: __wolin_reg18: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg18>[bool] = #1[bool], __wolin_lab_loop_end_1<label_po_if>[uword]
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 /*  */
save SP
// == FN_CALL: ARG #0 (char) pl.qus.wolin.chrout
alloc SP<__wolin_reg23>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru char
let SP(0)<__wolin_reg23>[ubyte*] = SPF(0)<pl.qus.wolin.print..char>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print..char
// po visit value
save &SP(0)<__wolin_reg23>[ubyte*] // CPU.A
free SP<__wolin_reg23>, #2 // for call argument 0, type = ubyte
// switchType to:unit by function return type 2
restore CPU.A[ubyte]
// switchType to:unit by function call
call 65490[uword] // pl.qus.wolin.chrout

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// 
// top type already set: __wolin_reg22: unit = 65535 /* for blockLevel expression */
alloc SP<__wolin_reg24>, #2 // for blockLevel expression
let SP(0)<__wolin_reg24>[ubyte*] = *SPF(2)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(2)<pl.qus.wolin.print..i>[ubyte] = SPF(2)<pl.qus.wolin.print..i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg24: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg24>, #2 // for blockLevel expression
alloc SP<__wolin_reg25>, #2 // for declaration valchar=what[i]
alloc SP<__wolin_reg26>, #2 // for var pl.qus.wolin.print..char init expression
alloc SP<__wolin_reg27>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg28>, #2 // array variable
let SP(0)<__wolin_reg28>[ubyte*] = SPF(3)<pl.qus.wolin.print.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg29>, #2 // For calculating index
let SP(0)<__wolin_reg29>[ubyte*] = *SPF(2)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg29: uword = 0 /* For calculating index */ -> uword
add SP(4)<__wolin_reg27>[ubyte*] = SP(2)<__wolin_reg28>[ubyte*], &SP(0)<__wolin_reg29>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg29>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg28: ubyte* = 0 /* array variable */
//  after index
// dereference value at topRegister
free SP<__wolin_reg28>, #2 // array variable
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg26>[ubyte*] = SP(0)<__wolin_reg27>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg27>, #2 // arr_deref
// top type already set: __wolin_reg26: ubyte* = 0 /* for var pl.qus.wolin.print..char init expression */
let SPF(0)<pl.qus.wolin.print..char>[ubyte*] = SP(0)<__wolin_reg26>[ubyte*] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..char
free SP<__wolin_reg26>, #2 // for var pl.qus.wolin.print..char init expression
// top type already set: __wolin_reg25: ubyte* = 0 /* for declaration valchar=what[i] */
free SP<__wolin_reg25>, #2 // for declaration valchar=what[i]
goto __wolin_lab_loop_start_1[uword]
label __wolin_lab_loop_end_1
free SP<__wolin_reg18>, #1 // for while condition
// top type already set: __wolin_reg17: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg17>, #2 // for blockLevel expression
free SPF<pl.qus.wolin.print.__fnargs>, #5 // free fn arguments and locals for pl.qus.wolin.print
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
alloc SPF, #5
// == FN_CALL: ARG #0 ("dupa") pl.qus.wolin.print
alloc SP<__wolin_reg32>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg32>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(3)[ubyte*] = SP(0)<__wolin_reg32>[ubyte*]
free SP<__wolin_reg32>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_print[uword]

// == FN_CALL END: pl.qus.wolin.print ========
// 
// top type already set: __wolin_reg31: unit = 65535 /* for blockLevel expression */
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
