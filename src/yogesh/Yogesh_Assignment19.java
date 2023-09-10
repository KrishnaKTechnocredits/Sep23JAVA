package yogesh;

public class Yogesh_Assignment19 {

	void revlength(String input) {
		for (int index = input.length() - 1; index >= 0; index--) {
			System.out.println(index + "->" + input.charAt(index));
		}
	}

	void freq(String input, char ch) {
		int count = 0;
		System.out.println("================================");
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " is " + count);
	}

	public static void main(String[] args) {
		Yogesh_Assignment19 assignment19 = new Yogesh_Assignment19();
		assignment19.revlength("techno");
		assignment19.freq("technocredits", 't');
	}
}
