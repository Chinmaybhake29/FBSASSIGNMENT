package Construct;

public class Date 
{
	int day,month,year;

	Date()
	{
		day=01;
		month=01;
		year=2025;
	}
	Date(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
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
