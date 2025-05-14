package Assignment0105;

class Distance1
{
	double feet, inch;
	
	public void setDistance(double feet, double inch)
	{
		this.inch=inch;
		this.feet=feet;
	}
	void display()
	{
		System.out.println("\n Inch: " + this.inch + "\n Feet: " + this.feet);
	}
}
public class Distance {
	public static void main(String[] args) {
		Distance1 d1=new Distance1();
		d1.setDistance(2,4.5);
		d1.display();	
		
	}
}
