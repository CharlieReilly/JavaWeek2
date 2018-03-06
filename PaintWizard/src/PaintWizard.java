import java.util.ArrayList;

public class PaintWizard {
	
	int sizeOfRoom;
	
	
	
	public PaintWizard(int sizeOfRoom) {
		
		this.sizeOfRoom = sizeOfRoom;
	}
	
	
	CheapoMax c = new CheapoMax();
	AverageJoes a = new AverageJoes();
	DuluxourousPaints d = new DuluxourousPaints();
	ArrayList <Paint> Paints = new ArrayList <Paint>();
	
	void gkgjk() {
	Paints.add(c);
	}
	
	public String leastWaste(int sizeOfRoom) {
		int wasteCheapo = sizeOfRoom%c.coverageOfTin;
		int wasteAverage = sizeOfRoom%a.coverageOfTin;
		int wasteDulux = sizeOfRoom%d.coverageOfTin;
		
		
			return "The paint with the least amount of waste is: ";
		}
		
}

