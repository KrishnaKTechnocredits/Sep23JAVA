//WAP to remove digit from given string and print
//Input : { "Rah2u4l", "Technocredits", "J6a6y", "cred5it2s" }
//output: ["Rahul" , "Technocredit", "Jay" , "credits"]

package akshita.array;

import java.util.Arrays;

public class Assignment47 {
	String removeDigit(String str) {
		String output ="";
		for(int index=0;index<str.length();index++) {
			char ch = str.charAt(index);
			if(!Character.isDigit(ch)) {
				output= output + ch;
			}
		}
		return output;
	}
	void getArray(String[] input) {
		    String[] output = new String[input.length];
		for(int index=0;index<input.length;index++) 
			output[index] = removeDigit(input[index]);
			System.out.println(Arrays.toString(output));
		}
	
	public static void main(String[] args) {
		Assignment47 ass47 = new Assignment47();
		String[] arr = { "Rah2u4l", "Technocredits", "J6a6y", "cred5it2s" };
		ass47.getArray(arr);
	}
}
