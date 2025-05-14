package Assignment0105;
//Employee (empID, age, yearsOfExperience)

class Employee1
{
	int empid, age, yearsOfExperience;
	
	void setValues(int e, int a, int y)
	{
		this.empid=e;
		this.age=a;
		this.yearsOfExperience=y;
	}
	void display()
	{
		System.out.println("\n Employee Id: " + this.empid + "\n Employee Age: " + this.age + "\n Experience: "+ this.yearsOfExperience);
	}
}

public class Employee {
	public static void main(String[] args) {
		Employee1 e=new Employee1();
		e.setValues(101, 23, 1);
		e.display();
	}
}
