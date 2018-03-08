import java.util.ArrayList;

public class PaintWizard {
	
	public PaintWizard() {
		
	}
	
	CheapoMax c = new CheapoMax();
	AverageJoes a = new AverageJoes();
	DuluxourousPaints d = new DuluxourousPaints();
	ArrayList <Paint> Paints = new ArrayList <Paint>();
	
	void gkgjk() {
	Paints.add(c);
	}
	
	public void leastWaste(int sizeOfRoom) {
		int wasteCheapo = sizeOfRoom%c.coverageOfTin;
		int wasteAverage = sizeOfRoom%a.coverageOfTin;
		int wasteDulux = sizeOfRoom%d.coverageOfTin;
		
		int leastWaste = Math.min(wasteCheapo, (Math.min(wasteAverage, wasteDulux)));
		
//		if(leastWaste == wasteCheapo) {
//			System.out.println("The paint with the least amount of waste is: Cheapo Max, with waste of " + leastWaste + " litres.");
//		}
		if(leastWaste == wasteAverage) {
			System.out.println("The paint with the least amount of waste is: Average Joes, with waste of " + leastWaste + " litres.");
		}
		if(leastWaste == wasteDulux) {
			System.out.println("The paints with the least amount of waste are: Cheapo Max & Duluxourous Paints, each with waste of " + leastWaste + " litres.");
		}
}
}


