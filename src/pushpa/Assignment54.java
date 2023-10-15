//Write a program to return unique vowels included in the string, ensure sequence is maintained.
//String str = "aakaniksha eaep dube";
//output : iu

package pushpa;

public class Assignment54 {

	public String getUniqueVowels(String input) {
		String uniqueVowels = "";
		int i = 0;
		while (i < input.length()) {
			Character ch = input.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				if (input.indexOf(ch) == input.lastIndexOf(ch))
					uniqueVowels += ch;
			}
			i++;
		}

		return uniqueVowels;
	}

	public static void main(String[] args) {
		Assignment54 assignment54 = new Assignment54();
		String result = assignment54.getUniqueVowels("aakaniksha eaep dube");
		System.out.println("Unique Vowls in String: " + result);
	}

}
