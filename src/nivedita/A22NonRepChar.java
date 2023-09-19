/*Assignment-22 : 13th Sep'2023
Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis*/


package nivedita;

public class A22NonRepChar {
	
	
	int checkChar(String input) {
		
		for(int index =0; index < input.length(); index ++) {
			char ch  = input.charAt(index);
			if (input.indexOf(ch)== input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
		return 0;

	}
	
	public static void main(String[] args) {
		A22NonRepChar nonRepChar = new A22NonRepChar();
		nonRepChar.checkChar("technocredits");
	}
}
