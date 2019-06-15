; setupSPE=155[ubyte],53247[uword]


; prepare exception stack
__wolin_spe = 155 ; exception stack ptr
__wolin_spe_top = 53247 ; exception stack top
    lda #<__wolin_spe_top ; set exception stack top
    sta __wolin_spe
    lda #>__wolin_spe_top
    sta __wolin_spe+1

; setupEXPTR=178[ubyte]


__wolin_exception_ptr = 178 ; pointer to exception object on throw


; setupCATCH=253[ubyte]


__wolin_spe_zp_vector = 253


; setupSPF=251[ubyte],40959[uword]


; prepare function stack
__wolin_spf = 251 ; function stack ptr
__wolin_spf_top = 40959 ; function stack top
    lda #<__wolin_spf_top ; set function stack top
    sta __wolin_spf
    lda #>__wolin_spf_top
    sta __wolin_spf+1

; setupSP=142[ubyte]


; prepare program stack
__wolin_sp_top = 142 ; program stack top
    ldx #__wolin_sp_top ; set program stack top

; goto__wolin_pl_qus_wolin_test_main[adr]

    jmp __wolin_pl_qus_wolin_test_main

; label__wolin_pl_qus_wolin_test_allocMem

__wolin_pl_qus_wolin_test_allocMem:

; allocSP<__wolin_reg0>,#2


    dex
    dex

; letSP(0)<__wolin_reg0>[uword]=#12345[uword]


    lda #<12345
    sta 0,x
    lda #>12345
    sta 0+1,x

; letSPF(4)<pl.qus.wolin.test.allocMem.returnValue>[uword]=SP(0)<__wolin_reg0>[uword]


    lda 0,x
    ldy #4
    sta (__wolin_spf),y
    lda 0+1,x
    iny
    sta (__wolin_spf),y

; freeSP<__wolin_reg0>,#2


    inx
    inx

; freeSPF,#4


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; ret

    rts

; label__wolin_pl_qus_wolin_test_setLfs

__wolin_pl_qus_wolin_test_setLfs:

; label__wolin_pl_qus_wolin_test_setNam

__wolin_pl_qus_wolin_test_setNam:

; label__wolin_pl_qus_wolin_test_testThrow

__wolin_pl_qus_wolin_test_testThrow:

; allocSP<__wolin_reg1>,#2


    dex
    dex

; letSP(0)<__wolin_reg1>[uword]=#12345[uword]


    lda #<12345
    sta 0,x
    lda #>12345
    sta 0+1,x

; throwSP(0)[uword]


    lda 0,x
    sta __wolin_exception_ptr
    lda 0+1,x
    sta __wolin_exception_ptr+1
    jmp __wolin_throw_exception



; freeSP<__wolin_reg1>,#2


    inx
    inx

; freeSPF,#4


    clc
    lda __wolin_spf
    adc #4
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; ret

    rts

; label__wolin_pl_qus_wolin_test_testCatch

__wolin_pl_qus_wolin_test_testCatch:

; allocSP<catch_addr>,#2


    dex
    dex

; letSP(0)[uword]=__wolin_lab_catch_block_start_0[uword]


    lda #<__wolin_lab_catch_block_start_0
    sta 0,x
    lda #>__wolin_lab_catch_block_start_0
    sta 0+1,x

; call__wolin_create_exception_entry[adr]

    jsr __wolin_create_exception_entry

; allocSPF,#4


    clc
    lda __wolin_spf
    sbc #4
    sta __wolin_spf
    lda __wolin_spf+1
    sbc #0
    sta __wolin_spf+1

; allocSP<__wolin_reg4>,#2


    dex
    dex

; letSP(0)<__wolin_reg4>[uword]=#4[ubyte]


    lda #4
    sta 0,x
    lda #0
    sta 0+1,x

; letSPF(2)[uword]=SP(0)<__wolin_reg4>[uword]


    lda 0,x
    ldy #2
    sta (__wolin_spf),y
    lda 0+1,x
    iny
    sta (__wolin_spf),y

