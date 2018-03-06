package src;

public class UniqueSum {


	  public UniqueSum() {
		  
	  }
	  
	  public int uniqueSum (int a, int b, int c) {
		  if(a==b && b!=c) {
			 return c;
		  }
		  if(a==c && b!=c) {
			 return b;
		  }
		  if(b==c && a!=b) {
			 return a;
		  }
		  if(a==b && b==c) {
			 return 0;
		  }
		  if(a!=b && b!=c && a!=c) {
			  
			  int d = a + b + c;
			  return d;
		  }
		return 0;
		  
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UniqueSum sum = new UniqueSum();
		
		sum.uniqueSum(1, 1, 1);
	}

}
