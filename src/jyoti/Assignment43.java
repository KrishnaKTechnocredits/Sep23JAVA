
/*Assignment 43: 01-Oct-23
WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21
*/

package jyoti;

public class Assignment43 {

	void getDiffSubstringNum(String str, char ch) {

		int first = str.indexOf(ch);
		int last = str.lastIndexOf(ch);
		int sum1 = 0;
		String output1 = "";
		String output2 = "";
		int sum2 = 0;
		int diff = 0;
		String output3 = "";
		String temp = "";
		output1 = output1 + str.substring(0, first);
		output2 = output2 + str.substring(first, last + 1);// ec5ehno4e7cre
		output3 = output3 + str.substring(last + 1);// dit983
		temp = temp + output1 + output3;// t1+dit983

		for (int index = 0; index < temp.length(); index++) {
			char ch1 = temp.charAt(index);

			if (Character.isDigit(ch1)) {
				sum1 = sum1 + Character.getNumericValue(ch1);
			}
		}
		for (int index = 0; index < output2.length(); index++) {
			char ch2 = output2.charAt(index);
			if (Character.isDigit(ch2)) {
				sum2 = sum2 + Character.getNumericValue(ch2);
			}
		}
		System.out.println("Outer String-->" + temp + "----Sum1--->" + sum1);
		System.out.println("Middle String-->" + output2 + "---Digits sum-->" + sum2);

		if (sum2 > sum1) {
			diff = diff + sum2 - sum1;
		} else if (sum1 > sum2) {
			diff = diff + sum1 - sum2;
		} else {
			diff = 0;
		}
		System.out.println("Difference of digits-->" + diff);

	}

	public static void main(String[] args) {
		Assignment43 d = new Assignment43();
		d.getDiffSubstringNum("t1ec5ehno4e7credit983", 'e');

	}

}