; freeSP<__wolin_reg4>,#2


    inx
    inx

; allocSP<__wolin_reg5>,#2


    dex
    dex

; letSP(0)<__wolin_reg5>[uword]=#2[ubyte]


    lda #2
    sta 0,x
    lda #0
    sta 0+1,x

; letSPF(0)[uword]=SP(0)<__wolin_reg5>[uword]


    lda 0,x
    ldy #0
    sta (__wolin_spf),y
    lda 0+1,x
    iny
    sta (__wolin_spf),y

; freeSP<__wolin_reg5>,#2


    inx
    inx

; call__wolin_pl_qus_wolin_test_testThrow[adr]

    jsr __wolin_pl_qus_wolin_test_testThrow

; freeSPF<unit>,#0

 

; freeSPE,#5


    clc
    lda __wolin_spe
    adc #5
    sta __wolin_spe
    lda __wolin_spe+1
    adc #0
    sta __wolin_spe+1

; goto__wolin_lab_after_catch_block_end_0[adr]

    jmp __wolin_lab_after_catch_block_end_0

; label__wolin_lab_catch_block_start_0

__wolin_lab_catch_block_start_0:

; allocSP<__wolin_reg8>,#2


    dex
    dex

; letSP(0)<__wolin_reg8>[uword]=#51965[uword]


    lda #<51965
    sta 0,x
    lda #>51965
    sta 0+1,x

; let__wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[uword]=SP(0)<__wolin_reg8>[uword]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_b
    lda 0+1,x
    sta __wolin_pl_qus_wolin_test_b+1


; freeSP<__wolin_reg8>,#2


    inx
    inx

; label__wolin_lab_after_catch_block_end_0

__wolin_lab_after_catch_block_end_0:

; ret

    rts

; label__wolin_pl_qus_wolin_test_testIf

__wolin_pl_qus_wolin_test_testIf:

; allocSP<__wolin_reg9>,#1

    dex

; allocSP<__wolin_reg10>,#1

    dex

; allocSP<__wolin_reg11>,#1

    dex

; letSP(0)<__wolin_reg11>[ubyte]=53281[ubyte]


    lda 53281
    sta 0,x

; allocSP<__wolin_reg12>,#1

    dex

; letSP(0)<__wolin_reg12>[ubyte]=#2[ubyte]


    lda #2
    sta 0,x

; evaleqSP(2)<__wolin_reg10>[bool]=SP(1)<__wolin_reg11>[ubyte],SP(0)<__wolin_reg12>[ubyte]


    lda #1 // rowne
    sta 2,x
    lda 1,x
    cmp 0,x
    beq @__wolin_eq_label_cont
    lda #0 // jednak rozne
    sta 2,x
@__wolin_eq_label_cont:

; freeSP<__wolin_reg12>,#1

    inx

; freeSP<__wolin_reg11>,#1

    inx

; bneSP(0)<__wolin_reg10>[bool]=#1[bool],__wolin_lab_afterIfExpression_1<label_DO_else>[uword]


    lda 0,x
    cmp #1
    bne __wolin_lab_afterIfExpression_1

; allocSP<__wolin_reg13>,#1

    dex

; allocSP<__wolin_reg14>,#2


    dex
    dex

; letSP(0)<__wolin_reg14>[uword]=#50000[uword]


    lda #<50000
    sta 0,x
    lda #>50000
    sta 0+1,x

; let__wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[uword]=SP(0)<__wolin_reg14>[uword]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_b
    lda 0+1,x
    sta __wolin_pl_qus_wolin_test_b+1


; freeSP<__wolin_reg14>,#2


    inx
    inx

; freeSP<__wolin_reg13>,#1

    inx

; label__wolin_lab_afterIfExpression_1

__wolin_lab_afterIfExpression_1:

; allocSP<__wolin_reg15>,#1

    dex

; allocSP<__wolin_reg16>,#1

    dex

; letSP(0)<__wolin_reg16>[ubyte]=53281[ubyte]


    lda 53281
    sta 0,x

