/* Write a method which takes input and return all
 Uppercase from given input using ASCII. 
input : "TeCHNocreditS"; 
output : TCHNS */

package sayali;

public class Assignment31 {

	void printAllUpperCaseInput(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int temp = ch;
			if (temp >= 65 && temp <= 90) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		assignment31.printAllUpperCaseInput("TeCHNocreditS");
	}
}