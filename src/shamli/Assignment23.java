/*
 * Write a program to find count of Uppercase, lowercase, digits and special characters.
String str = "TecHNo_cR6ediTs";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 1
		 Special char count -> 1
 */

package shamli;

public class Assignment23 {
	int ucount=0;
	int lcount=0;
	int digits=0;
	int scount=0;
	void findUcaseLcaseDigitsAndScharFromString(String input) {
		for(int index =0;index<input.length();index++) {
			if(Character.isUpperCase(input.charAt(index))) {
				ucount++;
			}else if(Character.isLowerCase(input.charAt(index))){
				lcount++;
			}else if(Character.isDigit(input.charAt(index))){
				digits++;
			}else {
				scount++;
			}
		}
		System.out.println("Total no of uppercase letters from string "+input+" is :"+ucount);
		System.out.println("Total no of lowercase letters from string "+input+" is :"+lcount);
		System.out.println("Total no of digits  from string "+input+" is :"+digits);
		System.out.println("Total no of Special characters from string "+input+" is :"+scount);
	}

	public static void main(String[] args) {
		Assignment23 assignment23 = new Assignment23();
		assignment23.findUcaseLcaseDigitsAndScharFromString("TecHNo_cR6ediTs");
	}

}
