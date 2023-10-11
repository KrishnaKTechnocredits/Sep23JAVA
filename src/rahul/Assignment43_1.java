/*Assignment 43: 01-Oct-23
WAP to calculate difference of outer sum (t1+dit983) - inner sum 
(i.e. 1st repeting vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21*/

package rahul;

public class Assignment43_1 {

	String getNonVowelSubString(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int first = input.indexOf(ch);
				int last = input.lastIndexOf(ch);
				temp = input.substring(0, first) + input.subSequence(last + 1, input.length());
				break;
			}
		}
		return temp;
	}

	String getVowelSubString(String input) {
		String temp = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int first = input.indexOf(ch);
				int last = input.lastIndexOf(ch);
				temp = input.substring(first, last + 1);
				break;
			}
		}
		return temp;
	}

	int getSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				int digit = Character.getNumericValue(ch);
				sum = sum + digit;
			}
		}
		return sum;
	}

	int getDifference(int sum1, int sum2) {
		int ans = 0;
		if (sum1 >= sum2) {
			ans = sum1 - sum2;
		} else if (sum2 > sum1) {
			System.out.println(sum2 + " is greater than " + sum1);
		}
		return ans;
	}

	public static void main(String[] args) {
		Assignment43_1 assignment43_1 = new Assignment43_1();
		String temp1 = assignment43_1.getNonVowelSubString("t1ec5ehno4e7credit983");
		int sum1 = assignment43_1.getSum(temp1);
		System.out.println("Sum1 is: " + sum1);
		String temp2 = assignment43_1.getVowelSubString("t1ec5ehno4e7credit983");
		int sum2 = assignment43_1.getSum(temp2);
		System.out.println("Sum2 is: " + sum2);
		int ans = assignment43_1.getDifference(sum1, sum2);
		System.out.println("Difference is: " + ans);
	}
}
