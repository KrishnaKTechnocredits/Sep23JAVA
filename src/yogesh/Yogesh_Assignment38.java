//Assignment 38: 01st Oct 2023
//WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
//String str = "Pu1ne5Ind3ia";
//output : 1+5+3 = 9
//String str = "R1hlTns7h";
//output : 0
package yogesh;

public class Yogesh_Assignment38 {

	int digitSum(String input) {
		int sum = 0;
		boolean flag = false;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
			}
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		if (flag == true) {
			return sum;
		}
		else
			return 0;
	}

	public static void main(String[] args) {
		Yogesh_Assignment38 assignment38 = new Yogesh_Assignment38();
		String input = "R1hlTns7h";
		int output = assignment38.digitSum(input);
		System.out.println("output for R1hlTns7h is:"+output);
		String input1 ="Pu1ne5Ind3ia";
		int output1 = assignment38.digitSum(input1);
		System.out.println("output for Pu1ne5Ind3ia is:"+output1);

	}
}
