//*WAP to print vowels of the string only if count of vowels is greater than 2.
//*Expected output:
        //* technocredits -> eoei
       //*  aakanksha -> aaaa
	//* yogesh -> vowels count is less than 2 in given string
	//* shamli -> vowels count is less than 2 in given string

package hetal;

public class Assignment56 {
	
	void printVowels(String[] input) {
		for(int index=0;index<input.length;index++) {
			String str =input[index];
			String output=getVowels(str);
			System.out.println(str + "-->" + output);
		}
	}
	
	
	String getVowels(String input) {
		int count = 0;
		String output ="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
				output = output+ch;
			}
		}
		if(count>2) {
			return output;
		}
		else {
			 return "vowels count is 2 or less then 2";
		}
	}

	public static void main(String[] args) {
		Assignment56 a = new Assignment56();
		String[] input = {"technocredits","aakanksha","yogesh","shamli"};
		a.printVowels(input);
	}
}
