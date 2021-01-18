package Professor;

public class Professor {
	private int id;
	private String name; 
	private String contactNum;
	private String major;
	private int labCode;
	
	public Professor() {};
	
	public Professor(int id, String name, String contactNum, String major, int labCode) {
		this.id = id;
		this.name = name;
		this.contactNum = contactNum;
		this.major = major;
		this.labCode = labCode;
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
	
	public int getLabCode() {
		return this.labCode;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public void setLabCode(int labCode) {
		this.labCode = labCode;
	}
}
