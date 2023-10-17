package pavan;

public class Assi20 {
	void processData(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (input.charAt(innerIndex) == ch) {
					count++;
				}
			}
			System.out.println(ch + "->" + count);
		}
	}

	public static void main(String[] args) {
		Assi20 assi20 = new Assi20();
		String input = "aakanksha";
		assi20.processData(input);
	}
}
