/*2. Finding area and perimeter of rectangle or circle.*/

#include<stdio.h>

int main()
{
	//Area of Reactangle
	int l,b,react;
	printf("Enter the length and breath");
	scanf("%d%d",&l,&b);
	
	react=l*b;
	
	printf("Area of Reactangle is: %d",react);
	
	//Area of circle 
	int pi=3.14, r, circle;
	printf("\n Enter the radius: ");
	scanf("%d",&r);
	circle=pi*r*r;
	
	printf("Area of Circle: %d",circle);
	
	
}
