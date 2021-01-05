package Graduate;

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

public class GraduateIOHandler {
	ScriptHandler scriptHandler = new ScriptHandler();
	
	public Graduate getGraduate() {
		int id = scriptHandler.getInteger("id : ");
		String name = scriptHandler.getString("name : ");
		int age = scriptHandler.getInteger("age : ");
		String major = scriptHandler.getString("major : ");
		String lab = scriptHandler.getString("lab : ");
		
		Graduate graduate = new Graduate(id, name, age, major, lab);
		
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
	
	public void putGradute(GraduateList graduateList) {
		System.out.println("id" + "\t" + "name" + "\t" + "age" + "\t" + "major" + "lab");
		for(int i = 0; i < graduateList.getCount(); i++) {
			System.out.println(graduateList.getGraduateList(i).getId() + "\t" + graduateList.getGraduateList(i).getName() + "\t" 
		+ graduateList.getGraduateList(i).getAge() + "\t" + graduateList.getGraduateList(i).getMajor() + "\t" + graduateList.getGraduateList(i).getLab());
		}
	}

	// 파일 출력
	public void loadGraduate(GraduateList graduateList, String fileName) throws IOException {

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
			String lab = item[4];

			Graduate graduate = new Graduate(id, name, age, major, lab);
			
			graduateList.insertGraduate(graduate);
		}
		br.close();
	}

	// 파일 출력
	// iohandler
	public void saveGraduate(GraduateList graduateList, String filename) throws IOException {

		FileOutputStream fout = new FileOutputStream(filename);
		BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fout));

		for (int i = 0; i < graduateList.getCount(); i++) {
			br.write(graduateList.getGraduateList(i).getId() + "\t");
			br.write(graduateList.getGraduateList(i).getName() + "\t");
			br.write(graduateList.getGraduateList(i).getAge() + "\t");
			br.write(graduateList.getGraduateList(i).getMajor() + "\t");
			br.write(graduateList.getGraduateList(i).getLab() + "\t");
			br.newLine();
		}
		br.close();
	}
}