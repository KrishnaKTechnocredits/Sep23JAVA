/*Assignment65:
check alphanumeric string palindrome
	a8r9t7t9r8a
	1j1
	c9e3rtr3e9c
	12521
	jadeja*/
package denish;

public class Assignment65 {

	void palindrome(String input) {
		String output = "";
		for (int index = input.length() - 1; index >= 0; index--) {
			output = output + input.charAt(index);
		}
		if (input.equals(output)) {
			System.out.println(input + " is palindrome");
		} else {
			System.out.println(input + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();
		assignment65.palindrome("a8r9t7t9r8a");
		assignment65.palindrome("1j1");
		assignment65.palindrome("c9e3rtr3e9c");
		assignment65.palindrome("12521");
		assignment65.palindrome("jadeja");
	}
}
