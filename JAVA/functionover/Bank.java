package functionover;

public class Bank {
	 void approveLoan(Student s) 
	 {
	        System.out.println("Loan Approval for Student: " + s.name);
	        if (s.percentage > 80) {
	            System.out.println("Approved Loan: 2 Lakh");
	        } else if (s.percentage >= 60) {
	            System.out.println("Approved Loan: 1 Lakh");
	        } else if (s.percentage >= 40) {
	            System.out.println("Approved Loan: 50K");
	        } else {
	            System.out.println("Loan Not Approved");
	        }
	}
	void approveLoan(Employee e) {
        System.out.println("Loan Approval for Employee: " + e.name);
        if (e.annualSalary > 12) {
            System.out.println("Approved Loan: 7 Lakh");
        } else if (e.annualSalary >= 10) {
            System.out.println("Approved Loan: 6 Lakh");
        } else if (e.annualSalary >= 6) {
            System.out.println("Approved Loan: 5 Lakh");
        } else {
            System.out.println("Loan Not Approved");
        }
    }

}
