#include<stdio.h>
#include<string.h>

 main()
{
	char s[20];
	
	printf("Enter the string ");
	scanf("%s",s);
	
	for(int i=0;s[i]!='\0';i++)
	{
		if(s[i]=='a' || s[i]=='A')
		{
			s[i]='$';
		}
	}
	printf("%s\n",s);
	return 0;
}
