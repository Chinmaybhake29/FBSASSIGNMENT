/*5. Accept the price from user. Ask the user if he is a student (user may say yes or
no). If he is a student and he has purchased more than 500 than discount is 20%
otherwise discount is 10%.But if he is not a student then if he has purchased
more than 600 discount is 15% otherwise there is not discount.*/

#include <stdio.h>

int main() {
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

