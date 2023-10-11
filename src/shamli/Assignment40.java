/*
 * WAP to print a string from 1st repeating vowel 'e' to last same repeating vowel 'e'.
Input: technocredits
Output: echnocr
 */
package shamli;

public class Assignment40 {

	char ch;
	
	void printSubstringFromRepetingVowel(String input) {
		System.out.println("Input string is :"+input);
		String output="";
		for(int index=0; index<input.length();index++) {
			char ch1=input.charAt(index);
			if(ch1=='a'||ch1=='A'||ch1=='e'||ch1=='E'||ch1=='i'||ch1=='I'||ch1=='o'||ch1=='O'||ch1=='u'||ch1=='U') {
				if(input.indexOf(ch1)!=input.lastIndexOf(ch1)) {
					ch = ch1;
					break;
					}
				}
			}
		
		System.out.println("First Repeting vowel in the given string is "+ch);
		int i=input.indexOf(ch);
		int j=input.lastIndexOf(ch);
		output=input.substring(i, j);
		System.out.println("Output string is :"+output);
	}
	public static void main(String[] args) {
		Assignment40 assignment40=new Assignment40();
		assignment40.printSubstringFromRepetingVowel("technocredits");
	}
}
