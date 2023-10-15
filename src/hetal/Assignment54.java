//*Write a program to return unique (non-repeated) vowels included in the string, ensure sequence is maintained.
//*String str = "aakaniksha eaep dube";
//*output : iu

package hetal;

public class Assignment54 {

	void printNonRepeatVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			int count = 0;
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				for (int innerindex = 0; innerindex < input.length(); innerindex++) {
					if (input.charAt(innerindex) == ch) {
						count++;
					}
				}
				if (count == 1) {
					output = output + ch;
				}
			}
		}
		System.out.println("non repeated vowels in given string--->"+output);
	}

	public static void main(String[] args) {
		Assignment54 a = new Assignment54();
		a.printNonRepeatVowels("aakaniksha eaep dube");
	}

}
