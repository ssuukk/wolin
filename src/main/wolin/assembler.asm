setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
//  main function entry
goto __wolin_pl_qus_wolin_test_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.main():unit
// ****************************************
label __wolin_pl_qus_wolin_test_main
alloc SP<__wolin_reg0>, #2 // for block level expression when(b){\n1->c++\n2->c--\n}
// When expression start
let SP(0)<__wolin_reg0>[uword] = __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.b
alloc SP<__wolin_reg1>, #1 // for condition result
alloc SP<__wolin_reg2>, #2 // for evaluating when condition
// When condition
// warunek
label __wolin_lab_whenLabel_0
let SP(0)<__wolin_reg2>[uword] = #1[ubyte] // atomic ex
// inferTopOregType __wolin_reg2 -> ubyte
evaleq SP(1)<__wolin_reg1>[bool] = SP(2)<__wolin_reg0>[uword], SP(0)<__wolin_reg2>[ubyte]
bne SP(1)<__wolin_reg1>[bool] = #1[bool], __wolin_lab_whenLabel_1[adr]
// when operacja
add __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword] = __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword], #1[byte] // simple id
// switchType to:uword by ++ operator
goto __wolin_lab_whenEndLabel_0[adr]
// When condition
// warunek
label __wolin_lab_whenLabel_1
let SP(0)<__wolin_reg2>[ubyte] = #2[ubyte] // atomic ex
// inferTopOregType __wolin_reg2 -> uword
evaleq SP(2)<__wolin_reg1>[bool] = SP(3)<__wolin_reg0>[uword], SP(0)<__wolin_reg2>[uword]
bne SP(2)<__wolin_reg1>[bool] = #1[bool], __wolin_lab_whenLabel_2[adr]
// when operacja
sub __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword] = __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword], #1[byte] // simple id
// switchType to:uword by -- operator
goto __wolin_lab_whenEndLabel_0[adr]
// When expression end
label __wolin_lab_whenEndLabel_0
free SP<__wolin_reg2>, #2 // for evaluating when condition
free SP<__wolin_reg1>, #1 // for condition result
// inferTopOregType __wolin_reg0 -> uword
free SP<__wolin_reg0>, #2 // for block level expression when(b){\n1->c++\n2->c--\n}, type = uword
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
