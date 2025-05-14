#include<string.h>
#include<stdio.h>

main()
{
	char s[20];
	int count=0;
	
	printf("Enter the string: ");
	scanf("%s",s);
	
	for(int i=0;i<strlen(s);i++)
	{
		if(s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u')
		{
			count++;
		}
	}
	printf("%d vowels are found",count);
	return 0;
}
