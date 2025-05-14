#include<stdio.h>

struct Employee
{
	int id;
	char name[20];
	int salary;	
};
int main()
{
	struct Employee employee[5];
	
	for(int i=0;i<5;i++)
	{
		printf("Enter the employee details: %d\n",i+1);
		scanf("%s",employee[i].name);
		scanf("%d",&employee[i].id);
		scanf("%d",&employee[i].salary);
	}
	printf("Employee details: ");
	for(int i=0;i<5;i++)
	{
		printf("\n %s \n %d \n %d",employee[i].name,employee[i].id,employee[i].salary);
	}
	return 0;
	
}
