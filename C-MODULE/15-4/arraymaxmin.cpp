#include<stdio.h>
#include<stdlib.h>

int arraymax(int a[5], int n);

int main()
{
	 int n, *a;

    printf("Enter the size of the array: ");
    scanf("%d", &n);

    a = (int *)malloc(n * sizeof(int));
    
	printf("Enter the element: ");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	arraymax(a,n);
}
int arraymax(int a[], int n)
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
	printf("Maximum Value of an array is: %d\n", max);
	printf("Minimum Value of an array is: %d\n", min);
	return 0;
}
