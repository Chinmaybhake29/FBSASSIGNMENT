package Ass0205;

class Date1
{
	int day,month,year;

	int getDay() {
		return day;
	}

	void setDay(int day) {
		this.day = day;
	}

	int getMonth() {
		return month;
	}

	void setMonth(int month) {
		this.month = month;
	}

	int getYear() {
		return year;
	}

	void setYear(int year) {
		this.year = year;
	}
	
	void display()
	{
		System.out.println("Date: " + this.day + "/" + this.month + "/" + this.year);
	}
}
public class Date 
{
	public static void main(String[] args) {
		Date1 d=new Date1();
		d.setDay(29);
		d.setMonth(01);
		d.setYear(2002);
		d.getDay();
		d.getMonth();
		d.getYear();
		d.display();
	}
}
