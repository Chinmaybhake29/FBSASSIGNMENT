package ToString;

class Engineer
{
	String name;
	int age;
	String field;
	
	public Engineer(String name, int age, String field) {
		super();
		this.name = name;
		this.age = age;
		this.field = field;
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

	String getField() {
		return field;
	}

	void setField(String field) {
		this.field = field;
	}

	@Override
	public String toString() {
		return "Engineer [name=" + name + ", age=" + age + ", field=" + field + "]";
	}
	
}
class prompt extends Engineer
{
	String model_type;

	public prompt(String name, int age, String field, String model_type) {
		super(name, age, field);
		this.model_type = model_type;
	}

	String getModel_type() {
		return model_type;
	}

	void setModel_type(String model_type) {
		this.model_type = model_type;
	}

	@Override
	public String toString() {
		return super.toString() + "prompt [model_type=" + model_type + "]";
	}
	
	
}
class ML_Engineer extends Engineer
{
	String dataset_size;

	public ML_Engineer(String name, int age, String field, String dataset_size) {
		super(name, age, field);
		this.dataset_size = dataset_size;
	}

	String getDataset_size() {
		return dataset_size;
	}

	void setDataset_size(String dataset_size) {
		this.dataset_size = dataset_size;
	}

	@Override
	public String toString() {
		return super.toString() + "ML_Engineer [dataset_size=" + dataset_size + "]";
	}
	
	
	
}
class ChatbotPrompt_Engineer extends Engineer
{
	String tone;
	int length;
	
	public ChatbotPrompt_Engineer(String name, int age, String field, String tone, int length) {
		super(name, age, field);
		this.tone = tone;
		this.length = length;
	}

	String getTone() {
		return tone;
	}

	void setTone(String tone) {
		this.tone = tone;
	}

	int getLength() {
		return length;
	}

	void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return super.toString() + "ChatbotPrompt_Engineer [tone=" + tone + ", length=" + length + "]";
	}
	
}
class ImagePrompt_Engineer extends Engineer
{
	String style;
	String resolution;
	
	public ImagePrompt_Engineer(String name, int age, String field, String style, String resolution) {
		super(name, age, field);
		this.style = style;
		this.resolution = resolution;
	}

	String getStyle() {
		return style;
	}

	void setStyle(String style) {
		this.style = style;
	}

	String getResolution() {
		return resolution;
	}

	void setResolution(String resolution) {
		this.resolution = resolution;
	}

	@Override
	public String toString() {
		return super.toString() + "ImagePrompt_Engineer [style=" + style + ", resolution=" + resolution + "]";
	}
	
	
}
public class TestEngineer 
{
	public static void main(String[] args) 
	{
		prompt p=new prompt("Chinmay", 34, "CS", "Prompt");
		System.out.println(p);
		
		ML_Engineer m=new ML_Engineer("Tanmay", 34, "IT", "67");
		System.out.println(m);
		
		ChatbotPrompt_Engineer c=new ChatbotPrompt_Engineer("RTYY", 56, "Testing", "Soft", 67);
		System.out.println(c);
		
		ImagePrompt_Engineer i=new ImagePrompt_Engineer("ETYHB", 56, "Designer", "Realistic", "8K");
		System.out.println(i);
	}
}
