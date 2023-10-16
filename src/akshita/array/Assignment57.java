//WAP to print consonants from given string and count of consonant and vowels from given string
//Input: technocredits

package akshita.array;

public class Assignment57 {

	void cons(String input) {
		String output = "";
		int count = 0;
		int count1 = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			} else {
				output = output + ch;
				count1++;
			}
		}
		System.out.println("Consonants from the given string : " + output);
		System.out.println("Count of vowels : " + count);
		System.out.println("Count of Consonants  : " + count1);
	}

	public static void main(String[] args) {
		Assignment57 assg57 = new Assignment57();
		String input = "technocredits";
		System.out.println("Input : " + input);
		assg57.cons(input);
	}
}
