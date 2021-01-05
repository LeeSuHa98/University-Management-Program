package Staff;

public class Staff {
	private int id;
	private String name;
	private String contactNum;
	private String department;
	
	public Staff() {
		
	}
	
	public Staff(int id, String name, String contactNum, String department) {
		this.id = id;
		this.name = name;
		this.contactNum = contactNum;
		this.department = department;
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
	public String getContactNum() {
		return contactNum;
	}
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	
	
}
