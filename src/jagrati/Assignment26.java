/*
 Assingment - 26 : 18th Sep'2023
Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1 
 */

package jagrati;

public class Assignment26 {
	
	void whileLoop(String input) {
		while(input.length()>0) {
			int orgLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int newLength = input.length();
			System.out.println(ch + " --> " + (orgLength-newLength));
		}
	}
	public static void main(String[] args) {
		Assignment26 assign = new Assignment26();
		assign.whileLoop("aakansha");
	}
}	
