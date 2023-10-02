/*Assignment 38: 01st Oct 2023
WAP to get the sum of digits in a string only if there are any vowels in the string else return 0.
String str = "Pu1ne5Ind3ia";
output : 1+5+3 = 9
String str = "R1hlTns7h";
output : 0
*/
package deepak;

public class Assignment38_StringSumOfDigitsVowel {

	boolean vowelCheck(String str) {
		boolean flag = false;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				flag = true;
				break;
			}
		}
		return flag;
	}

	int sumOfDigitsVowel(String str) {
		System.out.println("Input: "+str);
		int sum = 0;
		boolean flag = vowelCheck(str);
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (flag == true && Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment38_StringSumOfDigitsVowel result = new Assignment38_StringSumOfDigitsVowel();
		int output = result.sumOfDigitsVowel("Pu1ne5Ind3ia");
		System.out.println("Output(Sum of digits): " + output);
		int output1 = result.sumOfDigitsVowel("R1hlTns7h");
		System.out.println("Output: " + output1);
	}

}
