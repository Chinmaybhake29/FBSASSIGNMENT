package Assignment2504;

import java.io.ObjectInputFilter.Status;

public class Prime 
{
	public static int prime(int n)
	{
		int status=0, i=2;
		
		while(i<n)
		{
			if(n%i==0)
			{
				status=1;
				break;
			}
			i++;
		}
		return status;
	}
	public static void main(String[] args) 
	{
			Prime p=new Prime();
			
			int n=1;
			
			int result=prime(n);
			if(result==0)
			{
				System.out.println("is a prime number");
			}
			else
			{
				System.out.println("is not a prime number");
			}
	}

}
