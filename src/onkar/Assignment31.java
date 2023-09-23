/*Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS*/

package onkar;

public class Assignment31 {
	
	void findUppercaseChar (String input) {
		String output = "";
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch>=65 && ch<=90) {
				output = output + ch;
			}
		}
		System.out.println("Capital characters from String "+input+" are "+output);
	}
	
	public static void main(String[] args) {
		Assignment31 assignment31 = new Assignment31();
		assignment31.findUppercaseChar("TeCHNocreditS");
	}
}

