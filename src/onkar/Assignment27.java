/*Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2*/

package onkar;

public class Assignment27 {
	
	void findFirstRepeatChar(String input){
		while(input.length()>0) {
			int startLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int endLength = input.length();
			if (startLength-endLength>1) {
				System.out.println(ch+"-->"+(startLength-endLength));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment27 assignment27 = new Assignment27();
		assignment27.findFirstRepeatChar("abcdcededffff");
	}
}
