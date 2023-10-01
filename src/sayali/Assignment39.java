/* WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh */

package sayali;

public class Assignment39 {

	void strUpperToLower(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				char c = Character.toLowerCase(ch);
				str = str + c;
			} else if (Character.isLowerCase(ch)) {
				char d = Character.toUpperCase(ch);
				str = str + d;
			} else {
				str = str + ch;
			}
		}
		System.out.println("Given string after converting lowercase to uppercase and vice versa: " + str);
	}

	public static void main(String[] args) {
		Assignment39 s = new Assignment39();
		s.strUpperToLower("Yo7GEsH");
	}
}