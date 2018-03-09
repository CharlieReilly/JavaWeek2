package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		String result = "";
		for(int i = 0; i < input.length(); i++) {
			char letter = input.charAt(i);
			result = result + letter + letter;
		}
		return result;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		String[] words = input.split("bread");
		if((input.substring(0,5).equals("bread")) && (input.substring(input.length()-5).equals("bread"))) {
			return input.substring(5,input.length()-5);
		}
		
		if(words.length == 2) {
		return "";
		}
		else return words[1];
	}

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		int d = Math.max(a, Math.max(b, c));
		int e = Math.min(a, Math.min(b,c));
		int f = (a+b+c) - d - e;
		return (d-f) == (f-e);
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String first = input.substring(0, a);
		String last = input.substring(input.length()-a);
		return first + last;
		
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		if(input.length() >=2) {	
		return (input.substring(input.length()-2)).equals("ly");
		}
		else return false;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		String result = "";
		for(int i=0; i<input.length()-1; i++) {
		if(input.charAt(i) == input.charAt(i+1)) {
		
		String first = input.substring(0,i);
		String last = input.substring(i+1);
		result = first + last;
		
		
		}
		
		}
		return result;
		
	
		
		
//		String result = "";
//		if(input.charAt(0) == input.charAt(1)) {
//		
//		}
//		
//		for(int i=1; i<input.length(); i++) {
//				;
//				if(input.charAt(i) == input.charAt(i+1)) {
//				result = input.substring(0, i) + input.substring(i+1);
//			}
//		
//		}
//		return result;
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		if(input == 0) {
			return 0;
		}
		if(input == 1) {
			return 1;
		}
		if(input == 2) {
			return 1;
		}
		else return (fibonacci(input-2) + fibonacci(input-1));
		
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	public int bunnyEars(int input) {
		int result = 0;
		if(input == 0) {
			return 0;
		}
		if(input == 1) {
			return 2;
		}
		if(input == 2) {
			return 4;
		}
		if(input>2) {
			return result = bunnyEars(1) + bunnyEars(input-1);
		}
		return result;
	}

}
