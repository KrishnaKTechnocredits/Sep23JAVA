/* WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 5
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21 */

package sayali;

class Assignment43 {

	String str1;
	String str2;

	void processString(String input) {
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int a = input.indexOf(ch);
				int b = input.lastIndexOf(ch);
				str1 = input.substring(0, a) + input.substring(b + 1);
				str2 = input.substring(a, b + 1);
				break;
			}
		}
		System.out.println("Outer String is: " +str1);
		System.out.println("Inner string is: " +str2);
	}

	void positiveDiff(String input) {
		processString(input);
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < str1.length(); i++) {
			char ch = str1.charAt(i);
			if (Character.isDigit(ch)) {
				sum1 += Character.getNumericValue(ch);
			}
		}
		for (int a = 0; a < str2.length(); a++) {
			char ch = str2.charAt(a);
			if (Character.isDigit(ch)) {
				sum2 += Character.getNumericValue(ch);
			}
		}
		System.out.println("Sum of Inner string is: " + sum2);
		System.out.println("Sum of outer string is: " + sum1);
		if (sum1 > sum2) {
			System.out.println("Difference of sum of both strings is: " + (sum1 - sum2));
		} else {
			System.out.println("Difference of sum of both strings is: " + (sum2 - sum1));
		}
	}

	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		assignment43.positiveDiff("t1ec5ehno4e7credit983");
	}
}