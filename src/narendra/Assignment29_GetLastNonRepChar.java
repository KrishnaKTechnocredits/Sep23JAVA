/*
Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : s 

*/
package narendra;

public class Assignment29_GetLastNonRepChar {
	void toPrintFreOfFirstRepChar(String str) {
		while (str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(str.length() - 1);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if ((orgLength - newLength) == 1) {
				System.out.println("output is: " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment29_GetLastNonRepChar getlastnonrepchar = new Assignment29_GetLastNonRepChar();
		getlastnonrepchar.toPrintFreOfFirstRepChar("technocredits");
	}
}
