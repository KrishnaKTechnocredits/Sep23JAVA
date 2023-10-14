/*Print vowels of the string only if count of vowels is greater than 2.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 	 yogesh -> vowels count is less than 2 in given string
	 	 shamli -> vowels count is less than 2 in given string*/

package onkar;

public class Assignment56 {
	
	void printVowels (String[] arr) {
		for (int index=0; index<arr.length; index++) {
			String vowels = getVowels(arr[index]);
			System.out.println(arr[index]+" -> "+vowels);
		}
	}

	String getVowels (String input) {
		String output = "";
		int count = countVowels(input);
		if (count > 2) {
			for (int index=0; index<input.length(); index++) {
				char ch = input.charAt(index);
				if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
					output += ch;
				}
			}
			return output;
		}else
			return "vowels count is less than 2 in given string";
	}
	
	int countVowels (String input) {
		int count = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		String[] input = {"technocredits","aakanksha","yogesh","shamli"};
		new Assignment56().printVowels(input);
	}	
}
