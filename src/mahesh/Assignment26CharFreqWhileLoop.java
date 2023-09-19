/*Assingment - 26 : 18th Sep'2023 Print the freq of all character using while loop.
String str = "aakanksha";
 output : 
 a -> 4   
 k -> 2 
 n -> 1
 s -> 1    
 h -> 1 */

package mahesh;

public class Assignment26CharFreqWhileLoop {

	void printCharFreq(String input) {
		while (input.length() > 0) {
			int orglength = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int remainlength = input.length();
			System.out.println(ch + " --> " + (orglength - remainlength));
		}
	}

	public static void main(String[] args) {
		Assignment26CharFreqWhileLoop charFreq = new Assignment26CharFreqWhileLoop();
		charFreq.printCharFreq("aakanksha");
	}
}
