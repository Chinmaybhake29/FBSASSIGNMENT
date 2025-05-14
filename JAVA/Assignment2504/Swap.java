package Assignment2504;

public class Swap 
{
	public static int swap(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("A: "+ a);
		System.out.println("B: "+b);
		return 0;
	}
	public static void main(String[] args) {
		Swap s=new Swap();
		
		int result=swap(3, 4);
		System.out.println(result);
	}
}
