setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
//  main function entry
goto __wolin_pl_qus_wolin_test_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.main():unit
// ****************************************
label __wolin_pl_qus_wolin_test_main
alloc SP<__wolin_reg0>, #2 // for block level expression when(b){\n1->c++\n2->c--\nelse->c=0\n}
// When expression start
alloc SP<__wolin_reg1>, #1 // for when expression
let SP(0)<__wolin_reg1>[ubyte] = __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.b
// SAFE INFER TOP: __wolin_reg1: ubyte = 0 -> no change
alloc SP<__wolin_reg2>, #1 // for condition result
alloc SP<__wolin_reg3>, #1 // for evaluating when condition
// normal when condition
// warunek
label __wolin_lab_whenLabel_0
let SP(0)<__wolin_reg3>[ubyte] = #1[ubyte] // atomic ex
evaleq SP(1)<__wolin_reg2>[bool] = SP(2)<__wolin_reg1>[ubyte], SP(0)<__wolin_reg3>[ubyte]
bne SP(1)<__wolin_reg2>[bool] = #1[bool], __wolin_lab_whenLabel_1[adr]
// when operacja
add __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword] = __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword], #1[uword] // simple id
// switchType to:uword by ++ operator
goto __wolin_lab_whenEndLabel_0[adr]
// normal when condition
// warunek
label __wolin_lab_whenLabel_1
let SP(0)<__wolin_reg3>[ubyte] = #2[ubyte] // atomic ex
evaleq SP(1)<__wolin_reg2>[bool] = SP(2)<__wolin_reg1>[ubyte], SP(0)<__wolin_reg3>[ubyte]
bne SP(1)<__wolin_reg2>[bool] = #1[bool], __wolin_lab_whenLabel_2[adr]
// when operacja
sub __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword] = __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword], #1[uword] // simple id
// switchType to:uword by -- operator
goto __wolin_lab_whenEndLabel_0[adr]
// last when condition
// warunek
label __wolin_lab_whenLabel_2
// when else branch
// when operacja
//  lewa strona assignment
alloc SP<__wolin_reg4>, #2 // For assignment left side
// switchType to:uword by by znajdźSimpleIdW
// SAFE INFER TOP: __wolin_reg4: uword = 0 -> no change
//  prawa strona assignment
alloc SP<__wolin_reg5>, #2 // for value that gets assigned to left side
let SP(0)<__wolin_reg5>[uword] = #0[ubyte] // atomic ex
let __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword] = SP(0)<__wolin_reg5>[uword] // przez sprawdzacz typów
free SP<__wolin_reg5>, #2 // for value that gets assigned to left side, type = uword
free SP<__wolin_reg4>, #2 // For assignment left side
// When expression end
label __wolin_lab_whenEndLabel_0
free SP<__wolin_reg3>, #1 // for evaluating when condition
free SP<__wolin_reg2>, #1 // for condition result
free SP<__wolin_reg1>, #1
// SAFE INFER TOP: __wolin_reg0: uword = 0 -> no change
free SP<__wolin_reg0>, #2 // for block level expression when(b){\n1->c++\n2->c--\nelse->c=0\n}, type = uword
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
label __wolin_pl_qus_wolin_test_twoBytesLongArray
alloc 0[ptr]  // pl.qus.wolin.test.twoBytesLongArray
label __wolin_pl_qus_wolin_test_c
alloc 0[uword]  // pl.qus.wolin.test.c
label __wolin_pl_qus_wolin_test_b
alloc 0[ubyte]  // pl.qus.wolin.test.b
label __wolin_pl_qus_wolin_test_d
alloc 0[uword]  // pl.qus.wolin.test.d
label __wolin_pl_qus_wolin_test_oneByteLongArray
alloc 0[ptr]  // pl.qus.wolin.test.oneByteLongArray
label __wolin_pl_qus_wolin_test_fastArray
alloc 0[ptr]  // pl.qus.wolin.test.fastArray
