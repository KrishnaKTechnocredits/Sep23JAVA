/*Assignment-21 : 13th Sep'2023

Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4*/

package rahul;

public class Assignment21_1 {

	int printFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (ch == input.charAt(index)) {
				count++;
			}
		}
		return count;
	}

	void printMaxFreqOfString(String input) {
		char ch = ' ';
		char chMax = ' ';
		int maxCount = 0;
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			int maxCountReturn = printFreq(input, ch);
			if (maxCountReturn > maxCount) {
				chMax = ch;
				maxCount = maxCountReturn;
			}
		}
		System.out.println(input + " -> " + chMax + " -> " + maxCount);
	}

	public static void main(String[] args) {
		Assignment21_1 assignment21_1 = new Assignment21_1();
		assignment21_1.printMaxFreqOfString("aakanksha");
	}

}
