/*
Assignment-21_2 : 13th Sep'2023

Write a program to find character having last maximum frequency from given String.

input : tttteecccchnoceredites

output : tttteecccchnoceredites -> e -> 5
*/

package narendra;

public class ToGetLastMaxFreqChar {

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
			if (maxFreq <= freq) {
				maxFreq = freq;
				maxChar = ch;
			}
		}
		System.out.println(input + ": " + "last max freq char:- " + maxChar + "--> " + maxFreq);
	}

	public static void main(String[] args) {
		ToGetLastMaxFreqChar getlastmaxfreqchar = new ToGetLastMaxFreqChar();
		getlastmaxfreqchar.toPrintMaxFreqOfChar("tttteecccchnoceredites");

	}

}
