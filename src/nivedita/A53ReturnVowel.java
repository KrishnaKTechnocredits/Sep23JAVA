/*Assignment-53 : 13th Oct'2023 Write a program to return unique vowels included in 
\the string, ensure sequence is maintained. String str = "aakaniksha eaep dube"; 
output : aieu 
String getVowels(String str){ 
String output = ""; while(str.length()!= 0){ } }*/

package nivedita;

public class A53ReturnVowel {

	void printUniqueVowel(String input) {
		String output = "";
		while (input.length() != 0) {
			char ch = input.charAt(0);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
			input = input.replace(String.valueOf(ch), "");
		}
		System.out.println("Unique vowels are -> "+output);
	}

	public static void main(String[] args) {
		new A53ReturnVowel().printUniqueVowel("aakaniksha eaep dube");
	}
}
