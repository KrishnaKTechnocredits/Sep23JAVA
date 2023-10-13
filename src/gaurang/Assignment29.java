/*Print the last non repeatative character using while loop.
String str = "technocredits";
output : s*/

package gaurang;

public class Assignment29 {

	void printLastChar(String input) {
		while(input.length()>0) {
			int initial = input.length();
			char ch = input.charAt(input.length()-1);
			input = input.replace(String.valueOf(ch),"");
			int last = input.length();
			if(initial-last==1) {
				System.out.println(ch);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment29 a = new Assignment29();
		a.printLastChar("technocredits");
	}
}
