/*WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21*/

package onkar;

public class Assignment42 {
	
	void addNum (String input) {
		int sum = 0;
		
		String output = input.substring(0, input.indexOf('e')) + input.substring(input.lastIndexOf('e'));
		for (int index=0; index<output.length(); index++) {
			char ch = output.charAt(index);
			if (Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();
		assignment42.addNum("t1ecehnoecredit983");
	}
}
