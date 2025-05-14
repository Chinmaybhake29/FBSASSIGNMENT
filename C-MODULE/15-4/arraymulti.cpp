//5. Print alternate elements in array. 

#include<stdio.h>
#include<stdlib.h>

int arraymulti(int a[5], int n);

int main()
{
	int n, *a;
	
	printf("Enter the size of an array: ");
	scanf("%d",&n);
	
	a=(int *)malloc(n * sizeof(int));

	
	printf("Enter the elements");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	arraymulti(a,n);
}
int arraymulti(int a[], int n)
{
	
	for(int i=0;i<n;i=i+2)
	{
		printf(" %d ",a[i]);
	}
	return 0;
}

