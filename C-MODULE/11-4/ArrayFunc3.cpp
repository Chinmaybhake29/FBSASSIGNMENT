/*4. Find odd and even among the numbers. */
#include<stdio.h>

int array(int a[], int n);

int main()
{
	int a[100], n;
	
	printf("Enter the size of an array: ");
	scanf("%d",&n);
	
	printf("Enter the element");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	array(a,n);
}
int array(int a[], int n)
{
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
