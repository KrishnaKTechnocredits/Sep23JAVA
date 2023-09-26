//Write a method to print number of Uppercase,lowercase and digits in the input using ascii.
//
//input : "TeCHNoc33r44editS";
//output : Uppercase -> 5
//         Lowercase -> 8
//		 Digit -> 4

package pushpa;

public class Assignment32 {

	public void printallUpperCaseInString(String str) {
		int i = 0;
		String upperCaseString = "";
		while (i < str.length()) {
			if (Character.isUpperCase(str.charAt(i))) {
				upperCaseString += str.charAt(i);
			}
			i++;
		}
		System.out.print(upperCaseString);
	}

	public static void main(String[] args) {
		Assignment32 allUpperCaseInString = new Assignment32();
		allUpperCaseInString.printallUpperCaseInString("TeCHNocreditS");
	}

}
