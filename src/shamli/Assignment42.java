/*Assignment 42: 01-Oct-23
WAP to calculate sum of digits which are present outside of string 
i.e. 1st repeating vowel 'e' to last same repeating vowel 'e'
Input: 5t1ecehnoecredit983
Output: 1+9+8+3 = 21*/

package shamli;


public class Assignment42 {
	
	String processString(String input) {
		System.out.println("Input :"+input);
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U') {
				output=input.substring(0, input.indexOf(ch))+input.substring(input.lastIndexOf(ch)+1);
				break;
			}
		}
		return output;
	}
	
	void sumOfDigits(String input) {
		processString("5t1ecehnoecredit983");
		int sum=0;
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			if(Character.isDigit(ch)) {
				sum=sum+Character.getNumericValue(ch);
			}
		}
		System.out.println("Digit Sum is :"+sum);
	}

	public static void main(String[] args) {
		Assignment42 assignment42 = new Assignment42();
		assignment42.sumOfDigits("5t1ecehnoecredit983");

	}
}