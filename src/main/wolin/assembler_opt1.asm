setup HEADER 
label __wolin_pl_qus_wolin_plot = 65520 
label __wolin_pl_qus_wolin_chrout = 65490 
setup SPF = 251[ubyte] , 40959[uword] 
setup SP = 114[ubyte] 
setup HEAP = 176[ubyte] 
goto __wolin_pl_qus_wolin_main[uword] 
import __wolin_pl_qus_wolin_extPrint 

function __wolin_pl_qus_wolin_scopeTest 
alloc SP<__wolin_reg2> , #1 
_scope_ loop , 1 
label __wolin_lab_loop_start_1 
evalless SP(0)<__wolin_reg2>[bool] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] , #100[ubyte] 
bne SP(0)<__wolin_reg2>[bool] = #1[bool] , __wolin_lab_loop_end_1<label_po_if>[uword] 
bne *SPF(0)<pl.qus.wolin.scopeTest.war>[bool] = #1[bool] , __wolin_lab_else_branch_1<label_DO_else>[uword] 
alloc SP<__wolin_reg11> , #1 
_scope_ loop , 2 
label __wolin_lab_loop_start_2 
evalless SP(0)<__wolin_reg11>[bool] = #10[ubyte] , SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] 
bne SP(0)<__wolin_reg11>[bool] = #1[bool] , __wolin_lab_loop_end_2<label_po_if>[uword] 
add SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] , #1[ubyte] 
goto __wolin_lab_loop_start_2[uword] 
_scope_ endloop , 2 
label __wolin_lab_loop_end_2 
free SP<__wolin_reg11> , #1 
goto __wolin_lab_if_end_1[uword] 
label __wolin_lab_else_branch_1 
alloc SP<__wolin_reg18> , #1 
_scope_ loop , 3 
label __wolin_lab_loop_start_3 
evalless SP(0)<__wolin_reg18>[bool] = SPF(4)<pl.qus.wolin.scopeTest.x>[ubyte] , #20[ubyte] 
bne SP(0)<__wolin_reg18>[bool] = #1[bool] , __wolin_lab_loop_end_3<label_po_if>[uword] 
add SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] = SPF(3)<pl.qus.wolin.scopeTest.y>[ubyte] , #1[ubyte] 
goto __wolin_lab_loop_start_3[uword] 
_scope_ endloop , 3 
label __wolin_lab_loop_end_3 
free SP<__wolin_reg18> , #1 
label __wolin_lab_if_end_1 
goto __wolin_lab_loop_start_1[uword] 
_scope_ endloop , 1 
label __wolin_lab_loop_end_1 
free SP<__wolin_reg2> , #1 
free SPF<__wolin_pl_qus_wolin_scopeTest> , #5 
endfunction 

function __wolin_pl_qus_wolin_main 
alloc SPF<__wolin_pl_qus_wolin_extPrint> , #2 
let SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] = #__wolin_lab_stringConst_0[uword] 
call __wolin_pl_qus_wolin_extPrint[uword] 
endfunction 
string __wolin_lab_stringConst_0[uword] = $"dupa" 
