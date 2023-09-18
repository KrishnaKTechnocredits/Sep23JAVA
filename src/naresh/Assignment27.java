package naresh;

public class Assignment27 {

	void freqOfFirstRepeatativeCharacter(String input) {
		while (input.length() > 0) {
			char ch = input.charAt(0);
			int orglen = input.length();
			input = input.replace(String.valueOf(ch), "");
			int newlen = input.length();
			if (orglen - newlen > 1) {
				System.out.println(ch + "->" + (orglen - newlen));

				break;
			}
		}

	}

	public static void main(String[] args) {
		Assignment27 a = new Assignment27();
		a.freqOfFirstRepeatativeCharacter("abcdcededffff");

	}

}
