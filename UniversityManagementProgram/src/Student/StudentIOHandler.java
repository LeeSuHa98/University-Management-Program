package Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.InputMismatchException;

import ScriptHandler.*;

public class StudentIOHandler {
	Scanner sc = new Scanner(System.in);
	
	ScriptHandler scriptHandler = new ScriptHandler();
	
	public Student getStudent() {
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
		System.out.println("1. 학생 등록");
		System.out.println("2. 학생 수정");
		System.out.println("3. 학생 삭제");
		System.out.println("4. 학생 조회");
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

	// 파일 출력
	public void loadStudent(StudentList studentList, String fileName) throws IOException {

		FileInputStream fin = new FileInputStream(fileName);

		BufferedReader br = new BufferedReader(new InputStreamReader(fin));

		String patchLine;
		String seperator = "\t";

		while ((patchLine = br.readLine()) != null) {

			String[] item = patchLine.split(seperator);

			int id = Integer.parseInt(item[0]);
			String name = item[1];
			int age = Integer.parseInt(item[2]);
			String major = item[3];

			Student student = new Student(id, name, age, major);

			studentList.insertStudent(student);
		}
		br.close();
	}

	// 파일 출력
	// iohandler
	public void saveStudent(StudentList studentList, String filename) throws IOException {

		FileOutputStream fout = new FileOutputStream(filename);
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fout));

		for (int i = 0; i < studentList.getCount(); i++) {
			br.write(studentList.getStudentList(i).getId() + "\t");
			br.write(studentList.getStudentList(i).getName() + "\t");
			br.write(studentList.getStudentList(i).getAge() + "\t");
			br.write(studentList.getStudentList(i).getMajor() + "\t");
			br.newLine();
		}
		br.close();
	}
}
