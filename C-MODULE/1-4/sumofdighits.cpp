#include<stdio.h>

int main()
{
	int n, sum=0, rem;
	
	printf("Enter the number: ");
	scanf("%d",&n);
	
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem;
		n /= 10;
	}
	printf("Sum of Dighits: %d",sum);
	return 0;
}