; allocSP<__wolin_reg17>,#1

    dex

; letSP(0)<__wolin_reg17>[ubyte]=#3[ubyte]


    lda #3
    sta 0,x

; evaleqSP(2)<__wolin_reg15>[bool]=SP(1)<__wolin_reg16>[ubyte],SP(0)<__wolin_reg17>[ubyte]


    lda #1 // rowne
    sta 2,x
    lda 1,x
    cmp 0,x
    beq @__wolin_eq_label_cont
    lda #0 // jednak rozne
    sta 2,x
@__wolin_eq_label_cont:

; freeSP<__wolin_reg17>,#1

    inx

; freeSP<__wolin_reg16>,#1

    inx

; bneSP(0)<__wolin_reg15>[bool]=#1[bool],__wolin_lab_afterIfExpression_1<label_DO_else>[uword]


    lda 0,x
    cmp #1
    bne __wolin_lab_afterIfExpression_1

; allocSP<__wolin_reg18>,#1

    dex

; allocSP<__wolin_reg19>,#2


    dex
    dex

; letSP(0)<__wolin_reg19>[uword]=#50001[uword]


    lda #<50001
    sta 0,x
    lda #>50001
    sta 0+1,x

; let__wolin_pl_qus_wolin_test_b<pl.qus.wolin.test.b>[uword]=SP(0)<__wolin_reg19>[uword]


    lda 0,x
    sta __wolin_pl_qus_wolin_test_b
    lda 0+1,x
    sta __wolin_pl_qus_wolin_test_b+1


; freeSP<__wolin_reg19>,#2


    inx
    inx

; freeSP<__wolin_reg18>,#1

    inx

; label__wolin_lab_afterIfExpression_1

__wolin_lab_afterIfExpression_1:

; add53281[ubyte]=53281[ubyte],#1[byte]


    inc 53281

; freeSP<__wolin_reg15>,#1

    inx

; freeSP<__wolin_reg10>,#1

    inx

; freeSP<__wolin_reg9>,#1

    inx

; ret

    rts

; label__wolin_pl_qus_wolin_test_testWhile1

__wolin_pl_qus_wolin_test_testWhile1:

; allocSP<__wolin_reg20>,#1

    dex

; label__wolin_lab_loopStart_1

__wolin_lab_loopStart_1:

; allocSP<__wolin_reg21>,#1

    dex

; add53281[ubyte]=53281[ubyte],#1[byte]


    inc 53281

; freeSP<__wolin_reg21>,#1

    inx

; goto__wolin_lab_loopEnd_1[adr]

    jmp __wolin_lab_loopEnd_1

; allocSP<__wolin_reg23>,#1

    dex

; letSP(0)<__wolin_reg23>[ubyte]=53281[ubyte]


    lda 53281
    sta 0,x

; allocSP<__wolin_reg24>,#1

    dex

; letSP(0)<__wolin_reg24>[ubyte]=#10[ubyte]


    lda #10
    sta 0,x

; evaleqSP(2)<__wolin_reg20>[bool]=SP(1)<__wolin_reg23>[ubyte],SP(0)<__wolin_reg24>[ubyte]


    lda #1 // rowne
    sta 2,x
    lda 1,x
    cmp 0,x
    beq @__wolin_eq_label_cont
    lda #0 // jednak rozne
    sta 2,x
@__wolin_eq_label_cont:

; freeSP<__wolin_reg24>,#1

    inx

; freeSP<__wolin_reg23>,#1

    inx

; beqSP(0)<__wolin_reg20>[bool]=#1[bool],__wolin_lab_loopStart_1<label_po_if>[uword]


    lda 0,x
    cmp #1
    beq __wolin_lab_loopStart_1

; label__wolin_lab_loopEnd_1

__wolin_lab_loopEnd_1:

; freeSP<__wolin_reg20>,#1

    inx

; ret

    rts

; label__wolin_pl_qus_wolin_test_testWhile2

__wolin_pl_qus_wolin_test_testWhile2:

