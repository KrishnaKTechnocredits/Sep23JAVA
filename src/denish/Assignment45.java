/*Print the name having maximum and minimum length from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : Min length name is : J6a6y
         Max length name is : Technocredits*/
package denish;

public class Assignment45 {

	void minMax(String[] input) {
		String update1 = input[0];
		String update2 = input[0];
		int maxNum = input[0].length();
		int minNum = input[0].length();
		int count = 0;

		for (int index = 0; index < input.length; index++) {
			String x = input[index];
			count = x.length();

			if (count >= maxNum) {
				maxNum = count;
				update1 = x;
			}
			if (count <= minNum) {
				minNum = count;
				update2 = x;
			}
		}
		System.out.println("Max Length is -> " + update1);
		System.out.println("Min Length is -> " + update2);
	}

	public static void main(String[] args) {
		Assignment45 assignment45 = new Assignment45();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment45.minMax(input);
	}
}
