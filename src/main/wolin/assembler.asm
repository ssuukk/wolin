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
alloc SPF, #2
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
free SPF <pl.qus.wolin.main.__returnValue>, #0 // free return value of pl.qus.wolin.main from call stack
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.allocMem(pl.qus.wolin.allocMem.size: uword = 0 (), pl.qus.wolin.allocMem.count: uword = 0 ()):uword
// ****************************************
function __wolin_pl_qus_wolin_allocMem
alloc SP<__wolin_reg3>, #2 // for expression
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg3>[uword] = #30000[uword] // atomic ex
let SPF(4)<pl.qus.wolin.allocMem.__returnValue>[uword] = SP(0)<__wolin_reg3>[uword] // przez sprawdzacz typow - jump expression
// switchType to:uword by return expression
// top type already set: __wolin_reg3: uword = 0 (for expression)
free SP<__wolin_reg3>, #2 // for expression
free SPF<pl.qus.wolin.allocMem.__fnargs>, #4 // free fn arguments and locals for pl.qus.wolin.allocMem
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret


// ****************************************
// konstruktor: fun pl.qus.wolin.SummingClass():pl.qus.wolin.SummingClass
// ****************************************
function __wolin_pl_qus_wolin_SummingClass

alloc SP<__wolin_reg4>, #2 // for returning this
// switchType to:pl.qus.wolin.SummingClass* by function type 1
// top type already set: __wolin_reg4: pl.qus.wolin.SummingClass* = 0 (for returning this)
//  otwarcie stosu na wywolanie pl.qus.wolin.allocMem
alloc SPF, #6
//  tu podajemy argumenty dla pl.qus.wolin.allocMem
//  let pl.qus.wolin.allocMem.size = #3
let SPF(2)<pl.qus.wolin.allocMem.size>[uword] = #3[uword]
//  let pl.qus.wolin.allocMem.count = #1
let SPF(0)<pl.qus.wolin.allocMem.count>[uword] = #1[uword]
//  po argumentach dla pl.qus.wolin.allocMem
call __wolin_pl_qus_wolin_allocMem[adr]
let SP(0)<__wolin_reg4>[any*] = SPF(0)<pl.qus.wolin.allocMem.__returnValue>[uword]
free SPF <pl.qus.wolin.allocMem.__returnValue>, #2 // free return value of pl.qus.wolin.allocMem from call stack
//  tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora
let SPF(0)<pl.qus.wolin.SummingClass.pl.qus.wolin.SummingClass.__returnValue>[any*] = SP(0)<__wolin_reg4>[any*] // przez sprawdzacz typow - zwrotka alloc do zwrotki konstruktora
setup HEAP = SP(0)<__wolin_reg4>[any*]
free SP<__wolin_reg4>, #2 // for returning this
// inicjalizacja zmiennej pl.qus.wolin.SummingClass.x
alloc SP<__wolin_reg5>, #1 // for var pl.qus.wolin.SummingClass.x init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[ubyte] = #3[ubyte] // atomic ex
// top type already set: __wolin_reg5: ubyte = 0 (for var pl.qus.wolin.SummingClass.x init expression)
let HEAP(2)<pl.qus.wolin.SummingClass.x>[ubyte] = SP(0)<__wolin_reg5>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.SummingClass.x
free SP<__wolin_reg5>, #1 // for var pl.qus.wolin.SummingClass.x init expression
// inicjalizacja zmiennej pl.qus.wolin.SummingClass.y
alloc SP<__wolin_reg6>, #1 // for var pl.qus.wolin.SummingClass.y init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #7[ubyte] // atomic ex
// top type already set: __wolin_reg6: ubyte = 0 (for var pl.qus.wolin.SummingClass.y init expression)
let HEAP(1)<pl.qus.wolin.SummingClass.y>[ubyte] = SP(0)<__wolin_reg6>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.SummingClass.y
free SP<__wolin_reg6>, #1 // for var pl.qus.wolin.SummingClass.y init expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from constructor
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.SummingClass.suma(pl.qus.wolin.SummingClass.suma.this: pl.qus.wolin.SummingClass* = 0 ()):ubyte
// ****************************************
function __wolin_pl_qus_wolin_SummingClass_suma
setup HEAP = this
alloc SP<__wolin_reg8>, #2 // for expression
let SP(0)<__wolin_reg8>[ubyte*] = *HEAP(2)<pl.qus.wolin.SummingClass.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.SummingClass.x
// top type already set: __wolin_reg8: ubyte* = 0 (for expression)
alloc SP<__wolin_reg9>, #2 // RIGHT adding operator
let SP(0)<__wolin_reg9>[ubyte*] = *HEAP(1)<pl.qus.wolin.SummingClass.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.SummingClass.y
// top type already set: __wolin_reg9: ubyte* = 0 (RIGHT adding operator)
add &SP(2)<__wolin_reg8>[ubyte*] = &SP(2)<__wolin_reg8>[ubyte*], &SP(0)<__wolin_reg9>[ubyte*]
free SP<__wolin_reg9>, #2 // RIGHT adding operator
// top type already set: __wolin_reg8: ubyte* = 0 (for expression)
let SPF(2)<pl.qus.wolin.SummingClass.suma.__returnValue>[ubyte] = &SP(0)<__wolin_reg8>[ubyte*] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
free SP<__wolin_reg8>, #2 // for expression
free SPF<pl.qus.wolin.SummingClass.suma.__fnargs>, #2 // free fn arguments and locals for pl.qus.wolin.SummingClass.suma
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// top type already set: __wolin_reg11: unit = 65535 (for declaration valtestowa:SummingClass)
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg13>, #2 // ASSIGNMENT target
let SP(0)<__wolin_reg13>[any*] = SPF(0)<pl.qus.wolin.main..testowa>[any*] // przez sprawdzacz typow - simple id from var
// switchType to:pl.qus.wolin.SummingClass* by type from pl.qus.wolin.main..testowa
// top type already set: __wolin_reg13: pl.qus.wolin.SummingClass* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg14>, #2 // ASSIGNMENT value
// switchType to:pl.qus.wolin.SummingClass* by function type 1
// 
// == FN_CALL: pl.qus.wolin.SummingClass ========
alloc SPF, #2
// switchType to:pl.qus.wolin.SummingClass* by function type 2
// switchType to:pl.qus.wolin.SummingClass* by function call
call __wolin_pl_qus_wolin_SummingClass[adr]

