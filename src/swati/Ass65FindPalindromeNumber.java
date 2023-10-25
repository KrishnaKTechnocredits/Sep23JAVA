/*Assignment65:
check alphanumeric string palindrome
	a8r9t7t9r8a
	1j1
	c9e3rtr3e9c
	12521
	jadeja*/
package swati;

public class Ass65FindPalindromeNumber {
	
	void printPalindrome(String input) {
		String output = "";
		for(int index=input.length()-1;index>=0;index--) {
			output += input.charAt(index);
		}
		if(input.equals(output)) 
			System.out.println(input+" is palingdrome number");
		else
			System.out.println(input+" is not palingdrome number");
	}
	
	public static void main(String[] args) {
		Ass65FindPalindromeNumber ass65 = new Ass65FindPalindromeNumber();
		ass65.printPalindrome("a8r9t7t9r8a");
		ass65.printPalindrome("1j1");
		ass65.printPalindrome("c9e3rtr3e9c");
		ass65.printPalindrome("12521");
		ass65.printPalindrome("jadeja");
	}
}
