/*Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1
*/

package deepak;

class Assignment23_GetCharacterTypeCount {
	void getCharType(String input) {
		System.out.println("Input : " + input);
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int sCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch))
				uCount++;
			else if (Character.isLowerCase(ch))
				lCount++;
			else if (Character.isDigit(ch))
				dCount++;
			else
				sCount++;
		}
		System.out.println("UpperCase Count -> " + uCount);
		System.out.println("LowerCase Count -> " + lCount);
		System.out.println("Digit Count -> " + dCount);
		System.out.println("Special Character Count -> " + sCount);
	}

	public static void main(String[] args) {
		Assignment23_GetCharacterTypeCount charCount = new Assignment23_GetCharacterTypeCount();
		charCount.getCharType("TecHNo_cR6ediTs");
	}
}
