setup HEADER 
label __wolin_pl_qus_wolin_plot = 65520 
label __wolin_pl_qus_wolin_chrout = 65490 
setup SPF = 251[ubyte] , 40959[uword] 
setup SP = 114[ubyte] 
setup HEAP = 176[ubyte] 
goto __wolin_pl_qus_wolin_main[uword] 

function __wolin_pl_qus_wolin_print 
alloc SP<__wolin_reg1> , #1 
alloc SP<__wolin_reg2> , #1 
let SP(0)<__wolin_reg2>[ubyte] = #0[ubyte] 
let SPF(1)<pl.qus.wolin.print..i>[ubyte] = SP(0)<__wolin_reg2>[ubyte] 
free SP<__wolin_reg2> , #1 
free SP<__wolin_reg1> , #1 
alloc SP<__wolin_reg3> , #2 
alloc SP<__wolin_reg4> , #2 
alloc SP<__wolin_reg5> , #2 
alloc SP<__wolin_reg6> , #2 
let SP(0)<__wolin_reg6>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] 
alloc SP<__wolin_reg7> , #2 
let SP(0)<__wolin_reg7>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] 
add SP(4)<__wolin_reg5>[ubyte*] = SP(2)<__wolin_reg6>[ubyte*] , SP(0)<__wolin_reg7>[uword] 
free SP<__wolin_reg7> , #2 
free SP<__wolin_reg6> , #2 
let SP(2)<__wolin_reg4>[ubyte*] = SP(0)<__wolin_reg5>[ubyte*] 
free SP<__wolin_reg5> , #2 
let SPF(0)<pl.qus.wolin.print..char>[ubyte] = SP(0)<__wolin_reg4>[ubyte*] 
free SP<__wolin_reg4> , #2 
free SP<__wolin_reg3> , #2 
alloc SP<__wolin_reg9> , #1 
_scope_ loop , 1 
label __wolin_lab_loop_start_1 
alloc SP<__wolin_reg10> , #2 
let SP(0)<__wolin_reg10>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] 
alloc SP<__wolin_reg11> , #1 
let SP(0)<__wolin_reg11>[ubyte] = #0[ubyte] 
evalneq SP(3)<__wolin_reg9>[bool] = &SP(1)<__wolin_reg10>[ubyte*] , SP(0)<__wolin_reg11>[ubyte] 
free SP<__wolin_reg11> , #1 
free SP<__wolin_reg10> , #2 
bne SP(0)<__wolin_reg9>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 
save SP 
alloc SP<__wolin_reg14> , #2 
let SP(0)<__wolin_reg14>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] 
save &SP(0)<__wolin_reg14>[ubyte*] 
free SP<__wolin_reg14> , #2 
restore CPU.A[ubyte] 
call __wolin_pl_qus_wolin_chrout[uword] 
restore SP 
alloc SP<__wolin_reg15> , #2 
let SP(0)<__wolin_reg15>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] 
add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte] , #1[ubyte] 
free SP<__wolin_reg15> , #2 
alloc SP<__wolin_reg17> , #2 
let SP(0)<__wolin_reg17>[ubyte*] = *SPF(0)<pl.qus.wolin.print..char>[ubyte] 
alloc SP<__wolin_reg18> , #2 
alloc SP<__wolin_reg19> , #2 
alloc SP<__wolin_reg20> , #2 
let SP(0)<__wolin_reg20>[ubyte*] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] 
alloc SP<__wolin_reg21> , #2 
let SP(0)<__wolin_reg21>[ubyte*] = *SPF(1)<pl.qus.wolin.print..i>[ubyte] 
add SP(4)<__wolin_reg19>[ubyte*] = SP(2)<__wolin_reg20>[ubyte*] , SP(0)<__wolin_reg21>[uword] 
free SP<__wolin_reg21> , #2 
free SP<__wolin_reg20> , #2 
let SP(2)<__wolin_reg18>[ubyte*] = SP(0)<__wolin_reg19>[ubyte*] 
free SP<__wolin_reg19> , #2 
let &SP(2)<__wolin_reg17>[ubyte*] = &SP(0)<__wolin_reg18>[ubyte*] 
free SP<__wolin_reg18> , #2 
free SP<__wolin_reg17> , #2 
goto __wolin_lab_loop_start_1[uword] 
_endscope_ loop , 1 
label __wolin_lab_loop_end_1 
free SP<__wolin_reg9> , #1 
free SPF<__wolin_pl_qus_wolin_print> , #4 
endfunction 

function __wolin_pl_qus_wolin_main 
alloc SPF<__wolin_pl_qus_wolin_print> , #4 
alloc SP<__wolin_reg24> , #2 
let SP(0)<__wolin_reg24>[ubyte*] = #__wolin_lab_stringConst_0[uword] 
let SPF(2)<pl.qus.wolin.print.what>[ubyte*] = SP(0)<__wolin_reg24>[ubyte*] 
free SP<__wolin_reg24> , #2 
call __wolin_pl_qus_wolin_print[uword] 
endfunction 
string __wolin_lab_stringConst_0[uword] = $"dupa" 
