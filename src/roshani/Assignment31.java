/*Assignment-31 : 23nd Sep'2023 
Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS
*/

package roshani;

public class Assignment31 {
	void returnAllUppercase(String input) {
		System.out.print("\nUppercase letters from string '" +input+ "' are: ");
		for(int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			if(ch >=65 && ch <= 90){
				System.out.print(ch);
			}
		}
	}
	
	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		assignment31.returnAllUppercase("TeCHNocreditS");
	}
}
