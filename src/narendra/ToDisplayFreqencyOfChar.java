/*
Assignment-19_1 : 10th Sep'2023
Print the frequecy of given character from given String.
input : technocredits
        t
		
output : frequency of t in technocredits is 2.
*/

package narendra;

public class ToDisplayFreqencyOfChar {

	void printFrequencyOfGivenChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("frequency of char t in technocredits is: " + count);
	}

	public static void main(String[] args) {
		ToDisplayFreqencyOfChar frequencyofchar = new ToDisplayFreqencyOfChar();
		frequencyofchar.printFrequencyOfGivenChar("technocredits", 't');
	}
}
