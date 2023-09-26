/*Assignment-31 : 23nd Sep'2023 
Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS
*/

package deepak;

public class Assignment31_UpperCaseStringASCII {

	void getAsciiFromChar(char ch) { // Method to get ASCII using Character
		int ascii = ch;
		if (ch >= 65 && ch < 91) {
			System.out.println(ascii);
		}
	}

	void getCharFromAscii(int ascii) { // Method to get Character using ASCII
		char ch = (char) ascii;
		if (ch >= 65 && ch < 91) {
			System.out.println(ch);
		}
	}

	void getUpperCase(String input) {
		System.out.println("Input String: " + input);
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90) {
				output = output + ch;
			}
		}
		System.out.print("Output String: ");
		System.out.println(output);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment31_UpperCaseStringASCII getOutput = new Assignment31_UpperCaseStringASCII();
		// getOutput.getAsciiFromChar('A');
		// getOutput.getCharFromAscii(66);
		getOutput.getUpperCase("TeCHNocreditS");
	}

}
