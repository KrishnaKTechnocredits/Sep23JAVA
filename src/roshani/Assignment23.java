/*Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1
*/
package roshani;

public class Assignment23 {
	
	void getCharCount(String str) {
		
		int upperCount = 0;
		int lowerCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;
		
		for(int index = 0; index <str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isUpperCase(ch)) {
				upperCount++;
			}else if(Character.isLowerCase(ch)) {
				lowerCount++;
			}else if(Character.isDigit(ch)) {
				digitCount++;
			}else {
				specialCharCount++;
			}
		}
		System.out.println("\nString '"+str+"' contains:\n\n"+upperCount+" Uppercase characters\n"+lowerCount+" Lowercase characters\n"+digitCount+" Digit\n"+specialCharCount+" Special character");
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.getCharCount("TecHNo_cR6ediTs");
	}
	
}
