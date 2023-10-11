//WAP to convert element case from given array, Upper to Lower and Lower to upper
//Input : input[0]="Rah2u4l"; input[1]="Tech3no3CRedits"
//Output : Output = ["rAH2U4L" , "tECH3NO3crEDITS"]

package array;

import java.util.Arrays;

public class Assignment48 {

	String caseConvertor(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				ch = Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				ch = Character.toUpperCase(ch);
			}
			output = output + ch;
		}
		return output;
	}
	void arrayToString(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = caseConvertor(input[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		Assignment48 ass48 = new Assignment48();
		String[] arr = new String[2];
		arr[0] = "Rah2u4l";
		arr[1] = "Tech3no3CRedits";
		System.out.println(Arrays.toString(arr));
		ass48.arrayToString(arr);
	}
}
