
#include<stdio.h>

int main()
{
//	int arr[5]={1,5,7,-1,5};
//	
//	for(int i=0;i<5;i++)
//	{
//		for(int j=0;j<=5;j++)
//		{
//			if(arr[i]+arr[j]==6)
//			{
//				printf("(%d %d), ",arr[i],arr[j]);
//			}
//		}
//	}

	int arr[100],n;
	
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	printf("Enter the element");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=5;j++)
		{
			if(arr[i]+arr[j]==6)
			{
				printf("(%d %d), ",arr[i],arr[j]);
			} 
			else 
			{
				printf("No pair found!");
			}
		}
	}
	return 0;
}
