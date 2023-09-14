/*Write a program to print non repeatative character from given String.
input : technocredits
output : hnordis
*/
package sakshi;

public class Assignment22 {
	
	void getRepeatChar(String inputName) {
		for(int index=0; index<inputName.length(); index++) {
			char ch = inputName.charAt(index);
			if(inputName.indexOf(ch)==inputName.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment22 assignment22 = new Assignment22();
		assignment22.getRepeatChar("technocredits");
	}
}
