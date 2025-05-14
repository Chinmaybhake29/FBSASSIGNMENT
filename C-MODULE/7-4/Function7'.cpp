#include<stdio.h>

int swap(int a, int b);

int main()
{
	int a, b;
	
	printf("Enter the number: ");
	scanf("%d%d",&a,&b);
	
	swap(a,b);
}
int swap(int a, int b)
{
	a=a+b;
	b=a-b;
	a=a-b;
	
	printf("A: %d\n", a);
	printf("B: %d\n", b);
	
	return 0;
}
