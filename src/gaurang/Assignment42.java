/*WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' 
 * to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21*/

package gaurang;

public class Assignment42 {

	void getSum(String input,char ch) {
		int initial = input.indexOf(ch);
		int last = input.lastIndexOf(ch);
		String update = input.substring(0,initial) + input.substring(last);
		int sum = 0;
		for (int index = 0; index<update.length();index++) {
			char dig = update.charAt(index);
			if (Character.isDigit(dig)) {
				sum = sum + Character.getNumericValue(dig);
			}
		}
		System.out.println("Required sum is "+sum);
	}
	
	public static void main(String[] args) {
		Assignment42 a = new Assignment42();
		a.getSum("t1ecehnoecredit983",'e');
	}
}
