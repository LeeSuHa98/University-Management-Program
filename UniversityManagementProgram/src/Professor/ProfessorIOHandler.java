package Professor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import ScriptHandler.ScriptHandler;
import Student.Student;
import Student.StudentList;

public class ProfessorIOHandler {
	ScriptHandler scriptHandler = new ScriptHandler();

	public Professor getProfessor() {
		int id = scriptHandler.getInteger("id : ");
		String name = scriptHandler.getString("name : ");
		String contactNum = scriptHandler.getString("contact number : ");
		String major = scriptHandler.getString("major : ");
		String lab = scriptHandler.getString("lab : ");
		
		Professor professor = new Professor(id, name, contactNum, major, lab);
		
		return professor;
	}
	public int getProfessorMenu() {
		int menu = 0;

		System.out.println("메뉴 선택");
		System.out.println("1. 교수 등록");
		System.out.println("2. 교수 수정");
		System.out.println("3. 교수 삭제");
		System.out.println("4. 교수 조회");
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
	
	public void putProfessor(ProfessorList professorList) {
		System.out.println("id" + "\t" + "name" + "\t" + "contact num" + "\t" + "major" + "\t" + "lab");
		
		for(int i = 0; i < professorList.getCount(); i++) {
			System.out.println(professorList.getProfessorList(i).getId() + "\t" + professorList.getProfessorList(i).getName() + "\t" + professorList.getProfessorList(i).getContactNum()
					+ "\t" + "\t" + professorList.getProfessorList(i).getMajor() + "\t" + professorList.getProfessorList(i).getLab());
		}
	}
 }
