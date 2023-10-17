/*Assignment 40: 01-Oct-23
WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr
*/
package roshani;

public class Ass40PrintString{
	
	void stringWithVowels(String input,char ch){
		int first = input.indexOf(ch);
		int last = input.lastIndexOf(ch);
		String output = input.substring(first, last);
		System.out.println("Output is: "+ output);
	}

	public static void main(String[] args){
		Ass40PrintString assignment40 = new Ass40PrintString();
		assignment40.stringWithVowels("technocredits",'e');
	}
}
