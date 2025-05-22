package Array1;

class Course
{
	String title;
	String Duration;
	String instructor;
	
	public Course(String title, String duration, String instructor) {
		super();
		this.title = title;
		Duration = duration;
		this.instructor = instructor;
	}

	String getTitle() {
		return title;
	}

	void setTitle(String title) {
		this.title = title;
	}

	String getDuration() {
		return Duration;
	}

	void setDuration(String duration) {
		Duration = duration;
	}

	String getIntructor() {
		return instructor;
	}

	void setIntructor(String intructor) {
		this.instructor = intructor;
	}
	void display()
	{
		System.out.println("Title: "+title);
		System.out.println("Duration: "+Duration);
		System.out.println("Instructor: "+instructor);
	}	
}
class Platform extends Course
{
	String platform;

	public Platform(String title, String duration, String instructor, String platform) {
		super(title, duration, instructor);
		this.platform = platform;
	}

	String getPlatform() {
		return platform;
	}

	void setPlatform(String platform) {
		this.platform = platform;
	}
	
	void display()
	{
		super.display();
		System.out.println("Platform: "+platform);
	}
}
class location extends Course
{
	String location;

	public location(String title, String duration, String instructor, String location) {
		super(title, duration, instructor);
		this.location = location;
	}

	String getLocation() {
		return location;
	}

	void setLocation(String location) {
		this.location = location;
	}
	
	void display()
	{
		super.display();
		System.out.println("Location: "+location);
	}
}
public class TestCourse {
	public static void main(String[] args) {
		Platform[] p;
		
		p=new Platform[6];
		p[0]=new Platform("JAVA Full Statck", "6 Months", "Vinayak Sir", "Offline and Online");
		p[1]=new Platform("Python Full stack", "6 Months", "Adesh Sir", "Matoshri");
		p[2] = new Platform("Java Backend", "4 Months", "Rajesh Sir", "CodeAcademy");
		p[3] = new Platform("React Frontend", "3 Months", "Neha Ma'am", "TechLearn");
		p[4] = new Platform("Data Science", "8 Months", "Arun Sir", "AnalyticsPro");
		p[5] = new Platform("Cyber Security", "5 Months", "Meera Ma'am", "SecureNet");

		for (int i = 0; i < p.length; i++) {
			p[i].display();
			System.out.println();
		}
	}
}
