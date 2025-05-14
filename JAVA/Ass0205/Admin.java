package Ass0205;

class Admin1
{
	int id;
	String name;
	double salary; 
	double allowance;
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
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		System.out.println("Admin: " + this.id + "|" + this.name + "|" + this.salary + "|" +  this.allowance);
	}
}
public class Admin {
	public static void main(String[] args) {
		Admin1 a=new Admin1();
		a.setId(1);
		a.getId();
		a.setName("Ravi");
		a.getName();
		a.setSalary(50000);
		a.getSalary();
		a.setAllowance(5000);
		a.getAllowance();
		a.display();
	}
}
