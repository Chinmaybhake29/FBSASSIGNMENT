package Polymorphism;

class Student //Super class
{
	int firstbitId;
	String name;
	int distance;
	
	Student() {
		System.out.println("Dafault Constructor Called");
		this.firstbitId=101;
		this.name="No Given";
		this.distance=67;
	}
	
	Student(int firstbitId, String name, int distance) {

		this.firstbitId = firstbitId;
		this.name = name;
		this.distance = distance;
	}
	
	int getFirstbitId() {
		return firstbitId;
	}
	void setFirstbitId(int firstbitId) {
		this.firstbitId = firstbitId;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getDistance() {
		return distance;
	}
	void setDistance(int distance) {
		this.distance = distance;
	}
}   //class Student ends Here
class PlacedStudent extends Student //step 1 is-a //Sub Class
{
	String company;
	String designation;
	
	PlacedStudent() {
		super(); //Calling Super class  Default Constructor
		this.company="Not given";
		this.designation="Not given";
	}
	
	PlacedStudent(int fid, String name, int distance, String company, String designation) {
		super(fid,name,distance); //Calling Super class Parameter constructor
		this.company = company;
		this.designation = designation;
	} //parameter Constructor called here
	
	String getCompany() {
		return company;
	}

	void setCompany(String company) {
		this.company = company;
	}

	String getDesignation() {
		return designation;
	}

	void setDesignation(String designation) {
		this.designation = designation;
	}

	void display()
	{
		System.out.println("ID: "+firstbitId);
		System.out.println("Name: " + name);
		System.out.println("Distance: " + distance);
		System.out.println("Company: " + company);
		System.out.println("Designation: " +designation);
	}
}
public class TestStudent {
	public static void main(String[] args) {
		PlacedStudent p=new PlacedStudent();
		p.firstbitId=1;
		p.name="Chinmay";
		p.distance=8;
		p.company="ICC";
		p.designation="Opener";
		p.display();
	}
}
