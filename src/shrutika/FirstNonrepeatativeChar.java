/*Print the first non repeatative character using while loop.
String str = "technocredits";
output : h */
package shrutika;

public class FirstNonrepeatativeChar {

	void nonrepeatativeChar(String input) {
		while (input.length() > 0) {
			int orgLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int newLength = input.length();
			if (orgLength - newLength == 1) {
				System.out.println("first non repeatative character is -> "+ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		FirstNonrepeatativeChar firstNonrepeatativeChar = new FirstNonrepeatativeChar();
		firstNonrepeatativeChar.nonrepeatativeChar("technocredits");
	}
}
