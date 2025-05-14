package Assignments;

public class Add
{
	public static int add(int n)
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
	public static void main(String[] args) {
		Add a=new Add();
		int n=2;
		int result=a.add(n);
		
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

	