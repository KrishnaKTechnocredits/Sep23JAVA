//Write a method which takes input and return to return all Uppercase from given input.
//
//input : "TeCHNocreditS";
//output : TCHNS

package pushpa;

public class Assignment30 {

	public void printallUpperCaseInString(String str) {
		int i = 0, uCount = 0, lCount = 0, dCount = 0;

		while (i < str.length()) {
			int asciiValue = str.charAt(i);
			if (asciiValue >= 65 && asciiValue <= 90) {
				uCount++;
			} else if (asciiValue >= 97 && asciiValue <= 122) {
				lCount++;
			} else if (asciiValue >= 48 && asciiValue <= 57) {
				dCount++;
			}
			i++;
		}
		System.out.println("uppercase->" + uCount);
		System.out.println("lowercase->" + lCount);
		System.out.println("digits->" + dCount);

	}

	public static void main(String[] args) {
		Assignment30 allUpperCaseInString = new Assignment30();
		allUpperCaseInString.printallUpperCaseInString("TeCHNoc33r44editS");
	}

}
