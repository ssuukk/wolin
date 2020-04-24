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
// funkcja: fun pl.qus.wolin.strLen(pl.qus.wolin.strLen.what: ubyte* = 0 /*  */):ubyte
// ****************************************
function __wolin_pl_qus_wolin_strLen
alloc SP<__wolin_reg1>, #1 // for declaration varlen:ubyte=0
alloc SP<__wolin_reg2>, #1 // for var pl.qus.wolin.strLen..len init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg2>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg2: ubyte = 0 /* for var pl.qus.wolin.strLen..len init expression */
let SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = SP(0)<__wolin_reg2>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.strLen..len
free SP<__wolin_reg2>, #1 // for var pl.qus.wolin.strLen..len init expression
// top type already set: __wolin_reg1: ubyte = 0 /* for declaration varlen:ubyte=0 */
free SP<__wolin_reg1>, #1 // for declaration varlen:ubyte=0
alloc SP<__wolin_reg3>, #2 // for blockLevel expression
alloc SP<__wolin_reg4>, #1 // for while condition
label __wolin_lab_loop_start_1
alloc SP<__wolin_reg5>, #2 // LEFT equality check: evalneq
alloc SP<__wolin_reg6>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg7>, #2 // array variable
let SP(0)<__wolin_reg7>[ubyte*] = SPF(1)<pl.qus.wolin.strLen.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.strLen.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg8>, #2 // For calculating index
let SP(0)<__wolin_reg8>[ubyte*] = *SPF(0)<pl.qus.wolin.strLen..len>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.strLen..len
// FORCE TOP: __wolin_reg8: uword = 0 /* For calculating index */ -> uword
add SP(4)<__wolin_reg6>[ubyte*] = SP(2)<__wolin_reg7>[ubyte*], &SP(0)<__wolin_reg8>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg8>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg7: ubyte* = 0 /* array variable */
//  after index
// dereference value at topRegister
free SP<__wolin_reg7>, #2 // array variable
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg5>[ubyte*] = SP(0)<__wolin_reg6>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg6>, #2 // arr_deref
// top type already set: __wolin_reg5: ubyte* = 0 /* LEFT equality check: evalneq */
alloc SP<__wolin_reg9>, #1 // RIGHT equality check: evalneq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg9: ubyte = 0 /* RIGHT equality check: evalneq */
evalneq &SP(3)<__wolin_reg4>[bool] = &SP(1)<__wolin_reg5>[ubyte*], &SP(0)<__wolin_reg9>[ubyte] // two sides
free SP<__wolin_reg9>, #1 // RIGHT equality check: evalneq
free SP<__wolin_reg5>, #2 // LEFT equality check: evalneq
// top type already set: __wolin_reg4: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg4>[bool] = #1[bool], __wolin_lab_loop_end_1<label_po_if>[uword]
alloc SP<__wolin_reg11>, #2 // for blockLevel expression
let SP(0)<__wolin_reg11>[ubyte*] = *SPF(0)<pl.qus.wolin.strLen..len>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(0)<pl.qus.wolin.strLen..len>[ubyte] = SPF(0)<pl.qus.wolin.strLen..len>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg11: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg11>, #2 // for blockLevel expression
goto __wolin_lab_loop_start_1[uword]
label __wolin_lab_loop_end_1
free SP<__wolin_reg4>, #1 // for while condition
// top type already set: __wolin_reg3: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg3>, #2 // for blockLevel expression
alloc SP<__wolin_reg12>, #2 // for blockLevel expression
let SP(0)<__wolin_reg12>[ubyte*] = *SPF(0)<pl.qus.wolin.strLen..len>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.strLen..len
let SPF(3)<pl.qus.wolin.strLen.__returnValue>[ubyte] = &SP(0)<__wolin_reg12>[ubyte*] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
free SP<__wolin_reg12>, #2 // for blockLevel expression
free SPF<__wolin_pl_qus_wolin_strLen>, #3 // free fn arguments and locals for pl.qus.wolin.strLen
// ***** fnDeclFreeStackAndRet usuwanie zwrotki pl.qus.wolin.strLen ze stosu
// freeing call stack
// return from function body
endfunction

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.printAt(pl.qus.wolin.printAt.x: ubyte = 0 /*  */, pl.qus.wolin.printAt.y: ubyte = 0 /*  */, pl.qus.wolin.printAt.what: ubyte* = 0 /*  */):unit
// ****************************************
function __wolin_pl_qus_wolin_printAt
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg15>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg15: bool* = 0 /* ASSIGNMENT target */)
let SP(0)<__wolin_reg15>[bool*] = *CPU.C[bool] // przez sprawdzacz typow - simple id from var
// switchType to:bool by type from pl.qus.wolin.carry
// top type already set: __wolin_reg15: bool* = 0 /* ASSIGNMENT target */
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg16>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg16: bool = 0 /* ASSIGNMENT value */)
// switchType to:bool by parse literal constant
let SP(0)<__wolin_reg16>[bool] = #0[bool] // atomic ex
let &SP(1)<__wolin_reg15>[bool*] = &SP(0)<__wolin_reg16>[bool] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg16>, #1 // ASSIGNMENT value, type = bool
free SP<__wolin_reg15>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg14: unit = 65535 /* for blockLevel expression */
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.plot ========
// Arg: 0: pl.qus.wolin.plot.x: ubyte = 0 /*  */
// Arg: 1: pl.qus.wolin.plot.y: ubyte = 0 /*  */
save SP
// == FN_CALL: ARG #0 (x) pl.qus.wolin.plot
alloc SP<__wolin_reg18>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru x
let SP(0)<__wolin_reg18>[ubyte*] = *SPF(3)<pl.qus.wolin.printAt.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.printAt.x
// po visit value
save &SP(0)<__wolin_reg18>[ubyte*] // CPU.X
free SP<__wolin_reg18>, #2 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (y) pl.qus.wolin.plot
alloc SP<__wolin_reg19>, #2 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru y
let SP(0)<__wolin_reg19>[ubyte*] = *SPF(2)<pl.qus.wolin.printAt.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.printAt.y
// po visit value
save &SP(0)<__wolin_reg19>[ubyte*] // CPU.Y
free SP<__wolin_reg19>, #2 // for call argument 1, type = ubyte
// switchType to:unit by function return type 2
restore CPU.Y[ubyte]
restore CPU.X[ubyte]
// switchType to:unit by function call
call __wolin_pl_qus_wolin_plot[uword]

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.plot ========
// 
// top type already set: __wolin_reg17: unit = 65535 /* for blockLevel expression */
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.print ========
alloc SPF<__wolin_pl_qus_wolin_print>, #4
// == FN_CALL: ARG #0 (what) pl.qus.wolin.print
alloc SP<__wolin_reg21>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru what
let SP(0)<__wolin_reg21>[ubyte*] = SPF(4)<pl.qus.wolin.printAt.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.printAt.what
// po visit value
let SPF(2)<pl.qus.wolin.print.what>[ubyte*] = SP(0)<__wolin_reg21>[ubyte*]
free SP<__wolin_reg21>, #2 // for call argument 0, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_print[uword]

