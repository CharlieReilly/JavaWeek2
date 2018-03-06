
public class UniqueSum {

	 int a;
	 int b;
	 int c;
	 
	  public UniqueSum() {
		  
	  }
	  
	  public void uniqueSum (int a, int b, int c) {
		  if(a==b && b!=c) {
			  System.out.println(c);
		  }
		  if(a==c && b!=c) {
			  System.out.println(b);
		  }
		  if(b==c && a!=b) {
			  System.out.println(a);
		  }
		  if(a==b && b==c) {
			  System.out.println("0");
		  }
		  else if(a!=b && b!=c && a!=c) {
			  
			  int d = a + b + c;
			  System.out.println(d);
		  }
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniqueSum sum = new UniqueSum();
		
		sum.uniqueSum(10, 6, 17);
	}

}
