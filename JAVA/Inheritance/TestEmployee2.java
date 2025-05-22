package Inheritance;

class Employee1           //Super class
{
	String name;
	int age; 
	int id; 
	double salary;
	
	Employee1() {
		this.name="Not Given";
		this.age=0;
		this.id=0;
		this.salary=0;
	}
	public Employee1(String name, int age, int id, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.id = id;
		this.salary = salary;
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	int getId() {
		return id;
	}
	void setId(int id) {
		this.id = id;
	}
	double getSalary() {
		return salary;
	}
	void setSalary(double salary) {
		this.salary = salary;
	}
}
class SalesEmployee extends Employee1
{
	int target;
	double comission;
	
	SalesEmployee() {
		this.target=0;
		this.comission=0;
	}

	SalesEmployee(String nm, int a, int id, double s, int target, double comission) {
		super(nm,a,id,s);
		this.target = target;
		this.comission = comission;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	double getComission() {
		return comission;
	}

	void setComission(double comission) {
		this.comission = comission;
	}
}
class Manager extends SalesEmployee
{
	String allowance;
	
	Manager() {
		this.allowance="Not Given";
	}

	Manager(int tar, double commi, String allowance) {
		super();
		this.allowance = allowance;
	}

	String getAllowance() {
		return allowance;
	}

	void setAllowance(String allowance) {
		this.allowance = allowance;
	}
	void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: " + age);
		System.out.println("Salary: " + salary);
		System.out.println("Target: "+target);
		System.out.println("Commission: "+comission);
		System.out.println("Allownace: "+allowance);
	}
}
public class TestEmployee2 {
	public static void main(String[] args) {
		Manager m=new Manager();
		m.id=1;
		m.name="Chinmay";
		m.age=34;
		m.salary=34000;
		m.target=90;
		m.comission=4500;
		m.allowance="Approve";
		m.display();
	}
}
