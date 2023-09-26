/*
 * Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis
 */

package shamli;

public class Assignment22 {

	void findNonRepetiveChar(String input) {
		System.out.println("non repetive characters from string '"+input+ "' are-->");
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.println(ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.findNonRepetiveChar("technocredits");		
	}
}
