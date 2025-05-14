#include<stdio.h>

int main()
{
	int arr1[100], arr2[100], n, sum[100];
	
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	printf("Enter 1st array");
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr1[i]);
	}
	
	printf("Enter 2nd array");
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr2[i]);
	}
		
	for(int i=0;i<n;i++)
	{
		sum[i]=arr1[i]+arr2[i];
	}
	
	printf("Sum of two array is: \n");
	
	for(int i=0;i<n;i++)
	{
			printf("%d\n",sum[i]);
	}
	printf("\n");
	
	return 0;
}
