package Ass0205;

class Complex1
{
	double real;
	double imaginary;
		
	
	double getReal() {
		return real;
	}

	void setReal(double real) {
		this.real = real;
	}
	
	double getImaginary() {
		return imaginary;
	}

	void setImaginary(double imaginary) {
		this.imaginary = imaginary;
	}

	void display()
	{
		System.out.println("\n Real: " + this.real + "\n Imaginary: " + this.imaginary + "i");
	}
}
public class Complex {
	public static void main(String[] args) {
		Complex1 c=new Complex1();
		c.setImaginary(2.3);
		c.setReal(8.9);
		c.display();
	}
}
