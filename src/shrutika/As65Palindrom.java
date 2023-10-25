/*65. check alphanumeric string palindrom
	a8r9t7t9r8a
	1j1
	c9e3rtr3e9c
	12521
	jadeja */
package shrutika;

public class As65Palindrom {

	void palindrome(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		if (input.equals(output))
			System.out.println(input + " -> is palingdrome number");
		else
			System.out.println(input + " -> is not palingdrome number");
	}

	public static void main(String[] args) {
		As65Palindrom as65Palindrom = new As65Palindrom();
		as65Palindrom.palindrome("a8r9t7t9r8a");
		as65Palindrom.palindrome("1j1");
		as65Palindrom.palindrome("c9e3rtr3e9c");
		as65Palindrom.palindrome("12521");
		as65Palindrom.palindrome("jadeja");
	}
}
