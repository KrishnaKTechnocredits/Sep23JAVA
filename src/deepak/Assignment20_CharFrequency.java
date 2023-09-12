/*Write a program to print frequency of each character from given String.
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
*/
package deepak;

class CharFrequency {
	void allCharFrequency(String input) {
		System.out.println("Input String: " + input);

		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (input.charAt(innerIndex) == ch) {
					count++;
				}
			}
			System.out.println(ch + " -> " + count);
		}
	}

	public static void main(String[] args) {
		CharFrequency charCount = new CharFrequency();
		charCount.allCharFrequency("aakanksha");
	}
}