package denish;

public class Assignment21 {

	int getCharFrequency(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (ch == input.charAt(index))
			count++;
		}
		return count;
	}
		
	void maxCharacter(String input) {
		int maxFreq = 0;
		char maxChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int freq = getCharFrequency(input, ch);
			if (maxFreq < freq) {
				maxFreq = freq;
				maxChar = ch;
			}
		}

		System.out.println(input + "->" + maxChar + "->" + maxFreq);

	}

	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.maxCharacter("aakanksha");
		assignment21.maxCharacter("teecccchnoceredites");
	}
}
