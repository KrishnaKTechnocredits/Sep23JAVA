/*Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : s
*/
package pavan;

public class Assi29 {
	void test2(String str) {
		while (str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(str.length() - 1);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if (orgLength - newLength == 1) {
				System.out.println(ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assi29 assi29 = new Assi29();
		assi29.test2("technocredits");
	}
}
