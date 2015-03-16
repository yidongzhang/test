#include <stdio.h>
#include <malloc.h>

struct my_float {
	union {
	   unsigned char b1[3000];
	   unsigned char b2[4000];
	};
        float number;
	int i;
}__attribute__((aligned(0x200)));

struct my_int {
	int i
}__attribute__((aligned(0x200)));
//struct my_float a[4] = { {1, 1.0}, {2, 2.0}, {3, 3.0}, {4, 4.0} };

int
main(void)
{
	struct my_float *a = memalign(512, 4*sizeof(struct my_float));
	char *p = memalign(512, 1024); 
	printf("%d\n", sizeof(struct my_int));
	
       printf("%p %p %p %p\n", &a[0], &a[1], &a[2], &a[3]);
	printf("%p\n", a->b1);
}
