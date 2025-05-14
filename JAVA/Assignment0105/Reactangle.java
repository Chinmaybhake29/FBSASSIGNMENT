package Assignment0105;

class Reactangle1
{
	int length, breadth;
	
	void setValues(int l, int b)
	{
		this.length=l;
		this.breadth=b;
	}
	void display()
	{
		System.out.println("\n Length: " + this.length + "\n Breadth: " + this.breadth + "\n Display: " + this.length * this.breadth);
	}
}
public class Reactangle 
{
	public static void main(String[] args) 
	{
		Reactangle1 r=new Reactangle1();
		
		r.setValues(7, 9);
		r.display();
	}
}
