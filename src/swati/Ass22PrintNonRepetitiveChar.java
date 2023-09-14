/*Assignment-22 : 13th Sep'2023 Write a program to print non repetitive character from given String. 
input : technocredits output : hnordis*/

package swati;

public class Ass22PrintNonRepetitiveChar {

	void printNonRepetitiveChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(" "+ch);
			}
		}
	}

	public static void main(String[] args) {
		Ass22PrintNonRepetitiveChar ass22PrintNonRepetitiveChar = new Ass22PrintNonRepetitiveChar();
		ass22PrintNonRepetitiveChar.printNonRepetitiveChar("technocredits");
	}
}
