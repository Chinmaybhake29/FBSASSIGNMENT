package Construct;

class Complex1
{
	double real;
	double imaginary;
		
	Complex1() {
		real=89;
		imaginary=8.56;
	}
	Complex1(double r, double i)
	{
		real=r;
		imaginary=i;
	}
	
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
		System.out.println("\n Real: " + real + "\n Imaginary: " + imaginary + "i");
	}
}

