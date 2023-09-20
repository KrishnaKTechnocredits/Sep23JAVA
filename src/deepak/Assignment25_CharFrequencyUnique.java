/*Assingment - 25 : 18th Sep'2023
Print the freq of all character using nested for loop.
String str = "aakansha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1
*/
package deepak;

public class Assignment25_CharFrequencyUnique {
	void charFrequency(String input) {
		System.out.println("Input String: " + input);
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if (ch != '*') {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (input.charAt(innerIndex) == ch) {
						count++;
					}
				}
				System.out.println(ch + "->" + count);
				input = input.replace(ch, '*');
			}
		}
	}

	public static void main(String[] args) {
		Assignment25_CharFrequencyUnique charCount = new Assignment25_CharFrequencyUnique();
		charCount.charFrequency("aakanksha");
	}
}
