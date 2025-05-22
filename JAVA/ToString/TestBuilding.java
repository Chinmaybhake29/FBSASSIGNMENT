package ToString;

class Building
{
	int floors;
	String address;
	
	public Building(int floors, String address) {
		super();
		this.floors = floors;
		this.address = address;
	}

	int getFloors() {
		return floors;
	}

	void setFloors(int floors) {
		this.floors = floors;
	}

	String getAddress() {
		return address;
	}

	void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Building [floors=" + floors + ", address=" + address + "]";
	}
	
}
class House extends Building
{
	int rooms;

	public House(int floors, String address, int rooms) {
		super(floors, address);
		this.rooms = rooms;
	}

	int getRooms() {
		return rooms;
	}

	void setRooms(int rooms) {
		this.rooms = rooms;
	}

	@Override
	public String toString() {
		return super.toString()+"House [rooms=" + rooms + "]";
	}
	
}
class Office extends Building
{
	String departmnt;

	public Office(int floors, String address, String departmnt) {
		super(floors, address);
		this.departmnt = departmnt;
	}

	String getDepartmnt() {
		return departmnt;
	}

	void setDepartmnt(String departmnt) {
		this.departmnt = departmnt;
	}

	@Override
	public String toString() {
		return super.toString()+ "Office [departmnt=" + departmnt + "]";
	}
	
}
public class TestBuilding 
{
	public static void main(String[] args) 
	{
		Building b=new Building(11, "55A, A3 Runwal Seagull, Satar Nager, Shriram Chow");
		System.out.println(b);
		House h=new House(4, "FC road", 3);
		System.out.println(h);
		Office o=new Office(5, "Durga Nager, Manewada Road, Nagpur", "Inforamtion Tech");
		System.out.println(o);
	}
}
