/* Assingment - 29 : 18th Sep'2023 Print the last non repeatative character using while loop.
String str = "technocredits"; 
output : s */

package swati;

public class Ass29PrintLastNonRepetitiveChar {

	void printLastNonRepetitiveChar(String input) {
		while (input.length() > 0) {
			int origionallength = input.length();
			char ch = input.charAt(input.length() - 1);
			input = input.replace(String.valueOf(ch), "");
			int remaininglength = input.length();
			if (origionallength - remaininglength == 1) {
				System.out.println("Last Non-repetitive character is -> " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		new Ass29PrintLastNonRepetitiveChar().printLastNonRepetitiveChar("technocredits");
	}
}
