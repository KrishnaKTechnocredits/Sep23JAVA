/*
 * Assignment-53 : 13th Oct'2023
Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu
 */

package shamli;

public class Assignment53 {
	
	void printUniqueVowels(String input) {
		System.out.println("Input :"+input);
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				output=output+ch;
				input=input.replace(input.valueOf(ch), "");
			}
		}	
	System.out.println("Output :"+output);	
	}
	 

	public static void main(String[] args) {
		Assignment53 assignment53= new Assignment53();
		assignment53.printUniqueVowels("aakaniksha eaep dube");

	}

}
