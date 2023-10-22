/*Assignment 43: 
WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21 */
package shrutika;

public class As43DiffInnerOuterSum {

	int getSum(String input) {
		int sum = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println(input + "->" + sum);
		return sum;
	}

	void getChar(String input, char ch) {
		String outerSting = "";
		String innerString = "";
		int diffrance = 0;
		int firstIndex = input.indexOf(ch);
		int lsstIndex = input.lastIndexOf(ch);
		outerSting = input.substring(0, firstIndex) + input.substring(lsstIndex);
		innerString = input.substring(firstIndex, lsstIndex);
		System.out.println("OuterString -> " + outerSting);
		System.out.println("InnerString -> " + innerString);
		int outerSum = getSum(outerSting);
		int innerSum = getSum(innerString);
		if (outerSum > innerSum) {
			diffrance = outerSum - innerSum;
		} else {
			diffrance = innerSum - outerSum;
		}
		System.out.println("Diffrence between outersum and innersum is -> " + diffrance);
	}

	public static void main(String[] args) {
		As43DiffInnerOuterSum diffInnerOuterSumA43 = new As43DiffInnerOuterSum();
		diffInnerOuterSumA43.getChar("t1ec5ehno4e7credit983", 'e');
	}
}
