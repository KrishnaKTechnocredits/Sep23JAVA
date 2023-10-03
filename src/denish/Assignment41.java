package denish;

public class Assignment41 {

	void processData(String input) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count = index;
				break;
			}
		}
		String update = input.substring(count);
		System.out.println("Output is " + update);
	}

	public static void main(String[] args) {
		Assignment41 a = new Assignment41();
		a.processData("pqrabcgtyes");
	}
}
