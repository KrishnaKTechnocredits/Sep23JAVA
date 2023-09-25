/*
Assignment - 27 : 18th Sep'2023
Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2 

*/
package narendra;

public class Assignment27_GetFreqOfFirstfRepChar {
	void toPrintFreOfFirstRepChar(String str) {
		while (str.length() > 0) {
			int orgLength = str.length();
			char ch = str.charAt(0);
			str = str.replace(String.valueOf(ch), "");
			int newLength = str.length();
			if ((orgLength - newLength) > 1) {
				System.out.println("output is: "+ ch + "--> " + (orgLength - newLength));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment27_GetFreqOfFirstfRepChar getfreqoffirstrepchar = new Assignment27_GetFreqOfFirstfRepChar();
		getfreqoffirstrepchar.toPrintFreOfFirstRepChar("abcdcededffff");
	}
}
