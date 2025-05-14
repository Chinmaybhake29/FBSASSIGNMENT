#include<stdio.h>

int rev(int n);

int main()
{
	int n;
	
	printf("Enter the number: ");
	scanf("%d",&n);
	
	int r=rev(n);
	printf("%d\n",r);
}
int rev(int n)
{
	int rem, sum=0;
	
	while(n!=0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	return sum;
}
