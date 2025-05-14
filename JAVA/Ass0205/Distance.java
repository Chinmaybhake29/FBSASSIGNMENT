package Ass0205;

class Distance1
{
	double feet, inch;
	
	double getFeet() {
		return feet;
	}
	void setFeet(double feet) {
		this.feet = feet;
	}
	double getInch() {
		return inch;
	}
	void setInch(double inch) {
		this.inch = inch;
	}
	void display()
	{
		System.out.println("\n Inch: " + this.inch + "\n Feet: " + this.feet);
	}
}
public class Distance {
	public static void main(String[] args) {
		Distance1 d1=new Distance1();
		d1.setFeet(2);
		d1.setInch(5.6);
		d1.display();
		
	}
}
