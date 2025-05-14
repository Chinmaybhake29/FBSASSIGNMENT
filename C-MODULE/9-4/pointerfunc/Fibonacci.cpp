#include<stdio.h>

int Fibonacci()
{
	int n1=0,n2=2,n3,n,i;
	
	int *p_n1=&n1;
	int *p_n2=&n2;
	int *p_n3=&n3;
	
	int *p_n=&n;
	
	printf("Enter the number: ");
	scanf("%d",p_n);
	
	for(i=2;i<*p_n;i++)
	{
		*p_n1=*p_n2;
		*p_n2=*p_n3;
		*p_n3=*p_n1+*p_n2;
		printf("%d ",*p_n3);
	}
}
main()
{
	Fibonacci();
}
