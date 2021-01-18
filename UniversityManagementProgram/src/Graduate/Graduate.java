package Graduate;

public class Graduate {
    private int id;
	private String name;
	private int age;
	private String major;
	private int labCode;
	
	public Graduate() {
		
	}
	
	public Graduate(int id, String name, int age, String major, int labCode) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.major = major;
		this.labCode = labCode;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getLabCode() {
		return labCode;
	}
	public void setLab(int labCode) {
		this.labCode = labCode;
	}
}
