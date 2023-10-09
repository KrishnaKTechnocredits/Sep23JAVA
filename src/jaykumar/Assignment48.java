/*Assignment - 48 : 8th Oct'2023
Convert element case from given array, upper to lower and lower to upper.
String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
output : ["rAH2U4L", "tECH3NO3crEDITS"]	*/

package jaykumar;

import java.util.Arrays;

public class Assignment48 {

	void processArray(String[] arr) {
		for(int i=0; i<arr.length; i++) {
			String output = "";
			for(int j=0; j<arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if(Character.isLowerCase(ch)) {
					ch = Character.toUpperCase(ch);
					output += ch;
				}else if(Character.isUpperCase(ch)) {
					ch = Character.toLowerCase(ch);
					output += ch;
				}else {
					output += ch;
				}
			}
			arr[i] = output;
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		Assignment48 assignment48 = new Assignment48();
		String[] input = new String[2];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		assignment48.processArray(input);
	}
}
