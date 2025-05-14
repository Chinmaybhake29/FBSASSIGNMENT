#include<stdio.h>

int main()
{
	int n, temp, sum=0, result=0;
	
	printf("Enter the number");
	scanf("%d",&n);
	
	temp=n;
	
	while(n!=0)
	{
		sum=n%10;
		result += sum*sum*sum;
		n=n/10;
	}
	if(result==temp)
		printf("is a armstrong number");
	else
		printf("is not a armstrong number");
	return 0;
}
