/*1. Find the minimum and maximum elements in array*/
#include<stdio.h>

int array(int a[], int n);

int main()
{
	int a[5],n;
	
	printf("Enter the size of an array: ");
	scanf("%d",&n);
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	array(a, n);
}
int array(int a[], int n)
{
	int max=a[0], min=a[0];
	
	for(int i=0;i<n;i++)
	{
		printf("%d\n", a[i]);
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	printf("Maximum of array: %d\n", max);
	printf("Minimum of array: %d\n",min);
	return 0;
}
