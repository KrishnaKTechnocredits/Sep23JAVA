/*Print vowels of the string only if count of vowels is greater than 2.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 	 yogesh -> vowels count is less than 2 in given string
	 	 shamli -> vowels count is less than 2 in given string*/

package denish;
import java.util.*;
public class Assignment56 {
	
	String getVowels(String str) {
		String output = "";
		int count = countVowels(str);
		if(count>2) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
					output = output + ch;
				}
			}
			return output;
		}
		else {
			return "vowels count is less than 2 in given string";
		}
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
	
	void printVowels (String[] arr) {
		for (int index=0; index<arr.length; index++) {
			String vowels = getVowels(arr[index]);
			System.out.println(arr[index]+" -> "+vowels);
		}
	}
	
	

	public static void main(String[] args) {
		String[] str = { "technocredits", "aakanksha", "yogesh", "shamli" };
		Assignment56 ass = new Assignment56();
		ass.printVowels(str);
	}
}
