setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
ret
// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration
// switchType to:uword by parse literal constant

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.print(pl.qus.wolin.print.string: ubyte* = 0 () null null):unit
// ****************************************
function __wolin_pl_qus_wolin_print
// top type already set: __wolin_reg1: unit = 65535 (for declaration vari:ubyte) null null
alloc SP<__wolin_reg2>, #2 // for declaration varchar:ubyte=string[0]
alloc SP<__wolin_reg3>, #2 // for var pl.qus.wolin.print..char init expression
alloc SP<__wolin_reg4>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte* by type from pl.qus.wolin.print.string
//  PRAWA strona array access, czyli indeks w nawiasach
// Short array
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte*] = #0[ubyte] // atomic ex
// FORCE TOP: __wolin_reg4: ubyte* = 0 (arr_deref) null null -> ubyte*
//  fast array - no additional op
// **ARRAY Changing current type to prevReg type __wolin_reg4: ubyte* = 0 (arr_deref) null null
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  allocated fast array, changing top reg to ptr
add SP(2)<__wolin_reg3>[ubyte*] = __wolin_pl_qus_wolin_print_string[ubyte*], &SP(0)<__wolin_reg4>[ubyte*]
free SP<__wolin_reg4>, #2 // arr_deref
// top type already set: __wolin_reg3: ubyte* = 0 (for var pl.qus.wolin.print..char init expression) null null
let SPF(0)<pl.qus.wolin.print..char>[ubyte] = SP(0)<__wolin_reg3>[ubyte*] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.print..char
free SP<__wolin_reg3>, #2 // for var pl.qus.wolin.print..char init expression
// top type already set: __wolin_reg2: ubyte* = 0 (for declaration varchar:ubyte=string[0]) null null
free SP<__wolin_reg2>, #2 // for declaration varchar:ubyte=string[0]
alloc SP<__wolin_reg6>, #1 // for while condition
label __wolin_lab_loopStart_1
alloc SP<__wolin_reg7>, #2 // LEFT equality check: evalneq
let SP(0)<__wolin_reg7>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// top type already set: __wolin_reg7: ubyte* = 0 (LEFT equality check: evalneq) null null
alloc SP<__wolin_reg8>, #1 // RIGHT equality check: evalneq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg8>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg8: ubyte = 0 (RIGHT equality check: evalneq) null null
evalneq SP(3)<__wolin_reg6>[bool] = &SP(1)<__wolin_reg7>[ubyte*], SP(0)<__wolin_reg8>[ubyte] // two sides
free SP<__wolin_reg8>, #1 // RIGHT equality check: evalneq
free SP<__wolin_reg7>, #2 // LEFT equality check: evalneq
// top type already set: __wolin_reg6: bool = 0 (for while condition) null null
bne SP(0)<__wolin_reg6>[bool] = #1[bool], __wolin_lab_loopEnd_1<label_po_if>[adr]
alloc SP<__wolin_reg10>, #1 // for expression
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
alloc SPF, #1
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 () CPU.A null
save SP
// == FN_CALL: ARG #0 (char) pl.qus.wolin.chrout
alloc SP<__wolin_reg11>, #2 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru char
let SP(0)<__wolin_reg11>[ubyte*] = *SPF(1)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// po visit value
save SP(0)<__wolin_reg11>[ubyte*] // CPU.A
free SP<__wolin_reg11>, #2 // for call argument 0, type = ubyte
// switchType to:bool by function return type 2
restore CPU.A[ubyte]
// switchType to:bool by function call
call 65490[adr] // pl.qus.wolin.chrout

let SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] = CPU.C[bool] // lokacja wartości zwrotnej
restore SP
let SP(0)<__wolin_reg10>[bool] = SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] // przez sprawdzacz typow - copy return parameter
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// 
// top type already set: __wolin_reg10: bool = 0 (for expression) null null
free SP<__wolin_reg10>, #1 // for expression
alloc SP<__wolin_reg12>, #2 // for expression
let SP(0)<__wolin_reg12>[ubyte*] = *SPF(2)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - operator ++
add SPF(2)<pl.qus.wolin.print..i>[ubyte] = SPF(2)<pl.qus.wolin.print..i>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
// top type already set: __wolin_reg12: ubyte* = 0 (for expression) null null
free SP<__wolin_reg12>, #2 // for expression
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg14>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg14: ubyte* = 0 (ASSIGNMENT target) null null)
let SP(0)<__wolin_reg14>[ubyte*] = *SPF(1)<pl.qus.wolin.print..char>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..char
// top type already set: __wolin_reg14: ubyte* = 0 (ASSIGNMENT target) null null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg15>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg15: ubyte* = 0 (ASSIGNMENT value) null null)
alloc SP<__wolin_reg16>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte* by type from pl.qus.wolin.print.string
//  PRAWA strona array access, czyli indeks w nawiasach
// Short array
let SP(0)<__wolin_reg16>[ubyte*] = *SPF(2)<pl.qus.wolin.print..i>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.print..i
// FORCE TOP: __wolin_reg16: ubyte* = 0 (arr_deref) null null -> ubyte*
//  fast array - no additional op
// **ARRAY Changing current type to prevReg type __wolin_reg16: ubyte* = 0 (arr_deref) null null
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  allocated fast array, changing top reg to ptr
add SP(2)<__wolin_reg15>[ubyte*] = __wolin_pl_qus_wolin_print_string[ubyte*], &SP(0)<__wolin_reg16>[ubyte*]
free SP<__wolin_reg16>, #2 // arr_deref
let &SP(2)<__wolin_reg14>[ubyte*] = &SP(0)<__wolin_reg15>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg15>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg14>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg13: unit = 65535 (for expression) null null
goto __wolin_lab_loopStart_1[adr]
label __wolin_lab_loopEnd_1
free SP<__wolin_reg6>, #1 // for while condition
// top type already set: __wolin_reg5: unit = 65535 (for expression) null null
free SPF<pl.qus.wolin.print.__fnargs>, #3 // free fn arguments and locals for pl.qus.wolin.print
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.chrout ze stosu
free SPF <pl.qus.wolin.chrout.__returnValue>, #1 // free return value of pl.qus.wolin.chrout from call stack
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// switchType to:unit by function return type 1
// 
// == FN_CALL: pl.qus.wolin.clearScreen ========
alloc SPF, #0
save SP
// switchType to:unit by function return type 2
// switchType to:unit by function call
call 58692[adr] // pl.qus.wolin.clearScreen

restore SP
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.clearScreen ========
// 
// top type already set: __wolin_reg18: unit = 65535 (for expression) null null
alloc SP<__wolin_reg19>, #1 // for expression
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
alloc SPF, #1
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 () CPU.A null
save SP
// == FN_CALL: ARG #0 (65) pl.qus.wolin.chrout
alloc SP<__wolin_reg20>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 65
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg20>[ubyte] = #65[ubyte] // atomic ex
// po visit value
save SP(0)<__wolin_reg20>[ubyte] // CPU.A
free SP<__wolin_reg20>, #1 // for call argument 0, type = ubyte
// switchType to:bool by function return type 2
restore CPU.A[ubyte]
// switchType to:bool by function call
call 65490[adr] // pl.qus.wolin.chrout

let SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] = CPU.C[bool] // lokacja wartości zwrotnej
restore SP
let SP(0)<__wolin_reg19>[bool] = SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] // przez sprawdzacz typow - copy return parameter
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// 
// top type already set: __wolin_reg19: bool = 0 (for expression) null null
free SP<__wolin_reg19>, #1 // for expression
alloc SP<__wolin_reg21>, #1 // for expression
// switchType to:bool by function return type 1
// 
// == FN_CALL: pl.qus.wolin.chrout ========
alloc SPF, #1
// Arg: 0: pl.qus.wolin.chrout.char: ubyte = 0 () CPU.A null
save SP
// == FN_CALL: ARG #0 (66) pl.qus.wolin.chrout
alloc SP<__wolin_reg22>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 66
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg22>[ubyte] = #66[ubyte] // atomic ex
// po visit value
save SP(0)<__wolin_reg22>[ubyte] // CPU.A
free SP<__wolin_reg22>, #1 // for call argument 0, type = ubyte
// switchType to:bool by function return type 2
restore CPU.A[ubyte]
// switchType to:bool by function call
call 65490[adr] // pl.qus.wolin.chrout

let SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] = CPU.C[bool] // lokacja wartości zwrotnej
restore SP
let SP(0)<__wolin_reg21>[bool] = SPF(0)<pl.qus.wolin.chrout.__returnValue>[bool] // przez sprawdzacz typow - copy return parameter
// wywołanie natywnej
// == FN_CALL END: pl.qus.wolin.chrout ========
// 
// top type already set: __wolin_reg21: bool = 0 (for expression) null null
free SP<__wolin_reg21>, #1 // for expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.chrout ze stosu
free SPF <pl.qus.wolin.chrout.__returnValue>, #1 // free return value of pl.qus.wolin.chrout from call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.chrout ze stosu
free SPF <pl.qus.wolin.chrout.__returnValue>, #1 // free return value of pl.qus.wolin.chrout from call stack
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
label __wolin_pl_qus_wolin_wynik
alloc 0[bool]  // pl.qus.wolin.wynik
