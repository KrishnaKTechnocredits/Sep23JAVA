/*Assignment - 45 : 8th Oct'2023

Print the name having maximum and minimum length from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
 */


package jagrati;

public class Assignment45 {

	int getLength(String str) {
		return str.length();
	}

	void stringLenth(String[] input) {
		int maxLength = input[0].length();
		String maxLName = "";
		int minLength = input[0].length();
		String minLname = "";
		for (int index = 0; index < input.length; index++) {
			int length = getLength(input[index]);
			System.out.println("Given index characters length " + input[index] + "---" + length);
			if (length > maxLength) {
				maxLength = length;
				maxLName = input[index];
			}else if (minLength> length){
				minLength =length;
				minLname = input[index];
			}
		}System.out.println("-------------------Max and Min length----------------------");
		System.out.println("Maximum length of given staring array is = " + maxLName + "----" + maxLength);
		System.out.println("Maximum length of given staring array is = " +minLname +"----"+minLength);
	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		Assignment45 assign = new Assignment45();
		assign.stringLenth(input);
	}
}
