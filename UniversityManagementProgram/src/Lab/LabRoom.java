package Lab;

public class LabRoom {
	private int labCode;
	private String labName;
	private String department;
	private String professor;
	private String researchField;
	private String location;
	private String contactNum;

	public LabRoom(){
	}
	
	public LabRoom(int labCode, String labName, String department, String professor, String researchField, String location, String contactNum){
		this.labCode = labCode;
		this.labName = labName;
		this.department = department;
		this.professor = professor;
		this.researchField = researchField;
		this.location = location;
		this.contactNum = contactNum;
	}
	
	public int getLabCode() {
		return this.labCode;
	}

	public void setLabCode(int labCode) {
		this.labCode = labCode;
	}

	public String getLabName() {
		return this.labName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public String getDepartment() {
		return this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getProfessor() {
		return this.professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getResearchField() {
		return this.researchField;
	}

	public void setResearchField(String researchField) {
		this.researchField = researchField;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContactNum() {
		return this.contactNum;
	}

	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	

}
