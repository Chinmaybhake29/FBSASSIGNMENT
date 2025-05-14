package Ass0205;

class Student1
{
	int rollNo;
	double marks;
	String name;
	
	int getRollNo() {
		return rollNo;
	}

	void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	double getMarks() {
		return marks;
	}

	void setMarks(double marks) {
		this.marks = marks;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	void display()
	{
		System.out.println("Information about student:- "+ this.name + ":" + this.rollNo + ":" + this.marks);
	}
}
public class Student 
{
	public static void main(String[] args) {
		Student1 s=new Student1();
		s.setRollNo(101);
		s.getRollNo();
		s.setName("Chinmay");
		s.getName();
		s.setMarks(89);
		s.getMarks();
		s.display();
	}
}
