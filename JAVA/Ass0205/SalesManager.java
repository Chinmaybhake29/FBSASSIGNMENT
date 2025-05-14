package Ass0205;

class Sales
{
	 int id, name, salary, incentive, target;

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	int getName() {
		return name;
	}

	void setName(int name) {
		this.name = name;
	}

	int getSalary() {
		return salary;
	}

	void setSalary(int salary) {
		this.salary = salary;
	}

	int getIncentive() {
		return incentive;
	}

	void setIncentive(int incentive) {
		this.incentive = incentive;
	}

	int getTarget() {
		return target;
	}

	void setTarget(int target) {
		this.target = target;
	}
	 
	void display()
	{
		System.out.println("\n Id: " + this.id + "Name: " +  this.name + "Salary: " + this.salary + "Incentive: " + this.incentive + "Target: " + this.target);
	}

}
public class SalesManager 
{
	public static void main(String[] args) 
	{
		Sales s=new Sales();
		s.setId(101);
		
	}
}
