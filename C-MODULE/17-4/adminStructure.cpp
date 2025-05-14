#include <stdio.h>

struct admin {
	int id;
	char name[20];
	float salary;
	float allowance;
};

void store(struct admin admins[]) 
{
	for (int i = 0; i < 3; i++) 
	{
		printf("Enter the details of admin: %d\n", i + 1);
		printf("Enter the id: ");
		scanf("%d", &admins[i].id);
		printf("Enter the name: ");
		scanf("%s", admins[i].name);
		printf("Enter the salary: ");
		scanf("%f", &admins[i].salary);
		printf("Enter the allowance: ");
		scanf("%f", &admins[i].allowance);
	}
}

void display(struct admin admins[]) 
{
	for (int i = 0; i < 3; i++) 
	{
		printf("\n Details of admin %d:", i + 1);
		printf("ID: %d\n", admins[i].id);
		printf("Name: %s\n", admins[i].name);
		printf("Salary: %f\n", admins[i].salary);
		printf("Allowance: %f\n", admins[i].allowance);
	}
}

int main() {
	struct admin admins[3];
	store(admins, 3);
	display(admins, 3);
	return 0;
}

