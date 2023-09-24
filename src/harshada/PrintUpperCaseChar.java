//Assignment-30 : 22nd Sep'2023
//Write a method which takes input and return to return all Uppercase from given input.
//input : "TeCHNocreditS";
//output : TCHNS
//Hint : we can add characters in string like below.
//String output = "";
//output = output + str.charAt(index);

package harshada;

public class PrintUpperCaseChar {
	
	void getUpperChar(String input) {
		String output= "";
		
		for(int index=0; index<input.length(); index++) {
			char ch= input.charAt(index);
			
			if(Character.isUpperCase(ch)) {
				output=output+ch;
			}
		}
		System.out.println("output = "+ output);
	}
	
	public static void main(String[] args) {
		PrintUpperCaseChar printUpperCaseChar=new PrintUpperCaseChar();
		printUpperCaseChar.getUpperChar("TeCHNocreditS");
	}
}
