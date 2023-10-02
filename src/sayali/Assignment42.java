/* WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21 */

package sayali;

public class Assignment42 {

	void printSum(String input, char ch) {
		int index1 = input.indexOf(ch);
		int lastindex = input.lastIndexOf(ch);
		String str = input.substring(0, index1) + input.substring(lastindex);
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char t = str.charAt(index);
			if (Character.isDigit(t)) {
				sum = sum + Character.getNumericValue(t);
			}
		}
		System.out.println("Output:  " + sum);
	}

	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();
		assignment42.printSum("t1ecehnoecredit983", 'e');
	}
}