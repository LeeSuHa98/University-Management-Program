package Professor;
import ScriptHandler.*;

public class ProfessorController {
	public void registerProfessor(Professor professor, ProfessorIOHandler ioh, ProfessorList professorList) {
 		professor = ioh.getProfessor();
		
		professorList.insertProfessor(professor);
		
		while(true) {
			boolean dialog = ioh.getDialogMenu();
			
			if(dialog == true) {
				professor = ioh.getProfessor();
				
				professorList.insertProfessor(professor);
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
	
	public void changeProfessor(Professor professor, ProfessorIOHandler ioh, ProfessorList professorList) {
		int id = ioh.getId();
		
		int index = professorList.findProfessor(id);
		professor = ioh.getProfessor();
		
		professorList.updateProfessor(professor, index);
	}
	
	public void removeProfessor(Professor professor, ProfessorIOHandler ioh, ProfessorList professorList) {
		int id = ioh.getId();
		
		int index = professorList.findProfessor(id);
		
		professorList.deleteProfessor(index);
	}
	
	public void selectProfessor(ProfessorIOHandler ioh, ProfessorList professorList) {
		ioh.putProfessor(professorList);
	}
}
