#include<stdio.h>

int prime()
{
	int n, status=0;
	
	int *p_n=&n;
	int *p_status=&status;
	
	printf("Enter the number: ");
	scanf("%d",p_n);
	
	int i=2;
	
	while(i<*p_n)
	{
		if(*p_n%i==0)
		{
			*p_status=1;
			break;
		}
		i++;
	}
		if(*p_status==0)
		printf("%d is a Prime number",*p_n);
	else
		printf("%d is not a Prime number",*p_n);
}
main()
{
	prime();
}
