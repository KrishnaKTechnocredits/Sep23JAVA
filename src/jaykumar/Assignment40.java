/*Assignment 40: 01-Oct-23
WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr
*/
package jaykumar;

public class Assignment40 {
	char ch;
	
	void subString(String input) {
		System.out.println("input: "+input);
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch1 = input.charAt(index);
			if(ch1=='a'||ch1=='e'||ch1=='i'||ch1=='o'||ch1=='u'){
				if(input.indexOf(ch1)!=input.lastIndexOf(ch1)) {
					ch = ch1;
					break;
					}
			}
		}
		System.out.println("First repeating vowel in given string is: "+ ch);
		int i = input.indexOf(ch);
		int j = input.lastIndexOf(ch);
		output = input.substring(i,j);
		System.out.println("Output: "+output);
	}
	
	public static void main(String[] args) {
		Assignment40 assignment40 = new Assignment40();
		assignment40.subString("technocredits");
	}
}