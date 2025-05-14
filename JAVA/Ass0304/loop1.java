package Ass0304;
//2. Print prime number in the given range 1 to n?

public class loop1 {
	public static void main(String[] args) {
		int i,j,n=10,sum;
		
		for(i=1;i<=n;i++)
		{
		sum=0;
		for(j=1;j<i;j++)
		{
		if(i%j==0)
		 {
		sum=sum+j;
		}
		}
		if(i==sum)
		{
			System.out.printf("%d, ",i);
		}
		}
		System.out.printf("\n");
	}
}
