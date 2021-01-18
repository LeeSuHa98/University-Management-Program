package Graduate;

import ScriptHandler.ScriptHandler;

public class GraduateIOHandler {
	ScriptHandler scriptHandler = new ScriptHandler();
	
	public Graduate getGraduate() {
		int id = scriptHandler.getInteger("id : ");
		String name = scriptHandler.getString("name : ");
		int age = scriptHandler.getInteger("age : ");
		String major = scriptHandler.getString("major : ");
		int labCode = scriptHandler.getInteger("lab code : ");
		
		Graduate graduate = new Graduate(id, name, age, major, labCode);
		
		return graduate;
	}
	
	public int getGraduateMenu() {
		int menu = 0;

		System.out.println("메뉴 선택");
		System.out.println("1. 대학원생 등록");
		System.out.println("2. 대학원생 수정");
		System.out.println("3. 대학원생 삭제");
		System.out.println("4. 대학원생 조회");
		System.out.println("5. 종료");

		menu = scriptHandler.getInteger("");

		return menu;
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

	// id찾기
	public int getId() {
		int id = scriptHandler.getInteger("id을 입력해 주세요 : ");

		return id;
	}
	
	public void putGraduate(GraduateList graduateList) {
		System.out.println("id" + "\t" + "name" + "\t" + "age" + "\t" + "major" + "\t" + "lab code");
		for(int i = 0; i < graduateList.getCount(); i++) {
			System.out.println(graduateList.getGraduateList(i).getId() + "\t" + graduateList.getGraduateList(i).getName() + "\t" 
		+ graduateList.getGraduateList(i).getAge() + "\t" + graduateList.getGraduateList(i).getMajor() + "\t" + graduateList.getGraduateList(i).getLabCode());
		}
	}
}
