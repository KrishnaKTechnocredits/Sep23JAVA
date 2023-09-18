package yogesh;

public class Yogesh_Assignment29 {

	void lastNonRepetativeChar(String input) {
		while (input.length() > 0) {
			int orgLen = input.length();
			char ch = input.charAt(input.length() - 1);
			input = input.replace(input.valueOf(ch), "");
			int newLen = input.length();
			if (orgLen - newLen == 1) {
				System.out.println("Last non Repetative Char is-->" + ch);
				break;
			}
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment29 assignment29 = new Yogesh_Assignment29();
		assignment29.lastNonRepetativeChar("technocredits");
	}
}