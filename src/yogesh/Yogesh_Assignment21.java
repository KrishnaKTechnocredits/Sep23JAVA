package yogesh;

public class Yogesh_Assignment21 {

	int getCharFreq(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		return count;
	}

	void printMaxFreq(String input) {
		int maxFreq = 0;
		char maxChar = ' ';
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int freq = getCharFreq(input, ch);
			if (maxFreq < freq) {
				maxFreq = freq;
				maxChar = ch;
			}
		}
		System.out.println(input + " -> " + maxChar + " -> " + maxFreq);
	}

	public static void main(String[] args) {
		Yogesh_Assignment21 assignment21 = new Yogesh_Assignment21();
		assignment21.printMaxFreq("aakanksha");
		assignment21.printMaxFreq("teeccnoooocrrreeedits");
	}
}