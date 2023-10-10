/* WAP program on given string .
 * 1. Need to update character upper case to lower case and vice versa 
 * 2.After get the string convert into revers order 
 * 
 * output- TecHNoCreDIts
 */

package jagrati;

public class Discussion2_SecondProgram {

	String revers(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				output = output + Character.toLowerCase(ch);
			} else if (Character.isLowerCase(ch)) {
				output = output + Character.toUpperCase(ch);
			}
		}
		return output;
	}

	void test(String input) {
		String output1 = revers(input);
		String str = "";
		// System.out.println(output1);
		for (int index = output1.length() - 1; index >= 0; index--) {
			char ch = output1.charAt(index);
			str = str + ch;
		}
		System.out.print(str);
	}

	public static void main(String[] args) {
		Discussion2_SecondProgram t = new Discussion2_SecondProgram();
		t.test("TecHNoCreDIts");

	}

}
