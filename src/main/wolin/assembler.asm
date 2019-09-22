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
alloc SPF, #1
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
free SPF <unit>, #0 // free return value of pl.qus.wolin.main from call stack
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.suma(pl.qus.wolin.suma.a: ubyte = 0 (), pl.qus.wolin.suma.b: ubyte = 0 ()):ubyte
// ****************************************
label __wolin_pl_qus_wolin_suma
alloc SP<__wolin_reg3>, #2 // for expression
let SP(0)<__wolin_reg3>[ubyte*] = *SPF(1)<pl.qus.wolin.suma.a>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.suma.a
// top type already set: __wolin_reg3: ubyte* = 0 (for expression)
alloc SP<__wolin_reg4>, #2 // RIGHT adding operator
let SP(0)<__wolin_reg4>[ubyte*] = *SPF(0)<pl.qus.wolin.suma.b>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.suma.b
// top type already set: __wolin_reg4: ubyte* = 0 (RIGHT adding operator)
add &SP(2)<__wolin_reg3>[ubyte*] = &SP(2)<__wolin_reg3>[ubyte*], &SP(0)<__wolin_reg4>[ubyte*]
free SP<__wolin_reg4>, #2 // RIGHT adding operator
// top type already set: __wolin_reg3: ubyte* = 0 (for expression)
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg3>[ubyte*] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
free SP<__wolin_reg3>, #2 // for expression
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.suma
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
alloc SP<__wolin_reg6>, #1 // for declaration valx:ubyte=suma(2,2)
alloc SP<__wolin_reg7>, #1 // for var pl.qus.wolin.main..x init expression
// switchType to:ubyte by function type 1
// 
// == FN_CALL: pl.qus.wolin.suma ========
alloc SPF, #3
// == FN_CALL: ARG #0 (2) pl.qus.wolin.suma
alloc SP<__wolin_reg8>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 2
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg8>[ubyte] = #2[ubyte] // atomic ex
// po visit value
let SPF(1)[ubyte] = SP(0)<__wolin_reg8>[ubyte]
free SP<__wolin_reg8>, #1 // for call argument 0, type = ubyte
// == FN_CALL: ARG #1 (2) pl.qus.wolin.suma
alloc SP<__wolin_reg9>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 2
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #2[ubyte] // atomic ex
// po visit value
let SPF(0)[ubyte] = SP(0)<__wolin_reg9>[ubyte]
free SP<__wolin_reg9>, #1 // for call argument 1, type = ubyte
// switchType to:ubyte by function type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_suma[adr]

let SP(0)<__wolin_reg7>[ubyte] = SPF(0)<returnValue>[ubyte] // przez sprawdzacz typow - copy return parameter
free SPF <ubyte>, #1
// == FN_CALL END: pl.qus.wolin.suma ========
// 
// top type already set: __wolin_reg7: ubyte = 0 (for var pl.qus.wolin.main..x init expression)
let SPF(0)<pl.qus.wolin.main..x>[ubyte] = SP(0)<__wolin_reg7>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.main..x
free SP<__wolin_reg7>, #1 // for var pl.qus.wolin.main..x init expression
// top type already set: __wolin_reg6: ubyte = 0 (for declaration valx:ubyte=suma(2,2))
free SP<__wolin_reg6>, #1 // for declaration valx:ubyte=suma(2,2)
free SPF, #1 // free fn arguments and locals for pl.qus.wolin.main
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
