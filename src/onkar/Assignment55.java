/*print vowels for each element available in the given string array

String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai*/


package onkar;

public class Assignment55 {
	
	void printVowels (String[] arr) {
		for (int index=0; index<arr.length; index++) {
			String vowels = getVowels(arr[index]);
			System.out.println(arr[index]+" -> "+vowels);
		}
	}
	
	String getVowels (String input) {
		String output = "";
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				output += ch;
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		String[] input = {"technocredits","aakanksha","yogesh","shamli"};
		new Assignment55().printVowels(input);
	}
}
