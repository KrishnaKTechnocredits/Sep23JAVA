/*
 * Assignment-57 : 13th Oct'2023
WAP to print consonants in the given String and count of vowels and consonants
String str = "technocredits";
output : 
Consonants in the given string are : tchncrdts
Count of vowels in given string is : 4
Count of consonants in given string is : 9
 */

package shamli.stringprograms;

public class Assignment57 {
	
	void processString(String input) {
		String consonantStr="";
		int vowelCount=0;
		int consonantCount=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				vowelCount++;
			}else {
				consonantStr=consonantStr+ch;
				consonantCount++;
			}
		}
		System.out.println("Input string is :"+input);
		System.out.println("Consonants in the given string are :"+consonantStr);
		System.out.println("Consonants Count in the given string is :"+consonantCount);
		System.out.println("Vowels Count in the given string is :"+vowelCount);
	}

	public static void main(String[] args) {
		Assignment57 assignment57=new Assignment57();
		assignment57.processString("technocredits");

	}

}
