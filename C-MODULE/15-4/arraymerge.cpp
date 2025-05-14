//8. Merge two arrays

#include<stdio.h>
#include<stdlib.h>
int array(int a[], int b[], int n1, int n2);

int main()
{
	int *a,*b, n1,n2;
	
	printf("Enter the size of an array: ");
	scanf("%d",&n1);
	
	a=(int *)malloc(n1 * sizeof(int));
	b=(int *)malloc(n2 * sizeof(int));
	
	printf("Enter 1st elements of an array");
	
	for(int i=0;i<n1;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("Enter the size of an array: ");
	scanf("%d",&n2);
	
	printf("Enter 2nd elements of an array");
	
	for(int i=0;i<n2;i++)
	{
		scanf("%d",&b[i]);
	}
	array(a,b,n1,n2);
}
int array(int a[], int b[], int n1, int n2)
{
	int merge[100];
	
	for(int i=0;i<n1;i++)
	{
		merge[i]=a[i];
	}
	
	for(int i=0;i<n2;i++)
	{
		merge[n1+i]=b[i];
	}
	
	printf("Merge Array is: \n");
	
	for(int i=0;i<n1+n2;i++)
	{
		printf("%d ",merge[i]);
	}
	return 0;
}
