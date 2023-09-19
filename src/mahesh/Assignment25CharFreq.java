/*Assingment - 25 : 18th Sep'2023 Print the freq of all character using nested for loop.
String str = "aakanksha"; 
output : a -> 4      
k -> 2
n -> 1 
s -> 1    
h -> 1 */

package mahesh;

public class Assignment25CharFreq {

	void printCharFreq(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
			if (ch != '*') {
				for (int innerindex = 0; innerindex < input.length(); innerindex++) {
					if (input.charAt(innerindex) == ch) {
						count++;
					}
				}
				System.out.println(ch + " -> " + count);
				input = input.replace(ch, '*');
			}
		}
	}

	public static void main(String[] args) {
		Assignment25CharFreq charFreq = new Assignment25CharFreq();
		charFreq.printCharFreq("aakanksha");
	}
}