/*1.	Finding F from C (temp).*/

#include<stdio.h>
int main()
{
	int f,c;
	printf("Enter the number");
	scanf("%d",&f);
	c=(f-32)*5/9;
	printf("The Conversion of %d in C %d",f,c);
}
