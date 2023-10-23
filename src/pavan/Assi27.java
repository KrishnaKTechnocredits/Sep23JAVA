/*Assingment - 27 : 18th Sep'2023
Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2
*/
package pavan;

public class Assi27 {
	void test(String str) {
		while (str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if (orgLength - newLength > 1) {
				System.out.println(ch + " -> " + (orgLength - newLength));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assi27 assi27 = new Assi27();
		assi27.test("abcdcededffff");
	}
}
