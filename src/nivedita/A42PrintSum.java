/* Assignment 42
WAp to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
  input:t1ecehnoecredit983
  output:1+9+8+3=21
 */

package nivedita;

public class A42PrintSum {
	
	
	void printSum(String input,char ch) {
		int f = input.indexOf(ch);
		int l = input.lastIndexOf(ch);
		int sum = 0;
		String output = input.substring(0, f)+input.substring(l);
			for(int index=0;index<output.length();index++) {
				char sh = output.charAt(index);
				if(Character.isDigit(sh)) {
				sum = sum +Character.getNumericValue(sh);
				}
			}
		System.out.println("sum of outer digit is " +sum);	
	}
	
	public static void main(String[] args) {
		A42PrintSum a42PrintSum = new A42PrintSum();
		a42PrintSum.printSum("t1ecehnoecredit983",'e');
	}

}
