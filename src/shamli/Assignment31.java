/*
 * Assignment-31 : 23nd Sep'2023 
Write a method which takes input and return all Uppercase from given input using ascii.

input : "TeCHNocreditS";
output : TCHNS
 */

package shamli;

public class Assignment31 {
	
	String returnUpperCaseString(String input) {
		System.out.println("Input string is :"+input);
		String output="";
		for(int index=0;index<input.length();index++) {
			char ch=input.charAt(index);
			int temp=ch;
			if(temp>=65 && temp<=90) {
				output=output+ch;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Assignment31 assignment31=new Assignment31();
		String output=assignment31.returnUpperCaseString("TeCHNocreditS");
		System.out.println("Uppercase String is:"+output);

	}

}
