#include<string.h>
#include<stdio.h>

main()
{
	char s[20];
	int count=0;
	
	printf("Enter the string: ");
	scanf("%s",s);
	
	for(int i=0;s[i]!='\0';i++)
	{
		if(s[i]!=' ')
		{
			count++;
		}
	}
	printf("Total word is: %d",count);
	return 0;
}


