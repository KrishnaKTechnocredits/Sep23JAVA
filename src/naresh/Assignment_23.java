package naresh;
/*
 * Write a program to find count of Uppercase, lowercase, digits and special
 * characters.
 * 
 * String str = "TecHNo_cR6ediTs"; output : Uppercase -> 5 Lowercase -> 8 Digit
 * -> 1 Special char count -> 1
 */
public class Assignment_23 {

	void upper(String input) {
		int ucount = 0;
		int lcount = 0;
		int dcount = 0;
		int scount = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isUpperCase(input.charAt(index))) {
				ucount++;
			} else if (Character.isLowerCase(input.charAt(index))) {
				lcount++;
			} else if (Character.isDigit(input.charAt(index))) {
				dcount++;
			} else {
				scount++;
			}
		}
		System.out.println("Upper case ->" + ucount);
		System.out.println("Lower case ->" + lcount);
		System.out.println("digit case ->" + dcount);
		System.out.println("Special Character ->" + scount);
	}

	public static void main(String[] args) {

		Assignment_23 a = new Assignment_23();
		a.upper("TecHNo_cR6ediTs");
	}
}

