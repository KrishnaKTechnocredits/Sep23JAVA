//Print the first non repeatative character using while loop.
//String str = "technocredits";
//output : h

package pushpa;

public class Assignment28 {

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

	public void printFirstNonRepeatativeChar(String str) {
		int i = 0;
		while (i < str.length()) {
			int freq = getCharFrequency(str, str.charAt(i));
			if (freq <= 1) {
				System.out.println(str.charAt(i));
				break;
			}
			i++;
		}
	}

	public static void main(String[] args) {
		Assignment28 firstNonRepeatativeCharacterInString = new Assignment28();
		firstNonRepeatativeCharacterInString.printFirstNonRepeatativeChar("technocredits");
	}

}
