package Construct;

public class Time {
	int hour, min, sec;
	
	Time()
	{
		hour=03;
		min=13;
		sec=34;
	}
	Time(int h, int m, int s)
	{
		hour=h;
		min=m;
		sec=s;
	}
	void setHour(int hour) {
		this.hour = hour;
	}


	void setMin(int min) {
		this.min = min;
	}

	void setSec(int sec) {
		this.sec = sec;
	}


	void display()
	{
		System.out.println("Time is:- " + this.hour + ":" + this.min + ":"+ this.sec);
	}
}
