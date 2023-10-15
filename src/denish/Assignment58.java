/*WAP to print only special characters from the given string.
String str = "Te_23!cHNo#3cR3 2ed*&i2t%1S$";
output : "_!# *&%$" 
Note: including space in between*/
package denish;

public class Assignment58 {

	void processData(String input) {
		input = input.toLowerCase();
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch) || Character.isLetter(ch)) {
				input = input.replace(ch, '?');
			}
		}
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch != '?')
				output = output + ch;
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Assignment58 ass = new Assignment58();
		ass.processData("Te_23!cHNo#3cR3 2ed*&i2t%1S$");
	}
}
