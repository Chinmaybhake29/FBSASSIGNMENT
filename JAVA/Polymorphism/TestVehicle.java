package Polymorphism;

class Vehicle
{
	String brand;
	double speed;
	String fual_type;
	
	public Vehicle(String brand, double speed, String fual_type) {
		super();
		this.brand = brand;
		this.speed = speed;
		this.fual_type = fual_type;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	double getSpeed() {
		return speed;
	}
	void setSpeed(double speed) {
		this.speed = speed;
	}
	String getFual_type() {
		return fual_type;
	}
	void setFual_type(String fual_type) {
		this.fual_type = fual_type;
	}
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Speed: "+speed);
		System.out.println("Fuel Type: "+fual_type);
	}
	
}
class Bike extends Vehicle
{
	int gears;

	public Bike(String brand, double speed, String fual_type, int gears) {
		super(brand, speed, fual_type);
		this.gears = gears;
	}

	int getGears() {
		return gears;
	}

	void setGears(int gears) {
		this.gears = gears;
	}
	void display()
	{
		super.display();
		System.out.println("Gear: "+gears);
	}
}
class Car extends Vehicle
{
	String doors;

	public Car(String brand, double speed, String fual_type, String doors) {
		super(brand, speed, fual_type);
		this.doors = doors;
	}

	String getDoors() {
		return doors;
	}

	void setDoors(String doors) {
		this.doors = doors;
	}
	
	void display()
	{
		super.display();
		System.out.println("Doors: "+doors);
	}
}
class Bus extends Vehicle
{
	int capacity;

	public Bus(String brand, double speed, String fual_type, int capacity) {
		super(brand, speed, fual_type);
		this.capacity = capacity;
	}

	int getCapacity() {
		return capacity;
	}

	void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	void display()
	{
		super.display();
		System.out.println("Capacity: "+capacity);
	}
}
class Truck extends Vehicle
{
	String load_limit;

	public Truck(String brand, double speed, String fual_type, String load_limit) {
		super(brand, speed, fual_type);
		this.load_limit = load_limit;
	}

	String getLoad_limit() {
		return load_limit;
	}

	void setLoad_limit(String load_limit) {
		this.load_limit = load_limit;
	}
	
	void display()
	{
		super.display();
		System.out.println("Load Limit: "+load_limit);
	}
}
public class TestVehicle {
	public static void main(String[] args) 
	{
		Bike b=new Bike("Honda Shine", 140, "Petrol", 6);
		b.display();
		
		Car c=new Car("Volvo", 9, "Diesel", "5 Doors");
		c.display();
		
		Bus b1=new Bus("Volvo", 9, "Petrol", 34);
		b1.display();
		
		Truck t=new Truck("TATA", 6, "Diesel", "2000 ton");
		t.display();
	}
}
