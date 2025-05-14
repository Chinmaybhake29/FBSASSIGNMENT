#include<stdio.h>

int main()
{
//	int a[5]={2,3,4,5,6};
//	int b[5]={5,6,7,8,23};
//	
//	int c[5];
//	
////	printf("Sum of two Array");
////	for(int i=0;i<5;i++)
////	{
////		c[i]=a[i]+b[i];
////		printf("%d\n", c[i]);
////	}
//	return 0;

	int n;
	printf("Enter the size of array: ");
	scanf("%d",&n);
	
	int a[n];
	
	for(int i=0;i<n;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<n;i++)
	{
		printf("%d",a[i]);
	}
	return 0;
}
