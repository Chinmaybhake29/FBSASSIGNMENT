package Polymorphism;
class Shape
{
	String color;

	Shape(){
		System.out.println("Default Constructor called");
		this.color="Not Given";
	}
	
	public Shape(String color) {
		this.color = color;
	}

	String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}
}
class Rectangle extends Shape
{
	double length;
	double width;
	
	Rectangle() {
		this.length=0;
		this.width=0;
	}
	public Rectangle(String color, double length, double width) {
		super(color);
		this.length = length;
		this.width = width;
	}
	double getLength() {
		return length;
	}
	void setLength(double length) {
		this.length = length;
	}
	double getWidth() {
		return width;
	}
	void setWidth(double width) {
		this.width = width;
	}
	void display()
	{
		System.out.println("Color: " + color);
		System.out.println("Length: " + length);
		System.out.println("Width: " + width);
	}
}
public class TestShape {
	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.color="Red";
		r.length=8;
		r.width=9;
		r.display();
	}
}
