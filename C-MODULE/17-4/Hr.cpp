#include<stdio.h>

struct HR
{
	int id;
	char name[20];
	float salary;
	float commission;
};
HR storeHr()
{
	HR r;
	printf("Enter the details: ");
	scanf("%d",&r.id);
	scanf("%s",r.name);
	scanf("%f",&r.salary);
	scanf("%f",&r.commission);
	return r;
}
void display(HR r1)
{
	printf("Id: %d\n",r1.id);
	printf("Name: %s\n",r1.name);
	printf("Salary: %f\n",r1.salary);
	printf("Commission: %f\n", r1.commission);
}
int main()
{
	HR h1,h2,h3;
	
	h1=storeHr();
	display(h1);
	
	h2=storeHr();
	display(h2);
	
	h3=storeHr();
	display(h3);
}
