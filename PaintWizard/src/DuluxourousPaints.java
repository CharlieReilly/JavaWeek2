
public class DuluxourousPaints extends Paint{
	
	public DuluxourousPaints() {
		super();
		this.name = "Duluxourous Paints";
		this.litresOfPaint = 10;
		this.price = 25.00;
		this.coverageOfTin = 20 * litresOfPaint;
		}
	
	public String getName() {
		return this.name;
	}
}
