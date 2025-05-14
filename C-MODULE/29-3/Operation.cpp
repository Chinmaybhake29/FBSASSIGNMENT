/*3. Accept two numbers from user and an operator (+,-,/,*,%) based on that
perform the desiredoperations.
*/

#include<stdio.h>

int main()
{
	  int a, b;
    char op;
    
    printf("Enter the two numbers: ");
    scanf("%d %d", &a, &b);
    
    printf("Enter the operator: ");
    scanf(" %c", &op); 
	
	if(op=='+'){
		printf("Addition %d",a+b);
	} else if(op=='-'){
		printf("Subtraction %d",a-b);
	} else if(op=='*'){
		printf("Multiplecation %d",a*b);
	} else if(op=='/'){
		
		if((a%0==0)&&(b%0==0)){
			printf("Sorry I won't be divide by zero");
		} else {
			printf("Division %d",a/b);
		}
		
	} else {
		printf("Wrong Choice");
	}
}
