/*Assignment - 46 : 8th Oct'2023
Print the name having maximum digit sum from given array.

String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Tech3no3credits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";

output : J6a6y -> 12*/

package rahul;

public class Assignment46_1 {

	void maxDigitSum1(String[] arr) {
		int finalmax = 0;
		int max = 0;
		String str = "";
		for (int index = 0; index < arr.length - 1; index++) {
			str = arr[index];
			max = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (Character.isDigit(ch)) {
					int num = Character.getNumericValue(ch);
					max = max + num;
				}
			}
			if (finalmax < max) {
				finalmax = max;
				str = arr[index];
			}
		}
		System.out.println(str + " -> " + finalmax);
	}

	public static void main(String[] args) {
		Assignment46_1 assignment46_1 = new Assignment46_1();
		String[] arr = { "Rah2u4l", "Tech3no3credits", "J6a6y", "cred5it2s" };
		assignment46_1.maxDigitSum1(arr);
	}
}
