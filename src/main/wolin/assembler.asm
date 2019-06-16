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
// setTopOregType to ptr
// inferTopOregType __wolin_reg1 -> unit
// prawa strona assignment
alloc SP<__wolin_reg2>, #1 // for assigned value
alloc SP<__wolin_reg3>, #2 // arr_deref
// LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg3>[ptr] = __wolin_pl_qus_wolin_test_array<pl.qus.wolin.test.array>[ptr] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.array
// PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg4>, #2 // For calculating index
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[uword] = #5[ubyte] // atomic ex
// setTopOregType to uword
// long index, single byte per element array
add SP(2)<__wolin_reg3>[ptr] = SP(2)<__wolin_reg3>[ptr], SP(0)<__wolin_reg4>[uword]
free SP<__wolin_reg4>, #2 // For calculating index
// after index
//dereference value at topRegister
// kod obsługi tablicy
let SP(2)<__wolin_reg2>[ubyte] = SP(0)<__wolin_reg3>[ptr]
free SP<__wolin_reg3>, #2 // arr_deref
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[ubyte] = SP(0)<__wolin_reg2>[ubyte] // przez sprawdzacz typów
// inferTopOregType __wolin_reg2 -> ubyte
free SP<__wolin_reg2>, #1 // for assigned variable, type = ubyte
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
label __wolin_pl_qus_wolin_test_array
alloc 0[ptr]  // pl.qus.wolin.test.array
label __wolin_pl_qus_wolin_test_b
alloc 0[ubyte]  // pl.qus.wolin.test.b
