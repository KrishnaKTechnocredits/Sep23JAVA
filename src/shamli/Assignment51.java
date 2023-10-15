/*
 * Assignment-51 : 13th Oct'2023
WAP to print vowels in the given String
String str = "technocredits";
output : eoei
 */

package shamli;

public class Assignment51 {
	
	String getVowelsFromString(String input) {
		System.out.println("Input string is: "+input);
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				output+=ch;
			}
		}
		
		return output;
	}

	public static void main(String[] args) {
		Assignment51 assignment51=new Assignment51();
		String output=assignment51.getVowelsFromString("technocredits");
		System.out.println("Input string is: "+output);
	}

}
