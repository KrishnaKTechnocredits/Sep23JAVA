/*Assignment-53 : 13th Oct'2023
Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu
 */

package jagrati;

public class Assignment53 {
	
	void uniqueVowels(String input) {
		String output ="";
		while(input.length() != 0){
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			if( ch == 'a' || ch == 'e' || ch == 'i'||ch== 'o' || ch=='u') {
				output = output +ch;
			}
		}
		System.out.println("unique vowels included in the string = " + output);	
	}
public static void main(String[] args) {
	Assignment53 assign = new Assignment53();
	assign.uniqueVowels("aakaniksha eaep dube");
}
}
