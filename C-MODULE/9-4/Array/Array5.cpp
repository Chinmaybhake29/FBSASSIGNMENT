//6. Accept array and print only prime numbers of array. 


#include<stdio.h>

int main()
{
    int n;
    
    printf("Enter the size of an array: ");
    scanf("%d", &n);
    
    int arr[n];
    
    printf("Enter %d numbers:\n", n);
    for(int i = 0; i < n; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("Prime numbers in the array are:\n");

    for(int i = 0; i < n; i++)
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

