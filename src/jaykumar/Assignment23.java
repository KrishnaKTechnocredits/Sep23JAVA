/*Assignment - 23 : 14th Sep'2023
Write a program to find count of Uppercase, lowercase, digits and special characters.

String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1*/
		 
package jaykumar;

public class Assignment23 {
	
	void charCase(String input) {
		int uCount=0;
		int lCount=0;
		int dCount=0;
		int sCount=0;
		for(int index=0;index<input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))) {
				uCount++;
			}else if(Character.isLowerCase(input.charAt(index))) {
				lCount++;
			}else if(Character.isDigit(input.charAt(index))) {
				dCount++;
			}else {
				sCount++;
			}
		}
		System.out.println("Uppercase -> "+uCount);
		System.out.println("Lowercase -> "+lCount);
		System.out.println("Digit -> "+dCount);
		System.out.println("Special char count -> "+sCount);
	}
	
	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.charCase("TecHNo_cR6ediTs");
	}
}
