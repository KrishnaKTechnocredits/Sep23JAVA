/*
 Assingment - 29 : 18th Sep'2023
Print the last non repeatative character using while loop.
String str = "technocredits";
output : h
 */

package jagrati;

public class Assignment29 {
	void lastNonRepeatative(String input) {
		while(input.length()>0){
			int orgLength = input.length();
			char ch = input.charAt(input.length()-1);
			input = input.replace(String.valueOf(ch),"");
			int newLength = input.length();
			if((orgLength-newLength)==1){
				System.out.println("The last non repeatative character is " + ch);
				break;
			}
			
		}
		
		
	}
	public static void main(String[] args) {
		Assignment29 assign = new Assignment29();
		assign.lastNonRepeatative("technocredits");
	
}
}
