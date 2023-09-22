/*Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : s*/

package deepak;

public class Assignment29_LastNonRepetitiveChar {
	void getLastNonRepetitiveChar(String input) {
		System.out.println("Input String: " + input);
		while (input.length() > 0) {
			int oLen = input.length();
			char ch = input.charAt(oLen - 1);
			input = input.replace(String.valueOf(ch), "");
			int nLen = input.length();
			if ((oLen - nLen) == 1) {
				System.out.println("output: " + ch + " --> " + (oLen - nLen));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment29_LastNonRepetitiveChar getChar = new Assignment29_LastNonRepetitiveChar();
		getChar.getLastNonRepetitiveChar("technocredits");
	}
}
