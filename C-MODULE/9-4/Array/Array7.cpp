#include<stdio.h>

int main()
{
	int n, arr[10], sum=0;
	
	printf("Enter the Size of an array: ");
	scanf("%d",&n);
	
	printf("Enter the elements");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	printf("Sum of array");
	for(int i=0;i<n;i++)
	{
		sum=sum+arr[i];
	}
	printf("%d",sum);
	return 0;
}
