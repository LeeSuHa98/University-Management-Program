package FileHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import Graduate.Graduate;
import Graduate.GraduateList;
import Professor.Professor;
import Professor.ProfessorList;
import Staff.Staff;
import Staff.StaffList;
import Student.Student;
import Student.StudentList;

public class FileHandler {
	public FileHandler() {

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

	//파일 입력
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

	public void saveStaff(StaffList staffList, String filename) throws IOException {

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
