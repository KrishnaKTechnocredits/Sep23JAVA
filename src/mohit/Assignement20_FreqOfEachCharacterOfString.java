package mohit;

public class Assignement20_FreqOfEachCharacterOfString {

	void printLengthOfEachCharachterOfString(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			for (int innerindex = 0; innerindex < input.length(); innerindex++) {
				if (input.charAt(innerindex) == ch) {
					count++;
				}
			}
			System.out.println(ch + "->" + count);
		}
	}

	public static void main(String[] args) {
		Assignement20_FreqOfEachCharacterOfString freqOfEachCharacterOfString = new Assignement20_FreqOfEachCharacterOfString();
		String input = "aakanksha";
		freqOfEachCharacterOfString.printLengthOfEachCharachterOfString(input);
	}

}
