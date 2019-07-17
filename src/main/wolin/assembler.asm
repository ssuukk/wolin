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
alloc SP<__wolin_reg1>, #1 // for block level expression when(b){\n1->c++\n2->c--\nelse->c=0\n}
// When expression start
// Using already known __wolin_reg2
alloc SP<__wolin_reg2>, #1 // for when expression
let SP(0)<__wolin_reg2>[ubyte] = __wolin_pl_qus_wolin_b<pl.qus.wolin.b>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.b
// SAFE INFER TOP: __wolin_reg2: ubyte = 0 -> no change
// Using already known __wolin_reg3
alloc SP<__wolin_reg3>, #1 // for condition result
// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #1 // for evaluating when condition
// normal when condition
// warunek
label __wolin_lab_whenLabel_0
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte] = #1[ubyte] // atomic ex
evaleq SP(1)<__wolin_reg3>[bool] = SP(2)<__wolin_reg2>[ubyte], SP(0)<__wolin_reg4>[ubyte]
bne SP(1)<__wolin_reg3>[bool] = #1[bool], __wolin_lab_whenLabel_1[adr]
// when operacja
add __wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword] = __wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword], #1[uword] // simple id
// switchType to:uword by ++ operator
goto __wolin_lab_whenEndLabel_0[adr]
// normal when condition
// warunek
label __wolin_lab_whenLabel_1
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte] = #2[ubyte] // atomic ex
evaleq SP(1)<__wolin_reg3>[bool] = SP(2)<__wolin_reg2>[ubyte], SP(0)<__wolin_reg4>[ubyte]
bne SP(1)<__wolin_reg3>[bool] = #1[bool], __wolin_lab_whenLabel_2[adr]
// when operacja
sub __wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword] = __wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword], #1[uword] // simple id
// switchType to:uword by -- operator
goto __wolin_lab_whenEndLabel_0[adr]
// last when condition
// warunek
label __wolin_lab_whenLabel_2
// when else branch
// when operacja
//  lewa strona assignment
// Using already known __wolin_reg5
alloc SP<__wolin_reg5>, #2 // For assignment left side
// switchType to:uword by by znajdźSimpleIdW
// SAFE INFER TOP: __wolin_reg5: uword = 0 -> no change
//  prawa strona assignment
// Using already known __wolin_reg6
alloc SP<__wolin_reg6>, #2 // for value that gets assigned to left side
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[uword] = #0[ubyte] // atomic ex
let __wolin_pl_qus_wolin_c<pl.qus.wolin.c>[uword] = SP(0)<__wolin_reg6>[uword] // przez sprawdzacz typów
free SP<__wolin_reg6>, #2 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg5>, #2 // For assignment left side
// When expression end
label __wolin_lab_whenEndLabel_0
free SP<__wolin_reg4>, #1 // for evaluating when condition
free SP<__wolin_reg3>, #1 // for condition result
free SP<__wolin_reg2>, #1
// SAFE INFER TOP: __wolin_reg1: ubyte = 0 -> no change
free SP<__wolin_reg1>, #1 // for block level expression when(b){\n1->c++\n2->c--\nelse->c=0\n}, type = ubyte
// Using already known __wolin_reg7
alloc SP<__wolin_reg7>, #1 // for block level expression sum(4,6)
// switchType to:ubyte by function type 1
// SAFE INFER TOP: __wolin_reg7: ubyte = 0 -> no change
alloc SPF, #3
//  obsługa argumentu 0 wywołania sum
// Using already known __wolin_reg8
alloc SP<__wolin_reg8>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 4
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg8>[ubyte] = #4[ubyte] // atomic ex
// po visit value
let SPF(1)[ubyte] = SP(0)<__wolin_reg8>[ubyte]
free SP<__wolin_reg8>, #1 // for call argument 0, type = ubyte
//  obsługa argumentu 1 wywołania sum
// Using already known __wolin_reg9
alloc SP<__wolin_reg9>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 6
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg9>[ubyte] = #6[ubyte] // atomic ex
// po visit value
let SPF(0)[ubyte] = SP(0)<__wolin_reg9>[ubyte]
free SP<__wolin_reg9>, #1 // for call argument 1, type = ubyte
// switchType to:ubyte by function type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_sum[adr]

let SP(0)<__wolin_reg7>[ubyte] = SPF(0)<returnValue>[ubyte]// copy return parameter - TODO sprawdzić co jeśli wywołanie funkcji było bez podstawienia!!!
free SPF <ubyte>, #1
// SAFE INFER TOP: __wolin_reg7: ubyte = 0 -> no change
free SP<__wolin_reg7>, #1 // for block level expression sum(4,6), type = ubyte
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.sum(pl.qus.wolin.sum.x: ubyte = 0, pl.qus.wolin.sum.y: ubyte = 0):ubyte
// ****************************************
label __wolin_pl_qus_wolin_sum
// __wolin_reg10 not yet in variablary
let SP(0)<__wolin_reg10>[ptr] = SPF(1)<pl.qus.wolin.sum.x>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sum.x
// SAFE INFER TOP: __wolin_reg10: ubyte = 0 -> ubyte
// __wolin_reg11 not yet in variablary
let SP(0)<__wolin_reg11>[ptr] = SPF(0)<pl.qus.wolin.sum.y>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.sum.y
// SAFE INFER TOP: __wolin_reg11: ubyte = 0 -> ubyte
add SP(1)<__wolin_reg10>[ubyte] = SP(1)<__wolin_reg10>[ubyte], SP(0)<__wolin_reg11>[ubyte]
free SP<__wolin_reg11>, #1 // RIGHT adding operator
// SAFE INFER TOP: __wolin_reg10: ubyte = 0 -> no change
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg10>[ubyte] // przez sprawdzacz typów
// switchType to:ubyte by return expression
// SAFE INFER TOP: __wolin_reg10: ubyte = 0 -> no change
free SP<__wolin_reg10>, #1 // for block level expression returnx+y, type = ubyte
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.sum
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
label __wolin_pl_qus_wolin_oneByteLongArray
alloc 0[ptr]  // pl.qus.wolin.oneByteLongArray
label __wolin_pl_qus_wolin_fastArray
alloc 0[ptr]  // pl.qus.wolin.fastArray
label __wolin_pl_qus_wolin_twoBytesLongArray
alloc 0[ptr]  // pl.qus.wolin.twoBytesLongArray
label __wolin_pl_qus_wolin_b
alloc 0[ubyte]  // pl.qus.wolin.b
label __wolin_pl_qus_wolin_c
alloc 0[uword]  // pl.qus.wolin.c
label __wolin_pl_qus_wolin_d
alloc 0[uword]  // pl.qus.wolin.d
