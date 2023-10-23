/*Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : iu

String getVowels(String str){
	String output = "";
	while(str.length() != 0){
		
	}	
}
*/

package mohit;

public class Assignment_54 {
	String str = "aakaniksha eaep dube";

	void uniqueVowels() {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int count = getCountOfrepeatitiveVowels(ch);

				if (count == 1) {
					output = output + ch;
				}
			}
		}
		System.out.println("The unique vowels in the string is " + output);
	}

	int getCountOfrepeatitiveVowels(char ch) {
		int count = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch1 = str.charAt(index);
			if (ch == ch1) {
				count++;
			}

		}
		return count;
	}

	public static void main(String[] args) {
		new Assignment_54().uniqueVowels();

	}
}
