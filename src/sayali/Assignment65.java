/* WAP to check alphanumeric string palindrome
	a8r9t7t9r8a
	1j1
	c9e3rtr3e9c
	12521
	jadeja */

package sayali;

public class Assignment65 {

	public void isPalindrome(String str) {

		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output += str.charAt(index);
		}
		if (str.equals(output)) {
			System.out.println("\nString " + "'" + str+ "'" + " is palindrome.");
		} else {
			System.out.println("\nString " + "'" + str+ "'" + " is not palindrome.");
		}
	}

	public static void main(String[] args) {
		Assignment65 ass65 = new Assignment65();
		ass65.isPalindrome("a8r9t7t9r8a");
		ass65.isPalindrome("1j1");
		ass65.isPalindrome("c9e3rtr3e9c");
		ass65.isPalindrome("12521");
		ass65.isPalindrome("jadeja");
	}
}