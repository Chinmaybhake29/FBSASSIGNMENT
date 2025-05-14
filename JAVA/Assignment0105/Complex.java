package Assignment0105;

class Complex1
{
	double real;
	double imaginary;
	
	public void setValues(double r, double i)
	{
		this.real=r;
		this.imaginary=i;
	}
	void display()
	{
		System.out.println("\n Real: " + this.real + "\n Imaginary: " + this.imaginary + "i");
	}
}
public class Complex {
	public static void main(String[] args) {
		Complex1 c=new Complex1();
		c.setValues(2.4, 8.9);
		c.display();
	}
}
