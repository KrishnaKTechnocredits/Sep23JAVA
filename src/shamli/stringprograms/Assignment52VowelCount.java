/*
 * Assignment-52 : 13th Oct'2023

WAP to print the count of vowels in the given string
String str = "technocredits";
output : 4
 */

package shamli.stringprograms;

public class Assignment52VowelCount {
	
	int getVowelCount(String input) {
		System.out.println("Input string is :"+input);
		int count=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment52VowelCount assignment52=new Assignment52VowelCount();
		int vowelcount=assignment52.getVowelCount("technocredits");
		System.out.println("Vowel count is :"+vowelcount);
	}
}
