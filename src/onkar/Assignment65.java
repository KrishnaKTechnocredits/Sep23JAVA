/*check alphanumeric string palindrome
	a8r9t7t9r8a
	1j1
	c9e3rtr3e9c
	12521
	jadeja*/

package onkar;

public class Assignment65 {
	
	void isPalindrome(String input) {
		String output = "";
		for (int index=input.length()-1; index>=0; index--) {
			output += input.charAt(index); 
		}
		if (input.equals(output))
			System.out.println(input+" is a palindrome");
		else
			System.out.println(input+" is not a palindrome");
	}
	
	public static void main(String[] args) {
		Assignment65 assignment65 = new Assignment65();
		assignment65.isPalindrome("a8r9t7t9r8a");
		assignment65.isPalindrome("1j1");
		assignment65.isPalindrome("c9e3rtr3e9c");
		assignment65.isPalindrome("12521");
		assignment65.isPalindrome("jadeja");
	}
}
