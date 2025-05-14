//mystrncat

#include<stdio.h>

void concat(char s1[20], char s2[20])
{
	int i, length=0;
	
	for(i=0;s1[i]!='\0';i++)
	{
		length++;
	}
	for(i=0;s2[i]!='\0';i++)
	{
		s1[length+i]=s2[i];
	}
	s1[length+i]='\0';
}
int main()
{
	char s1[20], s2[20];
	
	printf("Enter the string 1: ");
	scanf("%s",&s1);
	
	printf("Enter the string 2: ");
	scanf("%s",&s2);
	
	concat(s1,s2);
	
	printf("Concat String is: %s\n",s1);
	return 0;
	
}
