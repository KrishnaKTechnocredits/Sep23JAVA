/*Assignment-54 : 13th Oct'2023
Write a program to return unique (non-repeated) vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu*/

package jaykumar;

public class Assignment54 {

	String getuniqueVowel(String input) {
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u') {
				if(input.indexOf(ch)==input.lastIndexOf(ch)) {
				output += ch;
				}
			}
		}
		System.out.println("Given string is: "+input);
		return output;
	}
	
	public static void main(String[] args) {
		Assignment54 assignment54 = new Assignment54();
		String output = assignment54.getuniqueVowel("aakaniksha eaep dube");
		System.out.print("Unique vowels in string are: "+output);

	}
}
