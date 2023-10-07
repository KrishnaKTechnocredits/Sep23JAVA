/*Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0*/

package jyoti;

public class Assignment38 {

	int getString(String str) {
		boolean flag = false;
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);// P
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
			}
			if (Character.isDigit(ch)) {// 0 1 2 -->1
				sum = sum + Character.getNumericValue(ch);
			}
		}

		if (flag == true) {
			return sum;
		} else
			return 0;

	}

	public static void main(String[] args) {
		Assignment38 vds = new Assignment38();
		Assignment38 vds1 = new Assignment38();
		int output = vds.getString("Pu1ne5Ind3ia");
		int output1 = vds1.getString("R1hlTns7h");
		System.out.println("If vowel are in string---->" + output);
		System.out.println("if vowel is not in string---->" + output1);
	}

}