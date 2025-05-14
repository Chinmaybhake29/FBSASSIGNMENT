package Assignment2504;

public class Fibonacci {
	
	public static int fibonacci(int n)
	{
		int n1=0,n2=1,n3, i;
		
		n=10;
		
		for(i=2;i<n;i++)
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
		return 0;
	}
	public static void main(String[] args) {
		Fibonacci f=new Fibonacci();
		int result=fibonacci(5);
		System.out.println(result);
	}
}
