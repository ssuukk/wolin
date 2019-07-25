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
// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #1 // condition expression bool result
// Using already known __wolin_reg5
alloc SP<__wolin_reg5>, #2 // LEFT equality check: evaleq
let SP(0)<__wolin_reg5>[uword] = __wolin_pl_qus_wolin_d<pl.qus.wolin.d>[uword] // simple id from var
// switchType to:uword by type from pl.qus.wolin.d
// SAFE INFER TOP: __wolin_reg5: uword = 0 -> no change
// Using already known __wolin_reg6
alloc SP<__wolin_reg6>, #1 // RIGHT equality check: evaleq
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg6: ubyte = 0 -> no change
evaleq SP(3)<__wolin_reg4>[bool] = SP(1)<__wolin_reg5>[uword], SP(0)<__wolin_reg6>[ubyte] // two sides
free SP<__wolin_reg6>, #1 // RIGHT equality check: evaleq
free SP<__wolin_reg5>, #2 // LEFT equality check: evaleq
// SAFE INFER TOP: __wolin_reg4: bool = 0 -> no change
bne SP(0)<__wolin_reg4>[bool] = #1[bool], __wolin_lab_afterIfExpression_0<label_DO_else>[uword]
//  body dla true
// Using already known __wolin_reg7
alloc SP<__wolin_reg7>, #1 // for block 'return value' {6}
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg7>[ubyte] = #6[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg7: ubyte = 0 -> no change
let __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] = SP(0)<__wolin_reg7>[ubyte] // przez sprawdzacz typów
free SP<__wolin_reg7>, #1 // for block 'return value' {6}, type = ubyte
goto __wolin_lab_afterWholeIf_0
label __wolin_lab_afterIfExpression_0
//  body dla false/else
// Using already known __wolin_reg8
alloc SP<__wolin_reg8>, #1 // for block 'return value' {9}
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg8>[ubyte] = #9[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 -> no change
let __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] = SP(0)<__wolin_reg8>[ubyte] // przez sprawdzacz typów
free SP<__wolin_reg8>, #1 // for block 'return value' {9}, type = ubyte
label __wolin_lab_afterWholeIf_0
free SP<__wolin_reg4>, #1 // condition expression bool result
let __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] = SP(0)<__wolin_reg3>[ubyte] // przez sprawdzacz typów
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
