/*WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21*/

package mohit;

public class Assignment_43 {
	void printString(String input, char ch) {
		int outerSum = 0;
		int innerSum = 0;
		String outerOutput = input.substring(0, input.indexOf(ch)) + input.substring(input.lastIndexOf(ch));
		String innerOutput = input.substring(input.indexOf(ch), input.lastIndexOf(ch));
		
		for (int index = 0; index < outerOutput.length(); index++) {
			char ch1 = outerOutput.charAt(index);
			if (Character.isDigit(ch1)) {
				outerSum = outerSum + Character.getNumericValue(ch1);
			}
		}
		for (int innerIndex = 0; innerIndex < innerOutput.length(); innerIndex++) {
			char ch2 = innerOutput.charAt(innerIndex);
			if (Character.isDigit(ch2)) {
				innerSum = innerSum + Character.getNumericValue(ch2);
			}
		}
		System.out.println("Inner sum is " + innerSum);
		System.out.println("outer sum is " + outerSum);

		System.out.println("diff of both inner and outer " + (outerSum - innerSum));

	}

	public static void main(String[] args) {
		Assignment_43 assignment_43 = new Assignment_43();
		assignment_43.printString("t1ec5ehno4e7credit983", 'e');
	}
}
