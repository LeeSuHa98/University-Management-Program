package Lab;

import ScriptHandler.ScriptHandler;

public class LabRoomIOHandler {
    ScriptHandler scriptHandler = new ScriptHandler();

    public LabRoom getLabRoom() {
        int labCode = scriptHandler.getInteger("lab code : ");
        String labName = scriptHandler.getString("lab name : ");
        String department = scriptHandler.getString("department : ");
        String professor = scriptHandler.getString("professor : ");
        String researchField = scriptHandler.getString("research field : ");
        String location = scriptHandler.getString("location(building, room number) : ");
        String contactNum = scriptHandler.getString("contact number : ");

        LabRoom labRoom = new LabRoom(labCode, labName, department, professor, researchField, location, contactNum);

        return labRoom;
    }

    public int getLabRoomMenu() {
        int menu = 0;

        System.out.println("-------연구실 관리-------");
        System.out.println("1. 연구실 등록");
        System.out.println("2. 연구실 수정");
        System.out.println("3. 연구실 삭제");
        System.out.println("4. 연구실 조회");
        System.out.println("5. 해당 연구실 대학원생 조회");
        System.out.println("6. 종료");

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

    public int getLabCode() {
        int labCode = scriptHandler.getInteger("lab code 값을 입력해 주세요. ");

        return labCode;
    }

    public void putLabRoom(LabRoomList labRoomList) {
        System.out.println("lab code" + "\t" + "lab name" + "\t" + "department" + "\t" + "professor" + "\t" + "research field" + "\t" + "location(building, room number)" + "\t" + "contact number");

        for(int i = 0; i < labRoomList.getCount(); i++){
            System.out.println(labRoomList.getLabRoomList(i).getLabCode() + "\t" + labRoomList.getLabRoomList(i).getLabName() + "\t" + labRoomList.getLabRoomList(i).getDepartment() + "\t" +
            labRoomList.getLabRoomList(i).getProfessor() + "\t" + labRoomList.getLabRoomList(i).getResearchField() + "\t" + labRoomList.getLabRoomList(i).getLocation() + "\t" +
            labRoomList.getLabRoomList(i).getLocation() + "\t" + labRoomList.getLabRoomList(i).getContactNum());
        }
    }
}
