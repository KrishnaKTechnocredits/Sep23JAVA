package denish;

public class Assignment39 {

	void processData(String input) {
		String str = "";

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isUpperCase(ch)) {
				char upper = Character.toLowerCase(ch);
				str = str + upper;
			} else if (Character.isLowerCase(ch)) {
				char lower = Character.toUpperCase(ch);
				str = str + lower;
			} else {
				str = str + ch;
			}
		}
		System.out.println("Reverse order is " + str);
	}

	public static void main(String[] args) {
		Assignment39 assignment39 = new Assignment39();
		assignment39.processData("Yo7GEsH");
	}
}
