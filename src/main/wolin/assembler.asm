setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
//  main function entry
goto __wolin_pl_qus_wolin_main[adr]
// Using already known __wolin_reg0
alloc SP<__wolin_reg0>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg0: ubyte = 0 (for var init expression) -> no change
let __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej znak
free SP<__wolin_reg0>, #1 // for var init expression
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
// Using already known __wolin_reg1
// Using already known __wolin_reg2
//  lewa strona assignment
// Using already known __wolin_reg3
alloc SP<__wolin_reg3>, #2 // For assignment left side
// switchType to:uword by by znajdźSimpleIdW
// SAFE INFER TOP: __wolin_reg3: uword = 0 (For assignment left side) -> no change
//  prawa strona assignment
// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #2 // for value that gets assigned to left side
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[uword] = #0[ubyte] // atomic ex
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg4>[uword] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg4>, #2 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg3>, #2 // For assignment left side
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg2: unit = 65535 (for expression) -> no change
// Using already known __wolin_reg5
// Using already known __wolin_reg6
alloc SP<__wolin_reg6>, #1 // for while condition
label __wolin_lab_loopStart_1
// Using already known __wolin_reg7
alloc SP<__wolin_reg7>, #2 // LEFT for <
let SP(0)<__wolin_reg7>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // simple id from var
// switchType to:uword by type from pl.qus.wolin.i
// SAFE INFER TOP: __wolin_reg7: uword = 0 (LEFT for <) -> no change
// Using already known __wolin_reg8
alloc SP<__wolin_reg8>, #2 // RIGHT for <
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg8>[uword] = #1000[uword] // atomic ex
// SAFE INFER TOP: __wolin_reg8: uword = 0 (RIGHT for <) -> no change
evalless SP(4)<__wolin_reg6>[bool] = SP(2)<__wolin_reg7>[uword], SP(0)<__wolin_reg8>[uword]
free SP<__wolin_reg8>, #2 // RIGHT for <
free SP<__wolin_reg7>, #2 // LEFT for <
// SAFE INFER TOP: __wolin_reg6: bool = 0 (for while condition) -> no change
bne SP(0)<__wolin_reg6>[bool] = #1[bool], __wolin_lab_loopEnd_1<label_po_if>[adr]
// Using already known __wolin_reg9
// Using already known __wolin_reg10
//  lewa strona assignment
// Using already known __wolin_reg11
alloc SP<__wolin_reg11>, #2 // For assignment left side
//  left side disjunction - prawie dobrze
// Using already known __wolin_reg12
alloc SP<__wolin_reg12>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg12>[ptr] = 1024[ptr] // simple id from fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.ekran
//  PRAWA strona array access, czyli indeks w nawiasach
// Using already known __wolin_reg13
alloc SP<__wolin_reg13>, #2 // For calculating index
let SP(0)<__wolin_reg13>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword], #1[uword] // simple id
// switchType to:uword by ++ operator
// FORCE TOP: __wolin_reg13: uword = 0 (For calculating index) -> uword
//  long index, single byte per element array
add SP(2)<__wolin_reg12>[ptr] = SP(2)<__wolin_reg12>[ptr], SP(0)<__wolin_reg13>[uword]
free SP<__wolin_reg13>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg12: ubyte* = 0 (arr_deref)
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg11>[ptr] = SP(0)<__wolin_reg12>[ptr]
free SP<__wolin_reg12>, #2 // arr_deref
// SAFE INFER TOP: __wolin_reg11: ubyte* = 0 (For assignment left side) -> no change
//  prawa strona assignment
// Using already known __wolin_reg14
alloc SP<__wolin_reg14>, #1 // for value that gets assigned to left side
let SP(0)<__wolin_reg14>[ubyte] = __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
let SP(1)<__wolin_reg11>[ptr] = SP(0)<__wolin_reg14>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg14>, #1 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg11>, #2 // For assignment left side
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg10: unit = 65535 (for expression) -> no change
goto __wolin_lab_loopStart_1[adr]
label __wolin_lab_loopEnd_1
free SP<__wolin_reg6>, #1 // for while condition
// SAFE INFER TOP: __wolin_reg5: unit = 65535 (for expression) -> no change
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
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
label __wolin_pl_qus_wolin_znak
alloc 0[ubyte]  // pl.qus.wolin.znak
