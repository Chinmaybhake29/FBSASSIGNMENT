package Construct;

class Employee1
{
	int id;
	String name;
	double salary;
	
	Employee1() {
		id=101;
		name="Chinmay";
		salary=89000;
	}
	Employee1(int i, String n, double s)
	{
		id=i;
		name=n;
		salary=s;
	}
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

