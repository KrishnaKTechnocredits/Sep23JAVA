/*Assignment-56 : 13th Oct'2023
WAP to print vowels of the string only if count of vowels is greater than 2.
Expected output:
         technocredits -> eoei
         aakanksha -> aaaa
	 yogesh -> vowels count is less than 2 in given string
	 shamli -> vowels count is less than 2 in given string*/

package jaykumar;

public class Assignment56 {
	
	void printVowels(String[] arr) {
		for(int index=0; index<arr.length; index++) {
			String output = getVowels(arr[index]);
			System.out.println(arr[index]+" -> "+output);
		}
	}
	
	String getVowels(String input) {
		int count = 0;
		String output = "";
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch=='a' || ch=='e' || ch=='i'  || ch=='o' || ch=='u') {
				count++;
				output += ch;
			}
		}
		if(count>2) {
			return output;
		}else {
			return "Vowels count is less than or equal to 2";
		}
	}

	public static void main(String[] args) {
		Assignment56 assignment56 = new Assignment56();
		String[] str = {"technocredits","aakanksha","yogesh","shamli"};
		assignment56.printVowels(str);
	}
}
