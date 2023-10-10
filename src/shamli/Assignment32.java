/*
 * Assignment-32 : 23nd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4
 */


package shamli;

public class Assignment32 {
	
	void printCaseCount(String input) {
		int ucount=0;
		int lcount=0;
		int dcount=0;
		System.out.println("Input String is :"+input);
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			int temp=ch;
			if(temp>=65 && temp<=90) {
				ucount++;
			}else if(temp>=97 && temp<=122) {
				lcount++;
			}else if(temp>=48 && temp<=57) {
				dcount++;
			}
		}
		System.out.println("UpperCase ->"+ucount);
		System.out.println("LowerCase ->"+lcount);
		System.out.println("Digit ->"+dcount);
	}

	public static void main(String[] args) {
		Assignment32 assignment32=new Assignment32();
		assignment32.printCaseCount("TeCHNoc33r44editS");
	}
}
