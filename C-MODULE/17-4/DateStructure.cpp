#include<stdio.h>

struct Date
{
	int date;
	int month;
	int year;
};
Date storeDate()
{
	Date d;
	printf("\nEnter the details: ");
	scanf("%d",&d.date);
	scanf("%d",&d.month);
	scanf("%d",&d.year);
	return d;
}
void display(Date r1)
{
	printf("Date: %d/%d/%d",r1.date,r1.month,r1.year);
}
int main()
{
	Date h1,h2,h3;
	
	h1=storeDate();
	display(h1);
	
	h2=storeDate();
	display(h2);
	
	h3=storeDate();
	display(h3);
}
