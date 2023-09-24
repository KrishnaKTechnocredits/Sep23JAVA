/*
 Assignment-32 : 23nd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4

 */
package deepak;

public class Assignment32_CharacterTypeUsingASCII {

	void getCharTypes(String input) {
		System.out.println("Input String: " + input);
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch >= 48 && ch <= 57)
				dCount++;
			else if (ch >= 65 && ch <= 90)
				uCount++;
			else if (ch >= 97 && ch <= 122)
				lCount++;
		}
		System.out.println("Output: ");
		System.out.println("UpperCase Count: " + uCount);
		System.out.println("LowerCase Count: " + lCount);
		System.out.println("Digit Count: " + dCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment32_CharacterTypeUsingASCII getCounts = new Assignment32_CharacterTypeUsingASCII();
		getCounts.getCharTypes("TeCHNoc33r44editS");
	}
}
