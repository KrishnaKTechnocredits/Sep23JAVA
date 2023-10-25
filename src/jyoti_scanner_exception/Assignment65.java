package jyoti_scanner_exception;

public class Assignment65 {

	void palindrome(String str) {
		String output = "";
		for (int index = str.length() - 1; index >= 0; index--) {
			output = output + str.charAt(index);
		}
		if (str.equals(output)) {
			System.out.println(str + "<---> This is Palindrome"+'\n');
		} else {
			System.out.println(str + "<---> This is not Palindrome"+'\n');
		}
	}

	public static void main(String[] args) {
		Assignment65 ass = new Assignment65();
		ass.palindrome("a8r9t7t9r8a");
		ass.palindrome("1j1");
		ass.palindrome("c9e3rtr3e9c");
		ass.palindrome("12521");
		ass.palindrome("jadeja");
		ass.palindrome("MalayalaM");
	}
}