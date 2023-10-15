//WAP to return unique vowels from string
//"aakanikshaea epdube"
//Output: aieu
package array;

public class Assignment53 {

	void uniqueVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
				input = input.replace(input.valueOf(ch), "");
			}
		}
		System.out.println("Output : " +output);
	}

	public static void main(String[] args) {
		Assignment53 ass53 = new Assignment53();
		String input = "aakanikshaea123ABC epdube";
		System.out.println("Input : " + input);
		ass53.uniqueVowels(input);
	}
}
