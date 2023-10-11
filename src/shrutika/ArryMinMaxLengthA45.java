/*
Assignment - 45 : 8th Oct'2023

Print the name having maximum and minimum length from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits */
package shrutika;

public class ArryMinMaxLengthA45 {

	int lengthOfString(String input) {
	//	System.out.println(input.length());
		return input.length();
	}

	void maxLengthName(String[] arry) {
		int maxLength = 0;
		int minLength=0;
		String maxLengthName = "";
		String minLengthName = "";
		for (int index = 0; index < arry.length; index++) {
			int length = lengthOfString(arry[index]);
			if(index==0){
			maxLength =length;
			minLength=length;
			}else if (length > maxLength) {
				maxLength = length;
				maxLengthName = arry[index];
			} else if (length < minLength) {
				minLength=length;
				minLengthName = arry[index];
			}
		}
		System.out.println("MaxLength name ->" + maxLengthName);
		System.out.println("MinLength name ->" + minLengthName);
	}

	public static void main(String[] args) {
		ArryMinMaxLengthA45 arryMinMaxLengthA45 = new ArryMinMaxLengthA45();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		arryMinMaxLengthA45.maxLengthName(input);
	}
}
