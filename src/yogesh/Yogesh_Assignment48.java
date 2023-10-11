//Assignment - 48 : 8th Oct'2023
//Convert element case from given array, upper to lower and lower to upper.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Tech3no3CRedits";
//	
//
//output : ["rAH2U4L", "tECH3NO3crEDITS"]	
package yogesh;

public class Yogesh_Assignment48 {

	String test(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				output = output + ch;
			}
			if (Character.isLowerCase(ch)) {
				char ch1 = Character.toUpperCase(ch);
				output = output + ch1;
			} else if (Character.isUpperCase(ch)) {
				char ch1 = Character.toLowerCase(ch);
				output = output + ch1;
			}
		}
		return output;
	}

	void convElement(String[] arr) {
		for (int index = 0; index < arr.length; index++) {
			String output = test(arr[index]);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3CRedits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		Yogesh_Assignment48 assignment48 = new Yogesh_Assignment48();
		assignment48.convElement(input);
	}

}
