package Assignment2504;

public class Eligible {
	public static int Eligible(int n1, int n2)
	{
		if(n1>=21 && n2>=18)
		{
			System.out.println("Both are eligible to marry");
		}
		else
		{
			System.out.println("Call Police");
		}
		return 0;
	}
	public static void main(String[] args) {
		Eligible(23, 34);
		
	}
}
