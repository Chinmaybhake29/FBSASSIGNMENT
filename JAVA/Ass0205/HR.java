package Ass0205;

class HR1
{
	int id;
	String name;
	double salary;
	double commission;
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
public class HR {
	public static void main(String[] args) {
		HR1 h=new HR1();
		h.setId(101);
		h.getId();
		h.setName("Ravikumar Shastri");
		h.getName();
		h.setSalary(9000);
		h.getSalary();
		h.setCommission(10000);
		h.getCommission();
		h.display();
	}
}
