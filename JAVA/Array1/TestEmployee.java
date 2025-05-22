package Array1;
//name , age , ID, salary
//target, commission, allowance

class Person
{
		String name;
		int age;
		String gender;
		
		Person() {
			System.out.println("Deafult Constructor Called");
			this.name="Not given";
			this.age=0;
			this.gender="Not Given";
		}
		
		Person(String name, int age, String gender) {
			this.name = name;
			this.age = age;
			this.gender = gender;
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
		String getGender() {
			return gender;
		}
		void setGender(String gender) {
			this.gender = gender;
		} 
}
class Employee extends Person
{
	int id;
	double salary;
	
	Employee() {
		this.id=0;
		this.salary=0;
	}
	public Employee(String name, int age, String gender, int id, double salary) {
		super(name,age,gender);
		this.id = id;
		this.salary = salary;
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
	void display()
	{
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Salary: "+salary);
	}
}
public class TestEmployee {
	public static void main(String[] args) {
		Employee[] arrEmp;
		
		arrEmp=new Employee[3];
		arrEmp[0]=new Employee("Chinmay", 23, "Male", 101, 230000);
		arrEmp[1]=new Employee("Rahul", 24, "Male", 102, 340000);
		arrEmp[2]=new Employee("Raghav", 25, "Male", 103, 890000);
		
		
		for (int i = 0; i < arrEmp.length; i++) {
			arrEmp[i].display();
			System.out.println();
		}
		
	}
}
