#include<stdio.h>

struct student
{
	int rollno;
	char name[20];
	int marks;
};
int main()
{
	struct student student[5];
	
	for(int i=0;i<2;i++)
	{
		printf("Enter the details of student: %d\n",i+1);
		scanf("%s",student[i].name);
		scanf("%d",&student[i].rollno);
		scanf("%d",&student[i].marks);
	}
	printf("Student Details");
	for(int i=0;i<2;i++)
	{
		printf("\n %s \n %d \n %d",student[i].name, student[i].rollno, student[i].marks);
	}
	return 0;
}

