setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.znak
alloc SP<__wolin_reg0>, #1 // for var pl.qus.wolin.znak init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg0: ubyte = 0 (for var pl.qus.wolin.znak init expression)
let __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.znak
free SP<__wolin_reg0>, #1 // for var pl.qus.wolin.znak init expression
// inicjalizacja zmiennej pl.qus.wolin.i
alloc SP<__wolin_reg1>, #1 // for var pl.qus.wolin.i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg1: ubyte = 0 (for var pl.qus.wolin.i init expression)
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg1>, #1 // for var pl.qus.wolin.i init expression
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
free SPF <unit>, #0 // free return value of pl.qus.wolin.main from call stack
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.allocMem(pl.qus.wolin.allocMem.size: uword = 0 (), pl.qus.wolin.allocMem.count: uword = 0 ()):Any
// ****************************************
label __wolin_pl_qus_wolin_allocMem
alloc SP<__wolin_reg2>, #2 // for block 'return value' {\nreturn30000\n}
alloc SP<__wolin_reg3>, #2 // for expression
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg3>[adr] = #30000[uword] // atomic ex
let SPF(4)<returnValue>[adr] = SP(0)<__wolin_reg3>[adr] // przez sprawdzacz typow - jump expression
// switchType to:Any by return expression
// top type already set: __wolin_reg3: Any = 65535 (for expression)
free SP<__wolin_reg3>, #2 // for expression
free SP<__wolin_reg2>, #2 // for block 'return value' {\nreturn30000\n}, type = Any
free SPF, #4 // free fn arguments and locals for pl.qus.wolin.allocMem
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret


// ****************************************
// konstruktor: fun pl.qus.wolin.Test():pl.qus.wolin.Test
// ****************************************
label __wolin_pl_qus_wolin_Test

