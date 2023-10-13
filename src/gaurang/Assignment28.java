/*Print the first non repeatative character using while loop.
String str = "technocredits";
output : h*/

package gaurang;

public class Assignment28 {

	void printChar(String input) {
		while(input.length()>0) {
			int initial = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int last = input.length();
			if(initial-last ==1) {
				System.out.println(ch);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment28 a = new Assignment28();
		a.printChar("technocredits");
	}
}
