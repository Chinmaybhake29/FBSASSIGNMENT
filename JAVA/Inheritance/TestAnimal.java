package Inheritance;

class Animal
{
	String name;
	int age;
	
	Animal(){
		this.name=name;
		this.age=age;
	}
	
	public Animal(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}
class Dog extends Animal
{
	String barkvolume;

	public Dog(String name, int age, String barkvolume) {
		super(name,age);
		this.barkvolume = barkvolume;
	}

	String getBarkvolume() {
		return barkvolume;
	}

	void setBarkvolume(String barkvolume) {
		this.barkvolume = barkvolume;
	}
	void display()
	{
		super.display();
		System.out.println("Barkvolumne: "+barkvolume);
	}
	
}
class cat extends Animal
{
	String eyecolor;

	public cat(String name, int age, String eyecolor) {
		super(name,age);
		this.eyecolor = eyecolor;
	}

	String getEyecolor() {
		return eyecolor;
	}

	void setEyecolor(String eyecolor) {
		this.eyecolor = eyecolor;
	}
	void display()
	{
		super.display();
		System.out.println("Eyecolor: "+eyecolor);
	}
}
class Bird extends Animal
{
	double wingspan;

	public Bird(String name, int age, double wingspan) {
		super(name,age);
		this.wingspan = wingspan;
	}

	double getWingspan() {
		return wingspan;
	}

	void setWingspan(double wingspan) {
		this.wingspan = wingspan;
	}
	void display()
	{
		super.display();
		System.out.println("Wingspan: "+wingspan);
	}
}
public class TestAnimal {
	public static void main(String[] args) 
	{
		Dog d=new Dog("Tommay", 3, "loud");
		d.display();
		
		cat c=new cat("Messy", 1, "Blue");
		c.display();
		
		Bird b=new Bird("Pintu", 3, 22.3);
		b.display();
	}
}
