package shamli.array;

import java.util.Arrays;


public class Assignment48 {

	void processArray(String[] arr) {
		String[] outputarr = new String[arr.length];
		for(int index=0;index<arr.length;index++) {
			outputarr[index]=processString(arr[index]);
		}
		System.out.println("Output Array : "+Arrays.toString(outputarr));
	}
	
	String processString(String input) {
		String output="";
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(Character.isUpperCase(ch)) {
				ch=Character.toLowerCase(ch);
			}else if(Character.isLowerCase(ch)) {
				ch=Character.toUpperCase(ch);	
			}
			output=output+ch;
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment48 assignment48=new Assignment48();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		System.out.println("Input Array :"+Arrays.toString(input));
		assignment48.processArray(input);
	}
}
