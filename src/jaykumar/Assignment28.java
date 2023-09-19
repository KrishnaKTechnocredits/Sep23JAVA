/*Assingment - 28 : 18th Sep'2023
Print the first non repeatative character using while loop.
String str = "technocredits";
output : h
*/
package jaykumar;

public class Assignment28 {
	
	void firstNonRepChar(String input) {
		while(input.length()!=0) {
			int orgLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int newLen = input.length();
			int count = orgLen-newLen;
			if(count==1) {
				System.out.println(ch);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment28 assignment28 = new Assignment28();
		assignment28.firstNonRepChar("technocredits");
	}
}
