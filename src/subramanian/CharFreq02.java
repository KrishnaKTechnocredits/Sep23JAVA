package subramanian;

public class CharFreq02 {

	void printCharFreq(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if (ch != '*') {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					if (ch == input.charAt(innerIndex)) {
						count++;
					}
				}System.out.println(ch + "-->" + count);
				input = input.replace(ch, '*');
			}
		}
	}
	
	public static void main(String[] args) {
		CharFreq02 charFreq02 = new CharFreq02();
		charFreq02.printCharFreq("aakanksha");

	}

}
