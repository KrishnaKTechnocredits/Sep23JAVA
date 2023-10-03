/*Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0

 */
package jagrati;

public class Assignment38 {
	int vowels(String input) {
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if ('a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch) {
				flag = true;
			}
		}
		if (flag == true) {
			int sum = 0;
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}
			}
			System.out.println("Given String " + input +" sum of "+ sum);
		} else
			return 0;
		return 0;
	}

	public static void main(String[] args) {
		Assignment38 assign = new Assignment38();
		assign.vowels("Pu1ne5Ind3ia");
		String input = "R1hlTns7h";
		assign.vowels(input);
		System.out.println("if no vowels in the Given String " + input +" it is returning "+assign.vowels(input));
	}
}
