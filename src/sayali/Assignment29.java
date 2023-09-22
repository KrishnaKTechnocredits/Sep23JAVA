/* Print the last non repetitive character using while loop.
String str = "technocredits";
output : s */

package sayali;

public class Assignment29 {

	void printLastNonRepetitiveChar(String input) {
		while(input.length()>0) {
			int strLen = input.length();
			char ch = input.charAt(input.length()-1);
			input = input.replace(String.valueOf(ch), "");
			int endLen = input.length();
			if (strLen-endLen == 1) {
				System.out.println("Last non repeatative character of the given string is --> "+ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment29 assignment29 = new Assignment29();
		assignment29.printLastNonRepetitiveChar("technocredits");
	}
}