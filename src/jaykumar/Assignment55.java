/*Assignment-55 : 13th Oct'2023
WAP to print vowels of each string from the given String array.
String[] str = {"technocredits","aakanksha","yogesh","shamli"};
output : technocredits -> eoei
         aakanksha -> aaaa
		 yogesh -> oe
		 shamli -> ai*/

package jaykumar;

public class Assignment55 {
	
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
		Assignment55 Assignment55 = new Assignment55();
		String[] str = {"technocredits","aakanksha","yogesh","shamli"};
		Assignment55.printVowels(str);
	}
}
