/*Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : s*/

package jaykumar;

public class Assignment29 {
	
	void lastNonRepChar(String input) {
		while(input.length()!=0) {
			int orgLen = input.length();
			char ch = input.charAt(orgLen-1);
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
		Assignment29 assignment29 = new Assignment29();
		assignment29.lastNonRepChar("technocredits");
	}
}
