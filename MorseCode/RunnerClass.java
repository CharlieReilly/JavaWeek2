
public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Converter conv = new Converter();
		
		conv.alpha.addMorseLetters();
		conv.alpha.addAlphaLetters();
		
		String morseInput = conv.getInput();
		String[] toWords = conv.splitInputToWords(morseInput);
		
		String[] convertedWords = conv.convertToAlphabet(toWords);
		conv.outputSentence(convertedWords);
		
		
	}

}
