setup HEADER 
label __wolin_pl_qus_wolin_plot = 65520 
label __wolin_pl_qus_wolin_chrout = 65490 
setup SPF = 251[ubyte] , 40959[uword] 
setup SP = 114[ubyte] 
setup HEAP = 176[ubyte] 
goto __wolin_pl_qus_wolin_main[uword] 
function __wolin_pl_qus_wolin_extPrint 
add SPF(2)<pl.qus.wolin.extPrint.__returnValue>[ubyte] = SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] , #0[ubyte] 
free SPF<__wolin_pl_qus_wolin_extPrint> , #2 
endfunction 
function __wolin_pl_qus_wolin_main 
alloc SPF<__wolin_pl_qus_wolin_extPrint> , #3 
let SPF(0)<pl.qus.wolin.extPrint.what>[ubyte*] = #__wolin_lab_stringConst_0[uword] 
call __wolin_pl_qus_wolin_extPrint[uword] 
free SPF<pl.qus.wolin.extPrint.__returnValue> , #1 
endfunction 
string __wolin_lab_stringConst_0[uword] = $"dupa" 
