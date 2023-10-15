//WAP to print count of vowels
//Input: technocredits
//Output : 4

package array;

public class Assignment52 {

	void countOfVowels(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}
		System.out.println("Count of Vowels : " + count);
	}
	public static void main(String[] args) {
		Assignment52 ass52 = new Assignment52();
		String input = "technocredits";
		System.out.println("Input : " + input);
		ass52.countOfVowels(input);
	}
}
