package naresh;

public class Assignment42 {
	boolean flag;
	int sum = 0;

	void display(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
			}
		}
		if (flag == true) {
			for (int index = 0; index < str.length(); index++) {
				char ch = str.charAt(index);
				if (Character.isDigit(ch)) {
					sum = sum + Character.getNumericValue(ch);

				}
			}
			System.out.println(sum);
		}

	}

	public static void main(String[] args) {
		Assignment42 a = new Assignment42();
		a.display("t1ecehnoecredit983");

	}

}
/*
 * Assignment 42: 01-Oct-23 WAP to calculate sum of digits which are present
 * outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel
 * 'e' Input: t1ecehnoecredit983 Output: 1+9+8+3 = 21
 */