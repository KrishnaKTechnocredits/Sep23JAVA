/*Assignment-21 : 13th Sep'2023 Write a program to find character having maximum
frequency from given String. input : aakanksha output : aakanksha -> a -> 4 input 
: teecccchnoceredites output : teecccchnoceredites -> e -> 5 */
 
package swati;

public class Ass21CharWitMaxFrequency {

	int getChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void printCharWithMaxFrequency(String input) {
		int maxcharcount = 0;
		char maxchar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int frequncy = getChar(input, ch);
			if (maxcharcount < frequncy) {
				maxcharcount = frequncy;
				maxchar = ch;
			}
		}
		System.out.println(input + " -> " + maxchar + " -> " + maxcharcount);
	}

	public static void main(String[] args) {
		Ass21CharWitMaxFrequency ass21CharWitMaxFrequency = new Ass21CharWitMaxFrequency();
		ass21CharWitMaxFrequency.printCharWithMaxFrequency("aakanksha");
		ass21CharWitMaxFrequency.printCharWithMaxFrequency("teecccchnoceredites");
	}
}
