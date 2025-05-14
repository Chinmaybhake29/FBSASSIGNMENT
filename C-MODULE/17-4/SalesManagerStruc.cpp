#include<stdio.h>

struct SalesManager
{
	int id;
	char name[20];
	float salary;
	float incentive;  
	float target;
};
SalesManager storeSM()
{
	SalesManager sm;
	printf("Enter the details: ");
	scanf("%d",&sm.id);
	scanf("%s",sm.name);
	scanf("%f",&sm.salary);
	scanf("%f",&sm.incentive);
	scanf("%f",&sm.target);
	return sm;
}
void display(SalesManager r1)
{
	printf("Id: %d\n",r1.id);
	printf("Name: %s\n",r1.name);
	printf("Salary: %f\n",r1.salary);
	printf("Incentive: %f\n",r1.incentive);
	printf("Target: %f\n",r1.target);
}
int main()
{
	SalesManager h1,h2,h3;
	
	h1=storeSM();
	display(h1);
	
	h2=storeSM();
	display(h2);
	
	h3=storeSM();
	display(h3);
}
