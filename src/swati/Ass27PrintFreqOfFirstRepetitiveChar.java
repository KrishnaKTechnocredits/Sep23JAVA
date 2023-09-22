/*Assingment - 27 : 18th Sep'2023 Print the freq of first repetitive character 
using while loop. 
String str = "abcdcededffff";
output : c -> 2 */

package swati;

public class Ass27PrintFreqOfFirstRepetitiveChar {

	void printFreqOfFirstRepetitiveChar(String input) {
		while (input.length() > 0) {
			int originallength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int remaininglength = input.length();
			if (originallength - remaininglength > 1) {
				System.out.println(ch + " --> " + (originallength - remaininglength));
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Ass27PrintFreqOfFirstRepetitiveChar().printFreqOfFirstRepetitiveChar("abcdcededffff");
	}
}
