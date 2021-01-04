package Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class StudentList {
	final int MAX_STUDENT = 10000;
	Scanner sc = new Scanner(System.in);

	private Student[] studentList = new Student[MAX_STUDENT];
	private int count;

	public StudentList() {
		count = 0;
	}

	public Student getStudentList(int index) {
		return studentList[index];
	}

	public int getCount() {
		return this.count;
	}

	// 특정 학생 찾는 함수
	public int findStudent(int id) {
		for (int i = 0; i < count; i++) {
			if (id == getStudentList(i).getId()) {
				return i;
			}
		}
		return 0;
	}

	// 대학생 등록
	public void insertStudent(Student student) {
		studentList[count] = student;
		count++;
	}

	// 대학생 수정
	public void updateStudent(Student student, int index) {
		studentList[index] = student;
	}

	// 대학생 삭제
	public void deleteStudent(int index) {
		for (int i = index; i < count; i++) {
			studentList[i] = studentList[i + 1];
		}		
		count--;
	}
}
