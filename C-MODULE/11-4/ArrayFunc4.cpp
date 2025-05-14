/*5. Print alternate elements in array. */
#include<stdio.h>

int array(int a[], int n);

int main()
{
	int a[100],n;
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	printf("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	array(a,n);
}
int array(int a[], int n)
{
	for(int i=0;i<n;i=i+2)
	{
		printf("%d\n",a[i]);
	}
	return 0;
}
