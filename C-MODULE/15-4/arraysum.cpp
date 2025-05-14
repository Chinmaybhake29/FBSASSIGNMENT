#include<stdio.h>
#include<stdlib.h>

int arraysum(int a[5], int n);

int main()
{
	int n, *a;
	
	printf("Enter the size of an array is: ");
	scanf("%d",&n);
	
	a=(int *)malloc(n * sizeof(int));
	
	printf("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
		scanf("%d", &a[i]);
	}
	arraysum(a, n);
}
int arraysum(int a[], int n)
{
	int sum=0;
	
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	printf("Sum of array is: %d\n", sum);
	return 0;
}


