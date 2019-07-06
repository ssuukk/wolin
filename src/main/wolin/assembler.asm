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
alloc SP<__wolin_reg1>, #2 // For assignment left side
//  left side disjunction - prawie dobrze
alloc SP<__wolin_reg2>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg2>[ptr] = __wolin_pl_qus_wolin_test_twoBytesLongArray<pl.qus.wolin.test.twoBytesLongArray>[ptr] // simple id from var
// switchType to:uword* by type from pl.qus.wolin.test.twoBytesLongArray
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg3>, #2 // For calculating index
let SP(0)<__wolin_reg3>[uword] = #400[uword] // atomic ex
// forceTopOregType to uword
//  long index, multi-byte per element array
mul SP(0)<__wolin_reg3>[uword] = SP(0)<__wolin_reg3>[uword], #2
add SP(2)<__wolin_reg2>[ptr] = SP(2)<__wolin_reg2>[ptr], SP(0)<__wolin_reg3>[uword]
free SP<__wolin_reg3>, #2 // For calculating index
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  non-fast array
let SP(2)<__wolin_reg1>[ptr] = SP(0)<__wolin_reg2>[ptr]
free SP<__wolin_reg2>, #2 // arr_deref
// inferTopOregType __wolin_reg1 -> uword*
//  prawa strona assignment
alloc SP<__wolin_reg4>, #2 // for value that gets assigned to left side
let SP(0)<__wolin_reg4>[uword] = #100[ubyte] // atomic ex
let SP(2)<__wolin_reg1>[ptr] = SP(0)<__wolin_reg4>[uword] // przez sprawdzacz typów
free SP<__wolin_reg4>, #2 // for value that gets assigned to left side, type = uword*
free SP<__wolin_reg1>, #2 // For assignment left side
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
