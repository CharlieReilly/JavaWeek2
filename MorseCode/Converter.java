import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Converter {
	
	
	public Converter() {
		
	}

//	ArrayList<String> morseInputArray = new ArrayList<String>();
	
	Alphabet alpha = new Alphabet();
	
	public String getInput() {
		
		Scanner sc = new Scanner(System.in);
		String morseInput = sc.nextLine();
		return morseInput;
		
	}
	
	public String[] splitInputToWords(String morseInput) {
		
		String[] toWords = morseInput.split(" / ");
		return toWords;
		
	}
	
	public String[] convertToAlphabet(String[] toWords) {
		
		for(int i = 0; i < toWords.length; i++) {
			String[] toLetters = toWords[i].split(" ");
		
			for(int j = 0; j < toLetters.length; j++) {
			
				for(String k : alpha.morseLetters) {
				
					if(k.equals(toLetters[j])) {
						int pos = alpha.morseLetters.indexOf(k);
						toLetters[j] = alpha.alphaLetters.get(pos);
						
					}
					
				
				}
			}
		
			toWords[i] = Stream.of(toLetters).collect(Collectors.joining());
		
		}
		return toWords;
		
		
	}
	
	public void outputSentence(String[] toWords) {
		
		for(int i=0; i < toWords.length; i++) {
			
			System.out.print(toWords[i] + " ");
		}
		
	}
	
	
}
