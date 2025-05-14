//mystrlen

#include<stdio.h>

int Strlength(char s[])
{
	int i, length=0;
	
	for(int i=0;s[i]!='\0';i++)
	{
		length++;
	}
	return(length);
}
int main()
{
	char s[20];
	int length;
	
	printf("Enter the string: ");
	scanf("%s",&s);
	
	length=Strlength(s);
	printf("Length of the string is: %d",length);
	return 0;
}
