//5. Print alternate elements in array. 

#include<stdio.h>

int main()
{
	int n;
	
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	int arr[n]; 
	
	for(int i=0;i<n;i++)
	{
		scanf("%d", &arr[i]);
	}
	printf("Print Alternate Number: ");
	
	for(int i=0;i<n;i=i+2)
	{
		printf("%d\n",arr[i]);
	}
	return 0;
}
