/*Assingment - 25 : 18th Sep'2023 Print the freq of all character using nested for loop.
String str = "aakansha"; 
output : a -> 4      
k -> 2
n -> 1 
s -> 1    
h -> 1*/

package swati;

public class Ass25PrintFreqOfCharUsingForLoop {

	void printCharFrequency(String input) {
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
		new Ass25PrintFreqOfCharUsingForLoop().printCharFrequency("aakanksha");
	}
}
