package nivedita;

public class A20PrintChar {
	
	void charFreqFromInput(String input) {
		/*int index=0;*/
		for(int index=0;index<input.length();index++) {
		char ch = input.charAt(index);
		int count=0;
		for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
			if (input.charAt(innerIndex) == ch) {
				count++;
			}
		}
		
		System.out.println(ch + "->" + count);
	}
	}

	public static void main(String[] args) {
		A20PrintChar printChar = new A20PrintChar();
		String input = "nivedita";
		printChar.charFreqFromInput(input);
	}
}
