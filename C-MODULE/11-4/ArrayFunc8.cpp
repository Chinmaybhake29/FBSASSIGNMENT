/*2. Search the given number in array. */

#include<stdio.h>

int array(int n, int arr[]);

int main()
{
	int n, arr[100];
	
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	printf("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	array(n, arr);
}
int array(int n, int arr[])
{
	int found=0,num;
	
	printf("Enter the element to search");
	scanf("%d",&num);
	
	for(int i=0;i<n;i++)
	{
		if(arr[i]==num)
		{
			printf("Element found in an array: \n");
			found=1;
			break;
		}
	}
	if(!found)
	{
		printf("Element not found in an array");
	}
	return 0;
}
