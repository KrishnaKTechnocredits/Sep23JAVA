/*Assignment-22 : 13th Sep'2023
Write a program to print non repetitive character from given String.
input : technocredits
output : hnordis*/

package jaykumar;

public class Assignment22 {
	
	void uniqueChar(String input) {
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.uniqueChar("technocredits");
	}
}
