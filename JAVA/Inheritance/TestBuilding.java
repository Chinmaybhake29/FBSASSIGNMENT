package Inheritance;

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
	void display()
	{
		System.out.println("Floors: "+floors);
		System.out.println("Address: "+address);
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
	void display()
	{
		super.display();
		System.out.println("Rooms: "+rooms);
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
	void display()
	{
		super.display();
		System.out.println("Department: "+departmnt);
	}
}
public class TestBuilding 
{
	public static void main(String[] args) 
	{
		Building b=new Building(11, "55A, A3 Runwal Seagull, Satar Nager, Shriram Chow");
		b.display();
		
		House h=new House(4, "FC road", 3);
		h.display();
		
		Office o=new Office(5, "Durga Nager, Manewada Road, Nagpur", "Inforamtion Tech");
		o.display();
	}
}
