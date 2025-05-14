#include<stdio.h>

int main()
{
	int n=6, sum=0,i;
	
	while(i<n)
	{
		if(n%i==0)
		{
			sum=sum+i;
		}
		i++;
	}
	
	if(sum==n)
		printf("is a perfect number");
	else
		printf("Is not a perfect numbr");
	return 0;
}
