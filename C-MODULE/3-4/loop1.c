#include<stdio.h>

int main()
{
	int i,j,n;
	
	printf("Enter the limit: ");
	scanf("%d",&n);
	
	for(i=1; i<=n;i++)
	{
		int status=1;
		
		for(j=1; j*j<=i;j++)
		{
			if(i%j==0){
				int status=0;
				break;
			}
		}
		if(status){
			printf("%d \n",i);
	    }
	}
	printf("\n");
	return 0;
	
}

