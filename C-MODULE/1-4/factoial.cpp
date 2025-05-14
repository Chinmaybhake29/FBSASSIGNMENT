#include<stdio.h>

int main()
{
	int n=5, i=1, fact=1;
	
	while(i<=n)
	{
		fact=fact*i;
		printf("%d\n",fact);
		i++;
	}
	printf("\n");
	return 0;
}
