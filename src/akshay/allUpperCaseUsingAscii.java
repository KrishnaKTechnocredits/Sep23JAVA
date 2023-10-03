
//Write a method which takes input and return all Uppercase from given input using ascii.
//
//input : "TeCHNocreditS";
//output : TCHNS

package akshay;

public class allUpperCaseUsingAscii {

	void M1(String input) {

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int temp = ch;
			if (temp >= 65 && temp <= 90) {
				System.out.println(ch);
			}

		}
	}

	public static void main(String[] args) {
		allUpperCaseUsingAscii uppercase = new allUpperCaseUsingAscii();
		uppercase.M1("TeCHNocreditS");
	}

}
