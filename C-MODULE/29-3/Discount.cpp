/*1. Find the price of item when discount is given (specify different discount based on
price)
*/

#include<stdio.h>

int main()
{
	float bill;
	float discount;
	
	printf("Enter the bill Amount");
	scanf("%f",&bill);
	
	printf("Enter the Discount Percentage");
	scanf("%f",&discount);

	if(discount==10)
	{
		if(discount==20){
			float afterdis = bill - (bill * 10 / 100);
		printf("After add %f discount on %f price is: %f",bill, discount,afterdis);
		}
	} else {
		printf("Sorry No more discount");
	}
}
