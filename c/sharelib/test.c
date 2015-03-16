#include <stdio.h>

char buf[24] = {0, 0};

int change_buf(char *src)
{
    if (src == NULL) {
         printf("src null, buf=%s\n", buf);
	 return 1;
    }    

    strcpy(buf, src);
    printf("buf=%s\n", buf);

    return 0;
}


