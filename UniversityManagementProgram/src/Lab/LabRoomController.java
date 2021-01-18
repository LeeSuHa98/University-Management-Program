package Lab;

public class LabRoomController {
    //연구실 등록
    public void registerLabRoom(LabRoom labRoom, LabRoomIOHandler labRoomIOH, LabRoomList labRoomList) {
        labRoom = labRoomIOH.getLabRoom();
        labRoomList.insertLabRoom(labRoom);

		while (true) {
			boolean dialog = labRoomIOH.getDialogMenu();

			if (dialog == true) {
				labRoom = labRoomIOH.getLabRoom();
				labRoomList.insertLabRoom(labRoom);
			} else if (dialog == false) {
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
				break;
			}
		}
	}
    
    //연구실 수정
    public void changeLabRoom(LabRoom labRoom, LabRoomIOHandler labRoomIOH, LabRoomList labRoomList){
        int labCode = labRoomIOH.getLabCode();

        int index = labRoomList.findLabRoom(labCode);
        labRoom = labRoomIOH.getLabRoom();

        labRoomList.updateLabRoom(labRoom, index);
    }

    //연구실 삭제
    public void removeLabRoom(LabRoom labRoom, LabRoomIOHandler labRoomIOH, LabRoomList labRoomList){
        int labCode = labRoomIOH.getLabCode();

        int index = labRoomList.findLabRoom(labCode);

        labRoomList.deleteLabRoom(index);
    }
    
    //연구실 정보 조회
	public void selectLabRoom(LabRoomList labRoomList, LabRoomIOHandler labRoomIOH) {
        labRoomIOH.putLabRoom(labRoomList);
	}
}
