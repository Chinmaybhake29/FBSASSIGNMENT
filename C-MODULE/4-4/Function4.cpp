#include<stdio.h>

void evenodd(int a)
{
	if(a%2==0)
	{
		printf("%d is even",a);
	}
	else
	{
		printf("%d is odd",a);
	}
}
int main()
{
	evenodd(4);
}
