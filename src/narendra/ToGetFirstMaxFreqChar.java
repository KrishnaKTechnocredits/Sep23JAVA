/*
Assignment-21_1 : 13th Sep'2023

Write a program to find character having first maximum frequency from given String.

input : aakanksha

output : aakanksha -> a -> 4

*/

package narendra;

public class ToGetFirstMaxFreqChar {

	int toPrintFreqOfChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		return count;
	}

	void toPrintMaxFreqOfChar(String input) {
		int maxFreq = 0;
		char maxChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int freq = toPrintFreqOfChar(input, ch);
			if (maxFreq < freq) {
				maxFreq = freq;
				maxChar = ch;
			}
		}
		System.out.println(input + ": " + "first max freq char: " + maxChar + "--> " + maxFreq);
	}

	public static void main(String[] args) {
		ToGetFirstMaxFreqChar getmaxfreqchar = new ToGetFirstMaxFreqChar();
		getmaxfreqchar.toPrintMaxFreqOfChar("aakanksha");
		getmaxfreqchar.toPrintMaxFreqOfChar("technocredits");

	}

}
