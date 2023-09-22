package mohit;

public class Assignment_21 {

	int getCharFreq(String input, char ch) {

		int count = 0;

		for (int innerindex = 0; innerindex < input.length(); innerindex++) {

			if (input.charAt(innerindex) == ch) {
				count++;
			}
		}
		return count;

	}

	void printMaxFreqCharacter(String input) {
		int maxFreq=0;
		char maxChar='@';
		
		for(int index=0; index<input.length();index++) {
			char ch=input.charAt(index);
			int freq=getCharFreq(input, ch);
			if (maxFreq<freq) {
				maxFreq=freq;
				maxChar=ch;
			}
		}
		System.out.println("The character haveing maximum frequency in " + input + " is " + maxChar + " and its frequency is " + maxFreq
			);
		
	}

	public static void main(String[] args) {
		Assignment_21 assignment_21 = new Assignment_21();
		assignment_21.printMaxFreqCharacter("aakanksha");
		assignment_21.printMaxFreqCharacter("teecccchnoceredites");
		
	}

}
