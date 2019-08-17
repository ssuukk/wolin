setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.znak
alloc SP<__wolin_reg0>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg0: ubyte = 0 (for var init expression) -> no change
let __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.znak
free SP<__wolin_reg0>, #1 // for var init expression
// inicjalizacja zmiennej pl.qus.wolin.i
alloc SP<__wolin_reg1>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg1: ubyte = 0 (for var init expression) -> no change
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg1>, #1 // for var init expression
//  main function entry
goto __wolin_pl_qus_wolin_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.allocMem(pl.qus.wolin.allocMem.size: uword = 0 (), pl.qus.wolin.allocMem.count: uword = 0 ()):Any
// ****************************************
label __wolin_pl_qus_wolin_allocMem
alloc SP<__wolin_reg2>, #2 // for block 'return value' {\nreturn30000\n}
alloc SP<__wolin_reg3>, #2 // for expression
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg3>[ptr] = #30000[uword] // atomic ex
let SPF(4)<returnValue>[ptr] = SP(0)<__wolin_reg3>[ptr] // przez sprawdzacz typow - jump expression
// switchType to:Any by return expression
// SAFE INFER TOP: __wolin_reg3: Any = 65535 (for expression) -> no change
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
// SAFE INFER TOP: __wolin_reg4: pl.qus.wolin.Test* = 0 (for returning this) -> no change
//  otwarcie stosu na wywolanie pl.qus.wolin.allocMem
alloc SPF, #6
//  tu podajemy argumenty dla pl.qus.wolin.allocMem
//  let pl.qus.wolin.allocMem.size = #3
let SPF(2)[uword] = #3[uword]
//  let pl.qus.wolin.allocMem.count = #1
let SPF(0)[uword] = #1[uword]
//  po argumentach dla pl.qus.wolin.allocMem
call __wolin_pl_qus_wolin_allocMem[adr]
let SP(0)<__wolin_reg4>[ptr] = SPF(0)<returnValue>[ptr]
free SPF <Any>, #2 // free return value of pl.qus.wolin.allocMem from call stack
//  tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora
let SPF(0)<pl.qus.wolin.Test.returnValue>[ptr] = SP(0)<__wolin_reg4>[ptr] // przez sprawdzacz typow - zwrotka alloc do zwrotki konstruktora
setup HEAP = SP(0)<__wolin_reg4>[ptr]
free SP<__wolin_reg4>, #2 // for returning this
// inicjalizacja zmiennej pl.qus.wolin.Test.x
alloc SP<__wolin_reg5>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[ubyte] = #3[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg5: ubyte = 0 (for var init expression) -> no change
let HEAP(2)<pl.qus.wolin.Test.x>[ubyte] = SP(0)<__wolin_reg5>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.x
free SP<__wolin_reg5>, #1 // for var init expression
// inicjalizacja zmiennej pl.qus.wolin.Test.y
alloc SP<__wolin_reg6>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #7[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg6: ubyte = 0 (for var init expression) -> no change
let HEAP(1)<pl.qus.wolin.Test.y>[ubyte] = SP(0)<__wolin_reg6>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.y
free SP<__wolin_reg6>, #1 // for var init expression
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
let SP(0)<__wolin_reg8>[ubyte] = HEAP(2)<pl.qus.wolin.Test.x>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.Test.x
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 (for expression) -> no change
alloc SP<__wolin_reg9>, #1 // RIGHT adding operator
let SP(0)<__wolin_reg9>[ubyte] = HEAP(1)<pl.qus.wolin.Test.y>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.Test.y
// SAFE INFER TOP: __wolin_reg9: ubyte = 0 (RIGHT adding operator) -> no change
add SP(1)<__wolin_reg8>[ubyte] = SP(1)<__wolin_reg8>[ubyte], SP(0)<__wolin_reg9>[ubyte]
free SP<__wolin_reg9>, #1 // RIGHT adding operator
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 (for expression) -> no change
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg8>[ubyte] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 (for expression) -> no change
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
// SAFE INFER TOP: __wolin_reg11: unit = 65535 (for declaration valtestowa:Test) -> no change
//  lewa strona assignment
alloc SP<__wolin_reg13>, #2 // ASSIGNMENT target
let SP(0)<__wolin_reg13>[ptr] = SPF(0)<pl.qus.wolin.main..testowa>[ptr] // simple id from var
// switchType to:pl.qus.wolin.Test by type from pl.qus.wolin.main..testowa
// SAFE INFER TOP: __wolin_reg13: pl.qus.wolin.Test = 65535 (ASSIGNMENT target) -> no change
//  prawa strona assignment
alloc SP<__wolin_reg14>, #2 // ASSIGNMENT value
// switchType to:pl.qus.wolin.Test by function type 1
alloc SPF, #2
// switchType to:pl.qus.wolin.Test by function type 2
// switchType to:pl.qus.wolin.Test by function call
call __wolin_pl_qus_wolin_Test[adr]

let SP(0)<__wolin_reg14>[ptr] = SPF(0)<returnValue>[ptr]// copy return parameter - TODO sprawdzić co jeśli wywołanie funkcji było bez podstawienia!!!
free SPF <pl.qus.wolin.Test>, #2
let SP(2)<__wolin_reg13>[ptr] = SP(0)<__wolin_reg14>[ptr] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg14>, #2 // ASSIGNMENT value, type = pl.qus.wolin.Test
free SP<__wolin_reg13>, #2 // ASSIGNMENT target
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg12: unit = 65535 (for expression) -> no change
//  lewa strona assignment
alloc SP<__wolin_reg16>, #2 // ASSIGNMENT target
let SP(0)<__wolin_reg16>[ptr] = 53280[ptr] // simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.border
// SAFE INFER TOP: __wolin_reg16: ubyte* = 0 (ASSIGNMENT target) -> no change
//  prawa strona assignment
alloc SP<__wolin_reg17>, #1 // ASSIGNMENT value
//  lewa strona deref
alloc SP<__wolin_reg18>, #2 // next deref level
let SP(0)<__wolin_reg18>[ptr] = SPF(0)<pl.qus.wolin.main..testowa>[ptr] // simple id from var
// switchType to:pl.qus.wolin.Test by type from pl.qus.wolin.main..testowa
// to jest klasa zmieniamy chwilowo aktualną
//  jesli tak, to na gorze heapu jest uniqid klasy
//  prawa strona deref
//  postfix unary w dereferencji
// switchType to:ubyte by function type 1
alloc SPF, #3
// obsługa this dla suma
let SPF(0)[ptr] = SP(0)<__wolin_reg18>[ptr]
// switchType to:ubyte by function type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_Test_suma[adr]

let SP(0)<__wolin_reg18>[ptr] = SPF(0)<returnValue>[ubyte]// copy return parameter - TODO sprawdzić co jeśli wywołanie funkcji było bez podstawienia!!!
free SPF <ubyte>, #1
// tu przywrócić poprzednią klasę
// tutaj powinniśmy przypisać __wolin_reg17: ubyte = 0 (ASSIGNMENT value) = __wolin_reg18: pl.qus.wolin.Test = 65535 (next deref level)
free SP<__wolin_reg18>, #2 // next deref level
let SP(1)<__wolin_reg16>[ptr] = SP(0)<__wolin_reg17>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg17>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg16>, #2 // ASSIGNMENT target
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg15: unit = 65535 (for expression) -> no change
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.main
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
