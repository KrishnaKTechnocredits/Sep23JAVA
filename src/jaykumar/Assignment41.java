/*Assignment 41: 01-Oct-23
WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtres*/

package jaykumar;

public class Assignment41 {

	void subString(String input) {
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
				System.out.println("First vowel in given string is: "+ch);
				output = input.substring(index);
				break;
			}
		}
		System.out.println("String from first vowel is: "+output);
	}
	
	public static void main(String[] args) {
		Assignment41 assignment41 = new Assignment41();
		String str = "pqrabcgtyes";
		System.out.println("Input: "+str);
		assignment41.subString(str);
	}
}
