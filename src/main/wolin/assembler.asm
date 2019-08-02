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
let __wolin_pl_qus_wolin_d<pl.qus.wolin.d>[uword] = SP(0)<__wolin_reg0>[ubyte] // podstawic wynik inicjalizacji expression do zmiennej d
free SP<__wolin_reg0>, #1 // for var init expression
// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.localTest(pl.qus.wolin.localTest.a: ubyte = 0 (), pl.qus.wolin.localTest.b: ubyte = 0 ()):ubyte
// ****************************************
label __wolin_pl_qus_wolin_localTest
// Using already known __wolin_reg1
// Using already known __wolin_reg2
// SAFE INFER TOP: __wolin_reg2: unit = 65535 (for declaration valsuma:ubyte) -> no change
// Using already known __wolin_reg3
//  lewa strona assignment
// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #1 // For assignment left side
// switchType to:ubyte by by znajdźSimpleIdW
// SAFE INFER TOP: __wolin_reg4: ubyte = 0 (For assignment left side) -> no change
//  prawa strona assignment
// Using already known __wolin_reg5
alloc SP<__wolin_reg5>, #1 // for value that gets assigned to left side
let SP(0)<__wolin_reg5>[ubyte] = SPF(3)<pl.qus.wolin.localTest.a>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.localTest.a
// SAFE INFER TOP: __wolin_reg5: ubyte = 0 (for value that gets assigned to left side) -> no change
// Using already known __wolin_reg6
alloc SP<__wolin_reg6>, #1 // RIGHT adding operator
let SP(0)<__wolin_reg6>[ubyte] = SPF(2)<pl.qus.wolin.localTest.b>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.localTest.b
// SAFE INFER TOP: __wolin_reg6: ubyte = 0 (RIGHT adding operator) -> no change
add SP(1)<__wolin_reg5>[ubyte] = SP(1)<__wolin_reg5>[ubyte], SP(0)<__wolin_reg6>[ubyte]
free SP<__wolin_reg6>, #1 // RIGHT adding operator
// SAFE INFER TOP: __wolin_reg5: ubyte = 0 (for value that gets assigned to left side) -> no change
let SPF(1)<pl.qus.wolin.localTest..suma>[ubyte] = SP(0)<__wolin_reg5>[ubyte] // przez sprawdzacz typow - process assignment
free SP<__wolin_reg5>, #1 // for value that gets assigned to left side, type = ubyte
free SP<__wolin_reg4>, #1 // For assignment left side
// switchType to:unit by assignment
// SAFE INFER TOP: __wolin_reg3: unit = 65535 (for expression) -> no change
// Using already known __wolin_reg7
alloc SP<__wolin_reg7>, #1 // for expression
let SP(0)<__wolin_reg7>[ubyte] = SPF(1)<pl.qus.wolin.localTest..suma>[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.localTest..suma
let SPF(6)<returnValue>[ubyte] = SP(0)<__wolin_reg7>[ubyte] // przez sprawdzacz typow - jump expression
// switchType to:ubyte by return expression
// SAFE INFER TOP: __wolin_reg7: ubyte = 0 (for expression) -> no change
free SP<__wolin_reg7>, #1 // for expression
free SPF, #6 // free fn arguments and locals for pl.qus.wolin.localTest
// caller ma obowiązek zwolnoć wartość zwrotną z SPF!!!
ret

// switchType to:unit by function declaration

// ****************************************
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
// Using already known __wolin_reg8
// Using already known __wolin_reg9
alloc SP<__wolin_reg9>, #1 // for expression
// switchType to:ubyte by function type 1
// SAFE INFER TOP: __wolin_reg9: ubyte = 0 (for expression) -> no change
alloc SPF, #7
//  obsługa argumentu 0 wywołania localTest
// Using already known __wolin_reg10
alloc SP<__wolin_reg10>, #1 // for call argument 0
// Prze visit vALUE
//  obliczenia dla parametru 4
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg10>[ubyte] = #4[ubyte] // atomic ex
// po visit value
let SPF(3)[ubyte] = SP(0)<__wolin_reg10>[ubyte]
free SP<__wolin_reg10>, #1 // for call argument 0, type = ubyte
//  obsługa argumentu 1 wywołania localTest
// Using already known __wolin_reg11
alloc SP<__wolin_reg11>, #1 // for call argument 1
// Prze visit vALUE
//  obliczenia dla parametru 3
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg11>[ubyte] = #3[ubyte] // atomic ex
// po visit value
let SPF(2)[ubyte] = SP(0)<__wolin_reg11>[ubyte]
free SP<__wolin_reg11>, #1 // for call argument 1, type = ubyte
// switchType to:ubyte by function type 2
// switchType to:ubyte by function call
call __wolin_pl_qus_wolin_localTest[adr]

let SP(0)<__wolin_reg9>[ubyte] = SPF(0)<returnValue>[ubyte]// copy return parameter - TODO sprawdzić co jeśli wywołanie funkcji było bez podstawienia!!!
free SPF <ubyte>, #1
// SAFE INFER TOP: __wolin_reg9: ubyte = 0 (for expression) -> no change
free SP<__wolin_reg9>, #1 // for expression
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
label __wolin_pl_qus_wolin_d
alloc 0[uword]  // pl.qus.wolin.d
