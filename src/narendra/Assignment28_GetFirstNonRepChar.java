/*
Assingment - 28 : 18th Sep'2023
Print the first non repeatative character using while loop.
String str = "technocredits";
output : h 

*/
package narendra;

public class Assignment28_GetFirstNonRepChar {
	void toPrintFreOfFirstRepChar(String str) {
//		for(; str.length()>0 ;) {
		while (str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if ((orgLength - newLength) == 1) {
				System.out.println("output is: " + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment28_GetFirstNonRepChar getfirstnonrepchar = new Assignment28_GetFirstNonRepChar();
		getfirstnonrepchar.toPrintFreOfFirstRepChar("technocredits");
	}

}
