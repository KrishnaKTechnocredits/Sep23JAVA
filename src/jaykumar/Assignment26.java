/*Assingment - 26 : 18th Sep'2023
Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1 */

package jaykumar;

public class Assignment26 {
	
	void allCharFreq(String input) {
		while(input.length()!=0) {
			int originalLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch),"");
			int newLength = input.length();
			System.out.println(ch+" -> "+(originalLength-newLength));
		}
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.allCharFreq("aakanskha");
	}
}
