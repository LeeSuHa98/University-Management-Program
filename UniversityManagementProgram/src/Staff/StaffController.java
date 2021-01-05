package Staff;

public class StaffController {
	public void registerStaff(Staff staff, StaffIOHandler ioh, StaffList staffList) {
		staff = ioh.getStaff();
	
		staffList.insertStaff(staff);
		
		while(true) {
			boolean dialog = ioh.getDialogMenu();
			
			if(dialog == true) {
				staff = ioh.getStaff();
				
				staffList.insertStaff(staff);
			}
			else if(dialog == false) {
				break;
			}
			else {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
	
	public void changeStaff(Staff staff, StaffIOHandler ioh, StaffList staffList) {
		int id = ioh.getId();
		
		int index = staffList.findStaff(id);
		staff = ioh.getStaff();
		
		staffList.updateStaff(staff, index);
	}
	
	public void removeStaff(Staff staff, StaffIOHandler ioh, StaffList staffList) {
		//삭제할 id 입력 
		int id = ioh.getId();
		//입력한 id가 리스트에 존재하는지 확인
		int index = staffList.findStaff(id);
		//해당되는 id 삭제 
		staffList.deleteStaff(index);
	}
	
	public void selectStaff(StaffIOHandler ioh, StaffList staffList) {
		ioh.putStaff(staffList);
	}
}