let SP(0)<__wolin_reg14>[any*] = SPF(0)<pl.qus.wolin.SummingClass.__returnValue>[any*] // przez sprawdzacz typow - copy return parameter
free SPF<pl.qus.wolin.SummingClass.__returnValue>, #2
// == FN_CALL END: pl.qus.wolin.SummingClass ========
// 
let &SP(2)<__wolin_reg13>[any*] = &SP(0)<__wolin_reg14>[any*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg14>, #2 // ASSIGNMENT value, type = pl.qus.wolin.SummingClass*
free SP<__wolin_reg13>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg12: unit = 65535 (for expression)
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg16>, #2 // ASSIGNMENT target
let SP(0)<__wolin_reg16>[ubyte*] = 53280[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.border
// top type already set: __wolin_reg16: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg17>, #1 // ASSIGNMENT value
//  deref: obiekt --------------------
alloc SP<__wolin_reg18>, #2 // dereferenced object
let SP(0)<__wolin_reg18>[any*] = SPF(0)<pl.qus.wolin.main..testowa>[any*] // przez sprawdzacz typow - simple id from var
// switchType to:pl.qus.wolin.SummingClass* by type from pl.qus.wolin.main..testowa
alloc SP<__wolin_reg19>, #1 // call result
// to jest klasa zmieniamy chwilowo aktualną
// jesli tak, to na gorze heapu jest uniqid klasy
//  deref: pole/metoda --------------------
//  postfix unary w dereferencji
// switchType to:ubyte by function type 1
// 
// == FN_CALL: pl.qus.wolin.SummingClass.suma ========
alloc SPF, #3
// == FN_CALL: ARG #THIS pl.qus.wolin.SummingClass.suma
let SPF(0)[any*] = SP(1)<__wolin_reg18>[any*]
// switchType to:ubyte by function type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_SummingClass_suma[adr]

let SP(0)<__wolin_reg19>[ubyte] = SPF(0)<pl.qus.wolin.SummingClass.suma.__returnValue>[ubyte] // przez sprawdzacz typow - copy return parameter
free SPF<pl.qus.wolin.SummingClass.suma.__returnValue>, #1
// == FN_CALL END: pl.qus.wolin.SummingClass.suma ========
// 
// tu przywrócić poprzednią klasę
// deref: przypisanie aktualnego do right side final var --------------------
let SP(3)<__wolin_reg17>[ubyte] = SP(0)<__wolin_reg19>[ubyte]
free SP<__wolin_reg19>, #1 // call result
free SP<__wolin_reg18>, #2 // next deref level
let &SP(1)<__wolin_reg16>[ubyte*] = SP(0)<__wolin_reg17>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg17>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg16>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg15: unit = 65535 (for expression)
free SPF<pl.qus.wolin.main.__fnargs>, #2 // free fn arguments and locals for pl.qus.wolin.main
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
