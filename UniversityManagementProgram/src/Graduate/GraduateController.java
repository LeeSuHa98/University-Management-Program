package Graduate;

public class GraduateController {
	public void registerGraduate(Graduate graduate, GraduateIOHandler graduateIOH, GraduateList graduateList) {
		// 대학원생 등록
		graduate = graduateIOH.getGraduate();
		graduateList.insertGraduate(graduate);

		while (true) {
			boolean dialog = graduateIOH.getDialogMenu();

			if (dialog == true) {
				graduate = graduateIOH.getGraduate();

				graduateList.insertGraduate(graduate);
			} else if (dialog == false) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
	
	public void changeGraduate(Graduate graduate, GraduateIOHandler graduateIOH, GraduateList graduateList) {
		int id = graduateIOH.getId();
		
		int index = graduateList.findGraduate(id);
		graduate = graduateIOH.getGraduate();
		
		graduateList.updateGraduate(graduate, index);
	}
	
	public void removeGraduate(Graduate graduate, GraduateIOHandler graduateIOH, GraduateList graduateList) {
		int id= graduateIOH.getId();
		
		int index = graduateList.findGraduate(id);
		
		graduateList.deleteGraduate(index);
	}
	
	public void selectGraduate(GraduateList graduateList, GraduateIOHandler graduateIOH) {
		graduateIOH.putGraduate(graduateList);
	}
}
