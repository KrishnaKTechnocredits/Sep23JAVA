/*Assignment-54 : 13th Oct'2023 Write a program to print non repetitive vowels included 
in the string, ensure sequence is maintained.
 String str = "aakaniksha eaep dube";
 output : iu
*/
package shrutika;

public class As54NonrepetiveVowel {

	void nonrepetiveVowel(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
					char cha = input.charAt(innerIndex);
					if (ch == cha)
						count++;
				}
			}
			if (count == 1)
				str = str + ch;
		}
		System.out.println("non repetitive vowels from given String -> " +str);
	}

	public static void main(String[] args) {
		As54NonrepetiveVowel as54NonrepetiveVowel = new As54NonrepetiveVowel();
		as54NonrepetiveVowel.nonrepetiveVowel("aakaniksha eaep dube");
	}
}
