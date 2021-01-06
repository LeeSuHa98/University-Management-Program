
import Professor.*;
import ScriptHandler.ScriptHandler;
import Student.*;
import Staff.*;
import Graduate.*;

import java.io.IOException;

import FileHandler.FileHandler;


public class Main {
	public static void main(String[] args) {
		// 데이터 값은 메모장에 입출력
		ScriptHandler scriptHandler = new ScriptHandler();

		StudentList studentList = new StudentList();
		Student student = new Student();
		StudentIOHandler studentIOH = new StudentIOHandler();
		StudentController studentController = new StudentController();

		Professor professor = new Professor();
		ProfessorList professorList = new ProfessorList();
		ProfessorIOHandler professorIOH = new ProfessorIOHandler();
		ProfessorController professorController = new ProfessorController();
		
		Staff staff = new Staff();
		StaffList staffList = new StaffList();
		StaffIOHandler staffIOH = new StaffIOHandler();
		StaffController staffController = new StaffController();
		
		Graduate graduate = new Graduate();
		GraduateList graduateList = new GraduateList();
		GraduateIOHandler graduateIOH = new GraduateIOHandler();
		GraduateController graduateController = new GraduateController();
		
		FileHandler file = new FileHandler();
		
		try {
			file.loadStudent(studentList, "/Users/suhalee/Desktop/student.txt");
			file.loadGraduate(graduateList, "/Users/suhalee/Desktop/professor.txt");
			file.loadStaff(staffList, "/Users/suhalee/Desktop/staff.txt");
			file.loadGraduate(graduateList, "/Users/suhalee/Desktop/graduate.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 메뉴 선택
		while (true) {
			int menu = 0;

			System.out.println(" 학교관리 시스템 메뉴 ");
			System.out.println("1. 대학생 정보 ");
			System.out.println("2. 대학원생 정보 ");
			System.out.println("3. 교수 정보 ");
			System.out.println("4. 교직원 정보 ");
			System.out.println("5. 종료");

			menu = scriptHandler.getInteger("");

			if (menu == 1) {
				while (true) {
					int studentMenu = studentIOH.getStudentMenu();

					switch (studentMenu) {
					case 1:
						studentController.registerStudent(student, studentIOH, studentList);
						// 등록 함수
						break;
					case 2:
						studentController.changeStudent(student, studentIOH, studentList);
						// 수정 함수
						break;
					case 3:
						studentController.removeStudent(studentIOH, studentList);
						// 삭제 함수
						break;
					case 4:
						studentController.selectStudent(studentList, studentIOH);
						// 조회 함수
						break;
					case 5:
						boolean dialog = studentIOH.getExitDialogMenu();

						if (dialog == true) {
							try {
								file.saveStudent(studentList, "/Users/suhalee/Desktop/student.txt");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.exit(1);
						} else if (dialog == false) {
							continue;
						} else {
							continue;
						}
					default:
						System.out.println("프로그램을 종료하시겠습니까 ? ");
						// 종료 함수
						break;
					}

				}
			}
			if (menu == 2) {
				while (true) {
					int graduateMenu = graduateIOH.getGraduateMenu();

					switch (graduateMenu) {
					case 1:
						graduateController.registerGraduate(graduate, graduateIOH, graduateList);;
						// 등록 함수
						break;
					case 2:
						graduateController.changeGraduate(graduate, graduateIOH, graduateList);
						// 수정 함수
						break;
					case 3:
						graduateController.removeGraduate(graduate, graduateIOH, graduateList);
						// 삭제 함수
						break;
					case 4:
						graduateController.selectGraduate(graduateList, graduateIOH);
						// 조회 함수
						break;
					case 5:
						boolean dialog = graduateIOH.getExitDialogMenu();

						if (dialog == true) {
							try {
								file.saveGraduate(graduateList, "/Users/suhalee/Desktop/graduate.txt");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.exit(1);
						} else if (dialog == false) {
							continue;
						} else {
							continue;
						}
					default:
						System.out.println("프로그램을 종료하시겠습니까 ? ");
						// 종료 함수
						break;
					}

				}
			}
			if (menu == 3) {
				while (true) {
					int professorMenu = professorIOH.getProfessorMenu();

					switch (professorMenu) {
					case 1:
						professorController.registerProfessor(professor, professorIOH, professorList);
						// 등록 함수
						break;
					case 2:
						professorController.changeProfessor(professor, professorIOH, professorList);
						//수정함수 
						break;
					case 3:
						professorController.removeProfessor(professor, professorIOH, professorList);
						//삭제함수 
						break;
					case 4:
						professorController.selectProfessor(professorIOH, professorList);
						//조회함수 
						break;
					case 5:
						boolean dialog = professorIOH.getExitDialogMenu();

						if (dialog == true) {
							try {
								file.saveProfessor(professorList, "/Users/suhalee/Desktop/professor.txt");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.exit(1);
						} else if (dialog == false) {
							continue;
						} else {
							continue;
						}
					default:
						System.out.println("프로그램을 종료하시겠습니까 ? ");
						// 종료 함수
						break;
					}
				}

			}
			if(menu == 4) {
				while(true) {
					int staffMenu = staffIOH.getStaffMenu();
					
					switch(staffMenu){
					case 1:
						staffController.registerStaff(staff, staffIOH, staffList);
						break;
					case 2:
						staffController.changeStaff(staff, staffIOH, staffList);
						break;
					case 3:
						staffController.removeStaff(staff, staffIOH, staffList);
						break;
					case 4:
						staffController.selectStaff(staffIOH, staffList);
						break;
					case 5:
						boolean dialog = staffIOH.getExitDialogMenu();

						if (dialog == true) {
							try {
								file.saveStaff(staffList, "/Users/suhalee/Desktop/staff.txt");
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							System.exit(1);
						} else if (dialog == false) {
							continue;
						} else {
							continue;
						}
					default:
						System.out.println("프로그램을 종료하시겠습니까 ? ");
						// 종료 함수
						break;
					}
				}
			}
			if (menu < 0 || menu > 5) {
				System.out.println("잘못선택함");
				break;
			}

		}
	}
}
