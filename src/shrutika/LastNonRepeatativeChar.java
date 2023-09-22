/* Print the last non repeatative character using while loop.
String str = "technocredits";
output : s */
package shrutika;

public class LastNonRepeatativeChar {
	
	void nonRepeatativeCha(String input) {
		while (input.length()>0) {
			int orgLength = input.length();
			char ch = input.charAt(input.length()-1);
			input = input.replace(String.valueOf(ch), "");
			int newLength = input.length();
			if (orgLength - newLength == 1) {
				System.out.println("last non repeatative character is -> " +ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		LastNonRepeatativeChar lastNonRepeatativeChar = new LastNonRepeatativeChar();
		lastNonRepeatativeChar.nonRepeatativeCha("technocredits");
	}
}