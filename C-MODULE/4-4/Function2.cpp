#include<stdio.h>

void temprature()
{
	int f,c;
	printf("Enter the number");
	scanf("%d",&f);
	c=(f-32)*5/9;
	printf("The Conversion of %d in C %d",f,c);
}
int main()
{
	temprature();
}
