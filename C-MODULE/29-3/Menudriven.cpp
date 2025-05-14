/*4. Display a menu to the user (like 1.Even Odd 2. Basic salary etc), ask the user to
enter his choice,then based on that perform the desired operations.*/

#include<stdio.h>

int main()
{
	int number,option;
	
	printf("Enter the Number");
	scanf("%d",&number);
	
	printf("Enter the Option");
	scanf("%d",&option);
	
	if(option==1)
	{	
		number%2==0 ? printf("is a Even"):printf("is a Odd");
	} 
	else if(option==2)
	{
		int da, ha, ta, hra, total;
		if(number<=5000){
		da=number*10/100;
		ta=number*20/100;
		hra=number*25/100;
	} 
	else 
	{
		da=number*15/100;
		ta=number*25/100;
		hra=number*30/100;
	}
	total=da+ta+hra;
	printf("The Basic Salary of %d da %d, ta %d, hra %d",total,da,ta,hra);
	}
	
}
