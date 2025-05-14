#include<stdio.h>

void num1()
{
	int i,j,n,sum;
	
	printf("Enter the limit: ");
	scanf("%d",&n);
	
	
	for(i=1;i<=n;i++)
	{
		sum=0;
		
		for(j=1;j<i;j++)
		{
			if(i%j==0)
		    {
				sum=sum+j;
			}				
		}
		if(i==sum)
		{
			printf("%d, ",i);
		}
	}
}
int main()
{
	num1();
}
