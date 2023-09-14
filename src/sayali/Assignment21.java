/* Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5 */

package sayali;

public class Assignment21 {
	
	int getCharFreq(String input, char ch) {
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
			int frequncy = getCharFreq(input, ch);
			if (maxcharcount < frequncy) {
				maxcharcount = frequncy;
				maxchar = ch;
			}
		}
		System.out.println(input + " -> " + maxchar + " -> " + maxcharcount);
	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.printCharWithMaxFrequency("aakanksha");
		assignment21.printCharWithMaxFrequency("teecccchnoceredites");
	}
}