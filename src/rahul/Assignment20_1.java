/*Assignment-20 : 12th Sep'2023

Write a program to print frequency of each character from given String.
input : aakanksha
output : 
a->4
a->4
k->2
a->4
n->1
k->2
s->1
h->1
a->4*/

package rahul;

public class Assignment20_1 {

	void printFreqForSingleChar(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println(ch + " -> " + count);
	}

	void printAllCharFreq(String input) {
		char ch = ' ';
		for (int index = 0; index < input.length(); index++) {
			ch = input.charAt(index);
			printFreqForSingleChar(input, ch);
		}
	}

	public static void main(String[] args) {
		Assignment20_1 assignment20_1 = new Assignment20_1();
		assignment20_1.printAllCharFreq("aakanksha");
	}
}
