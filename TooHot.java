
public class TooHot {
	int temperature;
	boolean isSummer;
	

	
	public TooHot() {
		
	}
		
	public void tooHot(int temperature, boolean isSummer) {
		
		
		if((60 <= temperature && temperature <= 100 && isSummer) || (60 <= temperature && temperature <= 90 && !isSummer)) {
			System.out.println("true");
		}

		else {
			System.out.println("false");
		}
		}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TooHot t = new TooHot();
		
		
		t.tooHot(30,true);

		
	}

}
