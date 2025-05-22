package Array;

class Employee {
	int id;
	String name;
	double salary;

	Employee() {
		this.id = 101;
		this.name = "not given";
		this.salary = 20000;

	}

	Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

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

	void display() {
		System.out.println("Id:" + id);
		System.out.println("Name:" + name);
		System.out.println("Salary:" + salary);
	}

}
// super class here ended

class Hr extends Employee {// step 1
	int commission;

	Hr() {
		super(); // step2
		this.commission = 50000;
	}

	Hr( int id, String name,double salary,int commission) {
		super(id, name, salary); // step 3
		this.commission = commission;
	}

	void setcommission(int commission) {
		this.commission = commission;
	}

	int getcommission() {
		return commission;
	}

	void display() {
		super.display(); // step 4
		System.out.println("commission:" + this.commission);
	}
}
// sub Hr class is here ended.

class SalesManeger extends Employee {
	double incentive;
	int target;

	SalesManeger() {
		super();
		this.incentive = 60000;
		this.target = 1000;
	}

	SalesManeger(int id, String name,double salary, int i, int t) {
		super(id, name, salary);
		this.incentive = i;
		this.target = t;
	}

	double getIncentive() {
		return incentive;
	}

	void setIncentive(double incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}

	void display() {
		super.display();
		System.out.println("Incentive:" + this.incentive);
		System.out.println("Target:" + this.target);
	}

}
// sub SalesManeger class is  here ended.

class Admin extends Employee {
	int allowance;

	Admin() {
		super();
		this.allowance = 50000;
	}

	Admin(int id, String name,double salary, int allowance) {
		super(id, name, salary);
		this.allowance = allowance;
	}

	void setallowance(int allowance) {
		this.allowance = allowance;
	}

	int getallowance() {
		return allowance;
	}

	void display() {
		super.display();
		System.out.println("Allowance:" + allowance);
	}
}
// sub Admin class is here ended.

public class Testemployee {

	public static void main(String[] args) 
	{

		Employee e1;
		
		e1=new SalesManeger(101,"prati",21,500000,3000);
		e1.display();
		
		e1=new Admin(104, "Chinmay", 47350, 6660);
		e1.display();
		
		e1=new Hr(105, "tanmay", 45530, 9990);
		e1.display();
		

	}

}
