//mystrlower

#include<stdio.h>

void lower(char s[])
{
 	int i=0;
 	
 	while(s[i]!='\0')
	{
 		if(s[i] >= 'A'&& s[i] <= 'Z')
 		{
 			s[i]=s[i]+32;
		 }
		 i++;
	}
}
int main()
{
	char s[20];
	
	printf("Enter the string: ");
	scanf("%s",&s);
	
	lower(s);
	
	printf("Lower case: %s",s);
	return 0;
}
