package ToString;

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

	@Override
	public String toString() {
		return "Animal [name=" + name + ", age=" + age + "]";
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

	@Override
	public String toString() {
		
		return super.toString()+"Dog [barkvolume=" + barkvolume + "]";
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

	@Override
	public String toString() {
		return super.toString()+"cat [eyecolor=" + eyecolor + "]";
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

	@Override
	public String toString() {
		return super.toString()+"Bird [wingspan=" + wingspan + "]";
	}
	
}
public class TestAnimal {
	public static void main(String[] args) 
	{
		Dog d=new Dog("Tommay", 3, "loud");
		System.out.println(d);
		cat c=new cat("Messy", 1, "Blue");
		System.out.println(c);
		Bird b=new Bird("Pintu", 3, 22.3);
		System.out.println(b);
	}
}
