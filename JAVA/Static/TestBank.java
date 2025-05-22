package Static;

class Bank
{
	int accNo;
	String accName;
	double balance;
	static double interest;
	
	static {
		interest=8.9;
	}
	
	public Bank()
	{
		this.accNo=100;
		this.accName="not given";
		this.balance=0;
	}
	public Bank(int accNo, String accName, double balance, double interest) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
	}
	int getAccNo() {
		return accNo;
	}
	void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	String getAccName() {
		return accName;
	}
	void setAccName(String accName) {
		this.accName = accName;
	}
	double getBalance() {
		return balance;
	}
	void setBalance(double balance) {
		this.balance = balance;
	}
	double getInterest() {
		return interest;
	}
	void setInterest(double interest) {
		this.interest = interest;
	}
	void dispaly()
	{
		System.out.println("Account No: "+this.accNo);
		System.out.println("Account Name:"+this.accName);
		System.out.println("Balance: "+this.balance);
		System.out.println("Interest: "+this.interest);
	}
	
}
public class TestBank 
{
	public static void main(String[] args) {
		Bank b=new Bank(101, "Chinmay", 6700,0);
		b.dispaly();
		Bank b1=new Bank(102, "Ahfs", 9700,0);
		b1.dispaly();
		
		
	}
}
