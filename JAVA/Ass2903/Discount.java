package Ass2903;

public class Discount {
	public static void main(String[] args) {
		float bill=2300f;
		float discount=10f;
		
		if(discount==10)
		{
		if(discount==20){
		float afterdis = bill - (bill * 10 / 100);
		System.out.printf("After add %f discount on %f price is: %f",bill, discount,afterdis);
		}
		} else {
		System.out.printf("Sorry No more discount");
		}

	}
}
