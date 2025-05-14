#include<stdio.h>

void prime()
{
	int n,i=2,status=0;
	
	printf("Enter the number");
	scanf("%d",&n);
	
	while(i<n)
	{
		if(n%i==0)
		{
			status=1;
			break;
		}
		i++;
	}
	if(status==0)
		printf("Is a prime number %d");
	else
		printf("Is not a prime number %d");
}
int main()
{
	prime();
}
