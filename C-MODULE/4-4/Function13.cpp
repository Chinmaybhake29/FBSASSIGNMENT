#include<iostream>

void Fibonacci()
{
	int n1=0, n2=1, n3, number,i;
	
	printf("Enter the number: ");
	scanf("%d",&number);
	
	for(i=2;i<number;i++)
	{
		n3=n1+n2;
		printf("%d, ",n3);
		n1=n2;
		n2=n3;
	}
}
int main()
{
	Fibonacci();
}
