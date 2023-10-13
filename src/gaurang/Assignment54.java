/*Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}*/

package gaurang;

public class Assignment54 {

	void printVowel(String input) {
		String output = "";
		while(input.length() != 0) {
			char ch = input.charAt(0);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				int initial = input.length();
				input = input.replace(String.valueOf(ch), "");
				int last = input.length();
				if(initial-last==1) {
					output += ch;
				}
			}
			input = input.replace(String.valueOf(ch), "");
		}
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Assignment54 a = new Assignment54();
		a.printVowel("aakaniksha eaep dube");
	}
}
