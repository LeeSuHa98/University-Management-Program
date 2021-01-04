package Professor;

public class ProfessorList {
	final int MAX_PROFESSOR = 1000;
	private int count = 0;
	
	public Professor[] professorList = new Professor[MAX_PROFESSOR];
	
	public ProfessorList() {
		count = 0;
	}
	public Professor getProfessorList(int index) {
		return professorList[index];
	}
	
	public int getCount() {
		return this.count;
	}
	
	public int findProfessor(int id) {
		for (int i = 0; i < count; i++) {
			if (id == getProfessorList(i).getId()) {
				return i;
			}
		}
		return 0;
	}
	public void insertProfessor(Professor professor) {
		professorList[count] = professor;
		count++;
	}
	
	public void updateProfessor(Professor professor, int index) {
		professorList[index] = professor;
	}
	
	public void deleteProfessor(int index) {
		for(int i = index; i < count; i++) {
			professorList[i] = professorList[i + 1];
		}
		count--;
	}
	
}
