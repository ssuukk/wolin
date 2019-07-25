setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
//  main function entry
goto __wolin_pl_qus_wolin_main[adr]
// Using already known __wolin_reg0
alloc SP<__wolin_reg0>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #2[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg0: ubyte = 0 -> no change
let __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej b
free SP<__wolin_reg0>, #1 // for var init expression
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
// Using already known __wolin_reg1
//  lewa strona assignment
// Using already known __wolin_reg2
alloc SP<__wolin_reg2>, #1 // For assignment left side
// switchType to:ubyte by by znajdźSimpleIdW
// SAFE INFER TOP: __wolin_reg2: ubyte = 0 -> no change
//  prawa strona assignment
// Using already known __wolin_reg3
alloc SP<__wolin_reg3>, #1 // for value that gets assigned to left side
// When expression start
// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #2 // for when top expression
let SP(0)<__wolin_reg4>[uword] = __wolin_pl_qus_wolin_d<pl.qus.wolin.d>[uword] // simple id from var
// switchType to:uword by type from pl.qus.wolin.d
// SAFE INFER TOP: __wolin_reg4: uword = 0 -> no change
// Using already known __wolin_reg5
alloc SP<__wolin_reg5>, #1 // for condition result
// Using already known __wolin_reg6
alloc SP<__wolin_reg6>, #2 // for evaluating when condition
// normal when condition
// warunek
label __wolin_lab_whenLabel_0
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[uword] = #0[ubyte] // atomic ex
evaleq SP(2)<__wolin_reg5>[bool] = SP(3)<__wolin_reg4>[uword], SP(0)<__wolin_reg6>[uword]
bne SP(2)<__wolin_reg5>[bool] = #1[bool], __wolin_lab_whenLabel_1[adr]
// when operacja
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[uword] = #6[ubyte] // atomic ex
goto __wolin_lab_whenEndLabel_0[adr]
// last when condition
// warunek
label __wolin_lab_whenLabel_1
// when else branch
// when operacja
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[uword] = #9[ubyte] // atomic ex
// When expression end
label __wolin_lab_whenEndLabel_0
free SP<__wolin_reg6>, #2 // for evaluating when condition
free SP<__wolin_reg5>, #1 // for condition result
free SP<__wolin_reg4>, #2 // for when top expression
let __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] = SP(0)<__wolin_reg3>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg3>, #1 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg2>, #1 // For assignment left side
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg1: unit = 65535 -> no change
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
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
label __wolin_pl_qus_wolin_c
alloc 0[uword]  // pl.qus.wolin.c
label __wolin_pl_qus_wolin_d
alloc 0[uword]  // pl.qus.wolin.d
