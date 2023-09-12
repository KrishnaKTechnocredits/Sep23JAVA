package deepak;

public class Assignment20_CharFrequency {
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
		// TODO Auto-generated method stub
		Assignment2_CharFrequencyOLD charCount = new Assignment2_CharFrequencyOLD();
		charCount.allCharFrequency("aakanksha");
	}

}
