    /*Assingment - 27 : 18th Sep'2023
Print the freq of first Repetitive character using while loop.
String str = "abcdcededffff";
output : c -> 2
*/
package deepak;

public class Assignment27_FirstRepetitiveChar {
	void getFirstRepetitiveChar(String input) {
		System.out.println("Input String: " + input);
		while(input.length() > 0) {
			int oLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int nLen = input.length();
			if((oLen - nLen) > 1) {
				System.out.println("Output: "+ch+" --> "+(oLen - nLen));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment27_FirstRepetitiveChar getChar = new Assignment27_FirstRepetitiveChar();
		getChar.getFirstRepetitiveChar("abcdcededffff");
	}
}
