package subramanian;

public class Assignment19 {

	void printLengthOfGivenString(String input) {

		System.out.println("length of "+input+ " is " + input.length());

		for (int index = 0; index < input.length(); index++) {
			System.out.println(index + " > " + input.charAt(index));
		}
	}

	void printLengthOfGivenStringRev(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(index + " > " + input.charAt(index));
		}
	}

	public static void main(String[] args) {
		Assignment19 assignment19 = new Assignment19();
		assignment19.printLengthOfGivenString("subramanian");
		System.out.println("==========================");
		assignment19.printLengthOfGivenStringRev("subramanian");

	}

}
