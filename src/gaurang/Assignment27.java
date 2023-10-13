/*Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2*/

package gaurang;

public class Assignment27 {

	void printFreq(String input) {
		while(input.length()>0) {
			int initial = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int last = input.length();
			if(initial-last>1) {
				System.out.println(ch+"--->"+(initial-last));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment27 a = new Assignment27();
		a.printFreq("abcdcededffff");
	}
}
