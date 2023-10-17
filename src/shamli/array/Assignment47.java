/*
 * Assignment - 47 : 8th Oct'2023
Print the array of string without digits in names.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : ["Rahul", "Technocredits", "Jay", "credits"]
 */

package shamli.array;
import java.util.Arrays;

public class Assignment47 {
	
	void processArray(String[] arr) {
		for(int index=0;index<arr.length;index++) {
			String outputStr=processString(arr[index]);
			arr[index]=outputStr;
		}
		System.out.println("Array after removing digits from string :"+Arrays.toString(arr));
	}
	
	String processString(String input) {
		String output="";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(!Character.isDigit(ch)) {
				output=output+ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment47 assignment47=new Assignment47();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		System.out.println("Before :"+Arrays.toString(input));
		assignment47.processArray(input);
	}
}
