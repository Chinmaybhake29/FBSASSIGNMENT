#include<stdio.h>

int main()
{
	int n, status=0, i=2;
	
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
		printf("%d Is a Prime number",n);
	else
		printf("%d Is not a Prime number",n);
}
