#include<stdio.h>

void sumofdigits()
{
	int n, sum=0, rem;
	
	printf("Enter the number: ");
	scanf("%d",&n);
	
	while(n>0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	printf("Sum of Digit is: %d", sum);
}
int main()
{
	sumofdigits();
}