; allocSP<__wolin_reg25>,#1

    dex

; label__wolin_lab_loopStart_2

__wolin_lab_loopStart_2:

; allocSP<__wolin_reg26>,#1

    dex

; letSP(0)<__wolin_reg26>[ubyte]=53281[ubyte]


    lda 53281
    sta 0,x

; allocSP<__wolin_reg27>,#1

    dex

; letSP(0)<__wolin_reg27>[ubyte]=#10[ubyte]


    lda #10
    sta 0,x

; evallessSP(2)<__wolin_reg25>[bool]=SP(1)<__wolin_reg26>[ubyte],SP(0)<__wolin_reg27>[ubyte]


    lda #1 // mniejsze
    sta 2,x
    lda 1,x
    cmp 0,x
    bcc @__wolin_eq_label_cont
    lda #0 // jednak wieksze
    sta 2,x
@__wolin_eq_label_cont:

; freeSP<__wolin_reg27>,#1

    inx

; freeSP<__wolin_reg26>,#1

    inx

; bneSP(0)<__wolin_reg25>[bool]=#1[bool],__wolin_lab_loopEnd_2<label_po_if>[uword]


    lda 0,x
    cmp #1
    bne __wolin_lab_loopEnd_2

; allocSP<__wolin_reg28>,#1

    dex

; add53281[ubyte]=53281[ubyte],#1[byte]


    inc 53281

; freeSP<__wolin_reg28>,#1

    inx

; allocSP<__wolin_reg30>,#1

    dex

; allocSP<__wolin_reg31>,#1

    dex

; letSP(0)<__wolin_reg31>[ubyte]=53281[ubyte]


    lda 53281
    sta 0,x

; allocSP<__wolin_reg32>,#1

    dex

; letSP(0)<__wolin_reg32>[ubyte]=#5[ubyte]


    lda #5
    sta 0,x

; evallessSP(2)<__wolin_reg30>[bool]=SP(1)<__wolin_reg31>[ubyte],SP(0)<__wolin_reg32>[ubyte]


    lda #1 // mniejsze
    sta 2,x
    lda 1,x
    cmp 0,x
    bcc @__wolin_eq_label_cont
    lda #0 // jednak wieksze
    sta 2,x
@__wolin_eq_label_cont:

; freeSP<__wolin_reg32>,#1

    inx

; freeSP<__wolin_reg31>,#1

    inx

; bneSP(0)<__wolin_reg30>[bool]=#1[bool],__wolin_lab_afterIfExpression_3<label_po_if>[uword]


    lda 0,x
    cmp #1
    bne __wolin_lab_afterIfExpression_3

; goto__wolin_lab_loopStart_2[adr]

    jmp __wolin_lab_loopStart_2

; label__wolin_lab_afterIfExpression_3

__wolin_lab_afterIfExpression_3:

; freeSP<__wolin_reg30>,#1

    inx

; allocSP<__wolin_reg33>,#1

    dex

; add53280[ubyte]=53280[ubyte],#1[byte]


    inc 53280

; freeSP<__wolin_reg33>,#1

    inx

; goto__wolin_lab_loopStart_2[adr]

    jmp __wolin_lab_loopStart_2

; label__wolin_lab_loopEnd_2

__wolin_lab_loopEnd_2:

; freeSP<__wolin_reg25>,#1

    inx

; ret

    rts

; label__wolin_pl_qus_wolin_test_testIncrement

__wolin_pl_qus_wolin_test_testIncrement:

; allocSP<__wolin_reg34>,#1

    dex

; add53281[ubyte]=53281[ubyte],#1[byte]


    inc 53281

; freeSP<__wolin_reg34>,#1

    inx

; ret

    rts

; label__wolin_pl_qus_wolin_test_testSum

__wolin_pl_qus_wolin_test_testSum:

; allocSP<__wolin_reg35>,#1

    dex

; letSP(0)<__wolin_reg35>[ubyte]=SPF(1)<pl.qus.wolin.test.testSum.arg1>[ubyte]


    ldy #1
    lda (__wolin_spf),y
    sta 0,x


