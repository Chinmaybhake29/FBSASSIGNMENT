#include<stdio.h>

void Eligible(int a, int b)
{
	if(a>=21 && a>=18)
	{
		printf("Both eligible to marry");
	} 
	else 
	{
		printf("Call Police");	
	}
}
void main()
{
	Eligible(23,67);
}
