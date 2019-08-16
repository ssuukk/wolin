setup HEADER
setup SP = 143[ubyte] // register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.i
// Using already known __wolin_reg0
alloc SP<__wolin_reg0>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg0: ubyte = 0 (for var init expression) -> no change
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg0>, #1 // for var init expression
// inicjalizacja zmiennej pl.qus.wolin.znak
// Using already known __wolin_reg1
alloc SP<__wolin_reg1>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg1: ubyte = 0 (for var init expression) -> no change
let __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.znak
free SP<__wolin_reg1>, #1 // for var init expression
//  main function entry
goto __wolin_pl_qus_wolin_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.allocMem(pl.qus.wolin.allocMem.size: uword = 0 (), pl.qus.wolin.allocMem.count: uword = 0 ()):Any
// ****************************************
label __wolin_pl_qus_wolin_allocMem
// Using already known __wolin_reg2
alloc SP<__wolin_reg2>, #2 // for block 'return value' {\nreturn30000\n}
// Using already known __wolin_reg3
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

// Using already known __wolin_reg4
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
// Using already known __wolin_reg5
alloc SP<__wolin_reg5>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[ubyte] = #3[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg5: ubyte = 0 (for var init expression) -> no change
let HEAP(2)<pl.qus.wolin.Test.x>[ubyte] = SP(0)<__wolin_reg5>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.x
free SP<__wolin_reg5>, #1 // for var init expression
// inicjalizacja zmiennej pl.qus.wolin.Test.y
// Using already known __wolin_reg6
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
// Using already known __wolin_reg7
// Using already known __wolin_reg8
alloc SP<__wolin_reg8>, #1 // for expression
let SP(0)<__wolin_reg8>[ubyte] = HEAP(2)<pl.qus.wolin.Test.x>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.Test.x
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 (for expression) -> no change
// Using already known __wolin_reg9
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
// Using already known __wolin_reg10
// Using already known __wolin_reg11
//  lewa strona assignment
// Using already known __wolin_reg12
alloc SP<__wolin_reg12>, #1 // For assignment left side
let SP(0)<__wolin_reg12>[ubyte] = 53280[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.border
// SAFE INFER TOP: __wolin_reg12: ubyte = 0 (For assignment left side) -> no change
//  prawa strona assignment
// Using already known __wolin_reg13
alloc SP<__wolin_reg13>, #1 // for value that gets assigned to left side
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg13>[ubyte] = #8[ubyte] // atomic ex
let SP(1)<__wolin_reg12>[ubyte] = SP(0)<__wolin_reg13>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg13>, #1 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg12>, #1 // For assignment left side
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg11: unit = 65535 (for expression) -> no change
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
