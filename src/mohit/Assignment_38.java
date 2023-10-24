/*WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0*/

package mohit;

public class Assignment_38 {
	int printVowels(String input) {
		boolean flag = false;

		int sum = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.contains("a") || input.contains("e") || input.contains("i") || input.contains("o")
					|| input.contains("u")) {
				flag = true;
			}
		}
		if (flag == true) {
			for (int index = 0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);
				}

			}
			System.out.println(input + " contain vowels, so sum is: ");
			return sum;
		} else {
			System.out.println(input + " does not contain vowels, so sum is: ");
			return 0;
		}
	}

	public static void main(String[] args) {
		Assignment_38 assignment_38 = new Assignment_38();
		int output1 = assignment_38.printVowels("Pu1ne5Ind3ia");
		System.out.println(output1);

		int output2 = assignment_38.printVowels("R1hlTns7h");
		System.out.println(output2);
	}
}
