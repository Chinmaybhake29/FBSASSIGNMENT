package Assignment2504;

public class even {
	public static int even(int n)
	{
		
		if(n%2==0)
		{
			System.out.println("Is a even number");
		}
		else
		{
			System.out.println("Is a odd Number");
		}
		return 0;
	}
	public static void main(String[] args) {
		even e=new even();
		int result=even(7);
		System.out.println(result);
	}
}
