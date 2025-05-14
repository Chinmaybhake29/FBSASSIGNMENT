/*6. Write a program to check if person is eligible to marry or not (male age >=21
and female age>=18).*/

#include<stdio.h>

int main()
{
	int a,b;
	printf("Enter the Male age: ");
	scanf("%d",&a);
	printf("Enter the Female age");
	scanf("%d",&b);
	
	if(a>=21 && b>=18)
	{
		printf("Both are eligible of Marry");
	} else {
		printf("Call Police");
	} 
	
}
