package pavan;

public class Assi19 {
	void printLength(String input) {

		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(index + "->" + input.charAt(index));

		}
	}

	void process(String input) {
		int count = 0;
		char ch = 't';

		for (int index = input.length() - 1; index >= 0; index--) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of 't' is " + count);
	}

	public static void main(String[] args) {
		Assi19 assi19 = new Assi19();
		assi19.printLength("techno");
		assi19.process("technocredits");
	}
}
