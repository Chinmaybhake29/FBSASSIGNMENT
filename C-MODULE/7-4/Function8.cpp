//#include<stdio.h>
//
//int main()
//{
//	int n, status=0, i;
//	
//	printf("Enter the number: ");
//	scanf("%d",&n);
//	
//	while(i<n)
//	{
//		if(n%i==0)
//		{
//			status=1;
//			break;
//		}
//		i++;
//	}
//	if(status==0)
//		printf("%d is prime number");
//	else
//		printf("%d is not a prime number");
//	return 0;
//}

#include<stdio.h>

int prime(int n);

int main()
{
	int n;
	
	printf("Enter the number: ");
	scanf("%d",&n);
	
	prime(n);
}
int prime(int n)
{
	int status=0, i=2;
	
	while(i<n)
	{
		if(n%i==0)
		{
			status=1;
			break;
		}
		i++;
	}
	if(status==0)
	{
		printf("%d is a prime number");
	}
	else
	{
		printf("%d is not a prime number");	
	}
}

