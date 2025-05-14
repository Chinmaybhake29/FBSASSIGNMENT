package Construct;

class Distance1
{
	double feet, inch;
	
	Distance1() 
	{
		feet=8.9;
		inch=8.2;
	}
	Distance1(double f, double i)
	{
		feet=f;
		inch=i;
	}
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

