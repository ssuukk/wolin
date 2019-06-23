setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
//  main function entry
goto __wolin_pl_qus_wolin_test_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.main():unit
// ****************************************
label __wolin_pl_qus_wolin_test_main
//  lewa strona assignment
// switchType to:bool by by znajdźSimpleIdW
//  prawa strona assignment
alloc SP<__wolin_reg2>, #1 // for value that gets assigned to left side
alloc SP<__wolin_reg3>, #1 // LEFT equality check: evaleq
let SP(0)<__wolin_reg3>[ubyte] = __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.b
alloc SP<__wolin_reg4>, #1 // RIGHT equality check: evaleq
let SP(0)<__wolin_reg4>[ubyte] = #5[ubyte] // atomic ex
evaleq SP(2)<__wolin_reg2>[bool] = SP(1)<__wolin_reg3>[ubyte], SP(0)<__wolin_reg4>[ubyte] // two sides
free SP<__wolin_reg4>, #1 // RIGHT equality check: evaleq
free SP<__wolin_reg3>, #1 // LEFT equality check: evaleq
let __wolin_pl_qus_wolin_test_x<pl.qus.wolin.test.x>[bool] = SP(0)<__wolin_reg2>[bool] // przez sprawdzacz typów
free SP<__wolin_reg2>, #1 // for value that gets assigned to left side, type = bool
// switchType to:unit by assignment
// inferTopOregType __wolin_reg0 -> unit
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
label __wolin_pl_qus_wolin_test_bo
alloc 1[bool]  // pl.qus.wolin.test.bo
label __wolin_pl_qus_wolin_test_w
alloc 0[ubyte]  // pl.qus.wolin.test.w
label __wolin_pl_qus_wolin_test_y
alloc 1[bool]  // pl.qus.wolin.test.y
label __wolin_pl_qus_wolin_test_x
alloc 1[bool]  // pl.qus.wolin.test.x
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
