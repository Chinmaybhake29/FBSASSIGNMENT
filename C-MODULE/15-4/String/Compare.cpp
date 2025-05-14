#include<stdio.h>
#include<string.h>

main()
{
	char s1[100], s2[100];
	int len1=0, len2=0;
	
	printf("Enter the string 1: ");
	scanf("%s",s1);
	
	printf("Enter the string 2: ");
	scanf("%s",s2);
	
	while(s1[len1]!='\0')
	{
		len1++;
	}
	while(s2[len2]!='\0')
	{
		len2++;
	}
	if(len1>len2){
		printf("Larger string is: %s\n", s1);
	} else if(len2>len1){
		printf("Larger string is: %s\n", s2);
	} else {
		printf("Both are equal");
	}
	return 0;
}
