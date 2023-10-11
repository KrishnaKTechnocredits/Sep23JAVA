//Assignment - 45 : 8th Oct'2023
//
//Print the name having maximum and minimum length from given array.
//
//String[] input = new String[4];
//		input[0] = "Rah2u4l";
//		input[1] = "Technocredits";
//		input[2] = "J6a6y";
//		input[3] = "cred5it2s";
//
//output : Min length name is : J6a6y
//         Max length name is : Technocredits
package yogesh;

public class Yogesh_Assignment45 {

	void length(String[] input) {
		String max = input[0];
		String min = input[0];

		for (int index = 0; index < input.length; index++) {

			if (input[index].length() < min.length()) {
				min = input[index];
			}
			if (input[index].length() > max.length()) {
				max = input[index];
			}

		}
		System.out.println("Minimum length name is:--" + min);
		System.out.println("Maximum length name is:--" + max);

	}

	public static void main(String[] args) {
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

		Yogesh_Assignment45 assignment45 = new Yogesh_Assignment45();
		assignment45.length(input);
	}

}
