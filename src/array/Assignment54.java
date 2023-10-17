//WAP to return non repetitive vowels from string
//"aakanikshaea epdube"
//Output: iu

package array;

import java.util.Arrays;

public class Assignment54 {

	void nonRepetative(String input) {
		String output = "";
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (input.indexOf(ch) == input.lastIndexOf(ch)) {
					output = output + ch;
				}
			}
		}
		System.out.println("Output : " + output);
	}

	public static void main(String[] args) {
		Assignment54 ass54 = new Assignment54();
		System.out.println("Return non repetitive vowels from string");
		String input = "aakanikshaea epdube";
		System.out.println("Input :" + input);
		ass54.nonRepetative(input);
	}
}
