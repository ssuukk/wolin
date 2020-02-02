setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 114[ubyte] // (było 143) register stack top = 142
setup HEAP = 176[ubyte]
// inicjalizacja zmiennej pl.qus.wolin.chr
alloc SP<__wolin_reg0>, #1 // for var pl.qus.wolin.chr init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg0: ubyte = 0 (for var pl.qus.wolin.chr init expression) location = null, null
let __wolin_pl_qus_wolin_chr<pl.qus.wolin.chr>[ubyte] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.chr
free SP<__wolin_reg0>, #1 // for var pl.qus.wolin.chr init expression
// inicjalizacja zmiennej pl.qus.wolin.i
alloc SP<__wolin_reg1>, #1 // for var pl.qus.wolin.i init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// top type already set: __wolin_reg1: ubyte = 0 (for var pl.qus.wolin.i init expression) location = null, null
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg1>, #1 // for var pl.qus.wolin.i init expression
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #0
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
ret
// switchType to:uword by parse literal constant
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg4>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg4: ubyte* = 0 (ASSIGNMENT target) location = null, null)
alloc SP<__wolin_reg5>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg5>[ubyte*] = *__wolin_pl_qus_wolin_string<pl.qus.wolin.string>[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.string
//  PRAWA strona array access, czyli indeks w nawiasach
alloc SP<__wolin_reg6>, #2 // For calculating index
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[uword] = #3[ubyte] // atomic ex
// FORCE TOP: __wolin_reg6: uword = 0 (For calculating index) location = null, null -> uword
add SP(2)<__wolin_reg5>[ubyte*] = SP(2)<__wolin_reg5>[ubyte*], &SP(0)<__wolin_reg6>[uword] // long index, single byte per element array (tutaj)
free SP<__wolin_reg6>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg5: ubyte* = 0 (arr_deref) location = null, null
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg4>[ubyte*] = SP(0)<__wolin_reg5>[ubyte*] // przez sprawdzacz typow - non-fast array
free SP<__wolin_reg5>, #2 // arr_deref
// top type already set: __wolin_reg4: ubyte* = 0 (ASSIGNMENT target) location = null, null
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg7>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg7: ubyte = 0 (ASSIGNMENT value) location = null, null)
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg7>[ubyte] = #65[ubyte] // atomic ex
let &SP(1)<__wolin_reg4>[ubyte*] = &SP(0)<__wolin_reg7>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg7>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg4>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg3: unit = 65535 (for expression) location = null, null
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret



// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
label __wolin_indirect_jsr
goto 65535[adr]
label __wolin_pl_qus_wolin_chr
alloc 0[ubyte]  // pl.qus.wolin.chr
label __wolin_pl_qus_wolin_string
alloc 0[ubyte*]  // pl.qus.wolin.string
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
