#include<stdio.h>

int isPalindrome(int n);

int main()
{
	int n;
	printf("Enter the number");
	scanf("%d",&n);
	
	int r=isPalindrome(n);	
	if(r==0)
	{
		printf("is a Plaindrome");
	} 
	else
	{
		printf("is not a Palindrome");
	}
}
int isPalindrome(int n)
{
	int temp, rem, sum=0;
	
	temp=n;
	
	while(n>0)
	{
		rem=n%10;
		sum=(sum*10)+rem;
		n=n/10;
	}
	if(temp==sum)
	{
		return 0;
	} 
	else 
	{
		return 1;
	}
}
