//mystrcpy

#include<stdio.h>

void strcpy(char str2[], char str1[])
{
	int i;
	for(i=0; str1[i]!='\0';i++)
	{
		str2[i]=str1[i];
	}
	str2[i]!='\0';
}
int main()
{
	char str1[20], str2[20];
	
	printf("Enter the string: ");
	scanf("%s",&str1);
	
	strcpy(str2,str1);
	
	printf("Copied String is: %s",str2);
}
