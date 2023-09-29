/*Assignment-31 : 23nd Sep'2023 
Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS*/

package rahul;

public class Assignment31_1 {

	String getUppercaseUsingASCII(String input) {
		String uppercase = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 65 && ch <= 90) {
				uppercase = uppercase + ch;
			}
		}
		return uppercase;
	}

	public static void main(String[] args) {
		Assignment31_1 assignment31_1 = new Assignment31_1();
		String output = assignment31_1.getUppercaseUsingASCII("TeCHNocreditS");
		System.out.println("Uppercase chars: " + output);
	}
}
