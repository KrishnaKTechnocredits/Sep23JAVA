/* Print the first non repeatative character using while loop.
String str = "technocredits";
output : h*/

package sayali;

public class Assignment28 {

	void firstNonRepeatativeChar(String input) {
		while(input.length() > 0) {
			int strLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int endLen = input.length();
			if(strLen-endLen==1) {
				System.out.println(ch+"-->"+(strLen-endLen));
				break;
			}
		}
	}

	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.firstNonRepeatativeChar("technocredits");
	}
}