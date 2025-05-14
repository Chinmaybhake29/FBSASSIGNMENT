package functionover;

public class Test {
	public static void main(String[] args) {
		calculator c=new calculator();
		
		System.out.println("Addition");
		System.out.println(c.add(45, 56));
		c.add(3.4, 5.6);
		c.add(34, 8.9);
		
		System.out.println("Subtraction");
		System.out.println(c.sub(56, 90));
		c.sub(8, 0.9);
		c.sub(78.45, 34.3);
		
		System.out.println("Multiplecation");
		System.out.println(c.mul(6, 9));
		c.mul(8, 0.9);
		c.mul(78.45, 34.3);
		
		System.out.println("Division");
		System.out.println(c.div(8, 2));
		c.div(8, 0.9);
		c.div(78.45, 34.3);
		
		Shape s=new Shape();
		s.areaofcircle(4.5);
		s.areaofreat(4, 6.7);
		s.areaoftri(4, 8.9);
		
		
	}
}
