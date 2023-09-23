/*Write a method to print number of Uppercase,lowercase and digits in the input using ascii.

input : "TeCHNoc33r44editS";
output : Uppercase -> 5
         Lowercase -> 8
		 Digit -> 4*/

package yogesh;

public class Yogesh_Assignment32 {

	void printCase(String input) {
		int ucount = 0;
		int lcount = 0;
		int dcount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int temp=ch;
			if (temp >= 65 && temp <= 90) {
				ucount++;
			} else if (temp >= 97 && temp <= 122) {
				lcount++;
			} else if (temp >= 48 && temp <= 57) {
				dcount++;
			}
		}
		System.out.println(input + " Uppercase count is " + ucount);
		System.out.println(input + " Lowercase count is " + lcount);
		System.out.println(input + " Digit count is " + dcount);
	}

	public static void main(String[] args) {
		Yogesh_Assignment32 assignment32 = new Yogesh_Assignment32();
		assignment32.printCase("TeCHNoc33r44editS");
	}

}

