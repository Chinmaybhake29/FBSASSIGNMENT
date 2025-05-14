package Assignment2504;

public class sumofdigit 
{
	public static int sum(int n)
	{
		int sum=0, rem;
		
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		int result=sum(1234);
		System.out.println(result);
	}
}
