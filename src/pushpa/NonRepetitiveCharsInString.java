//Assignment 22
package pushpa;

public class NonRepetitiveCharsInString {

	public void printNonRepetitiveCharsInString(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))) {
				System.out.print(str.charAt(i));
			}
		}
	}

	public static void main(String[] args) {
		NonRepetitiveCharsInString nonRepetitiveCharsInString = new NonRepetitiveCharsInString();
		nonRepetitiveCharsInString.printNonRepetitiveCharsInString("technocredits");
	}
}
