package ToString;

class Computer 
{
	String brand;
	String RAM;
	String Storage;
	public Computer(String brand, String rAM, String storage) {
		super();
		this.brand = brand;
		RAM = rAM;
		Storage = storage;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	String getRAM() {
		return RAM;
	}
	void setRAM(String rAM) {
		RAM = rAM;
	}
	String getStorage() {
		return Storage;
	}
	void setStorage(String storage) {
		Storage = storage;
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", RAM=" + RAM + ", Storage=" + Storage + "]";
	}
	
}
class Desktop extends Computer
{
	String power_supply;

	public Desktop(String brand, String rAM, String storage, String power_supply) {
		super(brand, rAM, storage);
		this.power_supply = power_supply;
	}

	String getPower_supply() {
		return power_supply;
	}

	void setPower_supply(String power_supply) {
		this.power_supply = power_supply;
	}

	@Override
	public String toString() {
		return super.toString()+ "Desktop [power_supply=" + power_supply + "]";
	}
	
	
}
class Laptop extends Computer
{
	String battery_life;

	public Laptop(String brand, String rAM, String storage, String battery_life) {
		super(brand, rAM, storage);
		this.battery_life = battery_life;
	}

	String getBattery_life() {
		return battery_life;
	}

	void setBattery_life(String battery_life) {
		this.battery_life = battery_life;
	}

	@Override
	public String toString() {
		return super.toString()+ "Laptop [battery_life=" + battery_life + "]";
	}
	
	
}
public class TestComputer {
	public static void main(String[] args) {
		Desktop d=new Desktop("Lenovo", "8GB RAM", "512GB", "Yes");
		System.out.println(d);
		Laptop l=new Laptop("HP", "16GB", "1TB", "100%");
		System.out.println(l);
	}
}
