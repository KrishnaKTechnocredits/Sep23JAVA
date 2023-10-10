/*Assignment - 47 : 8th Oct'2023
Print the array of string without digits in names.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : ["Rahul", "Technocredits", "Jay", "credits"]*/	 

package jaykumar;

import java.util.Arrays;

public class Assignment47 {
	
	void processArray(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			String output = "";
			for(int j=0; j<arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if(!Character.isDigit(ch)) {
					output += ch;
				}
			}
			arr[i] = output;
		}
		System.out.println("Array after removing digits: "+Arrays.toString(arr));
	}

	public static void main(String[] args) {
		Assignment47 assignment47 = new Assignment47();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment47.processArray(input);
	}
}
