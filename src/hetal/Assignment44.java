/*convert the input element in to uppercase if it contains digit*/

package hetal;

import java.util.Arrays;

public class Assignment44 {
	
	void printUpperCase(String[] arr) {
		String[] output = new String[arr.length];
		for(int index=0;index<arr.length;index++){
			String str = arr[index];
			output[index] = getUpperCase(str);
		}
		System.out.println(Arrays.toString(output));	
	}
	
	String getUpperCase(String input) {	
		String output ="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)) {
				for(int innerIndex=0;innerIndex<input.length();innerIndex++) {
					char sh = input.charAt(innerIndex);
					output = output + Character.toUpperCase(sh);
				}
				break;
			}		
		}
		return output;
	}
	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u41";
		input[1] = "J6a6y";
		input[2] = "techn1ocr3edits";
		input[3] = "cred5it2s";
		new Assignment44().printUpperCase(input);
		
		
	}
		
	

}