// == FN_CALL END: pl.qus.wolin.print ========
// 
// top type already set: __wolin_reg20: unit = 65535 /* for blockLevel expression */
free SPF<__wolin_pl_qus_wolin_printAt>, #4 // free fn arguments and locals for pl.qus.wolin.printAt
// freeing call stack
// return from function body
endfunction

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.print(pl.qus.wolin.print.what: ubyte* = 0 /*  */):unit
// ****************************************
function __wolin_pl_qus_wolin_print
alloc SP<__wolin_reg23>, #1 // for declaration vali=0
alloc SP<__wolin_reg24>, #1 // for var pl.qus.wolin.print..i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg24>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg24: ubyte = 0 /* for var pl.qus.wolin.print..i init expression */
let SPF(1)<pl.qus.wolin.print..i>[ubyte] = SP(0)<__wolin_reg24>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..i
free SP<__wolin_reg24>, #1 // for var pl.qus.wolin.print..i init expression
// top type already set: __wolin_reg23: ubyte = 0 /* for declaration vali=0 */
free SP<__wolin_reg23>, #1 // for declaration vali=0
alloc SP<__wolin_reg25>, #2 // for declaration valchar:ubyte=what[i]
alloc SP<__wolin_reg26>, #2 // for var pl.qus.wolin.print..char init expression
alloc SP<__wolin_reg27>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg28>, #2 // array variable
let SP(0)<__wolin_reg28>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg29>, #2 // For calculating index
let SP(0)<__wolin_reg29>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
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
let SPF(0)<pl.qus.wolin.print..char>[ubyte] = SP(0)<__wolin_reg26>[ubyte*] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..char
free SP<__wolin_reg26>, #2 // for var pl.qus.wolin.print..char init expression
// top type already set: __wolin_reg25: ubyte* = 0 /* for declaration valchar:ubyte=what[i] */
free SP<__wolin_reg25>, #2 // for declaration valchar:ubyte=what[i]
alloc SP<__wolin_reg31>, #1 // for while condition
label __wolin_lab_loop_start_2
alloc SP<__wolin_reg32>, #2 // LEFT equality check: evalneq
let SP(0)<__wolin_reg32>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// top type already set: __wolin_reg32: ubyte* = 0 /* LEFT equality check: evalneq */
alloc SP<__wolin_reg33>, #1 // RIGHT equality check: evalneq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg33>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg33: ubyte = 0 /* RIGHT equality check: evalneq */
evalneq &SP(3)<__wolin_reg31>[bool] = &SP(1)<__wolin_reg32>[ubyte*], &SP(0)<__wolin_reg33>[ubyte] // two sides
free SP<__wolin_reg33>, #1 // RIGHT equality check: evalneq
free SP<__wolin_reg32>, #2 // LEFT equality check: evalneq
// top type already set: __wolin_reg31: bool = 0 /* for while condition */
bne SP(0)<__wolin_reg31>[bool] = #1[bool], __wolin_lab_loop_end_2<label_po_if>[uword]
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 /*  */
save SP
// == FN_CALL: ARG #0 (char) pl.qus.wolin.chrout
alloc SP<__wolin_reg36>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru char
let SP(0)<__wolin_reg36>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// po visit value
save &SP(0)<__wolin_reg36>[ubyte*] // CPU.A
free SP<__wolin_reg36>, #2 // for call argument 0, type = ubyte
// switchType to:unit by function return type 2
restore CPU.A[ubyte]
// switchType to:unit by function call
call __wolin_pl_qus_wolin_chrout[uword]

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// 
// top type already set: __wolin_reg35: unit = 65535 /* for blockLevel expression */
alloc SP<__wolin_reg37>, #2 // for blockLevel expression
let SP(0)<__wolin_reg37>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg37: ubyte* = 0 /* for blockLevel expression */
free SP<__wolin_reg37>, #2 // for blockLevel expression
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg39>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg39: ubyte* = 0 /* ASSIGNMENT target */)
let SP(0)<__wolin_reg39>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// top type already set: __wolin_reg39: ubyte* = 0 /* ASSIGNMENT target */
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg40>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar 1 przypisano __wolin_reg40: ubyte* = 0 /* ASSIGNMENT value */)
alloc SP<__wolin_reg41>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
alloc SP<__wolin_reg42>, #2 // array variable
let SP(0)<__wolin_reg42>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.print.what
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg43>, #2 // For calculating index
let SP(0)<__wolin_reg43>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg43: uword = 0 /* For calculating index */ -> uword
add SP(4)<__wolin_reg41>[ubyte*] = SP(2)<__wolin_reg42>[ubyte*], &SP(0)<__wolin_reg43>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg43>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg42: ubyte* = 0 /* array variable */
//  after index
// dereference value at topRegister
free SP<__wolin_reg42>, #2 // array variable
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg40>[ubyte*] = SP(0)<__wolin_reg41>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg41>, #2 // arr_deref
let &SP(2)<__wolin_reg39>[ubyte*] = &SP(0)<__wolin_reg40>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg40>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg39>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg38: unit = 65535 /* for blockLevel expression */
goto __wolin_lab_loop_start_2[uword]
label __wolin_lab_loop_end_2
free SP<__wolin_reg31>, #1 // for while condition
// top type already set: __wolin_reg30: unit = 65535 /* for blockLevel expression */
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
// == FN_CALL: pl.qus.wolin.printAt ========
alloc SPF<__wolin_pl_qus_wolin_printAt>, #4
// == FN_CALL: ARG #0 (20) pl.qus.wolin.printAt
alloc SP<__wolin_reg46>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 20
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg46>[ubyte] = #20[ubyte] // atomic ex
// po visit value
let SPF(3)<pl.qus.wolin.printAt.x>[ubyte] = SP(0)<__wolin_reg46>[ubyte]
free SP<__wolin_reg46>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (20) pl.qus.wolin.printAt
alloc SP<__wolin_reg47>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 20
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg47>[ubyte] = #20[ubyte] // atomic ex
// po visit value
let SPF(2)<pl.qus.wolin.printAt.y>[ubyte] = SP(0)<__wolin_reg47>[ubyte]
free SP<__wolin_reg47>, #1 // for call argument 1, type = ubyte
// == FN_CALL: ARG #2 ("dupa") pl.qus.wolin.printAt
alloc SP<__wolin_reg48>, #2 // for call argument 2
// Prze visit vALUE
//  obliczenia dla parametru "dupa"
// switchType to:ubyte* by parse literal constant
let SP(0)<__wolin_reg48>[ubyte*] = #__wolin_lab_stringConst_0[uword] // atomic ex
// po visit value
let SPF(0)<pl.qus.wolin.printAt.what>[ubyte*] = SP(0)<__wolin_reg48>[ubyte*]
free SP<__wolin_reg48>, #2 // for call argument 2, type = ubyte*
// switchType to:unit by function return type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_printAt[uword]

// == FN_CALL END: pl.qus.wolin.printAt ========
// 
// top type already set: __wolin_reg45: unit = 65535 /* for blockLevel expression */
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
