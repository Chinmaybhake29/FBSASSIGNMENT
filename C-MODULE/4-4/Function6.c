#include<stdio.h>

void Discount1()
{
	double price, discount = 0.0, finalprice;
    char student;
    
	printf("Enter the price amount: ");
    scanf("%lf", &price);
    
    printf("Are you a student? (Y/N): ");
    scanf(" %c", &student); 

    if (student == 'Y' || student == 'y') {
        if (price > 500) {
            discount = 20.0;
        } else {
            discount = 10.0;
        }
    } else if (student == 'N' || student == 'n') {
        if (price > 600) {
            discount = 15.0;
        } else {
            printf("No Discount\n");
        }
    }

    finalprice = price - (price * discount / 100);
    printf("Final Price is: %.2lf\n", finalprice);

    return 0;
}
void main()
{
	Discount1();
}
