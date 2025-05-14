package Ass0205;

class Product1
{
	int id, quantity;
	String name;
	double price;
	
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	int getQuantity() {
		return quantity;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
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
	void display()
	{
		System.out.println("\n Id: " + this.id + "\n Name: " + this.name + "\n Quantity: " + this.quantity + "\n Price: " + this.price);
	}
}
public class Product 
{
	public static void main(String[] args) 
	{
		Product1 p=new Product1();
		p.setId(101);
		p.setName("Chinmay");
		p.setPrice(799.56);
		p.setQuantity(2);
		p.getId();
		p.getName();
		p.getPrice();
		p.getQuantity();
		p.display();
	}
}
