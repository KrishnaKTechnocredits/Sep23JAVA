//Print the freq of first repeatative character using while loop.
//String str = "abcdcededffff";
//output : c -> 2

package pushpa;

public class Assignment27 {

	public int getCharFrequency(String str, char ch) {
		int count = 0;
		int i = 0;
		while (i < str.length()) {
			if (str.charAt(i) == ch)
				count++;
			i++;
		}
		return count;
	}

	public void printFirstRepeatativeChar(String str) {
		int i = 0;
		while (i < str.length()) {
			int freq = getCharFrequency(str, str.charAt(i));
			if (freq > 1) {
				System.out.println(str.charAt(i) + " -> " + freq);
				break;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Assignment27 firstRepeatativeCharacterInString = new Assignment27();
		firstRepeatativeCharacterInString.printFirstRepeatativeChar("abcdcededffff");
	}

}
