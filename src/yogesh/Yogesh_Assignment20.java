package yogesh;

public class Yogesh_Assignment20 {

	void freqOfEachChar(String input) {
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (input.charAt(innerIndex) == ch) {
					count++;
				}
			}
			System.out.println(input + "->" + ch + "->" + count);
		}
	}

	public static void main(String[] args) {
		Yogesh_Assignment20 assignment20 = new Yogesh_Assignment20();
		String index = "aakanksha";
		assignment20.freqOfEachChar(index);

	}
}

