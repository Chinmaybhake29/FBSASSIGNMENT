//mystrupper

#include<stdio.h>

void Stringupper(char s[])
{
	int i=0;
	
	while(s[i]!='\0')
	{
		if(s[i] >= 'a' && s[i] <= 'z')
		{
			s[i]=s[i]-32;
		}
		i++;
	}
}
int main()
{
	char s[20];
	
	printf("Enter the string: ");
	scanf("%s",&s);
	
	Stringupper(s);
	
	printf("Uppercase the string: %s\n",s);
	return 0;
}
