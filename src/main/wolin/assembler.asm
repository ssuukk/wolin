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
// inicjalizacja zmiennej pl.qus.wolin.b
alloc SP<__wolin_reg1>, #1 // for var pl.qus.wolin.b init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #2[ubyte] // atomic ex
// top type already set: __wolin_reg1: ubyte = 0 (for var pl.qus.wolin.b init expression)
let __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.b
free SP<__wolin_reg1>, #1 // for var pl.qus.wolin.b init expression
// inicjalizacja zmiennej pl.qus.wolin.a
alloc SP<__wolin_reg2>, #1 // for var pl.qus.wolin.a init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg2>[ubyte] = #1[ubyte] // atomic ex
// top type already set: __wolin_reg2: ubyte = 0 (for var pl.qus.wolin.a init expression)
let __wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte] = SP(0)<__wolin_reg2>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.a
free SP<__wolin_reg2>, #1 // for var pl.qus.wolin.a init expression
// inicjalizacja zmiennej pl.qus.wolin.i
alloc SP<__wolin_reg3>, #1 // for var pl.qus.wolin.i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg3>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg3: ubyte = 0 (for var pl.qus.wolin.i init expression)
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg3>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg3>, #1 // for var pl.qus.wolin.i init expression
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
alloc SP<__wolin_reg5>, #2 // for expression
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg5>[any] = #30000[uword] // atomic ex
let SPF(4)<returnValue>[any] = SP(0)<__wolin_reg5>[any] // przez sprawdzacz typow - jump expression
// switchType to:Any by return expression
// top type already set: __wolin_reg5: Any = 65535 (for expression)
free SP<__wolin_reg5>, #2 // for expression
free SPF, #4 // free fn arguments and locals for pl.qus.wolin.allocMem
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret


// ****************************************
// konstruktor: fun pl.qus.wolin.Test():pl.qus.wolin.Test
// ****************************************
label __wolin_pl_qus_wolin_Test

alloc SP<__wolin_reg6>, #2 // for returning this
// switchType to:pl.qus.wolin.Test* by function type 1
// top type already set: __wolin_reg6: pl.qus.wolin.Test* = 0 (for returning this)
//  otwarcie stosu na wywolanie pl.qus.wolin.allocMem
alloc SPF, #6
//  tu podajemy argumenty dla pl.qus.wolin.allocMem
//  let pl.qus.wolin.allocMem.size = #3
let SPF(2)[uword] = #3[uword]
//  let pl.qus.wolin.allocMem.count = #1
let SPF(0)[uword] = #1[uword]
//  po argumentach dla pl.qus.wolin.allocMem
call __wolin_pl_qus_wolin_allocMem[adr]
let SP(0)<__wolin_reg6>[adr] = SPF(0)<returnValue>[adr]
free SPF <Any>, #2 // free return value of pl.qus.wolin.allocMem from call stack
//  tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora
let SPF(0)<pl.qus.wolin.Test.returnValue>[any*] = SP(0)<__wolin_reg6>[any*] // przez sprawdzacz typow - zwrotka alloc do zwrotki konstruktora
setup HEAP = SP(0)<__wolin_reg6>[any*]
free SP<__wolin_reg6>, #2 // for returning this
// inicjalizacja zmiennej pl.qus.wolin.Test.x
alloc SP<__wolin_reg7>, #1 // for var pl.qus.wolin.Test.x init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg7>[ubyte] = #3[ubyte] // atomic ex
// top type already set: __wolin_reg7: ubyte = 0 (for var pl.qus.wolin.Test.x init expression)
let HEAP(2)<pl.qus.wolin.Test.x>[ubyte] = SP(0)<__wolin_reg7>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.x
free SP<__wolin_reg7>, #1 // for var pl.qus.wolin.Test.x init expression
// inicjalizacja zmiennej pl.qus.wolin.Test.y
alloc SP<__wolin_reg8>, #1 // for var pl.qus.wolin.Test.y init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg8>[ubyte] = #7[ubyte] // atomic ex
// top type already set: __wolin_reg8: ubyte = 0 (for var pl.qus.wolin.Test.y init expression)
let HEAP(1)<pl.qus.wolin.Test.y>[ubyte] = SP(0)<__wolin_reg8>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.y
free SP<__wolin_reg8>, #1 // for var pl.qus.wolin.Test.y init expression
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from constructor
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.Test.suma(pl.qus.wolin.Test.suma.this: pl.qus.wolin.Test = 65535 ()):ubyte
// ****************************************
label __wolin_pl_qus_wolin_Test_suma
setup HEAP = this
alloc SP<__wolin_reg10>, #1 // for expression
let SP(0)<__wolin_reg10>[ubyte] = *HEAP(2)<pl.qus.wolin.Test.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.Test.x
// top type already set: __wolin_reg10: ubyte = 0 (for expression)
alloc SP<__wolin_reg11>, #1 // RIGHT adding operator
let SP(0)<__wolin_reg11>[ubyte] = *HEAP(1)<pl.qus.wolin.Test.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.Test.y
// top type already set: __wolin_reg11: ubyte = 0 (RIGHT adding operator)
add SP(1)<__wolin_reg10>[ubyte] = SP(1)<__wolin_reg10>[ubyte], SP(0)<__wolin_reg11>[ubyte]
free SP<__wolin_reg11>, #1 // RIGHT adding operator
// top type already set: __wolin_reg10: ubyte = 0 (for expression)
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg10>[ubyte] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
// top type already set: __wolin_reg10: ubyte = 0 (for expression)
free SP<__wolin_reg10>, #1 // for expression
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.Test.suma
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg14>, #1 // ASSIGNMENT target
let SP(0)<__wolin_reg14>[ubyte] = *__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.a
// top type already set: __wolin_reg14: ubyte = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg15>, #1 // ASSIGNMENT value
let SP(0)<__wolin_reg15>[ubyte] = *__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.b
let &SP(1)<__wolin_reg14>[ubyte] = SP(0)<__wolin_reg15>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg15>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg14>, #1 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg13: unit = 65535 (for expression)
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
label __wolin_pl_qus_wolin_b
alloc 0[ubyte]  // pl.qus.wolin.b
label __wolin_pl_qus_wolin_a
alloc 0[ubyte]  // pl.qus.wolin.a
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
