//WAP to print special character from given string
//Input : Te_23!cHNo#3c R32ed*&i2t%1s$
//Output : _!#*&%$

package akshita.array;

public class Assignment58 {

	void specChar(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
			} else if (Character.isLowerCase(ch)) {

			} else if (Character.isDigit(ch)) {

			} else {
				output = output + ch;
			}
		}
		System.out.println("Special Character from String : " + output);
	}

	public static void main(String[] args) {
		Assignment58 ass58 = new Assignment58();
		String input = "Te_23!cHNo#3c R32ed*&i2t%1s$";
		System.out.println("Input : " + input);
		ass58.specChar(input);
	}
}
