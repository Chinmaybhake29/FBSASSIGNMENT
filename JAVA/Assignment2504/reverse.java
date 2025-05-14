package Assignment2504;

public class reverse 
{
	public static int reverse(int n)
	{
		int rem, sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int result=reverse(10456);
		System.out.println(result);
	}
}
