/*Assingment - 28 : 18th Sep'2023 Print the first non repetitive character
 using while loop. 
String str = "technocredits"; 
output : h */

package swati;

public class Ass28PrintFreqOfFirstNonRepetitiveChar {

	void printFreqOfFirstNonRepetitiveChar(String input) {
		while (input.length() > 0) {
			int originallength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int remaininglength = input.length();
			if (originallength - remaininglength == 1){
				System.out.println("First non repetitive char is -> "+ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Ass28PrintFreqOfFirstNonRepetitiveChar().printFreqOfFirstNonRepetitiveChar("technocredits");
	}
}
