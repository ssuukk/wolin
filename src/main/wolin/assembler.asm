setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.i
alloc SP<__wolin_reg0>, #1 // for var pl.qus.wolin.i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg0: ubyte = 0 (for var pl.qus.wolin.i init expression)
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg0>, #1 // for var pl.qus.wolin.i init expression
// inicjalizacja zmiennej pl.qus.wolin.znak
alloc SP<__wolin_reg1>, #1 // for var pl.qus.wolin.znak init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg1: ubyte = 0 (for var pl.qus.wolin.znak init expression)
let __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.znak
free SP<__wolin_reg1>, #1 // for var pl.qus.wolin.znak init expression
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
free SPF <unit>, #2 // free return value of pl.qus.wolin.main from call stack
ret
// switchType to:unit* by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
alloc SP<__wolin_reg4>, #1 // for while condition
label __wolin_lab_loopStart_1
alloc SP<__wolin_reg5>, #2 // LEFT for <
let SP(0)<__wolin_reg5>[uword*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.i
// top type already set: __wolin_reg5: uword* = 0 (LEFT for <)
alloc SP<__wolin_reg6>, #2 // RIGHT for <
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg6>[uword] = #1000[uword] // atomic ex
// top type already set: __wolin_reg6: uword = 0 (RIGHT for <)
evalless SP(4)<__wolin_reg4>[bool] = &SP(2)<__wolin_reg5>[uword*], SP(0)<__wolin_reg6>[uword]
free SP<__wolin_reg6>, #2 // RIGHT for <
free SP<__wolin_reg5>, #2 // LEFT for <
// top type already set: __wolin_reg4: bool = 0 (for while condition)
bne SP(0)<__wolin_reg4>[bool] = #1[bool], __wolin_lab_loopEnd_1<label_po_if>[adr]
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg9>, #2 // ASSIGNMENT target
alloc SP<__wolin_reg10>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg10>[ubyte*] = 1024[ubyte*] // simple id - fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.ekran
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg11>, #2 // For calculating index
let SP(0)<__wolin_reg11>[uword*] = *__wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword], #1[uword] // simple id
// switchType to:uword by ++ operator
// FORCE TOP: __wolin_reg11: uword* = 0 (For calculating index) -> uword*
add SP(2)<__wolin_reg10>[ubyte*] = SP(2)<__wolin_reg10>[ubyte*], &SP(0)<__wolin_reg11>[uword*] // long index, single byte per element array
free SP<__wolin_reg11>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg10: ubyte* = 0 (arr_deref)
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg9>[ubyte*] = SP(0)<__wolin_reg10>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg10>, #2 // arr_deref
// top type already set: __wolin_reg9: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg12>, #2 // ASSIGNMENT value
let SP(0)<__wolin_reg12>[ubyte*] = *__wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
let &SP(2)<__wolin_reg9>[ubyte*] = &SP(0)<__wolin_reg12>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg12>, #2 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg9>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit* by assignment
// top type already set: __wolin_reg8: unit* = 0 (for expression)
goto __wolin_lab_loopStart_1[adr]
label __wolin_lab_loopEnd_1
free SP<__wolin_reg4>, #1 // for while condition
// top type already set: __wolin_reg3: unit* = 0 (for expression)
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
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
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
label __wolin_pl_qus_wolin_znak
alloc 0[ubyte]  // pl.qus.wolin.znak
