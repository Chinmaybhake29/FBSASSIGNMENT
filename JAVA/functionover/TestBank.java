package functionover;

public class TestBank {
	public static void main(String[] args) {
		Student s=new Student(101, "Chinmay", 80);
		Employee e=new Employee(1, "Rahul", 12);
		
		Bank b=new Bank();
		b.approveLoan(e);
		b.approveLoan(s);
	}
}
