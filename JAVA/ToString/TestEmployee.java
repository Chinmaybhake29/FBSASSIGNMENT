package ToString;

class Person
{
		String name;
		int age;
		String gender;
		
		Person() {
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

		@Override
		public String toString() {
			return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
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
	
	@Override
	public String toString() {
		return super.toString()+ "Employee [id=" + id + ", salary=" + salary + "]";
	}
	
}
public class TestEmployee {
	public static void main(String[] args) {
	Employee e=new Employee("Chinmay", 23, "Male", 101, 34000);
	System.out.println(e);
		
	}
}
