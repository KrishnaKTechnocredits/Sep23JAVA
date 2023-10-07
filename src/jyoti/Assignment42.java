/*Assignment 42: 01-Oct-23
WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21
*/

package jyoti;

public class Assignment42 {

	int getProcessedData(String str) {
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
		Assignment42 sdv = new Assignment42();
		sdv.getProcessedData("t1ecehnoecredit983");
		int output1 = sdv.getProcessedData("t1ecehnoecredit983");
		System.out.println("If vowel are in string---->" + output1);
	}

}
