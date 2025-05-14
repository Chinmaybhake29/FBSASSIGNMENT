package Assignment0105;

class Time1
{
	int hour;
	int min;
	int sec;

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
public class Time {
	public static void main(String[] args) 
	{
		Time1 t1=new Time1();
		t1.setHour(3);
		t1.setMin(11);
		t1.setSec(56);
		t1.display();
	}
}
