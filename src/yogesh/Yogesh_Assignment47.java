//Assignment - 47 : 8th Oct'2023
//Print after removing  digit  from given array.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Tech3no3credits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//
//output : ["Rahul", "Technocredits", "Jay", "credits"]	 
package yogesh;

public class Yogesh_Assignment47 {
	String getOutput(String str) {
		String output = "";

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (!Character.isDigit(ch)) {
				output = output + ch;
			}
		}
		return output;
	}

	void maxDigit(String[] input) {
		System.out.println("After Conversion:--");
		for (int index = 0; index < input.length; index++) {
			String output = getOutput(input[index]);
			System.out.println(output);
		}
	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		Yogesh_Assignment47 assignment47 = new Yogesh_Assignment47();
		assignment47.maxDigit(input);
	}
}
