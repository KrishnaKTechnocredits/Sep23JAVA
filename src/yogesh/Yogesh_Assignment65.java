//2. check alphanumeric string palindrom
//	a8r9t7t9r8a
//	1j1
//	c9e3rtr3e9c
//	12521
//	jadeja
package yogesh;

public class Yogesh_Assignment65 {

	static boolean checkPalindromeString(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch != str.charAt(str.length() - 1 - i)) {
				return false;
			}
		}
		return true;
	}

	static boolean processData(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String str = arr[i];
			if (!checkPalindromeString(str)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String[] s = { "a8r9t7t9r8a", "1j1", "c9e3rtr3e9c", "12521", "jadeja" };
		for (int i = 0; i < s.length; i++) {
			String str = s[i];
			if (checkPalindromeString(str)) {
				System.out.println("The string '" + str + "' is an alphanumeric palindrome.");
			} else {
				System.out.println("The string '" + str + "' is not an alphanumeric palindrome.");
			}
		}
	}
}