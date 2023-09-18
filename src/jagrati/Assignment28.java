/*Assingment - 28 : 18th Sep'2023
Print the first non repeatative character using while loop.
String str = "technocredits";
output : h
 */

package jagrati;

public class Assignment28 {
	void nonrepeatative(String input) {
		while(input.length()>0){
			int orgLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int newLength = input.length();
			if((orgLength-newLength)==1){
				System.out.println("The first non repeatative character = " + ch);
				break;
			}
		}
		
	}
	public static void main(String[] args) {
			Assignment28 assign = new Assignment28();
			assign.nonrepeatative("technocredits");
}
}
