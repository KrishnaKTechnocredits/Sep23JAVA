/*Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1*/

package onkar;

public class Assignment23 {
	
	void findCharacters (String input) {
		int uCount = 0;
		int lCount = 0;
		int dCount = 0;
		int specialCount = 0;
		for (int index=0; index<input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				uCount++;
			}else if (Character.isLowerCase(input.charAt(index))) {
				lCount++;
			}else if (Character.isDigit(input.charAt(index))) {
				dCount++;
			}else {
				specialCount++;
			}
		}
		System.out.println("Uppercase -> "+uCount);
		System.out.println("Lowercase -> "+lCount);
		System.out.println("Digit -> "+dCount);
		System.out.println("Special char count -> "+specialCount);
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.findCharacters("TecHNo_cR6ediTs");
	}
}
