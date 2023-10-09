/*WAP to calculate difference of outer sum (t1+dit983) - inner sum (i.e. 1st repeating vowel 'e' to last same repeating vowel 'e' )
Input: t1ec5ehno4e7credit983
Output: 
Inner sum: e->e : 5+4+7 = 16
Outer sum: t1+dit983 : 1+9+8+3 = 21*/

package onkar;

public class Assignment43 {
	String outerString;
	String innerString; 
	int sum;
	
	void findStringSum (String input) {
		outerString = input.substring(0, input.indexOf('e')) + input.substring(input.lastIndexOf('e'));
		innerString = input.substring(input.indexOf('e')+1, input.lastIndexOf('e'));
		calSum(innerString);
		System.out.println("Inner sum: "+sum);
		calSum(outerString);
		System.out.println("Outer sum: "+sum);
	}
	
	void calSum (String input) {
		sum = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				sum += Character.getNumericValue(ch);
		}
	}
	
	public static void main(String[] args) {
		Assignment43 assignment43 = new Assignment43();
		assignment43.findStringSum("t1ec5ehno4e7credit983");
	}
}
