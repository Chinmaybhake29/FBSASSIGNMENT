package Construct;

public class Test {
	public static void main(String[] args) {
		
		Date d=new Date();
		d.display();
		
		Date d1=new Date(07, 03, 2002);
		d1.display();
		
		Time t=new Time();
		t.setHour(8);
		t.display();
		
		Time t1=new Time(03, 14, 45);
		t1.display();
		
		Complex1 c=new Complex1();
		c.display();
		
		Complex1 c1=new Complex1(5.7, 23.4);
		c1.display();
		
		Admin1 a=new Admin1();
		a.display();
		
		Admin1 a1=new Admin1(102, "Mahesh", 78899, 999);
		a1.display();
		
		Distance1 d2=new Distance1();
		d2.display();
		
		Distance1 d3=new Distance1(3.4, 7.8);
		d3.display();
		
		Employee1 e1=new Employee1();
		e1.display();
		
		Employee1 e3=new Employee1(102, "Tanmay", 45000);
		e3.display();
				
		HR1 h=new HR1();
		h.display();
		
		HR1 h1=new HR1(101, "djfsfd", 73234, 789);
		h1.display();
	}
}
