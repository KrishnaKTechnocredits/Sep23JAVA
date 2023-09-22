//Write a program to print non repeatative character from given String.
//technocredits
//hnordis
package harshada;

public class NonRepeatation {
	
	void printNonRepChar(String input) {
		for(int index=0; index<input.length(); index++) {
			char ch=input.charAt(index);
			if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		NonRepeatation nonRepeatation=new NonRepeatation();
		nonRepeatation.printNonRepChar("technocredits");
	}
}
