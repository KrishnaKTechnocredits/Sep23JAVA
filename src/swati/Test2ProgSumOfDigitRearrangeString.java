/*Programming Test - 2 : 24th Sep'2023 Program 2 : Write a program to rearrange string as per below example.
 String input = "TeCHNoc33r44editS"; output : 14eocreditTCHNS String getOutput(String input){ }*/

package swati;

class Test2ProgSumOfDigitRearrangeString {
	int digitcount = 0;
	String uppercase = "";
	String lowercase = "";

	void rearrangeString(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digitcount = digitcount + Character.getNumericValue(ch);
			} else if (Character.isUpperCase(ch)) {
				uppercase = uppercase + ch;
			} else if (Character.isLowerCase(ch)) {
				lowercase = lowercase + ch;
			}
		}
		System.out.println(digitcount + lowercase + uppercase);
	}

	public static void main(String[] args) {
		Test2ProgSumOfDigitRearrangeString Progtest2SumOfdigitrearrangestring = new Test2ProgSumOfDigitRearrangeString();
		Progtest2SumOfdigitrearrangestring.rearrangeString("TeCHNoc33r44editS");
	}
}