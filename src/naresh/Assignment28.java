package naresh;

public class Assignment28 {

	void freqOfFirstNonRepeatativeCharacter(String input) {
		while (input.length() > 0) {
			char ch = input.charAt(0);
			int orglen = input.length();
			input = input.replace(String.valueOf(ch), "");
			int newlen = input.length();
			if (orglen - newlen < 2) {
				System.out.println(ch + "->" + (orglen - newlen));

				break;
			}
		}

	}

	public static void main(String[] args) {
		Assignment28 a = new Assignment28();
		a.freqOfFirstNonRepeatativeCharacter("technocredits");

	}

}
