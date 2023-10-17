/*Assignment 42: 01-Oct-23
WAP to calculate sum of digits which are present outside of string i.e. 1st repeating vowel 'e' to last same 
repeating vowel 'e'
Input: t1ecehnoecredit983
Output: 1+9+8+3 = 21
*/
package roshani;

public class Ass42SumofDigit{
	
	String processString(String input){
		String output = "";
		for(int index = 0; index < input.length(); index++){
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				output = input.substring(0,input.indexOf(ch))+input.substring(input.lastIndexOf(ch)+1);
				break;
			}	
		}
		System.out.println("The substring is: "+output);
		return output;
	}	
		
	void digitSum(String input) {
		processString(input);
		int sum=0;
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			if(Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("The sum is: "+sum);
	}

	public static void main(String[] args) {
		Ass42SumofDigit assignment42 = new Ass42SumofDigit();
		assignment42.digitSum("t1ecehnoecredit983");
	}	
}