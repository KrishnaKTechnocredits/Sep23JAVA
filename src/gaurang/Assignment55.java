

package gaurang;

import java.util.Arrays;

public class Assignment55 {

	String getVowels(String input) {
		String output = "";
		for(int index =0 ; index<input.length(); index++) {
			char ch = input.charAt(index);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				output = output + ch;
			}
		}
		return output;
	}
	
	void printVowels(String[] input) {
		String[] output = new String[input.length];
		for(int index=0 ; index<input.length ; index++) {
			String x = input[index];
			output[index] = getVowels(x);
			System.out.println(x+"-->"+output[index]);
		}
		System.out.println(Arrays.toString(output));
	}
	
	public static void main(String[] args) {
		Assignment55 a = new Assignment55();
		String[] input = new String[4];
		input[0] = "technocredits";
		input[1] = "aakanksha";
		input[2] = "yogesh";
		input[3] = "shamli";
		a.printVowels(input);
	}
}
