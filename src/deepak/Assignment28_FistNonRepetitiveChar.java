/*Assingment - 28 : 18th Sep'2023
Print the first non repeatative character using while loop.
String str = "technocredits";
output : h

*/
package deepak;

public class Assignment28_FistNonRepetitiveChar {
	void getFirstRepetitiveChar(String input) {
		System.out.println("Input String: " + input);
		while(input.length() > 0) {
			int oLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int nLen = input.length();
			if((oLen - nLen) == 1) {
				System.out.println("Output: "+ch+" --> "+(oLen - nLen));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment28_FistNonRepetitiveChar getChar = new Assignment28_FistNonRepetitiveChar();
		getChar.getFirstRepetitiveChar("technocredits");
	}
}
