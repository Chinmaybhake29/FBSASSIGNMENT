//mystrcmp

#include<stdio.h>
int mystrcmp(char* s1,char* s2);

int main()
{
	char s1[20]="Chinmay";
	char s2[20]="Chinmay";
	printf("%d", mystrcmp(s1,s2));
}
int mystrcmp(char* s1,char* s2)
{
	int i=0; 
	
	while(s1[i]!='\0'||s2[i]!='\0')
	{
		if(s1[i]!=s2[i])
		{
			if(s1[i]>s2[i])
			{	
				return 1;
			} 
			else 
			{
				return -1;
			}
		}
		i++;
	}
	return 0;
}
