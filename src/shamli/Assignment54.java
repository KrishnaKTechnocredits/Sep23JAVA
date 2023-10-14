/*
 * Assignment-54 : 13th Oct'2023
Write a program to return unique (non-repeated) vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu
 */

package shamli;

public class Assignment54 {
	
	void getUniqueNonRepetedVowel(String input) {
		System.out.println("Input :"+input);
		String output="";
		int orgLength=0;
		int newLength=0;
		int count=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
					output=output+ch;
				}
			}	
		}
		System.out.println("Output :"+output);
	}

	public static void main(String[] args) {
		Assignment54 assignment54=new Assignment54();
		assignment54.getUniqueNonRepetedVowel("aakaniksha eaep dube");
	}

}
