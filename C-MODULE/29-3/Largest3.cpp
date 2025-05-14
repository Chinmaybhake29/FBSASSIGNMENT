/*2. Write a program to find greatest of three numbers using nested if-else*/

#include<stdio.h>

int main()
{
	int a,b,c;
	
	printf("Enter the three Number");
	scanf("%d%d%d",&a,&b,&c);
	
		if(a>b && a>c){
			printf("Largest %d",a);
		} else if(b>a && b>c){
			printf("Largest %d",b);
		} else {
			printf("Largest %d",c);
		}
		return 0;
}
