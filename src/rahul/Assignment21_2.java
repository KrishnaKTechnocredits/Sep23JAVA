/*Assignment-22 : 13th Sep'2023
Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis*/

package rahul;

public class Assignment21_2 {

	void uniqueCharacter(String input) {
		for (int index = 0; index < input.length(); index++) {
			if (input.indexOf(input.charAt(index)) == input.lastIndexOf(input.charAt(index))) {
				System.out.println(input.charAt(index));
			}
		}
	}

	public static void main(String[] args) {
		Assignment21_2 assignment21_2 = new Assignment21_2();
		assignment21_2.uniqueCharacter("technocredits");
	}
}
