int main()
{
	int i = 0, j = 0;
	do {
		i++;
		printf("i=%d, j=%d\n", i, j);
		if (i%2 == 1)
			continue;
		j++;
	} while(i<10);

}
