package Ass2903;

public class menu {
	public static void main(String[] args) {
		int a=9, b=9;
		 char op='+';

		if(op=='+'){
			System.out.printf("Addition %d",a+b);
		} else if(op=='-'){
			System.out.printf("Subtraction %d",a-b);
		} else if(op=='*'){
			System.out.printf("Multiplecation %d",a*b);
		} else if(op=='/'){
		if((a%0==0)&&(b%0==0)){
			System.out.printf("Sorry I won't be divide by zero");
		} else {
			System.out.printf("Division %d",a/b);
		}
		} else {
			System.out.printf("Wrong Choice");
		}
	}
}
