setup HEADER 
label __wolin_pl_qus_wolin_plot = 65520 
label __wolin_pl_qus_wolin_chrout = 65490 
setup SPF = 251[ubyte] , 40959[uword] 
setup SP = 114[ubyte] 
setup HEAP = 176[ubyte] 
goto __wolin_pl_qus_wolin_main[uword] 

function __wolin_pl_qus_wolin_print 
let SPF(1)<pl.qus.wolin.print..i>[ubyte] = #0[ubyte] 
add SPF(0)<pl.qus.wolin.print..char>[ubyte] = SPF(2)<pl.qus.wolin.print.what>[ubyte*] , SPF(1)<pl.qus.wolin.print..i>[ubyte] 
alloc SP<__wolin_reg9> , #1 
_scope_ loop , 1 
label __wolin_lab_loop_start_1 
evalneq SP(2)<__wolin_reg9>[bool] = SPF(0)<pl.qus.wolin.print..char>[ubyte] , #0[ubyte] 
bne SP(0)<__wolin_reg9>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 
save SP 
save SPF(0)<pl.qus.wolin.print..char>[ubyte] 
restore CPU.A[ubyte] 
call __wolin_pl_qus_wolin_chrout[uword] 
restore SP 
add SPF(1)<pl.qus.wolin.print..i>[ubyte] = SPF(1)<pl.qus.wolin.print..i>[ubyte] , #1[ubyte] 
alloc SP<__wolin_reg18> , #2 
add SP<__wolin_reg18> = SPF(2)<pl.qus.wolin.print.what>[ubyte*] , SPF(1)<pl.qus.wolin.print..i>[ubyte] 
let SPF(0)<pl.qus.wolin.print..char>[ubyte] = &SP(0)<__wolin_reg18>[ubyte*] 
free SP<__wolin_reg18> , #2 
goto __wolin_lab_loop_start_1[uword] 
_endscope_ loop , 1 
label __wolin_lab_loop_end_1 
free SP<__wolin_reg9> , #1 
free SPF<__wolin_pl_qus_wolin_print> , #4 
endfunction 

function __wolin_pl_qus_wolin_main 
alloc SPF<__wolin_pl_qus_wolin_print> , #4 
let SPF(2)<pl.qus.wolin.print.what>[ubyte*] = #__wolin_lab_stringConst_0[uword] 
call __wolin_pl_qus_wolin_print[uword] 
endfunction 
string __wolin_lab_stringConst_0[uword] = $"dupa" 
