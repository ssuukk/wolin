setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
// inicjalizacja zmiennej pl.qus.wolin.znak
// Using already known __wolin_reg0
alloc SP<__wolin_reg0>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg0>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg0: ubyte = 0 (for var init expression) -> no change
let __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.znak
free SP<__wolin_reg0>, #1 // for var init expression
// inicjalizacja zmiennej pl.qus.wolin.i
// Using already known __wolin_reg1
alloc SP<__wolin_reg1>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg1>[ubyte] = #0[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg1: ubyte = 0 (for var init expression) -> no change
let __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = SP(0)<__wolin_reg1>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.i
free SP<__wolin_reg1>, #1 // for var init expression
//  main function entry
goto __wolin_pl_qus_wolin_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.allocMem():Any
// ****************************************
label __wolin_pl_qus_wolin_allocMem
// Using already known __wolin_reg2
alloc SP<__wolin_reg2>, #2 // for block 'return value' {\nreturn30000\n}
// Using already known __wolin_reg3
alloc SP<__wolin_reg3>, #2 // for expression
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg3>[ptr] = #30000[uword] // atomic ex
let SPF(4)<returnValue>[ptr] = SP(0)<__wolin_reg3>[ptr] // przez sprawdzacz typow - jump expression
// switchType to:Any by return expression
// SAFE INFER TOP: __wolin_reg3: Any = 65535 (for expression) -> no change
free SP<__wolin_reg3>, #2 // for expression
free SP<__wolin_reg2>, #2 // for block 'return value' {\nreturn30000\n}, type = Any
free SPF, #4 // free fn arguments and locals for pl.qus.wolin.allocMem
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret


// ****************************************
// konstruktor: fun pl.qus.wolin.Test():pl.qus.wolin.Test
// ****************************************
label __wolin_pl_qus_wolin_Test

// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #2 // for returning this
// switchType to:pl.qus.wolin.Test* by function type 1
// SAFE INFER TOP: __wolin_reg4: pl.qus.wolin.Test* = 0 (for returning this) -> no change
//  otwarcie stosu na wywolanie pl.qus.wolin.allocMem
alloc SPF, #6
//  tu podajemy argumenty dla pl.qus.wolin.allocMem
//  let pl.qus.wolin.allocMem.size = #3
let SPF(2)[uword] = #3[uword]
//  let pl.qus.wolin.allocMem.count = #1
let SPF(0)[uword] = #1[uword]
//  po argumentach dla pl.qus.wolin.allocMem
call __wolin_pl_qus_wolin_allocMem[adr]
let SP(0)<__wolin_reg4>[ptr] = SPF(0)<returnValue>[ptr]
free SPF <Any>, #2 // free return value of pl.qus.wolin.allocMem from call stack
//  tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora
let SPF(0)<pl.qus.wolin.Test.returnValue>[ptr] = SP(0)<__wolin_reg4>[ptr] // przez sprawdzacz typow - zwrotka alloc do zwrotki konstruktora
setup HEAP = SP(0)<__wolin_reg4>[ptr]
free SP<__wolin_reg4>, #2 // for returning this
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.Test
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// inicjalizacja zmiennej pl.qus.wolin.Test.x
// Using already known __wolin_reg5
alloc SP<__wolin_reg5>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[ubyte] = #10[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg5: ubyte = 0 (for var init expression) -> no change
let HEAP(2)<pl.qus.wolin.Test.x>[ubyte] = SP(0)<__wolin_reg5>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.x
free SP<__wolin_reg5>, #1 // for var init expression
// inicjalizacja zmiennej pl.qus.wolin.Test.y
// Using already known __wolin_reg6
alloc SP<__wolin_reg6>, #1 // for var init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg6>[ubyte] = #20[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg6: ubyte = 0 (for var init expression) -> no change
let HEAP(1)<pl.qus.wolin.Test.y>[ubyte] = SP(0)<__wolin_reg6>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.Test.y
free SP<__wolin_reg6>, #1 // for var init expression
// return from constructor
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.suma():ubyte
// ****************************************
label __wolin_pl_qus_wolin_suma
// Using already known __wolin_reg7
// Using already known __wolin_reg8
alloc SP<__wolin_reg8>, #1 // for expression
let SP(0)<__wolin_reg8>[ubyte] = SPF(0)<pl.qus.wolin.suma.a>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.suma.a
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 (for expression) -> no change
// Using already known __wolin_reg9
alloc SP<__wolin_reg9>, #1 // RIGHT adding operator
let SP(0)<__wolin_reg9>[ubyte] = SPF(1)<pl.qus.wolin.suma.b>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.suma.b
// SAFE INFER TOP: __wolin_reg9: ubyte = 0 (RIGHT adding operator) -> no change
add SP(1)<__wolin_reg8>[ubyte] = SP(1)<__wolin_reg8>[ubyte], SP(0)<__wolin_reg9>[ubyte]
free SP<__wolin_reg9>, #1 // RIGHT adding operator
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 (for expression) -> no change
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg8>[ubyte] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
// SAFE INFER TOP: __wolin_reg8: ubyte = 0 (for expression) -> no change
free SP<__wolin_reg8>, #1 // for expression
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.suma
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
// Using already known __wolin_reg10
// Using already known __wolin_reg11
// Using already known __wolin_reg12
alloc SP<__wolin_reg12>, #1 // for while condition
label __wolin_lab_loopStart_1
// Using already known __wolin_reg13
alloc SP<__wolin_reg13>, #2 // LEFT for <
let SP(0)<__wolin_reg13>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // simple id from var
// switchType to:uword by type from pl.qus.wolin.i
// SAFE INFER TOP: __wolin_reg13: uword = 0 (LEFT for <) -> no change
// Using already known __wolin_reg14
alloc SP<__wolin_reg14>, #2 // RIGHT for <
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg14>[uword] = #1000[uword] // atomic ex
// SAFE INFER TOP: __wolin_reg14: uword = 0 (RIGHT for <) -> no change
evalless SP(4)<__wolin_reg12>[bool] = SP(2)<__wolin_reg13>[uword], SP(0)<__wolin_reg14>[uword]
free SP<__wolin_reg14>, #2 // RIGHT for <
free SP<__wolin_reg13>, #2 // LEFT for <
// SAFE INFER TOP: __wolin_reg12: bool = 0 (for while condition) -> no change
bne SP(0)<__wolin_reg12>[bool] = #1[bool], __wolin_lab_loopEnd_1<label_po_if>[adr]
// Using already known __wolin_reg15
// Using already known __wolin_reg16
//  lewa strona assignment
// Using already known __wolin_reg17
alloc SP<__wolin_reg17>, #2 // For assignment left side
//  left side disjunction - prawie dobrze
// Using already known __wolin_reg18
alloc SP<__wolin_reg18>, #2 // arr_deref
//  LEWA strona array access, czyli co to za zmienna
let SP(0)<__wolin_reg18>[ptr] = 1024[ptr] // simple id from fixed array var
// switchType to:ubyte* by type from pl.qus.wolin.ekran
//  PRAWA strona array access, czyli indeks w nawiasach
// Using already known __wolin_reg19
alloc SP<__wolin_reg19>, #2 // For calculating index
let SP(0)<__wolin_reg19>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword] = __wolin_pl_qus_wolin_i<pl.qus.wolin.i>[uword], #1[uword] // simple id
// switchType to:uword by ++ operator
// FORCE TOP: __wolin_reg19: uword = 0 (For calculating index) -> uword
//  long index, single byte per element array
add SP(2)<__wolin_reg18>[ptr] = SP(2)<__wolin_reg18>[ptr], SP(0)<__wolin_reg19>[uword]
free SP<__wolin_reg19>, #2 // For calculating index
// **ARRAY Changing current type to prevReg type __wolin_reg18: ubyte* = 0 (arr_deref)
//  after index
// dereference value at topRegister
//  kod obsługi tablicy
//  non-fast array, changing top reg to ptr
let SP(2)<__wolin_reg17>[ptr] = SP(0)<__wolin_reg18>[ptr]
free SP<__wolin_reg18>, #2 // arr_deref
// SAFE INFER TOP: __wolin_reg17: ubyte* = 0 (For assignment left side) -> no change
//  prawa strona assignment
// Using already known __wolin_reg20
alloc SP<__wolin_reg20>, #1 // for value that gets assigned to left side
let SP(0)<__wolin_reg20>[ubyte] = __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] // przez sprawdzacz typow - operator ++
add __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte] = __wolin_pl_qus_wolin_znak<pl.qus.wolin.znak>[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
let SP(1)<__wolin_reg17>[ptr] = SP(0)<__wolin_reg20>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg20>, #1 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg17>, #2 // For assignment left side
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg16: unit = 65535 (for expression) -> no change
goto __wolin_lab_loopStart_1[adr]
label __wolin_lab_loopEnd_1
free SP<__wolin_reg12>, #1 // for while condition
// SAFE INFER TOP: __wolin_reg11: unit = 65535 (for expression) -> no change
// Using already known __wolin_reg21
alloc SP<__wolin_reg21>, #1 // for declaration valx:ubyte=suma(2,2)
// Using already known __wolin_reg22
alloc SP<__wolin_reg22>, #1 // for var init expression
// switchType to:ubyte by function type 1
// SAFE INFER TOP: __wolin_reg22: ubyte = 0 (for var init expression) -> no change
alloc SPF, #3
//  obsługa argumentu 0 wywołania suma
// Using already known __wolin_reg23
alloc SP<__wolin_reg23>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 2
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg23>[ubyte] = #2[ubyte] // atomic ex
// po visit value
let SPF(0)[ubyte] = SP(0)<__wolin_reg23>[ubyte]
free SP<__wolin_reg23>, #1 // for call argument 0, type = ubyte
//  obsługa argumentu 1 wywołania suma
// Using already known __wolin_reg24
alloc SP<__wolin_reg24>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 2
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg24>[ubyte] = #2[ubyte] // atomic ex
// po visit value
let SPF(1)[ubyte] = SP(0)<__wolin_reg24>[ubyte]
free SP<__wolin_reg24>, #1 // for call argument 1, type = ubyte
// switchType to:ubyte by function type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_suma[adr]

let SP(0)<__wolin_reg22>[ubyte] = SPF(0)<returnValue>[ubyte]// copy return parameter - TODO sprawdzić co jeśli wywołanie funkcji było bez podstawienia!!!
free SPF <ubyte>, #1
// SAFE INFER TOP: __wolin_reg22: ubyte = 0 (for var init expression) -> no change
let SPF(0)<pl.qus.wolin.main..x>[ubyte] = SP(0)<__wolin_reg22>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.main..x
free SP<__wolin_reg22>, #1 // for var init expression
// SAFE INFER TOP: __wolin_reg21: ubyte = 0 (for declaration valx:ubyte=suma(2,2)) -> no change
free SP<__wolin_reg21>, #1 // for declaration valx:ubyte=suma(2,2)
free SPF, #1 // free fn arguments and locals for pl.qus.wolin.main
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
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
label __wolin_pl_qus_wolin_znak
alloc 0[ubyte]  // pl.qus.wolin.znak
label __wolin_pl_qus_wolin_i
alloc 0[uword]  // pl.qus.wolin.i
