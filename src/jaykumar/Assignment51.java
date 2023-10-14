/*Assignment-51 : 13th Oct'2023
WAP to print vowels in the given String
String str = "technocredits";
output : eoei*/

package jaykumar;

public class Assignment51 {
	
	void processString(String input) {
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch== 'u') {
				output += ch;
			}
		}
		System.out.println("Given string is: "+input);
		System.out.println("Vowels in given string are: "+output);
	}

	public static void main(String[] args) {
		Assignment51 assignment51 = new Assignment51();
		assignment51.processString("technocredits");
	}
}
