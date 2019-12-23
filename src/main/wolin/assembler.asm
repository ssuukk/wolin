setup HEADER
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 143[ubyte] // register stack top = 142
setup HEAP = 176[ubyte]
//  main function entry
//  otwarcie stosu na wywolanie pl.qus.wolin.main
alloc SPF, #2
//  tu podajemy argumenty dla pl.qus.wolin.main
//  po argumentach dla pl.qus.wolin.main
call __wolin_pl_qus_wolin_main[adr]
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.allocMem(pl.qus.wolin.allocMem.size: uword = 0 (), pl.qus.wolin.allocMem.count: uword = 0 ()):uword
// ****************************************
function __wolin_pl_qus_wolin_allocMem
alloc SP<__wolin_reg1>, #2 // for expression
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg1>[uword] = #30000[uword] // atomic ex
let SPF(4)<pl.qus.wolin.allocMem.__returnValue>[uword] = SP(0)<__wolin_reg1>[uword] // przez sprawdzacz typow - jump expression
// switchType to:uword by return expression
// top type already set: __wolin_reg1: uword = 0 (for expression)
free SP<__wolin_reg1>, #2 // for expression
free SPF<pl.qus.wolin.allocMem.__fnargs>, #4 // free fn arguments and locals for pl.qus.wolin.allocMem
// ***** fnDeclFreeStackAndRet usuwanie zwrotki pl.qus.wolin.allocMem ze stosu
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret


// ****************************************
// konstruktor: fun pl.qus.wolin.SummingClass():pl.qus.wolin.SummingClass
// ****************************************
function __wolin_pl_qus_wolin_SummingClass

alloc SP<__wolin_reg2>, #2 // for returning this
// switchType to:pl.qus.wolin.SummingClass* by function type 1
// top type already set: __wolin_reg2: pl.qus.wolin.SummingClass* = 0 (for returning this)
//  otwarcie stosu na wywolanie pl.qus.wolin.allocMem
alloc SPF, #6
//  tu podajemy argumenty dla pl.qus.wolin.allocMem
//  let pl.qus.wolin.allocMem.size = #3
let SPF(2)<pl.qus.wolin.allocMem.size>[uword] = #3[uword]
//  let pl.qus.wolin.allocMem.count = #1
let SPF(0)<pl.qus.wolin.allocMem.count>[uword] = #1[uword]
//  po argumentach dla pl.qus.wolin.allocMem
call __wolin_pl_qus_wolin_allocMem[adr]
let SP(0)<__wolin_reg2>[any*] = SPF(0)<pl.qus.wolin.allocMem.__returnValue>[uword]
//  tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora
let SPF(2)<pl.qus.wolin.SummingClass.__returnValue>[any*] = SP(0)<__wolin_reg2>[any*] // przez sprawdzacz typow - zwrotka alloc do zwrotki konstruktora
point HEAP = SP(0)<__wolin_reg2>[any*]
free SP<__wolin_reg2>, #2 // for returning this
// inicjalizacja zmiennej pl.qus.wolin.SummingClass.x
alloc SP<__wolin_reg3>, #1 // for var pl.qus.wolin.SummingClass.x init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg3>[ubyte] = #1[ubyte] // atomic ex
// top type already set: __wolin_reg3: ubyte = 0 (for var pl.qus.wolin.SummingClass.x init expression)
let HEAP(2)<pl.qus.wolin.SummingClass.x>[ubyte] = SP(0)<__wolin_reg3>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.SummingClass.x
free SP<__wolin_reg3>, #1 // for var pl.qus.wolin.SummingClass.x init expression
// inicjalizacja zmiennej pl.qus.wolin.SummingClass.y
alloc SP<__wolin_reg4>, #1 // for var pl.qus.wolin.SummingClass.y init expression
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte] = #1[ubyte] // atomic ex
// top type already set: __wolin_reg4: ubyte = 0 (for var pl.qus.wolin.SummingClass.y init expression)
let HEAP(1)<pl.qus.wolin.SummingClass.y>[ubyte] = SP(0)<__wolin_reg4>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej pl.qus.wolin.SummingClass.y
free SP<__wolin_reg4>, #1 // for var pl.qus.wolin.SummingClass.y init expression
// ***** fnDeclFreeStackAndRet usuwanie zwrotki pl.qus.wolin.SummingClass ze stosu
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.allocMem ze stosu
free SPF <pl.qus.wolin.allocMem.__returnValue>, #2 // free return value of pl.qus.wolin.allocMem from call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.allocMem ze stosu
// return from constructor
ret
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.SummingClass.sum(pl.qus.wolin.SummingClass.sum.this: pl.qus.wolin.SummingClass* = 0 ()):ubyte
// ****************************************
function __wolin_pl_qus_wolin_SummingClass_sum
point HEAP = this
alloc SP<__wolin_reg6>, #2 // for expression
let SP(0)<__wolin_reg6>[ubyte*] = *HEAP(2)<pl.qus.wolin.SummingClass.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.SummingClass.x
// top type already set: __wolin_reg6: ubyte* = 0 (for expression)
alloc SP<__wolin_reg7>, #2 // RIGHT adding operator
let SP(0)<__wolin_reg7>[ubyte*] = *HEAP(1)<pl.qus.wolin.SummingClass.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.SummingClass.y
// top type already set: __wolin_reg7: ubyte* = 0 (RIGHT adding operator)
add &SP(2)<__wolin_reg6>[ubyte*] = &SP(2)<__wolin_reg6>[ubyte*], &SP(0)<__wolin_reg7>[ubyte*]
free SP<__wolin_reg7>, #2 // RIGHT adding operator
// top type already set: __wolin_reg6: ubyte* = 0 (for expression)
let SPF(2)<pl.qus.wolin.SummingClass.sum.__returnValue>[ubyte] = &SP(0)<__wolin_reg6>[ubyte*] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
free SP<__wolin_reg6>, #2 // for expression
free SPF<pl.qus.wolin.SummingClass.sum.__fnargs>, #2 // free fn arguments and locals for pl.qus.wolin.SummingClass.sum
// ***** fnDeclFreeStackAndRet usuwanie zwrotki pl.qus.wolin.SummingClass.sum ze stosu
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// return from function body
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
function __wolin_pl_qus_wolin_main
// top type already set: __wolin_reg9: unit = 65535 (for declaration valobj:SummingClass)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg11>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg11: pl.qus.wolin.SummingClass* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg11>[any*] = SPF(0)<pl.qus.wolin.main..obj>[any*] // przez sprawdzacz typow - simple id from var
// switchType to:pl.qus.wolin.SummingClass* by type from pl.qus.wolin.main..obj
// top type already set: __wolin_reg11: pl.qus.wolin.SummingClass* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg12>, #2 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg12: pl.qus.wolin.SummingClass* = 0 (ASSIGNMENT value))
// switchType to:pl.qus.wolin.SummingClass* by function return type 1
// 
// == FN_CALL: pl.qus.wolin.SummingClass ========
alloc SPF, #2
// switchType to:pl.qus.wolin.SummingClass* by function return type 2
// switchType to:pl.qus.wolin.SummingClass* by function call
call __wolin_pl_qus_wolin_SummingClass[adr]

