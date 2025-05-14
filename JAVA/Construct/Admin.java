package Construct;

class Admin1
{
	int id;
	String name;
	double salary; 
	double allowance;
	
	Admin1() 
	{
		id=101;
		name="Chinmay";
		salary=67888;
		allowance=7899;
				
	}
	Admin1(int i, String n, double sal, double alllow){
		id=i;
		name=n;
		salary=sal;
		allowance=alllow;
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
	double getAllowance() {
		return allowance;
	}
	void setAllowance(double allowance) {
		this.allowance = allowance;
	}
	
	void display()
	{
		System.out.println("Admin: " + id + "|" + name + "|" + salary + "|" +  allowance);
	}
}
