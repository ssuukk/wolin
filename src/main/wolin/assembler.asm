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
//  left side disjunction - prawie dobrze
alloc SP<__wolin_reg2>, #1 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
// switchType to:ubyte by type from pl.qus.wolin.test.fastArray
//  PRAWA strona array access, czyli indeks w nawiasach
let SP(0)<__wolin_reg2>[ubyte] = #5[ubyte] // atomic ex
// forceTopOregType to ubyte
//  fast array - no additional op
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  allocated fast array
let SP(1)<__wolin_reg1>[ptr] = pl.qus.wolin.test.fastArray[ptr], SP(0)<__wolin_reg2>[ubyte]
free SP<__wolin_reg2>, #1 // arr_deref
let SP(0)<__wolin_reg1>[ptr] = __wolin_pl_qus_wolin_test_fastArray<pl.qus.wolin.test.fastArray>[ptr] // ONLY FOR NON-TRIVIAL LEFT SIDE ASSIGN - TODO change SP(0)<__wolin_reg1>[ptr] to ptr!
//  prawa strona assignment
let SP(0)<__wolin_reg3>[ptr] = #100[ubyte] // atomic ex
let SP(0)<__wolin_reg1>[ptr] = SP(0)<__wolin_reg3>[ptr] // przez sprawdzacz typów
let SP(0)<__wolin_reg1>[ptr] = SP(0)<__wolin_reg3>[ptr] // ONLY FOR NON-TRIVIAL LEFT SIDE ASSIGN
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
