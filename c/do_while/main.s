	.file	"main.c"
	.section	.rodata
.LC0:
	.string	"i=%d, j=%d\n"
	.text
.globl main
	.type	main, @function
main:
.LFB0:
	.cfi_startproc
	pushq	%rbp
	.cfi_def_cfa_offset 16
	movq	%rsp, %rbp
	.cfi_offset 6, -16
	.cfi_def_cfa_register 6
	subq	$16, %rsp
	movl	$0, -4(%rbp)
	movl	$0, -8(%rbp)
.L4:
	addl	$1, -4(%rbp)
	movl	-8(%rbp), %edx
	movl	-4(%rbp), %eax
	movl	%eax, %esi
	movl	$.LC0, %edi
	movl	$0, %eax
	call	printf
	movl	-4(%rbp), %eax
	movl	%eax, %edx
	sarl	$31, %edx
	shrl	$31, %edx
	addl	%edx, %eax
	andl	$1, %eax
	subl	%edx, %eax
	cmpl	$1, %eax
	je	.L6
.L2:
	addl	$1, -8(%rbp)
	jmp	.L3
.L6:
	nop
.L3:
	cmpl	$9, -4(%rbp)
	jle	.L4
	leave
	ret
	.cfi_endproc
.LFE0:
	.size	main, .-main
	.ident	"GCC: (Ubuntu/Linaro 4.4.7-1ubuntu2) 4.4.7"
	.section	.note.GNU-stack,"",@progbits
