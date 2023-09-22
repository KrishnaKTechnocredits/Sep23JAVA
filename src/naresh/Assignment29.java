package naresh;

public class Assignment29 {
	void lastNonRepeatativeCharacter(String input) {

		while (input.length() > 0) {
			char ch = input.charAt(input.length() - 1);
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
		Assignment29 a = new Assignment29();
		a.lastNonRepeatativeCharacter("technocredits");

	}

}