alloc SP<__wolin_reg4>, #2 // for returning this
// switchType to:pl.qus.wolin.Test* by function type 1
// top type already set: __wolin_reg4: pl.qus.wolin.Test* = 0 (for returning this)
//  otwarcie stosu na wywolanie pl.qus.wolin.allocMem
alloc SPF, #6
//  tu podajemy argumenty dla pl.qus.wolin.allocMem
//  let pl.qus.wolin.allocMem.size = #3
let SPF(2)[uword] = #3[uword]
//  let pl.qus.wolin.allocMem.count = #1
let SPF(0)[uword] = #1[uword]
//  po argumentach dla pl.qus.wolin.allocMem
call __wolin_pl_qus_wolin_allocMem[adr]
let SP(0)<__wolin_reg4>[adr] = SPF(0)<returnValue>[adr]
free SPF <Any>, #2 // free return value of pl.qus.wolin.allocMem from call stack
//  tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora
let SPF(0)<pl.qus.wolin.Test.returnValue>[adr] = SP(0)<__wolin_reg4>[adr] // przez sprawdzacz typow - zwrotka alloc do zwrotki konstruktora
setup HEAP = SP(0)<__wolin_reg4>[adr]
free SP<__wolin_reg4>, #2 // for returning this
// inicjalizacja zmiennej pl.qus.wolin.Test.x
alloc SP<__wolin_reg5>, #1 // for var pl.qus.wolin.Test.x init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[ubyte] = #3[ubyte] // atomic ex
// top type already set: __wolin_reg5: ubyte = 0 (for var pl.qus.wolin.Test.x init expression)
let HEAP(2)<pl.qus.wolin.Test.x>[ubyte] = SP(0)<__wolin_reg5>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.x
free SP<__wolin_reg5>, #1 // for var pl.qus.wolin.Test.x init expression
// inicjalizacja zmiennej pl.qus.wolin.Test.y
alloc SP<__wolin_reg6>, #1 // for var pl.qus.wolin.Test.y init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #7[ubyte] // atomic ex
// top type already set: __wolin_reg6: ubyte = 0 (for var pl.qus.wolin.Test.y init expression)
let HEAP(1)<pl.qus.wolin.Test.y>[ubyte] = SP(0)<__wolin_reg6>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.y
free SP<__wolin_reg6>, #1 // for var pl.qus.wolin.Test.y init expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from constructor
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.Test.suma(pl.qus.wolin.Test.suma.this: pl.qus.wolin.Test = 65535 ()):ubyte
// ****************************************
label __wolin_pl_qus_wolin_Test_suma
setup HEAP = this
alloc SP<__wolin_reg8>, #1 // for expression
let SP(0)<__wolin_reg8>[ubyte] = HEAP(2)<pl.qus.wolin.Test.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.Test.x
// top type already set: __wolin_reg8: ubyte = 0 (for expression)
alloc SP<__wolin_reg9>, #1 // RIGHT adding operator
let SP(0)<__wolin_reg9>[ubyte] = HEAP(1)<pl.qus.wolin.Test.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.Test.y
// top type already set: __wolin_reg9: ubyte = 0 (RIGHT adding operator)
add SP(1)<__wolin_reg8>[ubyte] = SP(1)<__wolin_reg8>[ubyte], SP(0)<__wolin_reg9>[ubyte]
free SP<__wolin_reg9>, #1 // RIGHT adding operator
// top type already set: __wolin_reg8: ubyte = 0 (for expression)
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg8>[ubyte] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
// top type already set: __wolin_reg8: ubyte = 0 (for expression)
free SP<__wolin_reg8>, #1 // for expression
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.Test.suma
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
alloc SP<__wolin_reg12>, #1 // for while condition
label __wolin_lab_loopStart_1
alloc SP<__wolin_reg13>, #2 // LEFT for <
let SP(0)<__wolin_reg13>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // przez sprawdzacz typow - simple id from var
// switchType to:uword by type from pl.qus.wolin.i
// top type already set: __wolin_reg13: uword = 0 (LEFT for <)
alloc SP<__wolin_reg14>, #2 // RIGHT for <
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg14>[uword] = #1000[uword] // atomic ex
// top type already set: __wolin_reg14: uword = 0 (RIGHT for <)
evalless SP(4)<__wolin_reg12>[bool] = SP(2)<__wolin_reg13>[uword], SP(0)<__wolin_reg14>[uword]
free SP<__wolin_reg14>, #2 // RIGHT for <
free SP<__wolin_reg13>, #2 // LEFT for <
// top type already set: __wolin_reg12: bool = 0 (for while condition)
bne SP(0)<__wolin_reg12>[bool] = #1[bool], __wolin_lab_loopEnd_1<label_po_if>[adr]
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg17>, #2 // ASSIGNMENT target
alloc SP<__wolin_reg18>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg18>[adr] = 1024[adr] // simple id from fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.ekran
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg19>, #2 // For calculating index
let SP(0)<__wolin_reg19>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword], #1[uword] // simple id
// switchType to:uword by ++ operator
// FORCE TOP: __wolin_reg19: uword = 0 (For calculating index) -> uword
//  long index, single byte per element array
add SP(2)<__wolin_reg18>[adr] = SP(2)<__wolin_reg18>[adr], SP(0)<__wolin_reg19>[uword]
free SP<__wolin_reg19>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg18: ubyte* = 0 (arr_deref)
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg17>[adr] = SP(0)<__wolin_reg18>[adr] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg18>, #2 // arr_deref
// top type already set: __wolin_reg17: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg20>, #1 // ASSIGNMENT value
let SP(0)<__wolin_reg20>[ubyte] = __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
let SP(1)<__wolin_reg17>[ptr] = SP(0)<__wolin_reg20>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg20>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg17>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg16: unit = 65535 (for expression)
goto __wolin_lab_loopStart_1[adr]
label __wolin_lab_loopEnd_1
free SP<__wolin_reg12>, #1 // for while condition
// top type already set: __wolin_reg11: unit = 65535 (for expression)
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg22>, #2 // ASSIGNMENT target
let SP(0)<__wolin_reg22>[adr] = 53280[adr] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.border
// top type already set: __wolin_reg22: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg23>, #1 // ASSIGNMENT value
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg23>[ubyte] = #8[ubyte] // atomic ex
let SP(1)<__wolin_reg22>[ptr] = SP(0)<__wolin_reg23>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg23>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg22>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg21: unit = 65535 (for expression)
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
label __wolin_pl_qus_wolin_znak
alloc 0[ubyte]  // pl.qus.wolin.znak
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
