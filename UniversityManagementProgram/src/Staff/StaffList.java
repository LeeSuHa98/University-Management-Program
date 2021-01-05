package Staff;

public class StaffList {
	final int MAX_STAFF = 1000;
	private int count = 0;
	
	public Staff[] staffList = new Staff[MAX_STAFF];
	
	public StaffList() {
		this.count = 0;
	}

	public int getCount() {
		return count;
	}
	
	public Staff getStaffList(int index) {
		return staffList[index];
	}
	
	//교직원 찾는 함수 
	public int findStaff(int id) {
		for(int i = 0; i < count; i++) {
			if(id == staffList[i].getId()) {
				return i;
			}
			
		}
		return 0;
	}
	
	//교직원 등록 함수 
	public void insertStaff(Staff staff) {
		staffList[count] = staff;
		count++;
	}
	
	//교직원 수정 함수 
	public void updateStaff(Staff staff, int index) {
		staffList[index] = staff;
	}
	
	//교직원 삭제 함수 
	public void deleteStaff(int index) {
		for(int i = index; i < count; i++) {
			staffList[i] = staffList[i+1];
		}
		count--;
	}
}