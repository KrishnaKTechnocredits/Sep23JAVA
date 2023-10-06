/*Assignment 42: 01-Oct-23
WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21
 */


package jagrati;

public class Assignment48 {
	
	void characterVowel(String input){
		System.out.println("Input of program is - t1ecehnoecredit983");
			int firstIndex = input.indexOf('e');
			int lastIndex = input.lastIndexOf('e')+1;
			System.out.println("First out of program is " + (input.substring(0, firstIndex)+input.substring(lastIndex)));
		}
		
	void sumDigit(String input) {
		int sum =0;
		for(int index=0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isDigit(ch)){
				sum = sum + Character.getNumericValue(ch);
			}
		}System.out.println("Second out of program is " + sum);
	
	}
	public static void main(String[] args) {
		Assignment48 assign = new Assignment48();
		assign.characterVowel("t1ecehnoecredit983");
		assign.sumDigit("t1ecehnoecredit983");
		 
	}
}
