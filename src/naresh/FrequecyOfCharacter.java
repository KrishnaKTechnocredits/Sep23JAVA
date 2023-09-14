package naresh;

public class FrequecyOfCharacter {

	void frequecy(String input) {
		char charname;
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			charname = input.charAt(index);
			count = 0;
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (charname == input.charAt(innerIndex)) {
					count++;
				}

			}
			System.out.println(charname + "->" + count);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrequecyOfCharacter fre = new FrequecyOfCharacter();
		fre.frequecy("AAKANKSHA");
	}

}
