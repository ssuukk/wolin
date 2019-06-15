setup SPE = 155[ubyte], 53247[uword] // exception stack pointer at 155 = 53247 (was: datasette something)
setup EXPTR = 178[ubyte] // ptr to Exception object when exception occurs (was: datasette buffer)
setup CATCH = 253[ubyte] // jmp adddress for catch
setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 142[ubyte] // register stack top = 142
// main function entry
goto __wolin_pl_qus_wolin_test_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.allocMem(pl.qus.wolin.test.allocMem.size: uword = 0, pl.qus.wolin.test.allocMem.count: uword = 0):uword
// ****************************************
label __wolin_pl_qus_wolin_test_allocMem
alloc SP<__wolin_reg0>, #2 // for block level expression return12345
// switchType to:uword by guess number type
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg0>[uword] = #12345[uword] // atomic ex
let SPF(4)<pl.qus.wolin.test.allocMem.returnValue>[uword] = SP(0)<__wolin_reg0>[uword] // przez sprawdzacz typów
// switchType to:uword by return expression
// inferTopOregType __wolin_reg0 -> uword
free SP<__wolin_reg0>, #2 // for block level expression return12345, type = uword
free SPF, #4 // free fn arguments and locals for pl.qus.wolin.test.allocMem
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration
// switchType to:uword by guess number type
// switchType to:uword by parse literal constant

// ****************************************
// funkcja: fun pl.qus.wolin.test.setLfs(pl.qus.wolin.test.setLfs.lfn: ubyte = 0, pl.qus.wolin.test.setLfs.channel: ubyte = 0, pl.qus.wolin.test.setLfs.dev: ubyte = 0):unit
// ****************************************
label __wolin_pl_qus_wolin_test_setLfs

// switchType to:unit by function declaration
// switchType to:uword by guess number type
// switchType to:uword by parse literal constant

// ****************************************
// funkcja: fun pl.qus.wolin.test.setNam(pl.qus.wolin.test.setNam.len: ubyte = 0, pl.qus.wolin.test.setNam.name: word = 0):unit
// ****************************************
label __wolin_pl_qus_wolin_test_setNam

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.testThrow(pl.qus.wolin.test.testThrow.arg1: uword = 0, pl.qus.wolin.test.testThrow.arg2: uword = 0):unit
// ****************************************
label __wolin_pl_qus_wolin_test_testThrow
alloc SP<__wolin_reg1>, #2 // for block level expression throw12345
// switchType to:uword by guess number type
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg1>[uword] = #12345[uword] // atomic ex
throw SP(0)[uword] // nie martwimy sie o sotsy, bo te odtworzy obsluga wyjatku
// inferTopOregType __wolin_reg1 -> uword
free SP<__wolin_reg1>, #2 // for block level expression throw12345, type = uword
free SPF, #4 // free fn arguments and locals for pl.qus.wolin.test.testThrow
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.testCatch():unit
// ****************************************
label __wolin_pl_qus_wolin_test_testCatch
// try
alloc SP<catch_addr>, #2 // catch block entry point
let SP(0)[uword] = __wolin_lab_catch_block_start_0[uword]
call __wolin_create_exception_entry[adr]
// switchType to:unit by function type 1
// inferTopOregType __wolin_reg3 -> unit
alloc SPF, #4
// obsługa argumentu 0 wywołania testThrow
alloc SP<__wolin_reg4>, #2 // for call argument 0
//Prze visit vALUE
// obliczenia dla parametru 4
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[uword] = #4[ubyte] // atomic ex
//po visit value
let SPF(2)[uword] = SP(0)<__wolin_reg4>[uword]
free SP<__wolin_reg4>, #2 // for call argument 0, type = uword
// obsługa argumentu 1 wywołania testThrow
alloc SP<__wolin_reg5>, #2 // for call argument 1
//Prze visit vALUE
// obliczenia dla parametru 2
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg5>[uword] = #2[ubyte] // atomic ex
//po visit value
let SPF(0)[uword] = SP(0)<__wolin_reg5>[uword]
free SP<__wolin_reg5>, #2 // for call argument 1, type = uword
// switchType to:unit by function type 2
// switchType to:unit by function call
call __wolin_pl_qus_wolin_test_testThrow[adr]

free SPF <unit>, #0
// inferTopOregType __wolin_reg3 -> unit
free SPE, #5 // remove exception table entry
goto __wolin_lab_after_catch_block_end_0[adr]

