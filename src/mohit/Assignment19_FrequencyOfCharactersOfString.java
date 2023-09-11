package mohit;

public class Assignment19_FrequencyOfCharactersOfString {

	void printReverseOrderString(String input) {
		for (int index = input.length()-1; index>=0; index--) {
			System.out.println(input.charAt(index));
		}
	}

	void printFrequencyOfCharactersOfString(String input, char ch) {
		int count = 0;
		for (int index = input.length() - 1; index >= 0; index--) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("frequency of 't' is " + count);
	}

	public static void main(String[] args) {
		Assignment19_FrequencyOfCharactersOfString assignment19_FrequencyOfCharactersOfString = new Assignment19_FrequencyOfCharactersOfString();
		assignment19_FrequencyOfCharactersOfString.printFrequencyOfCharactersOfString("technocredits",'t');
		System.out.println("---------------**------------------------------");
		assignment19_FrequencyOfCharactersOfString.printReverseOrderString("techno");
	}
}
