//Assignment65:
//check alphanumeric string palindrome
//	a8r9t7t9r8a
//	1j1
//	c9e3rtr3e9c
//	12521
//	jadeja

package pushpa;

public class Assignment65 {

	public void checkAlphaNumericPalindromeString(String input) {
		String output = "";
		
		for(int i = input.length()-1 ; i >=0 ; i--) {
			output += input.charAt(i);
		}
		
		if(input.equals(output))
			System.out.println("String is palindrome :"+ input);
		else
			System.out.println("String is not palindrome :"+ input);
	}

	public static void main(String[] args) {
		Assignment65 assignment64 = new Assignment65();
		assignment64.checkAlphaNumericPalindromeString("a8r9t7t9r8a");
		assignment64.checkAlphaNumericPalindromeString("1j1");
		assignment64.checkAlphaNumericPalindromeString("c9e3rtr3e9c");
		assignment64.checkAlphaNumericPalindromeString("12521");
		assignment64.checkAlphaNumericPalindromeString("jadeja");
	}
}
