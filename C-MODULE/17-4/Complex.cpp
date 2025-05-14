#include<stdio.h>
#include<string.h>

struct Complex
{
	float real;
	float imag;
};
int main()
{
	Complex num1,num2,sum;
	
	printf("Enter the real number 1: ");
	scanf("%f",&num1.real);
	
	printf("Enter the Imaginary number 1: ");
	scanf("%f",&num1.imag);

	printf("Enter the real number 2: ");
	scanf("%f",&num2.real);
	
	printf("Enter the Imaginary number 2: ");
	scanf("%f",&num2.imag);
	
	sum.real=num1.real+num2.real;
	sum.imag=num1.imag+num2.imag;	
	
	printf("Sum = %.1f + %.1fi\n", sum.real, sum.imag);
	return 0;
}


