/*WAp to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
 * input:t1ecehnoecredit983
 * output:1+9+8+3=21
 */

package hetal;

public class Assignment42 {
	
	
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
		Assignment42 a = new Assignment42();
		a.printSum("t1ecehnoecredit983",'e');
	}

}
