package Polymorphism;

class Exam
{
	String subject;
	String total_marks;
	public Exam(String subject, String total_marks) {
		super();
		this.subject = subject;
		this.total_marks = total_marks;
	}
	String getSubject() {
		return subject;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	String getTotal_marks() {
		return total_marks;
	}
	void setTotal_marks(String total_marks) {
		this.total_marks = total_marks;
	}
	void display()
	{
		System.out.println("Subject: "+subject);
		System.out.println("Total Marks: "+total_marks);
	}
}
class WrittenExam extends Exam
{
	String durration;

	public WrittenExam(String subject, String total_marks, String durration) {
		super(subject, total_marks);
		this.durration = durration;
	}

	String getDurration() {
		return durration;
	}

	void setDurration(String durration) {
		this.durration = durration;
	}
	
	void display()
	{
		super.display();
		System.out.println("Duration: "+durration);
	}
}
class OralExam extends Exam
{
	int speaking_score;

	public OralExam(String subject, String total_marks, int speaking_score) {
		super(subject, total_marks);
		this.speaking_score = speaking_score;
	}

	int getSpeaking_score() {
		return speaking_score;
	}

	void setSpeaking_score(int speaking_score) {
		this.speaking_score = speaking_score;
	}
	
	void display()
	{
		super.display();
		System.out.println("Speak Score: "+speaking_score);
	}
}
class OnlineExam extends Exam
{
	String platform;

	public OnlineExam(String subject, String total_marks, String platform) {
		super(subject, total_marks);
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
public class TestExam {

	public static void main(String[] args) {
		WrittenExam w=new WrittenExam("OS", "90", "3 Hrs");
		w.display();
		
		OralExam o=new OralExam("English", "67", 89);
		o.display();
	}

}
