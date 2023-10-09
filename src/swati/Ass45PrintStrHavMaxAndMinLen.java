/*Assignment - 45 : 8th Oct'2023 Print the name having maximum and minimum length from given array. 
String[] input = new String[4]; input[0] = "Rah2u4l"; input[1] = "Technocredits"; input[2] = "J6a6y"; input[3] = "cred5it2s"; 
output : Min length name is : J6a6y   
 Max length name is : Technocredits*/

package swati;

class Ass45PrintStrHavMaxAndMinLen {

	void printMinMaxLength(String[] input) {
		
		String maxlengthstr = "";
		String minlengthstr = "";
		int maxlength = 0;
		int minlength = 0;

		for (int index = 0; index < input.length; index++) {
			int length = input[index].length();
			if (index == 0) {
				maxlength = length;
				minlength = length;
			} else {
				if (length > maxlength) {
					maxlength = length;
					maxlengthstr = input[index];
				} else if (length < minlength) {
					minlength = length;
					minlengthstr = input[index];
				}
			}
		}
		System.out.println("Maximum length name is : " + maxlengthstr);
		System.out.println("Minimum length name is : " + minlengthstr);
	}

	public static void main(String[] args) {
		String[] str = { "Rah2u4l", "Technocredits", "J6a6y", "cred5it2s" };
		new Ass45PrintStrHavMaxAndMinLen().printMinMaxLength(str);

	}

}