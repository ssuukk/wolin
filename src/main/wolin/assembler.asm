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
// funkcja: fun pl.qus.wolin.main():unit
// ****************************************
label __wolin_pl_qus_wolin_main
// Using already known __wolin_reg1
alloc SP<__wolin_reg1>, #1 // for block 'return value' {\nwhile(border<255)border++\n}
// Using already known __wolin_reg2
alloc SP<__wolin_reg2>, #1 // for while condition
label __wolin_lab_loopStart_1
// Using already known __wolin_reg3
alloc SP<__wolin_reg3>, #1 // LEFT for <
let SP(0)<__wolin_reg3>[ubyte] = 53280[ubyte] // simple id from var
// switchType to:ubyte by type from pl.qus.wolin.border
// SAFE INFER TOP: __wolin_reg3: ubyte = 0 (LEFT for <) -> no change
// Using already known __wolin_reg4
alloc SP<__wolin_reg4>, #1 // RIGHT for <
// switchType to:ubyte by parse literal constant
let SP(0)<__wolin_reg4>[ubyte] = #255[ubyte] // atomic ex
// SAFE INFER TOP: __wolin_reg4: ubyte = 0 (RIGHT for <) -> no change
evalless SP(2)<__wolin_reg2>[bool] = SP(1)<__wolin_reg3>[ubyte], SP(0)<__wolin_reg4>[ubyte]
free SP<__wolin_reg4>, #1 // RIGHT for <
free SP<__wolin_reg3>, #1 // LEFT for <
// SAFE INFER TOP: __wolin_reg2: bool = 0 (for while condition) -> no change
bne SP(0)<__wolin_reg2>[bool] = #1[bool], __wolin_lab_loopEnd_1<label_po_if>[adr]
add 53280[ubyte] = 53280[ubyte], #1[ubyte] // simple id
// switchType to:ubyte by ++ operator
goto __wolin_lab_loopStart_1[adr]
label __wolin_lab_loopEnd_1
free SP<__wolin_reg2>, #1 // for while condition
// SAFE INFER TOP: __wolin_reg1: ubyte = 0 (for block 'return value' {\nwhile(border<255)border++\n}) -> no change
free SP<__wolin_reg1>, #1 // for block 'return value' {\nwhile(border<255)border++\n}, type = ubyte
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
