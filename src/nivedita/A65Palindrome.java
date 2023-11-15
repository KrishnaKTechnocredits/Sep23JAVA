/*Assignment65:
check alphanumeric string palindrome
	a8r9t7t9r8a
	1j1
	c9e3rtr3e9c
	12521
	jadeja*/

package nivedita;

public class A65Palindrome {
	
	void isPalindrome(String input) {
		String output = "";
		for(int index=input.length()-1; index>=0; index--) {
			output += input.charAt(index);
		}
		if(input.equals(output)) {
			System.out.println(input+" is palindrome!");
		}else {
			System.out.println(input+" is not palindrome!");
		}
	}

	public static void main(String[] args) {
		A65Palindrome a65Palindrome = new A65Palindrome();
		a65Palindrome.isPalindrome("a8r9t7t9r8a");
		a65Palindrome.isPalindrome("1j1");
		a65Palindrome.isPalindrome("c9e3rtr3e9c");
		a65Palindrome.isPalindrome("12521");
		a65Palindrome.isPalindrome("jadeja");
	}
}
