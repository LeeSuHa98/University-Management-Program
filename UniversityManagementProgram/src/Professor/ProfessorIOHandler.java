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
	
	// 파일 출력
		public void loadProfessor(ProfessorList professorList, String fileName) throws IOException {

			FileInputStream fin = new FileInputStream(fileName);

			BufferedReader br = new BufferedReader(new InputStreamReader(fin));

			String patchLine;
			String seperator = "\t";

			while ((patchLine = br.readLine()) != null) {

				String[] item = patchLine.split(seperator);

				int id = Integer.parseInt(item[0]);
				String name = item[1];
				String contactNum = item[2];
				String major = item[3];
				String lab = item[4];
				
				Professor professor = new Professor(id, name, contactNum, major, lab);

				professorList.insertProfessor(professor);
			}
			br.close();
		}

		// 파일 출력
		// iohandler
		public void saveProfessor(ProfessorList professorList, String filename) throws IOException {

			FileOutputStream fout = new FileOutputStream(filename);
			BufferedWriter br = new BufferedWriter(new OutputStreamWriter(fout));

			for (int i = 0; i < professorList.getCount(); i++) {
				br.write(professorList.getProfessorList(i).getId() + "\t");
				br.write(professorList.getProfessorList(i).getName() + "\t");
				br.write(professorList.getProfessorList(i).getContactNum() + "\t");
				br.write(professorList.getProfessorList(i).getMajor() + "\t");
				br.write(professorList.getProfessorList(i).getLab() + "\t");
				br.newLine();
			}
			br.close();
		}
 }
