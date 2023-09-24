/*Assignment-32 : 23nd Sep'2023 
Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4
 */

package jagrati;

public class Assignment32 {
	void printNumber(String input) {
		int uCount=0;
		int lCount=0;
		int dCount=0;
		for(int index=0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int output = ch;
			if (output > 65 && output<90) {
				uCount++;
			}else if ( output>97 && output< 122) {
				lCount++;
			}else if (output> 48 && output< 57) {
				dCount++;
			}else {
				System.out.println("Character is specal");
			}
		}System.out.println("UpperCase-> " + uCount);
		System.out.println("LowerCase -> " + lCount);
		System.out.println("Digit-> " + dCount);
		
	}
	public static void main(String[] args) {
		Assignment32 assign = new Assignment32();
		assign.printNumber("TeCHNoc33r44editS");
		
	}
}
