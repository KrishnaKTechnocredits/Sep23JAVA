/*Assignment-32 : 23nd Sep'2023 Write a method to print number of
  Uppercase,lowercase and digits in the input.
 input : "TeCHNoc33r44editS"; output : 
 Uppercase -> 5    
 Lowercase -> 8
 Digit -> 4 */

package swati;

class Ass32PrintUppLowDigInInput {

	void printAllChar(String input) {
		int uppercasecount = 0;
		int lowercasecount = 0;
		int digitcasecount = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int temp = ch;
			if (temp >= 65 && temp <= 90) {
				uppercasecount++;
			} else if (temp >= 97 && temp <= 122) {
				lowercasecount++;
			} else if (temp >= 48 && temp <= 57) {
				digitcasecount++;
			}
		}
		System.out.println("UpperCase -> " + uppercasecount + "\nLowerCase ->" + lowercasecount + "\nDigit ->" + digitcasecount);
	}

	public static void main(String[] args) {
		Ass32PrintUppLowDigInInput ass32printupplowdigininput = new Ass32PrintUppLowDigInInput();
		ass32printupplowdigininput.printAllChar("TeCHNoc33r44editS");
	}
}
