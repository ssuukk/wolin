setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.b
alloc SP<__wolin_reg0>, #1 // for var pl.qus.wolin.b init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #2[ubyte] // atomic ex
// top type already set: __wolin_reg0: ubyte = 0 (for var pl.qus.wolin.b init expression)
let __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.b
free SP<__wolin_reg0>, #1 // for var pl.qus.wolin.b init expression
// inicjalizacja zmiennej pl.qus.wolin.a
alloc SP<__wolin_reg1>, #1 // for var pl.qus.wolin.a init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #1[ubyte] // atomic ex
// top type already set: __wolin_reg1: ubyte = 0 (for var pl.qus.wolin.a init expression)
let __wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.a
free SP<__wolin_reg1>, #1 // for var pl.qus.wolin.a init expression
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
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg4>, #2 // ASSIGNMENT target
let SP(0)<__wolin_reg4>[ubyte*] = *__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.a
// top type already set: __wolin_reg4: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg5>, #2 // ASSIGNMENT value
let SP(0)<__wolin_reg5>[ubyte*] = *__wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.b
let &SP(2)<__wolin_reg4>[ubyte*] = &SP(0)<__wolin_reg5>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg5>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg4>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit* by assignment
// top type already set: __wolin_reg3: unit* = 0 (for expression)
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg7>, #2 // ASSIGNMENT target
let SP(0)<__wolin_reg7>[ubyte*] = 53280[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.border
// top type already set: __wolin_reg7: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg8>, #2 // ASSIGNMENT value
let SP(0)<__wolin_reg8>[ubyte*] = *__wolin_pl_qus_wolin_a<pl.qus.wolin.a>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.a
let &SP(2)<__wolin_reg7>[ubyte*] = &SP(0)<__wolin_reg8>[ubyte*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg8>, #2 // ASSIGNMENT value, type = ubyte*
free SP<__wolin_reg7>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// 
// switchType to:unit* by assignment
// top type already set: __wolin_reg6: unit* = 0 (for expression)
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
label __wolin_pl_qus_wolin_b
alloc 0[ubyte]  // pl.qus.wolin.b
label __wolin_pl_qus_wolin_a
alloc 0[ubyte]  // pl.qus.wolin.a
