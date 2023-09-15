//Assignment - 23 : 14th Sep'2023
//Write a program to find count of Uppercase, lowercase, digits and special characters.
//
//String str = "TecHNo_cR6ediTs";
//output : Uppercase -> 5
//         Lowercase -> 8
//		   Digit -> 1
//		   Special char count -> 1

package pushpa;

public class CountSplUpperLowerCharFreq {

	public void countSplUpperLowerCharFreqency(String str) {
		int upperCount = 0, lowerCount = 0, digitCount = 0, splCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i)))
				upperCount++;
			else if (Character.isLowerCase(str.charAt(i)))
				lowerCount++;
			else if (Character.isDigit(str.charAt(i)))
				digitCount++;
			else
				splCount++;
		}
		System.out.println("Uppercase : " + upperCount);
		System.out.println("Lowercase : " + lowerCount);
		System.out.println("Digits : " + digitCount);
		System.out.println("Special char count : " + splCount);
	}

	public static void main(String[] args) {
		CountSplUpperLowerCharFreq countSplUpperLowerCharFreq = new CountSplUpperLowerCharFreq();
		countSplUpperLowerCharFreq.countSplUpperLowerCharFreqency("TecHNo_cR6ediTs");
	}
}
