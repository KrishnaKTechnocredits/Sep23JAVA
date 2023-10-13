/*Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}*/

package gaurang;

public class Assignment53 {

	void getVowels(String input) {
		String output = "";
		while(input.length()!=0) {
			char ch = input.charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output += ch;
			}
			input = input.replace(String.valueOf(ch), "");
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Assignment53 a = new Assignment53();
		a.getVowels("aakaniksha eaep dube");
	}
}
