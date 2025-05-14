#include<stdio.h>

int main()
{
	int n1,n2,merge[100];
	
	printf("Enter the size of an array: ");
	scanf("%d",&n1);
	
	printf("Enter the %d element",n1);
	
	int arr[n1];
	
	for(int i=0;i<n1;i++)
	{
		scanf("%d",&arr[i]);
	}
	
	printf("Enter the size of an array: ");
	scanf("%d",&n2);
	
 	int arr2[n2];
    
	printf("Enter the %d element",n2);
    
	for (int i = 0; i < n2; i++)
    {
        scanf("%d", &arr2[i]);
    }

    for (int i = 0; i < n1; i++)
    {
        merge[i] = arr[i];
    }
    for (int i = 0; i < n2; i++)
    {
        merge[n1 + i] = arr2[i];
    }

    printf("Merged Array:\n");
    
	for (int i = 0; i < n1 + n2; i++)
    {
        printf("%d ", merge[i]);
    }
    return 0;
}
