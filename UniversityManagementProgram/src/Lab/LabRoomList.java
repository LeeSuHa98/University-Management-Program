package Lab;

public class LabRoomList {
    final int MAX_LABROOMLIST = 10000;
    private int count = 0;

    public LabRoom[] labRoomList = new LabRoom[MAX_LABROOMLIST];

    public LabRoomList(){
        this.count = 0;
    }

    public int getCount(){
        return count;
    }

    public LabRoom getLabRoomList(int index){
        return labRoomList[index];
    }

    public int findLabRoom(int labCode){
        for(int i = 0; i < count; i++) {
			if(labCode == labRoomList[i].getLabCode()) {
				return i;
			}
		}
		return 0;
    }

    public void insertLabRoom(LabRoom labRoom){
        labRoomList[count] = labRoom;
        count++;
    }

    public void updateLabRoom(LabRoom labRoom, int labCode){
        labRoomList[labCode] = labRoom;
    }
    
    public void deleteLabRoom(int labCode){
        for(int i = labCode; i < count; i++){
            labRoomList[i] = labRoomList[i+1];
        }
        count--;
    }
}
