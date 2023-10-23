/*Assignment-53 : 13th Oct'2023

Write a program to return unique vowels included in the string, ensure sequence is maintained.
String str = "aakaniksha eaep dube";
output : aieu*/

package rahul;

public class Assignment53_1 {

	String uniqueVowels(String str) {
		String uniqueList = "";
		boolean aFlag = true;
		boolean eFlag = true;
		boolean iFlag = true;
		boolean oFlag = true;
		boolean uFlag = true;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch == 'a' && aFlag == true) {
				uniqueList = uniqueList + ch;
				aFlag = false;
			} else if (ch == 'e' && eFlag == true) {
				uniqueList = uniqueList + ch;
				eFlag = false;
			} else if (ch == 'i' && iFlag == true) {
				uniqueList = uniqueList + ch;
				iFlag = false;
			} else if (ch == 'o' && oFlag == true) {
				uniqueList = uniqueList + ch;
				oFlag = false;
			} else if (ch == 'u' && uFlag == true) {
				uniqueList = uniqueList + ch;
				uFlag = false;
			}
		}
		System.out.println("Original String: " + str);
		return uniqueList;
	}

	public static void main(String[] args) {
		Assignment53_1 assignment53_1 = new Assignment53_1();
		String output = assignment53_1.uniqueVowels("aakaniksha eaep dube");
		System.out.println("Unique vowels in string are: " + output);
	}
}
