/*Assignment-30 : 22nd Sep'2023 Write a method which takes input and return all 
Uppercase from given input. 
input : "TeCHNocreditS"; output : TCHNS 
Hint : we can add characters in string like below. 
String output = ""; 
output = output + str.charAt(index);*/

package swati;

public class Ass30ReturnAllUpperCaseChar {

	void returnUpperCaseCharUsingForLoop(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + input.charAt(index);
			}
		}
		System.out.println("Output Using for loop --> " + output);
	}

	void returnUpperCaseCharUsingWhileLoop(String input) {
		String output = "";
		int index = 0;
		while (index < input.length()) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + input.charAt(index);
			}
			index++;
		}
		System.out.println("Output Using While Loop --> " + output);
	}

	public static void main(String[] args) {
		Ass30ReturnAllUpperCaseChar ass30ReturnAllUpperCaseChar = new Ass30ReturnAllUpperCaseChar();
		ass30ReturnAllUpperCaseChar.returnUpperCaseCharUsingForLoop("TeCHNocreditS");
		ass30ReturnAllUpperCaseChar.returnUpperCaseCharUsingWhileLoop("TeCHNocreditS");
	}
}
