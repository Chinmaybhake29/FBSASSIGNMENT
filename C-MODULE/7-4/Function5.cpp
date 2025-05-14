#include<stdio.h>

double Discount(int price, char student); //Declartion

int main()
{
	double price;
	
	printf("Enter the price: ");
	scanf("%lf",&price);
	
	char student;            			//Calling
	
	printf("Are you a student? (Y/N): ");
    scanf(" %c", &student); 

	Discount(price, student);

}
double Discount(int price, char student)  //Defination
{
	double discount = 0.0, finalprice;
	
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


