#include<stdio.h>
#include<string.h>

main()
{
	char s1[20]="Chinmay";
	
	char s2[20];
	
	char s3[20]="Bhake";
	char s4[20]="hello";
	
	printf("Length of the string is: %d\n", strlen(s1));
	printf("Copy one string to the another string: %s\n", strcpy(s2,s1));
	printf("Concate the two strings: %s\n", strcat(s1,s3));
	int result=strcmp(s1,s3);
	if(result==0)
	{a
		printf("\n Both are matching");
	}
	else
	{
		printf("\n Sorry both are different");
	}
	char *a=strchr(s1,'a');
	printf("found at %d\n",a-s1,"Position ");
	printf("Reverse the string is: %s\n",strrev(s1));
	printf("Duplicate the string is: %s\n", strdup(s2));
	char s11[] = "Chinmay";
    char s12[] = "Chinmay1";

    printf("Length of initial segment is: %zu\n", strspn(s11, s12));
}
