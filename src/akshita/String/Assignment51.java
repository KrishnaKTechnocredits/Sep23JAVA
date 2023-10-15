//WAP to write vowels from string
//Input: "technocredits"
//Output: eoei

package akshita.String;

public class Assignment51 {

	void vowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		System.out.println("Output : " + output);
	}

	public static void main(String[] args) {
		Assignment51 ass51 = new Assignment51();
		String input = "technocredits";
		System.out.println("input : " + input);
		ass51.vowels(input);
	}
}
