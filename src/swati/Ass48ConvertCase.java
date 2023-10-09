////Assignment - 48 : 8th Oct'2023 Convert element case from given array, upper to 
////lower and lower to upper.
//String[]input=new String[4];input[0]="Rah2u4l";
////input[1] = "Tech3no3CRedits"; 
//output:["rAH2U4L","tECH3NO3crEDITS"]
package swati;

import java.util.Arrays;

public class Ass48ConvertCase {

	String convertcase(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				str += Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				str += Character.toUpperCase(ch);
			} else if (Character.isDigit(ch)) {
				str += ch;
			}
		}
		return str;
	}

	void printStringelement(String[] input) {
		String output[] = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			output[index] = convertcase(input[index]);
		}
		System.out.println(Arrays.toString(output));
	}

	public static void main(String[] args) {
		String[] str = { "Rah2u4l", "Tech3no3CRedits" };
		new Ass48ConvertCase().printStringelement(str);
	}
}
