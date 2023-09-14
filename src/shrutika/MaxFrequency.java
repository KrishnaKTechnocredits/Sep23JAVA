/*Assignment-21 : 13th Sep'2023 Write a program to find character having maximum
frequency from given String. input : aakanksha output : aakanksha -> a -> 4 input 
: teecccchnoceredites output : teecccchnoceredites -> e -> 5 */

package shrutika;

public class MaxFrequency {

	int getChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void charMaxFrequency(String input) {
		int maxCount = 0;
		char maxChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int frequency = getChar(input, ch);
			if (maxCount < frequency) {
				maxCount = frequency;
				maxChar = ch;
			}
		}
		System.out.println(input + " -> " + maxChar + " -> " + maxCount);
	}

	public static void main(String[] args) {
		MaxFrequency maxFrequency = new MaxFrequency();
		maxFrequency.charMaxFrequency("aakanksha");
		maxFrequency.charMaxFrequency("teecccchnoceredites");
	}
}
