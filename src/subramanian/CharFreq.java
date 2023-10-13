package subramanium;

public class CharFreq {

	void printInputCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			System.out.println("Value at index" + index + " is " + input.charAt(index));
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of char " + ch + " is " + count);
	}

	public static void main(String[] args) {
		CharFreq charFreq = new CharFreq();
		charFreq.printInputCharFreq("David", 'd');
		System.out.println("====================");
		charFreq.printInputCharFreq("subramanian", 'a');

	}

}
