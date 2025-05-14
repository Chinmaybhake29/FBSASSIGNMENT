#include<stdio.h>

int largest(int a, int b, int c);

int main()
{
	int a,b,c;
	
	printf("Enter the three number: ");
	scanf("%d %d %d",&a,&b,&c);
	
	largest(a,b,c);
}
int largest(int a, int b, int c)
{
	if(a>b && a>c){
		printf("Largest No: %d",a);
	}else if(b>a && b>c){
		printf("Largest No: %d",b);
	}else{
		printf("Largest No: %d",c);
	}
	return 0;
}

