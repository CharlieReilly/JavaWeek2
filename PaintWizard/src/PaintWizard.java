import java.util.ArrayList;

public class PaintWizard {
	
	public PaintWizard() {
		
	}
	
	CheapoMax c = new CheapoMax();
	AverageJoes a = new AverageJoes();
	DuluxourousPaints d = new DuluxourousPaints();
	ArrayList <Paint> Paints = new ArrayList <Paint>();
	
	public void gkgjk() {
	Paints.add(c);
	Paints.add(a);
	Paints.add(d);
	}
	
	public void leastWaste(int sizeOfRoom) {
		int wasteCheapo = sizeOfRoom%c.coverageOfTin;
		int wasteAverage = sizeOfRoom%a.coverageOfTin;
		int wasteDulux = sizeOfRoom%d.coverageOfTin;
		
		int leastWaste = Math.min(wasteCheapo, (Math.min(wasteAverage, wasteDulux)));
		
		if(wasteDulux == wasteAverage) {
			System.out.println("All paints have the same amount of waste, with " + leastWaste + " litres.");
		}
		
		else if(leastWaste == wasteAverage) {
			System.out.println("The paint with the least amount of waste is: Average Joes, with waste of " + leastWaste + " litres.");
		}
		else if(leastWaste == wasteDulux) {
			System.out.println("The paints with the least amount of waste are: Cheapo Max & Duluxourous Paints, each with waste of " + leastWaste + " litres.");
		}
		
}
	public void cheapestPaint(int sizeOfRoom) {
		int cTinsNeeded = (sizeOfRoom/c.coverageOfTin) + 1;
		int aTinsNeeded = (sizeOfRoom/a.coverageOfTin) + 1;
		int dTinsNeeded = (sizeOfRoom/d.coverageOfTin) + 1;
		
		float cTotalCost = (float) (cTinsNeeded*c.price);
		float aTotalCost = (float) (aTinsNeeded*a.price);
		float dTotalCost = (float) (dTinsNeeded*d.price);
		
		float cheapestChoice = Math.min(cTotalCost, Math.min(aTotalCost, dTotalCost));
		
		if(cheapestChoice == cTotalCost) {
			System.out.println("The cheapest paint to buy in order to fully paint a room of size " + sizeOfRoom + " metres squared is Cheapo Max, with a cost of £" + cTotalCost);
			}
		if(cheapestChoice == aTotalCost) {
			System.out.println("The cheapest paint to buy in order to fully paint a room of size " + sizeOfRoom + " metres squared is Average Joes, with a cost of £" + aTotalCost);
		}
		if(cheapestChoice == dTotalCost) {
			System.out.println("The cheapest paint to buy in order to fully paint a room of size " + sizeOfRoom + " metres squared is Duluxourous Paints, with a cost of £" + dTotalCost);
		}
	
}
}


