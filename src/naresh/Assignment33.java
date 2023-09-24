package naresh;

public class Assignment33 {

	String m1(String input) {
		String digits = "";

		String upper = "";
		String lower = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch)) {
				digits = digits + ch;

			} else if (Character.isLowerCase(ch)) {
				lower = lower + ch;
			} else if (Character.isUpperCase(ch)) {
				upper = upper + ch;
			}
		}
		String output = digits + lower + upper;
		return output;
	}

	public static void main(String[] args) {
		Assignment33 assignment33 = new Assignment33();
		System.out.println(assignment33.m1("TeCHNoc33r44editS"));

	}
}

