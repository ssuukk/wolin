setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
//  main function entry
goto __wolin_pl_qus_wolin_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
// Using already known __wolin_reg0
// Using already known __wolin_reg1
//  lewa strona assignment
// Using already known __wolin_reg2
alloc SP<__wolin_reg2>, #1 // For assignment left side
//  left side disjunction - prawie dobrze
// Using already known __wolin_reg3
alloc SP<__wolin_reg3>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg3>[ptr] = 1024[ptr] // simple id from fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.ekran
//  PRAWA strona array access, czyli indeks w nawiasach
// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #2 // For calculating index
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[uword] = #0[ubyte] // atomic ex
// FORCE TOP: __wolin_reg4: uword = 0 (For calculating index) -> uword
//  long index, single byte per element array
add SP(2)<__wolin_reg3>[ptr] = SP(2)<__wolin_reg3>[ptr], SP(0)<__wolin_reg4>[uword]
free SP<__wolin_reg4>, #2 // For calculating index
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg2>[ptr] = SP(0)<__wolin_reg3>[ptr]
free SP<__wolin_reg3>, #2 // arr_deref
//  prawa strona assignment
// Using already known __wolin_reg5
alloc SP<__wolin_reg5>, #1 // for value that gets assigned to left side
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[ubyte] = #65[ubyte] // atomic ex
let SP(1)<__wolin_reg2>[ptr] = SP(0)<__wolin_reg5>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg5>, #1 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg2>, #2 // For assignment left side
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg1: unit = 65535 (for expression) -> no change
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
