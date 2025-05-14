#include<iostream>

void factorial()
{
	int n, fact=1;
	
	printf("Enter then number: ");
	scanf("%d",&n);
	
	for(int i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	printf("Factorial: %d",fact);
	
}
int main()
{
	factorial();
}
