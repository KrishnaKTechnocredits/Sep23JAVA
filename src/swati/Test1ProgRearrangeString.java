/*Programming Test - 1 : 24th Sep'2023 Program 1 : Write a program to rearrange string as
 per below example.
 String input = "TeCHNoc33r44editS"; 
 output : 3344eocreditTCHNS*/

package swati;

class Test1ProgRearrangeString {

	void rearrangeString(String input) {
		String digit = "";
		String uppercase = "";
		String lowercase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digit = digit + ch;
			} else if (Character.isUpperCase(ch)) {
				uppercase = uppercase + ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase = lowercase + ch;
			}
		}
		System.out.println(digit + uppercase + lowercase);
	}

	public static void main(String[] args) {
		Test1ProgRearrangeString progtest1rearrangestringne = new Test1ProgRearrangeString();
		progtest1rearrangestringne.rearrangeString("TeCHNoc33r44editS");
	}

}