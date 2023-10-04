//WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
//String str = "Pu1ne5Ind3ia";
//output : 1+5+3 = 9
//String str = "R1hlTns7h";
//output : 0

package pushpa;

import java.util.Scanner;

public class Assignment38 {

	public boolean checkVowels(String str) {
		if (str.contains(Character.toString('a')) || str.contains(Character.toString('e'))
				|| str.contains(Character.toString('i')) || str.contains(Character.toString('o'))
				|| str.contains(Character.toString('u')))
			return true;
		else if (str.contains(Character.toString('A')) || str.contains(Character.toString('E'))
				|| str.contains(Character.toString('I')) || str.contains(Character.toString('O'))
				|| str.contains(Character.toString('U')))
			return true;
		else
			return false;
	}

	public int sumOfDigits(String str, boolean flag) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (flag == true && Character.isDigit(str.charAt(i)))
				sum += Character.getNumericValue(str.charAt(i));
		}
		return sum;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scanner.next();
		Assignment38 assignment38 = new Assignment38();
		boolean result = assignment38.checkVowels(str);
		int sum = assignment38.sumOfDigits(str, result);
		System.out.println(sum);

	}

}
