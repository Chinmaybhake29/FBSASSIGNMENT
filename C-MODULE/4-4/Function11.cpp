#include<stdio.h>

void Plaindrome()
{
	int n, sum=0, rem, temp;
	
	printf("Enter the number");
	scanf("%d",&n);
	
	temp=n;
	
	while(n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(temp==sum)
		printf("Is a Plaindrome %d");
	else
		printf("Is not a Plaindrome %d");
}
int main()
{
	Plaindrome();
}
