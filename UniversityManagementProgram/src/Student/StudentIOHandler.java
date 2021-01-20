package Student;

import ScriptHandler.*;

public class StudentIOHandler {
	ScriptHandler scriptHandler = new ScriptHandler();

	public Student getStudent(StudentList studentList) {
		int id = scriptHandler.getInteger("id : ");
		String name = scriptHandler.getString("name : ");
		int age = scriptHandler.getInteger("age : ");
		String major = scriptHandler.getString("major : ");
 
		Student student = new Student(id, name, age, major);

		return student;
	}
	
	public int getStudentMenu() {
		int menu = 0;

		System.out.println("메뉴 선택");
		System.out.println("1. 대학생 등록");
		System.out.println("2. 대학생 수정");
		System.out.println("3. 대학생 삭제");
		System.out.println("4. 대학생 조회");
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

	
	// 학생 값 넘기기
	public void putStudent(StudentList studentList) {
		System.out.println("id" + "\t" + "name" + "\t" + "age" + "\t" + "major");
		for (int i = 0; i < studentList.getCount(); i++) {
			System.out.println(studentList.getStudentList(i).getId() + "\t" + studentList.getStudentList(i).getName()
					+ "\t" + studentList.getStudentList(i).getAge() + "\t" + studentList.getStudentList(i).getMajor());
		}
	}
}
