//4. Find odd and even among the numbers. 

#include<stdio.h>
#include<stdlib.h>

int arrayoe(int a[5], int n);

int main()
{
	int n, *a;
	printf("Enter the size of an array: ");
	scanf("%d",&n);
	
	a=(int *)malloc(n * sizeof(int));
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	arrayoe(a, n);
}
int arrayoe(int a[], int n)
{
	printf("\n Even number");
	for(int i=0;i<n;i++)
	{
		if(a[i]%2==0)
		{
			printf("%d\n", a[i]);
		}
	}
	
	printf("\n Odd Number");
	for(int i=0;i<n;i++)
	{
		if(a[i]%2!=0)
		{
			printf("%d\n", a[i]);
		}
	
	}
	return 0;
}
