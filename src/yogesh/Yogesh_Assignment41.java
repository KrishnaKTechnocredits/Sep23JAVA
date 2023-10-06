//
//Assignment 41: 01-Oct-23
//WAP to print a string from 1st vowel
//Input: pqrabcgtyes
//Output: abcgtres
package yogesh;

public class Yogesh_Assignment41 {
	void printv(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int firstindex = input.indexOf(ch);
				output = input.substring(firstindex);
				break;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		Yogesh_Assignment41 assignment41 = new Yogesh_Assignment41();
		assignment41.printv("pqrabcgtyes");
	}
}