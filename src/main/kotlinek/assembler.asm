setup SPF = 251[ubyte], 40959[uword] // call stack pointer at 251 = 40959
setup SP = 142[ubyte] // register stack top = 142
// main function entry
goto __wolin_pl_qus_wolin_test_main[adr]
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.test.main():unit
// ****************************************
label __wolin_pl_qus_wolin_test_main
// lewa strona
// setTopOregType to ptr
// inferTopOregType __wolin_reg1 -> unit
// prawa strona
alloc SP<__wolin_reg2>, #1 // for assigned value
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg2>[ubyte] = #43[ubyte] // atomic ex
let 53281[ubyte] = SP(0)<__wolin_reg2>[ubyte] // przez sprawdzacz typów
// inferTopOregType __wolin_reg2 -> ubyte
free SP<__wolin_reg2>, #1 // for assigned variable, type = ubyte
// switchType to:unit by assignment
// inferTopOregType __wolin_reg0 -> unit
// lewa strona
// setTopOregType to ptr
// inferTopOregType __wolin_reg4 -> unit
// prawa strona
alloc SP<__wolin_reg5>, #2 // for assigned value
// switchType to:(ubyte,ubyte)->ubyte by lambda declaration
// inferTopOregType __wolin_reg5 -> (ubyte,ubyte)->ubyte
let SP(0)<__wolin_reg5>[ptr] = __wolin_lambda_function_0[adr]
let __wolin_pl_qus_wolin_test_suma<pl.qus.wolin.test.suma>[ptr] = SP(0)<__wolin_reg5>[ptr] // przez sprawdzacz typów
// inferTopOregType __wolin_reg5 -> (ubyte,ubyte)->ubyte
free SP<__wolin_reg5>, #2 // for assigned variable, type = (ubyte,ubyte)->ubyte
// switchType to:unit by assignment
// inferTopOregType __wolin_reg3 -> unit
// lewa strona
// setTopOregType to ptr
// inferTopOregType __wolin_reg8 -> unit
// prawa strona
alloc SP<__wolin_reg9>, #1 // for assigned value
// switchType to:ubyte by function type 1
// inferTopOregType __wolin_reg9 -> ubyte
alloc SPF, #3
// obsługa argumentu 0 wywołania suma
alloc SP<__wolin_reg10>, #1 // for call argument 0
//Prze visit vALUE
// obliczenia dla parametru 1
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg10>[ubyte] = #1[ubyte] // atomic ex
//po visit value
let SPF(1)[ubyte] = SP(0)<__wolin_reg10>[ubyte]
free SP<__wolin_reg10>, #1 // for call argument 0, type = ubyte
// obsługa argumentu 1 wywołania suma
alloc SP<__wolin_reg11>, #1 // for call argument 1
//Prze visit vALUE
// obliczenia dla parametru 2
// switchType to:ubyte by guess number type
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg11>[ubyte] = #2[ubyte] // atomic ex
//po visit value
let SPF(0)[ubyte] = SP(0)<__wolin_reg11>[ubyte]
free SP<__wolin_reg11>, #1 // for call argument 1, type = ubyte
// switchType to:ubyte by function type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_test_suma[ptr] // lambda call

let SP(0)<__wolin_reg9>[ubyte] = SPF(0)<returnValue>[ubyte]// copy return parameter - TODO sprawdzić co jeśli wywołanie funkcji było bez podstawienia!!!
free SPF <ubyte>, #1
let 53281[ubyte] = SP(0)<__wolin_reg9>[ubyte] // przez sprawdzacz typów
// inferTopOregType __wolin_reg9 -> ubyte
free SP<__wolin_reg9>, #1 // for assigned variable, type = ubyte
// switchType to:unit by assignment
// inferTopOregType __wolin_reg7 -> unit
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret



// ****************************************
// LAMBDAS
// ****************************************
// switchType to:unit by function declaration

// ****************************************
// lambda: lambda_function_0
// ****************************************
label __wolin_lambda_function_0
alloc SP<__wolin_reg12>, #1 // for block level expression a+b
// lewa strona
let SP(0)<__wolin_reg12>[ubyte] = SPF(1)<lambda_function_0.a>[ubyte] // simple id from var
// switchType to:ubyte by type from lambda_function_0.a
// prawa strona
alloc SP<__wolin_reg13>, #1 // for right side
let SP(0)<__wolin_reg13>[ubyte] = SPF(0)<lambda_function_0.b>[ubyte] // simple id from var
// switchType to:ubyte by type from lambda_function_0.b
add SP(1)<__wolin_reg12>[ubyte] = SP(1)<__wolin_reg12>[ubyte], SP(0)<__wolin_reg13>[ubyte] // two sides
// inferTopOregType __wolin_reg13 -> ubyte
free SP<__wolin_reg13>, #1 // for right side, type =ubyte
// inferTopOregType __wolin_reg12 -> ubyte
let SPF(2)<returnValue>[ubyte] = SP(0)<__wolin_reg12>[ubyte] // LAMBDA return assignment
free SP<__wolin_reg12>, #1 // for block level expression a+b, type = ubyte
// switchType to:ubyte by return expression
free SPF, #2 // free fn arguments and locals for lambda_function_0
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret



// ****************************************
// STATIC SPACE
// ****************************************
label __wolin_indirect_jsr
goto 65535[adr]
label __wolin_pl_qus_wolin_test_dst
alloc 0[ubyte]  // pl.qus.wolin.test.dst
label __wolin_pl_qus_wolin_test_lam
alloc 0[ptr]  // pl.qus.wolin.test.lam
label __wolin_pl_qus_wolin_test_src
alloc 0[ubyte]  // pl.qus.wolin.test.src
label __wolin_pl_qus_wolin_test_suma
alloc 0[ptr]  // pl.qus.wolin.test.suma
