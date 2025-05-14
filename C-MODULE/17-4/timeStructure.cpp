#include<stdio.h>

struct Time
{
	int hour;
	int Minute;
	int Second;
};
Time storeTime()
{
	Time t;
	printf("\nEnter the details: ");
	scanf("%d",&t.hour);
	scanf("%d",&t.Minute);
	scanf("%d",&t.Second);
	if(t.hour > 24||t.Minute > 60||t.Second > 60)
	{
		printf("Error! Invalid Input");
	}
	return t;
}
void display(Time t1)
{
	printf("Time: %d:%d:%d",t1.hour,t1.Minute,t1.Second);
}
int main()
{
	Time h1,h2,h3;
	
	h1=storeTime();
	display(h1);
	
	h2=storeTime();
	display(h2);
	
	h3=storeTime();
	display(h3);
}