// catch
label __wolin_lab_catch_block_start_0
// lewa strona
// setTopOregType to ptr
// inferTopOregType __wolin_reg7 -> unit
// prawa strona
alloc SP<__wolin_reg8>, #2 // for assigned value
// switchType to:uword by guess number type
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg8>[uword] = #51965[uword] // atomic ex
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[uword] = SP(0)<__wolin_reg8>[uword] // przez sprawdzacz typów
// inferTopOregType __wolin_reg8 -> uword
free SP<__wolin_reg8>, #2 // for assigned variable, type = uword
// switchType to:unit by assignment
// inferTopOregType __wolin_reg6 -> unit

// catch end
label __wolin_lab_after_catch_block_end_0
// inferTopOregType __wolin_reg2 -> unit
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.testIf():unit
// ****************************************
label __wolin_pl_qus_wolin_test_testIf
alloc SP<__wolin_reg9>, #1 // for block level expression if(tlo==2)\nb=50000\nelseif(tlo==3)\nb=50001\nelse\ntlo++
alloc SP<__wolin_reg10>, #1 // equality result
// początek equality - lewa noga
// lewa strona com
alloc SP<__wolin_reg11>, #1 // for comp left side
let SP(0)<__wolin_reg11>[ubyte] = 53281[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.tlo
// inferTopOregType __wolin_reg11 -> ubyte
// prawa strona
alloc SP<__wolin_reg12>, #1 // for comp right side
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg12>[ubyte] = #2[ubyte] // atomic ex
// inferTopOregType __wolin_reg12 -> ubyte
evaleq SP(2)<__wolin_reg10>[bool] = SP(1)<__wolin_reg11>[ubyte], SP(0)<__wolin_reg12>[ubyte] // two sides
free SP<__wolin_reg12>, #1 // for comp right side, type =ubyte
free SP<__wolin_reg11>, #1 // for comp left side, type =ubyte
// setTopOregType to bool
// koniec equality
bne SP(0)<__wolin_reg10>[bool] = #1[bool], __wolin_lab_afterIfExpression_1<label_DO_else>[uword]
// body dla true
// lewa strona
alloc SP<__wolin_reg13>, #1 // For assignment left side
// setTopOregType to ptr
// inferTopOregType __wolin_reg13 -> ubyte
// prawa strona
alloc SP<__wolin_reg14>, #2 // for assigned value
// switchType to:uword by guess number type
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg14>[uword] = #50000[uword] // atomic ex
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[uword] = SP(0)<__wolin_reg14>[uword] // przez sprawdzacz typów
// inferTopOregType __wolin_reg14 -> uword
free SP<__wolin_reg14>, #2 // for assigned variable, type = uword
free SP<__wolin_reg13>, #1 // For assignment left side
label __wolin_lab_afterIfExpression_1
// body dla false/else
alloc SP<__wolin_reg15>, #1 // equality result
// początek equality - lewa noga
// lewa strona com
alloc SP<__wolin_reg16>, #1 // for comp left side
let SP(0)<__wolin_reg16>[ubyte] = 53281[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.tlo
// inferTopOregType __wolin_reg16 -> ubyte
// prawa strona
alloc SP<__wolin_reg17>, #1 // for comp right side
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg17>[ubyte] = #3[ubyte] // atomic ex
// inferTopOregType __wolin_reg17 -> ubyte
evaleq SP(2)<__wolin_reg15>[bool] = SP(1)<__wolin_reg16>[ubyte], SP(0)<__wolin_reg17>[ubyte] // two sides
free SP<__wolin_reg17>, #1 // for comp right side, type =ubyte
free SP<__wolin_reg16>, #1 // for comp left side, type =ubyte
// setTopOregType to bool
// koniec equality
bne SP(0)<__wolin_reg15>[bool] = #1[bool], __wolin_lab_afterIfExpression_1<label_DO_else>[uword]
// body dla true
// lewa strona
alloc SP<__wolin_reg18>, #1 // For assignment left side
// setTopOregType to ptr
// inferTopOregType __wolin_reg18 -> ubyte
// prawa strona
alloc SP<__wolin_reg19>, #2 // for assigned value
// switchType to:uword by guess number type
// switchType to:uword by parse literal constant
let SP(0)<__wolin_reg19>[uword] = #50001[uword] // atomic ex
let __wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[uword] = SP(0)<__wolin_reg19>[uword] // przez sprawdzacz typów
// inferTopOregType __wolin_reg19 -> uword
free SP<__wolin_reg19>, #2 // for assigned variable, type = uword
free SP<__wolin_reg18>, #1 // For assignment left side
label __wolin_lab_afterIfExpression_1
// body dla false/else
add 53281[ubyte] = 53281[ubyte], #1[byte] // simple id
// switchType to:ubyte by ++ operator
free SP<__wolin_reg15>, #1 // equality result
free SP<__wolin_reg10>, #1 // equality result
// inferTopOregType __wolin_reg9 -> ubyte
free SP<__wolin_reg9>, #1 // for block level expression if(tlo==2)\nb=50000\nelseif(tlo==3)\nb=50001\nelse\ntlo++, type = ubyte
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.testWhile1():unit
// ****************************************
label __wolin_pl_qus_wolin_test_testWhile1
alloc SP<__wolin_reg20>, #1 // for block level expression do{\ntlo++\nbreak\n}while(tlo==10)
label __wolin_lab_loopStart_1
// setTopOregType to bool
alloc SP<__wolin_reg21>, #1 // for block level expression tlo++
add 53281[ubyte] = 53281[ubyte], #1[byte] // simple id
// switchType to:ubyte by ++ operator
// inferTopOregType __wolin_reg21 -> ubyte
free SP<__wolin_reg21>, #1 // for block level expression tlo++, type = ubyte
goto __wolin_lab_loopEnd_1[adr]
// switchType to:unit by break expression
// inferTopOregType __wolin_reg22 -> unit
// początek equality - lewa noga
// lewa strona com
alloc SP<__wolin_reg23>, #1 // for comp left side
let SP(0)<__wolin_reg23>[ubyte] = 53281[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.tlo
// inferTopOregType __wolin_reg23 -> ubyte
// prawa strona
alloc SP<__wolin_reg24>, #1 // for comp right side
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg24>[ubyte] = #10[ubyte] // atomic ex
// inferTopOregType __wolin_reg24 -> ubyte
evaleq SP(2)<__wolin_reg20>[bool] = SP(1)<__wolin_reg23>[ubyte], SP(0)<__wolin_reg24>[ubyte] // two sides
free SP<__wolin_reg24>, #1 // for comp right side, type =ubyte
free SP<__wolin_reg23>, #1 // for comp left side, type =ubyte
// setTopOregType to bool
// koniec equality
beq SP(0)<__wolin_reg20>[bool] = #1[bool], __wolin_lab_loopStart_1<label_po_if>[uword]
label __wolin_lab_loopEnd_1
// inferTopOregType __wolin_reg20 -> ubyte
free SP<__wolin_reg20>, #1 // for block level expression do{\ntlo++\nbreak\n}while(tlo==10), type = ubyte
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.testWhile2():unit
// ****************************************
label __wolin_pl_qus_wolin_test_testWhile2
alloc SP<__wolin_reg25>, #1 // for block level expression while(tlo<10){\ntlo++\nif(tlo<5)\ncontinue\n\nramka++\n}
label __wolin_lab_loopStart_2
// setTopOregType to bool
//=================================
alloc SP<__wolin_reg26>, #1 // for LNAGLE left calculation
// lewy namedInfix: co?
let SP(0)<__wolin_reg26>[ubyte] = 53281[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.tlo
// inferTopOregType __wolin_reg26 -> ubyte
// prawy namedInfix: od czego?
alloc SP<__wolin_reg27>, #1 // for LNAGLE right calculation
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg27>[ubyte] = #10[ubyte] // atomic ex
// inferTopOregType __wolin_reg27 -> ubyte
evalless SP(2)<__wolin_reg25>[bool] = SP(1)<__wolin_reg26>[ubyte], SP(0)<__wolin_reg27>[ubyte]
free SP<__wolin_reg27>, #1 // for LNAGLE right calculation
free SP<__wolin_reg26>, #1 // for LNAGLE left calculation
//=================================
bne SP(0)<__wolin_reg25>[bool] = #1[bool], __wolin_lab_loopEnd_2<label_po_if>[uword]
alloc SP<__wolin_reg28>, #1 // for block level expression tlo++
add 53281[ubyte] = 53281[ubyte], #1[byte] // simple id
// switchType to:ubyte by ++ operator
// inferTopOregType __wolin_reg28 -> ubyte
free SP<__wolin_reg28>, #1 // for block level expression tlo++, type = ubyte
alloc SP<__wolin_reg30>, #1 // equality result
//=================================
alloc SP<__wolin_reg31>, #1 // for LNAGLE left calculation
// lewy namedInfix: co?
let SP(0)<__wolin_reg31>[ubyte] = 53281[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.tlo
// inferTopOregType __wolin_reg31 -> ubyte
// prawy namedInfix: od czego?
alloc SP<__wolin_reg32>, #1 // for LNAGLE right calculation
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg32>[ubyte] = #5[ubyte] // atomic ex
// inferTopOregType __wolin_reg32 -> ubyte
evalless SP(2)<__wolin_reg30>[bool] = SP(1)<__wolin_reg31>[ubyte], SP(0)<__wolin_reg32>[ubyte]
free SP<__wolin_reg32>, #1 // for LNAGLE right calculation
free SP<__wolin_reg31>, #1 // for LNAGLE left calculation
//=================================
bne SP(0)<__wolin_reg30>[bool] = #1[bool], __wolin_lab_afterIfExpression_3<label_po_if>[uword]
// body dla true
goto __wolin_lab_loopStart_2[adr]
// switchType to:unit by continue expression
// label po if
label __wolin_lab_afterIfExpression_3
free SP<__wolin_reg30>, #1 // equality result
// inferTopOregType __wolin_reg29 -> unit
alloc SP<__wolin_reg33>, #1 // for block level expression ramka++
add 53280[ubyte] = 53280[ubyte], #1[byte] // simple id
// switchType to:ubyte by ++ operator
// inferTopOregType __wolin_reg33 -> ubyte
free SP<__wolin_reg33>, #1 // for block level expression ramka++, type = ubyte
goto __wolin_lab_loopStart_2[adr]
label __wolin_lab_loopEnd_2
// inferTopOregType __wolin_reg25 -> ubyte
free SP<__wolin_reg25>, #1 // for block level expression while(tlo<10){\ntlo++\nif(tlo<5)\ncontinue\n\nramka++\n}, type = ubyte
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.testIncrement():unit
// ****************************************
label __wolin_pl_qus_wolin_test_testIncrement
alloc SP<__wolin_reg34>, #1 // for block level expression tlo++
add 53281[ubyte] = 53281[ubyte], #1[byte] // simple id
// switchType to:ubyte by ++ operator
// inferTopOregType __wolin_reg34 -> ubyte
free SP<__wolin_reg34>, #1 // for block level expression tlo++, type = ubyte
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.testSum(pl.qus.wolin.test.testSum.arg1: ubyte = 0, pl.qus.wolin.test.testSum.arg2: ubyte = 0):ubyte
// ****************************************
label __wolin_pl_qus_wolin_test_testSum
alloc SP<__wolin_reg35>, #1 // for block level expression returnarg1+arg2
// lewa strona
let SP(0)<__wolin_reg35>[ubyte] = SPF(1)<pl.qus.wolin.test.testSum.arg1>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.testSum.arg1
// prawa strona
alloc SP<__wolin_reg36>, #1 // for right side
let SP(0)<__wolin_reg36>[ubyte] = SPF(0)<pl.qus.wolin.test.testSum.arg2>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.testSum.arg2
add SP(1)<__wolin_reg35>[ubyte] = SP(1)<__wolin_reg35>[ubyte], SP(0)<__wolin_reg36>[ubyte] // two sides
// inferTopOregType __wolin_reg36 -> ubyte
free SP<__wolin_reg36>, #1 // for right side, type =ubyte
let SPF(2)<pl.qus.wolin.test.testSum.returnValue>[ubyte] = SP(0)<__wolin_reg35>[ubyte] // przez sprawdzacz typów
// switchType to:ubyte by return expression
// inferTopOregType __wolin_reg35 -> ubyte
free SP<__wolin_reg35>, #1 // for block level expression returnarg1+arg2, type = ubyte
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.test.testSum
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret


// ****************************************
// konstruktor: fun pl.qus.wolin.test.Dupa():pl.qus.wolin.test.Dupa
// ****************************************
label __wolin_pl_qus_wolin_test_Dupa

alloc SP<__wolin_reg37>, #2 // for returning this
// switchType to:uword by function type 1
// inferTopOregType __wolin_reg37 -> uword
// switchType to:uword by function type 2
// otwarcie stosu na wywolanie pl.qus.wolin.test.allocMem
alloc SPF, #6
// tu podajemy argumenty dla pl.qus.wolin.test.allocMem
// let pl.qus.wolin.test.allocMem.size = #3
let SPF(2)[uword] = #3[uword]
// let pl.qus.wolin.test.allocMem.count = #1
let SPF(0)[uword] = #1[uword]
// po argumentach dla pl.qus.wolin.test.allocMem
call __wolin_pl_qus_wolin_test_allocMem[adr]
let SP(0)<__wolin_reg37>[uword] = SPF(0)<returnValue>[uword] // przez sprawdzacz typów
free SPF <uword>, #2 // free return value of pl.qus.wolin.test.allocMem from call stack
// tutaj kod na przepisanie z powyższego rejestru do zwrotki konstruktora
let SPF(0)<pl.qus.wolin.test.Dupa.returnValue>[ptr] = SP(0)<__wolin_reg37>[uword] // przez sprawdzacz typów
ret
free SP<__wolin_reg37>, #2 // for returning this
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.Dupa.jakasFunkcja(pl.qus.wolin.test.Dupa.jakasFunkcja.this: pl.qus.wolin.test.Dupa = 65535):unit
// ****************************************
label __wolin_pl_qus_wolin_test_Dupa_jakasFunkcja
setup HEAP = this
// lewa strona
// setTopOregType to ptr
// inferTopOregType __wolin_reg39 -> unit
// prawa strona
alloc SP<__wolin_reg40>, #1 // for assigned value
// lewa strona
let SP(0)<__wolin_reg40>[ubyte] = HEAP(2)<pl.qus.wolin.test.Dupa.a>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.Dupa.a
// prawa strona
alloc SP<__wolin_reg41>, #1 // for right side
let SP(0)<__wolin_reg41>[ubyte] = HEAP(1)<pl.qus.wolin.test.Dupa.b>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.test.Dupa.b
add SP(1)<__wolin_reg40>[ubyte] = SP(1)<__wolin_reg40>[ubyte], SP(0)<__wolin_reg41>[ubyte] // two sides
// inferTopOregType __wolin_reg41 -> ubyte
free SP<__wolin_reg41>, #1 // for right side, type =ubyte
let 53281[ubyte] = SP(0)<__wolin_reg40>[ubyte] // przez sprawdzacz typów
// inferTopOregType __wolin_reg40 -> ubyte
free SP<__wolin_reg40>, #1 // for assigned variable, type = ubyte
// switchType to:unit by assignment
// inferTopOregType __wolin_reg38 -> unit
free SPF, #2 // free fn arguments and locals for pl.qus.wolin.test.Dupa.jakasFunkcja
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.main():unit
// ****************************************
label __wolin_pl_qus_wolin_test_main
// lewa strona
// setTopOregType to ptr
// inferTopOregType __wolin_reg43 -> unit
// prawa strona
alloc SP<__wolin_reg44>, #1 // for assigned value
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg44>[ubyte] = #43[ubyte] // atomic ex
let 53281[ubyte] = SP(0)<__wolin_reg44>[ubyte] // przez sprawdzacz typów
// inferTopOregType __wolin_reg44 -> ubyte
free SP<__wolin_reg44>, #1 // for assigned variable, type = ubyte
// switchType to:unit by assignment
// inferTopOregType __wolin_reg42 -> unit
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret


// ****************************************
// Library modules
// ****************************************

label __wolin_create_exception_entry
alloc SPE, #5
let SPE(0)[uword] = SP(0)[uword] // adres bloku catch, jeśli będzie exception
free SP, #2 //catch_addr
let SPE(2)[ubyte] = SPC[ubyte] // aktualny stos CPU, dwa odejmiemy od niego, jeśli będzie exception
let SPE(3)[ubyte] = SP[ubyte] // aktualny stos kotlinka
// TODO - sprawdzić czy jego też trzeba zmniejszyć, bo catch jest wewnątrz allokacji dla statementu!
ret

label __wolin_throw_exception
bne SPE = __wolin_spe_top, __wolin_process_exception // jesli mamy blok catch, to go obslugujemy
let __wolin_exception_ptr[ptr] = #0[uword]
crash

label __wolin_process_exception
let __wolin_spe_zp_vector[uword] = SPE(0)[uword] // pobieramy adres bloku catch i ustawimy go jako wektor
add SPE(2)[ubyte] = SPE(2)[ubyte], #2[ubyte] // stos zapamiętaliśmy w podprogramie, musimy go zmniejszyć o adres powrotny
let SPC[ubyte] = SPE(2)[ubyte] // przywrócenie stosu CPU, takiego jak był w bloku try
let SP[ubyte] = SPE(3)[ubyte] // przywrócenie stosu kotlinka
free SPE, #5
goto __wolin_spe_zp_vector[ptr]


// ****************************************
// LAMBDAS
// ****************************************


// ****************************************
// STATIC SPACE
// ****************************************
label __wolin_indirect_jsr
goto 65535[adr]
label __wolin_pl_qus_wolin_test_src
alloc 0[ubyte]  // pl.qus.wolin.test.src
label __wolin_pl_qus_wolin_test_dupa
alloc 65535[ptr]  // pl.qus.wolin.test.dupa
label __wolin_pl_qus_wolin_test_dst
alloc 0[ubyte]  // pl.qus.wolin.test.dst
label __wolin_pl_qus_wolin_test_b
alloc 0[uword]  // pl.qus.wolin.test.b
label __wolin_pl_qus_wolin_test_suma
alloc 0[ptr]  // pl.qus.wolin.test.suma
