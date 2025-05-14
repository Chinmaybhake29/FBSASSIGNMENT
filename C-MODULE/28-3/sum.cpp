/*Accept a 3 digit number from user and find the sum of the digits and also
reverse the number*/

#include <stdio.h>

int main() {
  int num, sum = 0;

  printf("Enter a 3-digit number: ");
  scanf("%d", &num);
  
  sum += num % 10;      
  num /= 10;            
  sum += num % 10;      
  num /= 10;            
  sum += num;            
  

  printf("Sum of digits: %d\n", sum);

  return 0;
}
