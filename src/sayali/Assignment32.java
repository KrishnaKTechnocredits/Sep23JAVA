/* Write a method to print number of
  Uppercase,lowercase and digits in the input.
 input : "TeCHNoc33r44editS"; output : 
 Uppercase -> 5    
 Lowercase -> 8
 Digit -> 4 */

package sayali;

class Assignment32 {

	void printAllChar(String input) {
		int uppercasecharcount = 0;
		int lowercasecharcount = 0;
		int digitscount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int temp = ch;
			if (temp >= 65 && temp <= 90) {
				uppercasecharcount++;
			} else if (temp >= 97 && temp <= 122) {
				lowercasecharcount++;
			} else if (temp >= 48 && temp <= 57) {
				digitscount++;
			}
		}
		System.out.println("UpperCase -> " + uppercasecharcount + "\nLowerCase ->" + lowercasecharcount + "\nDigit ->" + digitscount);
	}

	public static void main(String[] args) {
		Assignment32 assignment32 = new Assignment32();
		assignment32.printAllChar("TeCHNoc33r44editS");
	}
}