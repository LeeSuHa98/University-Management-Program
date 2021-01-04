package Student;

public class StudentController {
	public void registerStudent(Student student, StudentIOHandler ioh, StudentList studentList) {
		student = ioh.getStudent();

		studentList.insertStudent(student);
		
		while(true) {
			boolean dialog = ioh.getDialogMenu();
			
			if(dialog == true) {
				student = ioh.getStudent();

				studentList.insertStudent(student);
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

	public void changeStudent(Student student, StudentIOHandler ioh, StudentList studentList) {
		int id = ioh.getId();

		int index = studentList.findStudent(id);
		student = ioh.getStudent();

		studentList.updateStudent(student, index);
	}

	public void removeStudent(StudentIOHandler ioh, StudentList studentList) {
		int id = ioh.getId();

		int index = studentList.findStudent(id);
		
		studentList.deleteStudent(index);
	}

	// 대학생 조회
	public void selectStudent(StudentList studentList, StudentIOHandler ioh) {
		ioh.putStudent(studentList);
	}
}
