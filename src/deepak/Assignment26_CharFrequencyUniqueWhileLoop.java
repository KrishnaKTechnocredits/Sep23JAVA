/*Assingment - 26 : 18th Sep'2023
Print the freq of all character using while loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1 

*/
package deepak;

public class Assignment26_CharFrequencyUniqueWhileLoop {
	void charFrequency(String input) {
		System.out.println("Input String: " + input);
		while (input.length() > 0) {
			int oLen = input.length();
			char ch = input.charAt(0);
			input = input.replace(String.valueOf(ch), "");
			int nLen = input.length();
			System.out.println(ch + " -> " + (oLen - nLen));
		}
	}

	public static void main(String[] args) {
		Assignment26_CharFrequencyUniqueWhileLoop charCount = new Assignment26_CharFrequencyUniqueWhileLoop();
		charCount.charFrequency("aakanksha");
	}
}
