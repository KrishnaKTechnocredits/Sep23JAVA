/*Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0*/

package rahul;

public class Assignment38_1 {

	void checkVowels(String input) {
		int sum = 0;
		String str = input.toLowerCase();
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				sum = sumOfDigits(str);
			}
		}
		System.out.println("Sum is: " + sum);
	}

	int sumOfDigits(String input2) {
		int sum = 0;
		for (int index = 0; index < input2.length(); index++) {
			boolean flag = Character.isDigit(input2.charAt(index));
			if (flag == true) {
				int num = Character.getNumericValue(input2.charAt(index));
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment38_1 assignment38_1 = new Assignment38_1();
		assignment38_1.checkVowels("Pu1ne5Ind3ia");
		assignment38_1.checkVowels("R1hlTns7h");
	}
}
