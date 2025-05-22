package Static;

class Electronics
{
	String brand;
	int battery_life;
	int IMI_no;
	static String manfacture_date;
	
	static {
		manfacture_date = "07/12/2024";
	}
	public Electronics()
	{
		this.brand="null";
		this.battery_life=0;
		this.IMI_no=0;
	}
	
	public Electronics(String brand, int battery_life, int iMI_no, String manfacture_date) {
		super();
		this.brand = brand;
		this.battery_life = battery_life;
		IMI_no = iMI_no;
	}

	String getBrand() {
		return brand;
	}

	void setBrand(String brand) {
		this.brand = brand;
	}

	int getBattery_life() {
		return battery_life;
	}

	void setBattery_life(int battery_life) {
		this.battery_life = battery_life;
	}

	int getIMI_no() {
		return IMI_no;
	}

	void setIMI_no(int iMI_no) {
		IMI_no = iMI_no;
	}

	String getManfacture_date() {
		return manfacture_date;
	}

	void setManfacture_date(String manfacture_date) {
		this.manfacture_date = manfacture_date;
	}

	@Override
	public String toString() {
		return "Electronics [brand=" + brand + ", battery_life=" + battery_life + ", IMI_no=" + IMI_no
				+ ", manfacture_date=" + manfacture_date + "]";
	}
	
}
public class TestElectronics {
	
	public static void main(String[] args) {
		Electronics e=new Electronics("IFB", 100, 373427,"");
		System.out.println(e);
	}
}
