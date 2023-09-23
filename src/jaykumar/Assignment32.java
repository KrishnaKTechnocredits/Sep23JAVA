/*Assignment-32 : 23nd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4*/

package jaykumar;

public class Assignment32 {

	void printCharCount(String input) {
		int uCount=0;
		int lCount=0;
		int dCount=0;
		for(int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int temp = ch;
			if(temp>=65 && temp<=90) {
				uCount++;
			}
			else if(temp>=97 && temp<=122) {
				lCount++;
			}
			else if(temp>=48 && temp<=57) {
				dCount++;
			}
		}
		System.out.println("Uppercase -> "+uCount);
		System.out.println("Lowercase -> "+lCount);
		System.out.println("Digits -> "+dCount);
	}
	
	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.printCharCount("TeCHNoc33r44editS");
	}
}
