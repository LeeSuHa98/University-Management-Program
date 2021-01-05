package Professor;

public class Professor {
	private int id;
	private String name; 
	private String contactNum;
	private String major;
	private String lab;
	
	public Professor() {};
	
	public Professor(int id, String name, String contactNum, String major, String lab) {
		this.id = id;
		this.name = name;
		this.contactNum = contactNum;
		this.major = major;
		this.lab = lab;
	}
	
	// 값을 가져오는 getter
	
	public int getId() {
		return this.id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getContactNum() {
		return this.contactNum;
	}
	
	public String getMajor( ) {
		return this.major;
	}
	
	public String getLab() {
		return this.lab;
	}
}
