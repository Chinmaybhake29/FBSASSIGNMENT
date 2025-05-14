#include<stdio.h>

int main()
{
	int n=121, temp, sum=0, rem;
	
	temp=n;
	
	while(n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(temp==sum)
		printf("Is a Plaindrome number");
	else
		printf("Is not a Palindrome number");
	return 0;
}
