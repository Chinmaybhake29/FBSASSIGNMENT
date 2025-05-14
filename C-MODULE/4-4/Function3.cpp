#include<stdio.h>

void reactnagle(int a, int b)
{	
	int result=a*b;
	printf("Area of Reactangle: %d",result);
}
void circular(int radius)
{
	int pi=3.14;
	int circle=pi*radius*radius;
	printf("Area of Circle: %d",circle);
}
int main()
{
	reactnagle(56,78);
	circular(56);
}
