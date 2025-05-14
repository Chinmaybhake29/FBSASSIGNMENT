/*4. Check if the given number is even or odd.*/

#include<stdio.h>

int main()
{
	int a;
	printf("Enter the number: ");
	scanf("%d",&a);
	a%2==0 ? printf(" %d is a Even"):printf("%d is a Odd");
}
