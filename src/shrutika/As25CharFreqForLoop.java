/*Assingment - 25 : 18th Sep'2023
Print the freq of all character using nested for loop.
String str = "aakanksha";
output : a -> 4
         k -> 2
		 n -> 1 
		 s -> 1
         h -> 1*/
package shrutika;

public class As25CharFreqForLoop {

	void charFreq(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if (ch != '*') {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (ch == input.charAt(innerIndex)) {
						count++;
					}
				}
				input = input.replace(ch, '*');
				System.out.println(ch + " -> " + count);
			}
		}
	}

	public static void main(String[] args) {
		As25CharFreqForLoop charFreqForLoop = new As25CharFreqForLoop();
		charFreqForLoop.charFreq("aakanksha");
	}
}
