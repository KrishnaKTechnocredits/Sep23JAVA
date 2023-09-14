/*Assignment-21 : 13th Sep'2023

Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5
there may be more than one method and we can call method1 in method2. In main method we do not write the code in main method ,its not a good practice.we genarally give commands in main method.
*/
package jyoti;
public class MaxFreq{

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
			int freq = getChar(input, ch); //called getChar method[it return int value] inside the printCharWithMaxFrequency method
			if (maxcharcount < freq) {
				maxcharcount = freq;
				maxchar = ch;
			}
		}
		System.out.println(input + " -> " + maxchar + " -> " + maxcharcount);
	}

	public static void main(String[] args) {
		MaxFreq mxfq = new MaxFreq();
		mxfq.printCharWithMaxFrequency("aakanksha");
		mxfq.printCharWithMaxFrequency("teecccchnoceredites");
	}
}