let SP(0)<__wolin_reg12>[any*] = SPF(0)<pl.qus.wolin.SummingClass.__returnValue>[any*] // przez sprawdzacz typow - copy return parameter
// == FN_CALL END: pl.qus.wolin.SummingClass ========
// 
let &SP(2)<__wolin_reg11>[any*] = &SP(0)<__wolin_reg12>[any*] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg12>, #2 // ASSIGNMENT value, type = pl.qus.wolin.SummingClass*
free SP<__wolin_reg11>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg10: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg14>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg14: ubyte* = 0 (ASSIGNMENT target))
//  deref: obiekt --------------------
alloc SP<__wolin_reg15>, #2 // dereference temp
let SP(0)<__wolin_reg15>[any*] = SPF(2)<pl.qus.wolin.main..obj>[any*] // przez sprawdzacz typow - simple id from var
// switchType to:pl.qus.wolin.SummingClass* by type from pl.qus.wolin.main..obj
point HEAP = SP(0)<__wolin_reg15>[any*]
// to jest klasa zmieniamy chwilowo aktualną
// jesli tak, to na gorze heapu jest uniqid klasy
//  deref: pole/metoda --------------------
alloc SP<__wolin_reg16>, #2 // deref register
//  postfix unary w dereferencji
let SP(0)<__wolin_reg16>[ubyte*] = *HEAP(2)<pl.qus.wolin.SummingClass.x>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.SummingClass.x
// tu przywrócić poprzednią klasę
// ==== KROK 1 memberAccessOperator: przypisanie aktualnego do czegoś --------------------
let SP(4)<__wolin_reg14>[ubyte*] = SP(0)<__wolin_reg16>[ubyte*] // przez sprawdzacz typow - dereferejcya, right side final = 1
free SP<__wolin_reg16>, #2 // deref register
free SP<__wolin_reg15>, #2 // dereference temp
//  deref: end deref --------------------
// top type already set: __wolin_reg14: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg17>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg17: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg17>[ubyte] = #2[ubyte] // atomic ex
let &SP(1)<__wolin_reg14>[ubyte*] = SP(0)<__wolin_reg17>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg17>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg14>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg13: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg19>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg19: ubyte* = 0 (ASSIGNMENT target))
//  deref: obiekt --------------------
alloc SP<__wolin_reg20>, #2 // dereference temp
let SP(0)<__wolin_reg20>[any*] = SPF(2)<pl.qus.wolin.main..obj>[any*] // przez sprawdzacz typow - simple id from var
// switchType to:pl.qus.wolin.SummingClass* by type from pl.qus.wolin.main..obj
point HEAP = SP(0)<__wolin_reg20>[any*]
// to jest klasa zmieniamy chwilowo aktualną
// jesli tak, to na gorze heapu jest uniqid klasy
//  deref: pole/metoda --------------------
alloc SP<__wolin_reg21>, #2 // deref register
//  postfix unary w dereferencji
let SP(0)<__wolin_reg21>[ubyte*] = *HEAP(1)<pl.qus.wolin.SummingClass.y>[ubyte] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte by type from pl.qus.wolin.SummingClass.y
// tu przywrócić poprzednią klasę
// ==== KROK 1 memberAccessOperator: przypisanie aktualnego do czegoś --------------------
let SP(4)<__wolin_reg19>[ubyte*] = SP(0)<__wolin_reg21>[ubyte*] // przez sprawdzacz typow - dereferejcya, right side final = 1
free SP<__wolin_reg21>, #2 // deref register
free SP<__wolin_reg20>, #2 // dereference temp
//  deref: end deref --------------------
// top type already set: __wolin_reg19: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg22>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg22: ubyte = 0 (ASSIGNMENT value))
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg22>[ubyte] = #4[ubyte] // atomic ex
let &SP(1)<__wolin_reg19>[ubyte*] = SP(0)<__wolin_reg22>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg22>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg19>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg18: unit = 65535 (for expression)
// 
// == ASSIGNMENT PUSH =======================================
// 
// == ASSIGNMENT LEFT =======================================
alloc SP<__wolin_reg24>, #2 // ASSIGNMENT target
// (do assignLeftSideVar przypisano __wolin_reg24: ubyte* = 0 (ASSIGNMENT target))
let SP(0)<__wolin_reg24>[ubyte*] = 53280[ubyte*] // przez sprawdzacz typow - simple id from var
// switchType to:ubyte* by type from pl.qus.wolin.border
// top type already set: __wolin_reg24: ubyte* = 0 (ASSIGNMENT target)
// == ASSIGNMENT RIGHT =======================================
alloc SP<__wolin_reg25>, #1 // ASSIGNMENT value
// (do assignRightSideFinalVar przypisano __wolin_reg25: ubyte = 0 (ASSIGNMENT value))
//  deref: obiekt --------------------
alloc SP<__wolin_reg26>, #2 // dereference temp
let SP(0)<__wolin_reg26>[any*] = SPF(2)<pl.qus.wolin.main..obj>[any*] // przez sprawdzacz typow - simple id from var
// switchType to:pl.qus.wolin.SummingClass* by type from pl.qus.wolin.main..obj
point HEAP = SP(0)<__wolin_reg26>[any*]
// to jest klasa zmieniamy chwilowo aktualną
// jesli tak, to na gorze heapu jest uniqid klasy
//  deref: pole/metoda --------------------
alloc SP<__wolin_reg27>, #1 // deref register
//  postfix unary w dereferencji
// switchType to:ubyte by function return type 1
// 
// == FN_CALL: pl.qus.wolin.SummingClass.sum ========
alloc SPF, #3
// == FN_CALL: ARG #THIS pl.qus.wolin.SummingClass.sum
let SPF(0)[any*] = SP(1)<__wolin_reg26>[any*]
// switchType to:ubyte by function return type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_SummingClass_sum[adr]

