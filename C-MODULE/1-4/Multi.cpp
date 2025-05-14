#include<stdio.h>

int main()
{
	int n, i=1;
	
	printf("Enter the Number: ");
	scanf("%d",&n);
	
	while(i<=10)
	{
		
		printf("%d\n",n*i);
		i++;
	}
	printf("\n");
	return 0;
}
