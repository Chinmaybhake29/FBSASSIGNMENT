#include<stdio.h>
#include<string.h>

main()
{
	char s[20], n;
	int found=0;
	
	printf("Enter the string: ");
	scanf("%s",s);
	
	printf("Enter the element to search: ");
	scanf(" %c",&n);
	
	for(int i=0;i<strlen(s);i++)
	{
		if(s[i]==n)
		{
			found=1;
			printf("Found",n,i);
			break;
		}
	}
	if(!found)
	{
		printf("Element not found");
	}
	return 0;
}
