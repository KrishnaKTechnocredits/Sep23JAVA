/*Assignment-55 : 13th Oct'2023

WAP to print vowels of each string from the given String array.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai
*/

package roshani;

public class Ass55VowelsOfEachString {
	void printVowels(String[] arr) {
		for(int index=0; index<arr.length; index++) {
			String output = getVowels(arr[index]);
			System.out.println(arr[index]+" -> "+output);
		}
	}

	String getVowels(String input) {
		String output ="";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u') {
				output += ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Ass55VowelsOfEachString assignment55 = new Ass55VowelsOfEachString();
		String[] str = {"technocredits","aakanksha","yogesh","shamli"};
		assignment55.printVowels(str);
	}
}
