package Ass2903;

public class dis {
	public static void main(String[] args) {
		double price=788f, discount = 0.0, finalprice;
		 char student='y';

		 if (student == 'Y' || student == 'y') {
		 if (price > 500) {
		 discount = 20.0;
		 } else {
		 discount = 10.0;
		 }
		 } else if (student == 'N' || student == 'n') {
		 if (price > 600) {
		 discount = 15.0;
		 } else {
			 System.out.println("No Discount\n");
		 }
		 }
		 finalprice = price - (price * discount / 100);
		 System.out.printf("Final Price is: %.2lf\n", finalprice);
	}
}
