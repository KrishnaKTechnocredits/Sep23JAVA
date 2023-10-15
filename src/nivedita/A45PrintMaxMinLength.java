/* Assignment 45
Print the name having maximum and minimum length from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits*/

package nivedita;

public class A45PrintMaxMinLength {
	
	void findString (String[] arr) {
		int maxLength = 0;
		String maxLengthName = "";
		int minLength = arr[0].length();
		String minLengthName = "";
		
		for (int index=0; index<arr.length; index++) {
			if (arr[index].length() > maxLength) {
				maxLength = arr[index].length();
				maxLengthName = arr[index];
			}
			if (arr[index].length() < minLength) {
				minLength = arr[index].length();
				minLengthName = arr[index];
			}
		}
		System.out.println("Min length name is : "+minLengthName);
		System.out.println("Max length name is : "+maxLengthName);
	}
		
	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		new A45PrintMaxMinLength().findString(input);
	}
}
