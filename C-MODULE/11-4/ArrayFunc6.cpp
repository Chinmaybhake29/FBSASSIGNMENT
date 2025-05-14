/*6. Accept array and print only prime numbers of array. */
#include<stdio.h>

int array(int n, int arr[]);

int main()
{
	int n,arr[100];
	
	printf("Enter the size of an array");
	scanf("%d",&n);
	
	printf("Enter the elements");
	for(int i=0;i<n;i++)
	{
		scanf("%d",&arr[i]);
	}
	array(n,arr);
}
int array(int n,int arr[])
{
	printf("Print the number of arrays are: \n");
	
	for(int i=0;i<n;i++)
	{
		int num = arr[i];
        int isPrime = 1; 

        if(num <= 1)
            isPrime = 0; 

        for(int j = 2; j <= num/2; j++)
        {
            if(num % j == 0)
            {
                isPrime = 0; 
                break;
            }
        }

        if(isPrime)
        {
            printf("%d ", num);
        }
	}
	return 0;
}
