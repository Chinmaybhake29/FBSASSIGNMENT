#include<stdio.h>

int sum(int n);

int main()
{
	int n;
	printf("Enter the number: ");
	scanf("%d",&n);
	
	int s=sum(n);
	printf("%d\n",s);
}
int sum(int n)
{
	int rem, sum=0;
	while(n!=0)
	{
		rem=n%10;
		sum=sum+rem;
		n=n/10;
	}
	return sum;
}

