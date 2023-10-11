/* WAP to Print the name having maximum and minimum length from given array.
String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
output : Min length name is : J6a6y
         Max length name is : Technocredits */
		 
package sayali;

public class Assignment45 {

	void printMaxMinLength(String[] input) {
		String str1 = input[0];
		String str2 = input[0];
		int count = 0;
		int minLength = input[0].length();
		int maxLength = input[0].length();
		

		for (int index = 0; index < input.length; index++) {
			String s = input[index];
			count = s.length();

			if (count <= minLength) {
				minLength = count;
				str1 = s;
			}
			if (count >= maxLength) {
				maxLength = count;
				str2 = s;
			}
		}
		System.out.println("Min length name is : " + str1);
		System.out.println("Max length name is : " + str2);
	}

	public static void main(String[] args) {
		Assignment45 assignment45 = new Assignment45();
		String[] input = new String[4];
		input[0] = "Rah2u4l";
		input[1] = "Technocredits";
		input[2] = "J6a6y";
		input[3] = "cred5it2s";
		assignment45.printMaxMinLength(input);
	}
}