package Construct;

class HR1
{
	int id;
	String name;
	double salary;
	double commission;
	
	HR1()
	{
		id=101;
		salary=34000;
		name="FSJQG";
		commission=7899;
	}
	HR1(int i, String n, double s, double c)
	{
		id=i;
		name=n;
		salary=s;
		commission=c;
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
	double getCommission() {
		return commission;
	}
	void setCommission(double commission) {
		this.commission = commission;
	}

	void display()
	{
		System.out.println("\n Id: " + this.id + "\n Name: " + this.name + "\n Salary: " + this.salary + "\n Commission: " + this.commission);
	}
}
