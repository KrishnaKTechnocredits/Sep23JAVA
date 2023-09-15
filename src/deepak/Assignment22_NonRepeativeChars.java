/*Assignment-22 : 13th Sep'2023
Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis
*/
package deepak;

class Assignment22_NonRepeativeChars {
	void getNoRepeatChars(String input) {
		System.out.println("Input : "+input);
		System.out.print("Output : ");
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch))
				System.out.print(ch);
		}
	}

	public static void main(String[] args) {
		Assignment22_NonRepeativeChars nonRepeatChar = new Assignment22_NonRepeativeChars();
		nonRepeatChar.getNoRepeatChars("technocredits");
	}
}