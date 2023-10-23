/*Assingment - 28 : 18th Sep'2023
Print the first non repeatative character using while loop.
String str = "technocredits";
output : h */

package pavan;

public class Assi28 {
	void test1(String str) {
		while (str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if (orgLength - newLength == 1) {
				System.out.println(ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assi28 assi28 = new Assi28();
		assi28.test1("technocredits");
	}
}
