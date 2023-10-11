/*Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtres*/

package shamli;

public class Assignment41 {
	
	void printStringFromFirstVowel(String input) {
		System.out.println("Input String is :"+input);
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				System.out.println("First vowel in the string is :"+ch);
				output=input.substring(index);
				break;
			}
		}
		System.out.println("Substring is :"+output);
	}

	public static void main(String[] args) {
		Assignment41 assignment41 =new Assignment41();
		assignment41.printStringFromFirstVowel("pqrabcgtyes");
	}
}
