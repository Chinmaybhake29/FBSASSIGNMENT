//4. Find odd and even among the numbers. 

#include<stdio.h>

int main()
{	
	int n;
	printf("Enter the size of array: ");
	scanf("%d",&n);
	
	int a[n];
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("\n Even Number");
	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			printf(" %d\n ",a[i]);
		}
	}
	
	printf("\n");
	
	printf("\n Odd Numbers");
	for(int i=0;i<n;i++)
	{
		if(a[i]%2!=0)
		{
			printf(" %d\n ",a[i]);	
		}
	}
	
	printf("\n");
	return 0;
}
