/*print the name having maximum and minimum length from given array*/

package hetal;

public class Assignment45 {
	
	void printLength(String[] arr) {
		int maxLength = arr[0].length();
		int minLength = arr[0].length();
		String minLengthName = "";
		String maxLengthName = "";
		for(int index=0;index<arr.length;index++) {
			int length = getLengthOfString(arr[index]);
			if(length > maxLength) {
				maxLength = length;
				maxLengthName = arr[index];	
			}
			if (minLength>length) {
				minLength = length;
				minLengthName = arr[index];
			}
		}
		System.out.println("maxLength string is " +maxLengthName );
		System.out.println("minLength string is " +minLengthName);
	}
	
	int getLengthOfString(String str) {
		return str.length();	
	}
	
	public static void main(String[] args) {
		String[]input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "j6a6y";
		input[3] = "cred5it2s";
		new Assignment45().printLength(input);
	}
}
