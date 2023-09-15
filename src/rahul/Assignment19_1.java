/*Assignment-19 : 10th Sep'2023
1. Print the frequecy of given character from given String.
input : technocredits
        t*/

package rahul;

public class Assignment19_1 {

	void printFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("In string '" + input + "' frequency of '" + ch + "' is: " + count);
	}

	public static void main(String[] args) {
		Assignment19_1 assignment19_1 = new Assignment19_1();
		assignment19_1.printFrequency("techocredits", 't');
	}
}
