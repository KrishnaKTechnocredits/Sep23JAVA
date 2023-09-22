/*Print the freq of first repeatative character using while loop.
String str = "abcdcededffff";
output : c -> 2 */
 package shrutika;

public class FirstRepeatativeChar {
	
	void repeatativeChar(String input) {
		while(input.length()>0) {
			int orgLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int newLength = input.length();
			if(orgLength- newLength >1) {
				System.out.println(ch +" -<" +(orgLength- newLength));
				break;
			}
		}
	}

	public static void main(String[] args) {
		FirstRepeatativeChar frirstRepeatativeChar = new FirstRepeatativeChar();
		frirstRepeatativeChar.repeatativeChar("abcdcededffff");
	}
}
