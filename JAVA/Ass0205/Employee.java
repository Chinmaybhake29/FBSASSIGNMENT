package Ass0205;

class Employee1
{
	int id;
	String name;
	double salary;
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Employee Details: "+ this.id + "||" + this.name + "||" + this.salary);
		
	}
}
public class Employee {
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.setId(18);
		e.getId();
		e.setName("Chinmay");
		e.getName();
		e.setSalary(56000);
		e.getSalary();
		e.display();
	}
}