; allocSP<__wolin_reg36>,#1

    dex

; letSP(0)<__wolin_reg36>[ubyte]=SPF(0)<pl.qus.wolin.test.testSum.arg2>[ubyte]


    ldy #0
    lda (__wolin_spf),y
    sta 0,x


; addSP(1)<__wolin_reg35>[ubyte]=SP(1)<__wolin_reg35>[ubyte],SP(0)<__wolin_reg36>[ubyte]


    clc
    lda 1,x
    adc 0,x
    sta 1,x

; freeSP<__wolin_reg36>,#1

    inx

; letSPF(2)<pl.qus.wolin.test.testSum.returnValue>[ubyte]=SP(0)<__wolin_reg35>[ubyte]


    lda 0,x
    ldy #2
    sta (__wolin_spf),y

; freeSP<__wolin_reg35>,#1

    inx

; freeSPF,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; ret

    rts

; label__wolin_pl_qus_wolin_test_Dupa

__wolin_pl_qus_wolin_test_Dupa:

; allocSP<__wolin_reg37>,#2


    dex
    dex

; allocSPF,#6


    clc
    lda __wolin_spf
    sbc #6
    sta __wolin_spf
    lda __wolin_spf+1
    sbc #0
    sta __wolin_spf+1

; letSPF(2)[uword]=#3[uword]


    ldy #2
    lda #<3
    sta (__wolin_spf),y
    iny
    lda #>3
    sta (__wolin_spf),y

; letSPF(0)[uword]=#1[uword]


    ldy #0
    lda #<1
    sta (__wolin_spf),y
    iny
    lda #>1
    sta (__wolin_spf),y

; call__wolin_pl_qus_wolin_test_allocMem[adr]

    jsr __wolin_pl_qus_wolin_test_allocMem

; letSP(0)<__wolin_reg37>[uword]=SPF(0)<returnValue>[uword]


    ldy #0
    lda (__wolin_spf),y
    sta 0,x
    iny
    lda (__wolin_spf),y
    sta 0+1,x


; freeSPF<uword>,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; letSPF(0)<pl.qus.wolin.test.Dupa.returnValue>[ptr]=SP(0)<__wolin_reg37>[uword]


    ldy #0
    lda 0,x
    sta (__wolin_spf),y
    iny
    lda 0+1,x
    sta (__wolin_spf),y

; ret

    rts

; freeSP<__wolin_reg37>,#2


    inx
    inx

; label__wolin_pl_qus_wolin_test_Dupa_jakasFunkcja

__wolin_pl_qus_wolin_test_Dupa_jakasFunkcja:

; setupHEAP=this


    ldy #0 ; this pointer from SPF to this pointer on ZP
    lda (__wolin_spf),y
    sta __wolin_this_ptr
    iny
    lda (__wolin_spf),y
    sta __wolin_this_ptr+1

; allocSP<__wolin_reg40>,#1

    dex

; letSP(0)<__wolin_reg40>[ubyte]=HEAP(2)<pl.qus.wolin.test.Dupa.a>[ubyte]


    ldy #2 ; assuming this ZP is set!
    lda (__wolin_this_ptr),y
    sta 0,x

; allocSP<__wolin_reg41>,#1

    dex

; letSP(0)<__wolin_reg41>[ubyte]=HEAP(1)<pl.qus.wolin.test.Dupa.b>[ubyte]


    ldy #1 ; assuming this ZP is set!
    lda (__wolin_this_ptr),y
    sta 0,x

; addSP(1)<__wolin_reg40>[ubyte]=SP(1)<__wolin_reg40>[ubyte],SP(0)<__wolin_reg41>[ubyte]


    clc
    lda 1,x
    adc 0,x
    sta 1,x

; freeSP<__wolin_reg41>,#1

    inx

; let53281[ubyte]=SP(0)<__wolin_reg40>[ubyte]


    lda 0,x
    sta 53281


