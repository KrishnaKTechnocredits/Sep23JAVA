/*Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4*/

package gaurang;

public class Assignment32 {

	void printCases(String input) {
		int upper = 0;
		int lower = 0;
		int digit = 0;
		for(int index=0 ; index<input.length() ; index++) {
			char ch = input.charAt(index);
			if(ch>65 && ch<90) {
				upper++;
			}
			else if(ch>48 && ch<57) {
				digit++;
			}
			else {
				lower++;
			}
		}
		System.out.println("Uppercase --> " + upper);
		System.out.println("Lowercase --> " + lower);
		System.out.println("Digits --> "+digit);
	}
	
	public static void main(String[] args) {
		Assignment32 a = new Assignment32();
		a.printCases("TeCHNoc33r44editS");
	}
}
