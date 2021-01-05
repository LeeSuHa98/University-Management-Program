package Staff;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import Professor.Professor;
import Professor.ProfessorList;
import ScriptHandler.ScriptHandler;

public class StaffIOHandler {
	ScriptHandler scriptHandler = new ScriptHandler();
	
	public Staff getStaff() {
		int id = scriptHandler.getInteger("id : ");
		String name = scriptHandler.getString("name : ");
		String contactNum = scriptHandler.getString("contact number : ");
		String department = scriptHandler.getString("department : ");
		
		Staff staff = new Staff(id, name, contactNum, department);
		
		return staff;
	}
	
	public int getStaffMenu() {
		int menu = 0;

		System.out.println("메뉴 선택");
		System.out.println("1. 교직원 등록");
		System.out.println("2. 교직원 수정");
		System.out.println("3. 교직원 삭제");
		System.out.println("4. 교직원 조회");
		System.out.println("5. 종료");

		menu = scriptHandler.getInteger("");

		return menu;
	}
	
	public boolean getDialogMenu() {

		String answer = scriptHandler.getString("계속 입력하시겠습니까(y/n)?");

		if (answer.contains("y")) {
			return true;
		} else if (answer.contains("n")) {
			return false;
		} else {
			System.out.print("Not Found Error");
			return false;
		}
	}
	
	public boolean getExitDialogMenu() {

		String answer = scriptHandler.getString("프로그램을 종료 하시겠습니까(y/n)?");

		if (answer.contains("y")) {
			return true;
		} else if (answer.contains("n")) {
			return false;
		} else {
			System.out.print("Not Found Error");
			return false;
		}
	}

	public int getId() {
		int id = scriptHandler.getInteger("id값을 입력해 주세요. ");
		
		return id;
	}
	
	public void putStaff(StaffList staffList) {
		System.out.println("id" + "\t" + "name" + "\t" + "contact num" + "\t" + "department");
		
		for(int i = 0; i < staffList.getCount(); i++) {
			System.out.println(staffList.getStaffList(i).getId() + "\t" + staffList.getStaffList(i).getName() + "\t" + 
					staffList.getStaffList(i).getContactNum()+ "\t" + "\t" + staffList.getStaffList(i).getDepartment());
		}
	}
	
	// 파일 출력
		public void loadStaff(StaffList staffList, String fileName) throws IOException {

			FileInputStream fin = new FileInputStream(fileName);

			BufferedReader br = new BufferedReader(new InputStreamReader(fin));

			String patchLine;
			String seperator = "\t";

			while ((patchLine = br.readLine()) != null) {

				String[] item = patchLine.split(seperator);

				int id = Integer.parseInt(item[0]);
				String name = item[1];
				String contactNum = item[2];
				String department = item[3];
				
				Staff staff = new Staff(id, name, contactNum, department);

				staffList.insertStaff(staff);
			}
			br.close();
		}

		// 파일 출력
		// iohandler
		public void saveStaff(StaffList staffList,  String filename) throws IOException {

			FileOutputStream fout = new FileOutputStream(filename);
			BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fout));

			for (int i = 0; i < staffList.getCount(); i++) {
				br.write(staffList.getStaffList(i).getId() + "\t");
				br.write(staffList.getStaffList(i).getName() + "\t");
				br.write(staffList.getStaffList(i).getContactNum() + "\t");
				br.write(staffList.getStaffList(i).getDepartment() + "\t");
				br.newLine();
			}
			br.close();
		}
}
