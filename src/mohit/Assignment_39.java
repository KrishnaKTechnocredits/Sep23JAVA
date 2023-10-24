/*WAP to convert lowercase character to uppercase and uppercase character to lowercase, keeping the digit as is in the given string 
String str = "Yo7GEsH";
output : yO7geSh*/

package mohit;

public class Assignment_39 {

	void printString(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			output = output + ch;
		}
		System.out.println(output);

	}

	public static void main(String[] args) {
		Assignment_39 assignment_39 = new Assignment_39();
		assignment_39.printString("Yo7GEsH");
	}
}
