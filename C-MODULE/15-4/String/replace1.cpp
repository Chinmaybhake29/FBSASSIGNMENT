#include<stdio.h>
#include<string.h>

main()
{
	char s[30]="ABCS GHJK KLJL";
	char c='^';
	
	for(int i=0;s[i]!='\0';i++)
	{
		if(s[i]==' ')
		{
			s[i]=c;
		}
	}
	printf("Modified string is: %s",s);
}
