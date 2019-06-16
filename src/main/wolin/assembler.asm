setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 142[ubyte] // register stack top = 142
// main function entry
goto __wolin_pl_qus_wolin_test_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.main():unit
// ****************************************
label __wolin_pl_qus_wolin_test_main
// lewa strona assignment
alloc SP<__wolin_reg1>, #1 // For assignment left side
// switchType to:ubyte by by znajdźSimpleIdW
// setTopOregType to ptr
// inferTopOregType __wolin_reg1 -> ubyte
// prawa strona assignment
alloc SP<__wolin_reg2>, #1 // for value that gets assigned to left side
alloc SP<__wolin_reg3>, #1 // arr_deref
// LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte by type from pl.qus.wolin.test.oneByteSmallArray
// PRAWA strona array access, czyli indeks w nawiasach
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg3>[ubyte] = #5[ubyte] // atomic ex
// setTopOregType to ubyte
// fast array - no additional op
// after index
//dereference value at topRegister
// kod obsługi tablicy
// allocated fast array - warning - SP(0) cannot get optimized!!!
let SP(1)<__wolin_reg2>[ubyte] = pl.qus.wolin.test.oneByteSmallArray[ptr], SP(0)<__wolin_reg3>[ubyte]
free SP<__wolin_reg3>, #1 // arr_deref
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] = SP(0)<__wolin_reg2>[ubyte] // przez sprawdzacz typów
free SP<__wolin_reg2>, #1 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg1>, #1 // For assignment left side
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
label __wolin_pl_qus_wolin_test_twoBytesBigArray
alloc 0[ptr]  // pl.qus.wolin.test.twoBytesBigArray
label __wolin_pl_qus_wolin_test_oneByteBigArray
alloc 0[ptr]  // pl.qus.wolin.test.oneByteBigArray
label __wolin_pl_qus_wolin_test_c
alloc 0[uword]  // pl.qus.wolin.test.c
label __wolin_pl_qus_wolin_test_b
alloc 0[ubyte]  // pl.qus.wolin.test.b
label __wolin_pl_qus_wolin_test_oneByteSmallArray
alloc 0[ptr]  // pl.qus.wolin.test.oneByteSmallArray
