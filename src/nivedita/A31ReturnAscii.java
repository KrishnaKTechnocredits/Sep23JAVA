/*Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS*/

package nivedita;

public class A31ReturnAscii {

	String getUpperCase(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 65 && ch <= 90) {

				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		A31ReturnAscii returnAscii = new A31ReturnAscii();
		String input = "TeCHNocreditS";
		String output = returnAscii.getUpperCase(input);
		System.out.println("Output is-> " + output);
	}
}