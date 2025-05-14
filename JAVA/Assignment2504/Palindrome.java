package Assignment2504;

public class Palindrome 
{
	public static int palindrome(int n)
	{
		int rem, sum=0, temp;
				
		while(n>0)
		{
			rem=n%10;
			sum=(sum*10)+rem;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Palindrome p=new Palindrome();
		
		int n=121;
		
		int result=palindrome(n);
		
		if(result==n)
		{
			System.out.println("is a palindrome number");
		}
		else
		{
			System.out.println("i not a palindrome number");
		}
	}
}

