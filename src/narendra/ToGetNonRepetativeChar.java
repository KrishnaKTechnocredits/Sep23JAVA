/*
Assignment-22 : 13th Sep'2023
Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis
*/

package narendra;

public class ToGetNonRepetativeChar {

	void toPrintNonRepetativeChar(String input) {
//		System.out.print(input.indexOf('e'));
		System.out.print("output is: ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		ToGetNonRepetativeChar getnonrepetativechar = new ToGetNonRepetativeChar();
		getnonrepetativechar.toPrintNonRepetativeChar("technocredits");

	}

}
