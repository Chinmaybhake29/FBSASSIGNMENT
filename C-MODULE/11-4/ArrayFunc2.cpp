/*3. Find sum of all numbers. */
#include<stdio.h>

int array(int a[], int n);

int main()
{
	int a[100], n;
	
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	printf("Enter the elements: ");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	array(a,n);
}              
int array(int a[], int n)
{
	int sum=0;
	
	printf("Sum of an array: %d\n");
	for(int i=0;i<n;i++)
	{
		sum=sum+a[i];
	}
	printf("%d\n",sum);
	return 0;
}                                                                                                           
