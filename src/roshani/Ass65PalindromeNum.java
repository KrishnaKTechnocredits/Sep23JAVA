/*
Assignment65:
check alphanumeric string palindrome
	a8r9t7t9r8a
	1j1
	c9e3rtr3e9c
	12521
	jadeja
	
	*/

package roshani;

public class Ass65PalindromeNum {
	
	void palindrome(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output = output + str.charAt(index);
		}
		if (str.equals(output)) {
			System.out.println("'" + str + "' is Palindrome"+'\n');
		} else {
			System.out.println("'" + str + "' is not Palindrome"+'\n');
		}
	}

	public static void main(String[] args) {
		Ass65PalindromeNum assignment65 = new Ass65PalindromeNum();
		assignment65.palindrome("a8r9t7t9r8a");
		assignment65.palindrome("1j1");
		assignment65.palindrome("c9e3rtr3e9c");
		assignment65.palindrome("12521");
		assignment65.palindrome("jadeja");
		assignment65.palindrome("MalayalaM");
	}
}
