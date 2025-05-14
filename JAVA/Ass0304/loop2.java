package Ass0304;
//Print fibonacci series?(optional)

public class loop2 {
	public static void main(String[] args) {
		int n1=0, n2=1, n3 = 0, number=89,i;
		
		for(i=2;i<number;i++)
		{
		n1=n2;
		n2=n3;
		n3=n1+n2;
		System.out.printf("%d, ",n3);
		}
	}
}
