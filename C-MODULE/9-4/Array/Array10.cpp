//2. Search the given number in array. 

#include<stdio.h>

int main()
{
	int n, arr[100], num, found=0;
	
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	printf("Enter the elememts in an array:");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Enter the element to search");
	scanf("%d",&num);
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]==num)
		{
			printf("Number will be found");
			found=1;
			break;
		}
	}
	if(!found)
	{
		printf("Element not found at position");
	}
	return 0;
}
