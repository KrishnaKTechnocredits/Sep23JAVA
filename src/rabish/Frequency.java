package rabish;

public class Frequency {

	void frequencyChar(String str, char ch) {
		int count = 0;

		for (int i = 0; i <= str.length() - 1; i++) {
			// System.out.println(str.charAt(i));
			if (str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("Frequency of " + ch + " = " + count);
		System.out.println("================================");
	}

	void reverseString(String input) {
		System.out.println("Reverse of " + input);
		for (int i = input.length() - 1; i >= 0; i--) {

			System.out.println(input.charAt(i));
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frequency count = new Frequency();
		count.frequencyChar("technocredits", 't');
		count.reverseString("techno");
	}

}
