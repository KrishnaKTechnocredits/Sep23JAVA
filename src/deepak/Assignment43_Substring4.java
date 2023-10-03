/*
Assignment 43: 01-Oct-23
WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21*/

package deepak;

class Assignment43_Substring4 {
	char vowel;

	char getVowel(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowel = ch;
				break;
			}
		}
		return vowel;
	}

	int getOuterSum(String input) {
		int sum1 = 0;
		int sum2 = 0;
		char vowel = getVowel(input);
		String str1 = "";
		String str2 = "";
		str1 = str1 + (input.substring(0, input.indexOf(vowel)));
		str2 = str2 + (input.substring(input.lastIndexOf(vowel), input.length()));
		for (int index = 0; index < str1.length(); index++) {
			char ch = str1.charAt(index);
			if (Character.isDigit(ch)) {
				sum1 = sum1 + Character.getNumericValue(ch);
			}
		}
		for (int index = 0; index < str2.length(); index++) {
			char ch = str2.charAt(index);
			if (Character.isDigit(ch)) {
				sum2 = sum2 + Character.getNumericValue(ch);
			}
		}
		return (sum1 + sum2);
	}

	int getInnerSum(String input) {
		int innerSum = 0;
		char vowel = getVowel(input);
		String innerStr = "";
		innerStr = innerStr + input.substring(input.indexOf(vowel), input.lastIndexOf(vowel) + 1);
		for (int index = 0; index < innerStr.length(); index++) {
			char ch = innerStr.charAt(index);
			if (Character.isDigit(ch)) {
				innerSum = innerSum + Character.getNumericValue(ch);
			}
		}
		return innerSum;
	}

	void getDifference(String input) {
		System.out.println("Difference between the sum of inner(String between first and last place of 1st identified vowel) and outer(String outside the first and last place of 1st identified vowel) strings");
		System.out.println("Input: " + input);
		int innerSum = getInnerSum(input);
		System.out.println("InnerSum: " + innerSum);
		int outerSum = getOuterSum(input);
		System.out.println("OuterSum: " + outerSum);
		if (innerSum > outerSum)
			System.out.println("Difference: " + (innerSum - outerSum));
		else if (innerSum < outerSum)
			System.out.println("Difference: " + (outerSum - innerSum));
		else if (innerSum == outerSum)
			System.out.println("Difference: " + (innerSum - outerSum));
	}

	public static void main(String[] args) {
		Assignment43_Substring4 string = new Assignment43_Substring4();
		string.getDifference("t1ec5ehno4e7credit983");
	}
}