; freeSP<__wolin_reg40>,#1

    inx

; freeSPF,#2


    clc
    lda __wolin_spf
    adc #2
    sta __wolin_spf
    lda __wolin_spf+1
    adc #0
    sta __wolin_spf+1

; ret

    rts

; label__wolin_pl_qus_wolin_test_main

__wolin_pl_qus_wolin_test_main:

; allocSP<__wolin_reg44>,#1

    dex

; letSP(0)<__wolin_reg44>[ubyte]=#43[ubyte]


    lda #43
    sta 0,x

; let53281[ubyte]=SP(0)<__wolin_reg44>[ubyte]


    lda 0,x
    sta 53281


; freeSP<__wolin_reg44>,#1

    inx

; ret

    rts

; label__wolin_create_exception_entry

__wolin_create_exception_entry:

; allocSPE,#5


    clc
    lda __wolin_spe
    sbc #5
    sta __wolin_spe
    lda __wolin_spe+1
    sbc #0
    sta __wolin_spe+1

; letSPE(0)[uword]=SP(0)[uword]


    lda 0,x
    ldy #0
    sta (__wolin_spe),y
    lda 0+1,x
    iny
    sta (__wolin_spe),y

; freeSP,#2


    inx
    inx

; letSPE(2)[ubyte]=SPC[ubyte]


    txa
    pha
    tsx
    txa
    ldy #2
    sta (__wolin_spe),y
    pla
    tax
  

; letSPE(3)[ubyte]=SP[ubyte]


    ldy #3
    stx (__wolin_spe),y

; ret

    rts

; label__wolin_throw_exception

__wolin_throw_exception:

; bneSPE=__wolin_spe_top,__wolin_process_exception


    lda __wolin_spe
    cmp #<__wolin_spe_top
    bne __wolin_process_exception
    lda __wolin_spe+1
    cmp #>__wolin_spe_top
    bne __wolin_process_exception

; let__wolin_exception_ptr[ptr]=#0[uword]


    lda #0
    sta __wolin_exception_ptr
    sta __wolin_exception_ptr+1

; crash

    brk

; label__wolin_process_exception

__wolin_process_exception:

; let__wolin_spe_zp_vector[uword]=SPE(0)[uword]


    ldy #0
    lda (__wolin_spe),y
    sta __wolin_spe_zp_vector
    iny
    lda (__wolin_spe),y
    sta __wolin_spe_zp_vector+1

; addSPE(2)[ubyte]=SPE(2)[ubyte],#2[ubyte]


    clc
    ldy #2
    lda (__wolin_spe),y
    adc #2
    sta (__wolin_spe),y


; letSPC[ubyte]=SPE(2)[ubyte]


    txa
    pha
    ldy #2
    lda (__wolin_spe),y
    tax
    txs
    pla
    tax

; letSP[ubyte]=SPE(3)[ubyte]


    ldy #3
    ldx (__wolin_spe),y

; freeSPE,#5


    clc
    lda __wolin_spe
    adc #5
    sta __wolin_spe
    lda __wolin_spe+1
    adc #0
    sta __wolin_spe+1

; goto__wolin_spe_zp_vector[ptr]

    jmp (__wolin_spe_zp_vector)

; label__wolin_indirect_jsr

__wolin_indirect_jsr:

; goto65535[adr]

    jmp 65535

; label__wolin_pl_qus_wolin_test_src

__wolin_pl_qus_wolin_test_src:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_test_dupa

__wolin_pl_qus_wolin_test_dupa:

; alloc65535[ptr]

    .word 65535

; label__wolin_pl_qus_wolin_test_dst

__wolin_pl_qus_wolin_test_dst:

; alloc0[ubyte]

    .byte 0

; label__wolin_pl_qus_wolin_test_b

__wolin_pl_qus_wolin_test_b:

; alloc0[uword]

    .word 0

; label__wolin_pl_qus_wolin_test_suma

__wolin_pl_qus_wolin_test_suma:

; alloc0[ptr]

    .word 0

