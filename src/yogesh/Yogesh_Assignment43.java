//Assignment 43: 01-Oct-23

//WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
//Input: t1ec5ehno4e7credit983
//Output: 
//Inner sum: e->e : 5+4+7 = 16
//Outer sum: t1+dit983 : 1+9+8+3 = 21
package yogesh;

public class Yogesh_Assignment43 {
	String str1 = "";
	String str2 = "";

	void test(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				int firstindex = input.indexOf(ch);
				int lastindex = input.lastIndexOf(ch);
				str1 = input.substring(0, firstindex) + input.substring(lastindex + 1);
				str2 = input.substring(firstindex, lastindex + 1);
				break;
			}
		}
		System.out.println("1st Substring is: " + str1);
		System.out.println("2nd substring: " + str2);
	}

	void sumanddiff(String input) {
		test(input);
		int diff = 0;
		int sum1 = 0;
		int sum2 = 0;
		for (int firstindex = 0; firstindex < str1.length(); firstindex++) {
			char ch = str1.charAt(firstindex);
			if (Character.isDigit(ch))
				sum1 = sum1 + Character.getNumericValue(ch);
		}
		System.out.println("Sum 1 is :" + sum1);
		for (int lastindex = 0; lastindex < str2.length(); lastindex++) {
			char ch = str2.charAt(lastindex);
			if (Character.isDigit(ch))
				sum2 = sum2 + Character.getNumericValue(ch);
		}
		System.out.println("Sum 2 is :" + sum2);
		if (sum1 > sum2) {
			diff = sum1 - sum2;
			System.out.println("Difference is: " + diff);
		} else if (sum2 > sum1) {
			diff = sum2 - sum1;
			System.out.println("Difference is: " + diff);
		}

	}

	public static void main(String[] args) {
		Yogesh_Assignment43 assignment43 = new Yogesh_Assignment43();
		assignment43.sumanddiff("t1ec5ehno4e7credit983");
	}

}
