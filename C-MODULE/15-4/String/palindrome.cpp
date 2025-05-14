#include<stdio.h>
#include<string.h>

int main()
{
	char s[20];
	int start=0, end, flag=1;
	
	printf("Enter the string: ");
	scanf("%s", s);
	
	end = strlen(s)-1;
	
	while(start<end)
	{
		if(s[start]!=s[end]){
			flag=0;
			break;
		}
		start++;
		end--;
	}
	if(flag==1)
		printf("is a Palindrome");
	else
		printf("is not a Palindrome");
	return 0;
	
}
