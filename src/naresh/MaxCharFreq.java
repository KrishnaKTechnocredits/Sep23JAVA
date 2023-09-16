package naresh;

public class MaxCharFreq {

	int abc(String input, char ch) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {

			if (input.charAt(index) == ch) {
				count = count + 1;
			}
		}
		return count;
	}

	void Printmax(String input) {
		int maxFreq = 0;
		char maxChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int freq = abc(input, ch);
			if (maxFreq <= freq) {
				maxFreq = freq;
				maxChar = ch;
			}
		}
		System.out.println(input+"->"+maxChar + "->" + maxFreq);

	}

	public static void main(String[] args) {
		MaxCharFreq test = new MaxCharFreq();
		test.Printmax("aakanksha");
		test.Printmax("teecccchnoceredites");
	}
}
