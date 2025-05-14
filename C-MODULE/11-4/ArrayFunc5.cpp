./*
7. Take two array and add sum in third array
Examplearr[5]= {1,2, 3, 4,5}
brr[5]={10,20,30, 40, 50}
crr[5]={11,22,33,44,55}
*/
#include<stdio.h>

int array(int a[], int b[], int n);

int main()
{
	int a[100], b[100], n;
	
	printf("Enter the size of an array: ");
	
	scanf("%d",&n);
	
	printf("Enter the 1st elements: ");
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	
	printf("Enter the 2nd elements: ");
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&b[i]);
	}
	
	array(a,b,n);
	
}
int array(int a[], int b[], int n)
{
	int sum[100];
	
	for(int i=0;i<n;i++)
	{
		sum[i]=a[i]+b[i];
	}
	
	printf("Sum of two array is: \n");
	
	for(int i=0;i<n;i++)
	{
		printf("%d\n",sum[i]);
	}
	
	printf("\n");
	
	return 0;
}
