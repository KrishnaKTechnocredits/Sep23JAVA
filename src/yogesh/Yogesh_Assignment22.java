package yogesh;

public class Yogesh_Assignment22 {

	void nonRepetativeChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == input.lastIndexOf(ch)) {
				System.out.print(ch);
			}
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment22 assignment22 = new Yogesh_Assignment22();
		assignment22.nonRepetativeChar("technocredits");
	}
}
