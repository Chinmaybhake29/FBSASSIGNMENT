package Assignment0105;

class Date1
{
	int day,month,year;
}
public class Date 
{
	public static void main(String[] args) {
		Date1 d1=new Date1();
		
		d1.day=21;
		d1.month=01;
		d1.year=2002;
		
		System.out.printf("Date: %d Month: %d Year: %d",d1.day,d1.month,d1.year);
	}
}
