//Assignment 40: 01-Oct-23
//WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
//Input: technocredits
//Output: echnocr

package yogesh;

public class Yogesh_Assignment40 {

	void repeatingVowel(String input) {
		int firstindex = input.indexOf('e');
		int lastindex = input.lastIndexOf('e');
		String output = input.substring(firstindex, lastindex);
		System.out.println("Output: " + output);
	}

	public static void main(String[] args) {
		Yogesh_Assignment40 assignment40 = new Yogesh_Assignment40();
		assignment40.repeatingVowel("technocredits");
	}
}
