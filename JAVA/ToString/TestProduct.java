package ToString;

class Product
{
	String name;
	double price;
	
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getPrice() {
		return price;
	}

	void setPrice(double price) {
		this.price = price;
	}
//	void display()
//	{
//		System.out.println("Name: "+name);
//		System.out.println("Price: "+price);
//	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", ";
	}
	
}
class Electronics extends Product
{
	String Warranty;
	String Type;
	public Electronics(String name, double price, String warranty, String type) {
		super(name, price);
		Warranty = warranty;
		Type = type;
	}
	String getWarranty() {
		return Warranty;
	}
	void setWarranty(String warranty) {
		Warranty = warranty;
	}
	String getType() {
		return Type;
	}
	void setType(String type) {
		Type = type;
	}
	@Override
	public String toString() {
		return super.toString()+"Warranty=" + Warranty + ", Type=" + Type + "]";
	}
	
//	void display()
//	{
//		super.display();
//		System.out.println("Warranty: "+Warranty);
//		System.out.println("Type: "+Type);
//	}
	
}
class Cloths extends Product
{
	String size;

	public Cloths(String name, double price, String size) {
		super(name, price);
		this.size = size;
	}

	String getSize() {
		return size;
	}

	void setSize(String size) {
		this.size = size;
	}
//	void display()
//	{
//		super.display();
//		System.out.println("Size: "+size);
//	}

	@Override
	public String toString() {
		return super.toString()+"size=" + size + "]";
	}
	
}
public class TestProduct 
{
	public static void main(String[] args) 
	{
		Electronics e=new Electronics("GalaxyS24", 150000, "2 years", "Mobile");
		System.out.println(e);
		Cloths c=new Cloths("MaxFashion",3400,"36");
		System.out.println(c);
		
	}
}
