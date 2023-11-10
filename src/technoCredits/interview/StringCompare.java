package technoCredits.interview;

//if compareTo returns 0, both strings are identical.
// if compareTo returns -ve number, first string is smaller then second string.
// if compareTo returns +ve number, first string is bigger then second string.

public class StringCompare {
	
	public static void main(String[] args) {
		String str1 = "Hz"; //97
		String str2 = "HiNewlysdgsdgdfgsdgsgsdf"; //105
		String str3 = "Ho";
		String str4 = "PiNew";
		
		
		int asciiDifference = str2.compareTo(str4);
		System.out.println(asciiDifference);
	}
}