let SP(0)<__wolin_reg27>[ubyte] = SPF(0)<pl.qus.wolin.SummingClass.sum.__returnValue>[ubyte] // przez sprawdzacz typow - copy return parameter
// == FN_CALL END: pl.qus.wolin.SummingClass.sum ========
// 
// tu przywrócić poprzednią klasę
// ==== KROK 1 memberAccessOperator: przypisanie aktualnego do czegoś --------------------
let SP(3)<__wolin_reg25>[ubyte] = SP(0)<__wolin_reg27>[ubyte] // przez sprawdzacz typow - dereferejcya, right side final = 1
free SP<__wolin_reg27>, #1 // deref register
free SP<__wolin_reg26>, #2 // dereference temp
//  deref: end deref --------------------
let &SP(1)<__wolin_reg24>[ubyte*] = SP(0)<__wolin_reg25>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg25>, #1 // ASSIGNMENT value, type = ubyte
free SP<__wolin_reg24>, #2 // ASSIGNMENT target
// == ASSIGNMENT END =======================================
// == ASSIGNMENT POP =======================================
// 
// switchType to:unit by assignment
// top type already set: __wolin_reg23: unit = 65535 (for expression)
free SPF<pl.qus.wolin.main.__fnargs>, #1 // free fn arguments and locals for pl.qus.wolin.main
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
// freeing call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.SummingClass ze stosu
free SPF <pl.qus.wolin.SummingClass.__returnValue>, #2 // free return value of pl.qus.wolin.SummingClass from call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.SummingClass.sum ze stosu
free SPF <pl.qus.wolin.SummingClass.sum.__returnValue>, #1 // free return value of pl.qus.wolin.SummingClass.sum from call stack
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.SummingClass ze stosu
// ***** fnCallReleaseRet usuwanie zwrotki pl.qus.wolin.SummingClass.sum ze stosu
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
