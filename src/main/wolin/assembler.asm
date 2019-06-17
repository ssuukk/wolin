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
alloc SP<__wolin_reg1>, #2 // For assignment left side
let SP(0)<__wolin_reg1>[uword] = __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[ptr] // for assignment left side - TODO change SP(0)<__wolin_reg1>[uword] to ptr!
// switchType to:uword by by znajdźSimpleIdW
// setTopOregType to ptr
// inferTopOregType __wolin_reg1 -> uword
// prawa strona assignment
alloc SP<__wolin_reg2>, #2 // for value that gets assigned to left side
alloc SP<__wolin_reg3>, #2 // arr_deref
// LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg3>[ptr] = 5000[ptr] // simple id from fixed array var
// switchType to:uword by type from pl.qus.wolin.test.twoBytesBigArray
// PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg4>, #2 // For calculating index
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[uword] = #5[ubyte] // atomic ex
// setTopOregType to uword
// long index, multi-byte per element array
mul SP(0)<__wolin_reg4>[uword] = SP(0)<__wolin_reg4>[uword], #2
add SP(2)<__wolin_reg3>[ptr] = SP(2)<__wolin_reg3>[ptr], SP(0)<__wolin_reg4>[uword]
free SP<__wolin_reg4>, #2 // For calculating index
// after index
//dereference value at topRegister
// kod obsługi tablicy
// non-fast array
let SP(2)<__wolin_reg2>[uword] = SP(0)<__wolin_reg3>[ptr]
free SP<__wolin_reg3>, #2 // arr_deref
let __wolin_pl_qus_wolin_test_c<pl.qus.wolin.test.c>[uword] = SP(0)<__wolin_reg2>[uword] // przez sprawdzacz typów
// should be: let SP(2)<__wolin_reg1>[uword][ptr] = SP(0)<__wolin_reg2>[uword]
free SP<__wolin_reg2>, #2 // for value that gets assigned to left side, type = ubyte
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
label __wolin_pl_qus_wolin_test_oneByteSmallArray
alloc 0[ptr]  // pl.qus.wolin.test.oneByteSmallArray
label __wolin_pl_qus_wolin_test_oneByteBigArray
alloc 0[ptr]  // pl.qus.wolin.test.oneByteBigArray
label __wolin_pl_qus_wolin_test_c
alloc 0[uword]  // pl.qus.wolin.test.c
label __wolin_pl_qus_wolin_test_b
alloc 0[ubyte]  // pl.qus.wolin.test.b
