/*Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS*/
package yogesh;

public class Yogesh_Assignment31 {

	String getUpperCase(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 65 && ch <= 90) {
				
				output = output + ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Yogesh_Assignment31 assignment31 = new Yogesh_Assignment31();
		String input = "TeCHNocreditS";
		String output = assignment31.getUpperCase(input);
		System.out.println("Output is-> "+output);
	}
}