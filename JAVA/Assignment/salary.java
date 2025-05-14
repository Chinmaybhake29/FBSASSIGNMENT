package Assignment;

public class salary {
	public static void main(String args[])
	{
		int salary=89000, da, ta, hra,total;
		
		if(salary<=5000){
		da=salary*10/100;
		ta=salary*20/100;
		hra=salary*25/100;
		} else {
		da=salary*15/100;
		ta=salary*25/100;
		hra=salary*30/100;
		}
		total=da+ta+hra;
		System.out.printf("The Basic Salary of %d da %d, ta %d, hra %d",total,da,ta,hra);
	}
}
