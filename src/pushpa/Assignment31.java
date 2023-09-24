//Write a method which takes input and return all Uppercase from given input using ascii.
//
//input : "TeCHNocreditS";
//output : TCHNS

package pushpa;

public class Assignment31 {

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
		Assignment31 allUpperCaseInString = new Assignment31();
		allUpperCaseInString.printallUpperCaseInString("TeCHNocreditS");
	}

}
