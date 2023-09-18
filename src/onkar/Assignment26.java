/*Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1 */

package onkar;

public class Assignment26 {
	
	void printFreq (String input) {
		while (input.length()>0) {
			int startLength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int endLength = input.length();
			System.out.println(ch+"-->"+(startLength-endLength));
		}
	}
	
	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		assignment26.printFreq("aakanksha");
	}
}
