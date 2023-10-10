/*
 * Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : s
 */

package shamli;

public class Assignment29 {

	void printLastNonRepChar(String input){

		System.out.println("Input String is :"+input);
		while(input.length()!=0) {
			int originalLength=input.length();
			char ch=input.charAt(originalLength-1);
			input=input.replace(String.valueOf(ch),"");
			int newLength=input.length();
			int count=originalLength-newLength;

			if(count==1) {
				System.out.println("Last non repetative char from string is :"+ch);
				break;
			}
		}
	}
	public static void main(String[] args) {
		Assignment29 assignment29=new Assignment29();
		assignment29.printLastNonRepChar("technocredits");
	}
}
