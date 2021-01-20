package Graduate;

public class GraduateList {
	final int MAX_GRADUATE = 10000;
	public int count;
	
	Graduate[] graduateList = new Graduate[MAX_GRADUATE];
	
	public GraduateList() {
		this.count = 0;
	}
	
	public Graduate getGraduateList(int index) {
		return graduateList[index];
	}
	
	public int getCount() {
		return count;
	}
	
	public int findGraduate(int id) {
		for(int i = 0; i < count; i++) {
			if(id == graduateList[i].getId()) {
				return i;
			}
		}
		return 0;
	}

	public void insertGraduate(Graduate graduate) {
		graduateList[count] = graduate;
		count++;
	}
	
	public void updateGraduate(Graduate graduate, int index) {
		graduateList[index] = graduate;
	}
	
	public void deleteGraduate(int index) {
		for(int i = index; i < count; i++) {
			graduateList[i] = graduateList[i+1];
		}
		count--;
	}
}
