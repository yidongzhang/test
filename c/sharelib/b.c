#include <stdio.h>
#include <dlfcn.h>

int main()
{
       void *handle;
	int (*fptr)(char *);
	handle = dlopen("./test.so", RTLD_NOW);
	fptr = (int (*)(char*))dlsym(handle, "change_buf");


	fptr(NULL);
	getchar();
}





