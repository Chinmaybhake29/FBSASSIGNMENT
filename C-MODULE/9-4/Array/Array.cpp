//1. Find minimum and maximum number in array. 

#include<stdio.h>

int main()
{
	int a[5], max=a[0], min=a[0];
	
	for(int i=0;i<5;i++)
	{
		scanf("%d",&a[i]);
	}
	for(int i=0;i<5;i++)
	{
		printf("%d\n", a[i]);
		if(a[i]>max)
			max=a[i];
		if(a[i]<min)
			min=a[i];
	}
	printf("Maximum of array: %d\n", max);
	printf("Minimum of array: %d\n",min);
	return 0;
}
