package Ass2903;

public class largest3 {
	public static void main(String[] args) {
		int a=1,b=2,c=3;
		
		if(a>b && a>c){
		System.out.printf("Largest %d",a);
		} else if(b>a && b>c){
			System.out.printf("Largest %d",b);
		} else {
			System.out.printf("Largest %d",c);
		}

	}
}
