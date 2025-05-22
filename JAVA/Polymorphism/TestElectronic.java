package Polymorphism;

class ElectroncDevice
{
	String brand;
	String battery_life;
	
	ElectroncDevice() {
		this.brand="Not Given";
		this.battery_life="Not Given";
	}

	ElectroncDevice(String brand, String battery_life) {
		super();
		this.brand = brand;
		this.battery_life = battery_life;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	String getBattery_life() {
		return battery_life;
	}

	void setBattery_life(String battery_life) {
		this.battery_life = battery_life;
	}

}
class Laptop1 extends ElectroncDevice
{
	String RAM;

	Laptop1() {
		this.RAM="Not Given";
	}
	
	Laptop1(String brand, String battery, String rAM) {
		super(brand,battery);
		RAM = rAM;
	}

	String getRAM() {
		return RAM;
	}

	void setRAM(String rAM) {
		RAM = rAM;
	}
	void display()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Battery Life: " + battery_life);
		System.out.println("RAM: " + RAM);
	}
}
public class TestElectronic {
	public static void main(String[] args) {
//		Laptop1 l=new Laptop1();
//		l.brand="DELL";
//		l.battery_life="100%";
//		l.RAM="16GB";
//		l.display();
		
		Laptop l;
		
		l=new Laptop("DELL", "16GB", "512GB", "100%");
		l.display();
		
		
	}
}
