package subramanian;

public class Assignment_22 {

	void uniqueChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Assignment_22 assignment_22 = new Assignment_22();
		String input = "technocredit";
		assignment_22.uniqueChar(input);
		System.out.println();
		System.out.println("==================");
		System.out.println("First Index of t in " + input + " is " + input.indexOf('t'));
		System.out.println("Last Index of t in " + input + " is " + input.lastIndexOf('t'));
	}

}
