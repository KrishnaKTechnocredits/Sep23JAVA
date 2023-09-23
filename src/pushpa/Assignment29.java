//Print the last non repeatative character using while loop.
//String str = "technocredits";
//output : h	

package pushpa;

public class Assignment29 {

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

	public void printLastNonRepeatativeChar(String str) {
		int i = 0;
		char lastNonRepeChar = 0;
		while (i < str.length()) {
			int freq = getCharFrequency(str, str.charAt(i));
			if (freq <= 1) {
				lastNonRepeChar = str.charAt(i);
			}
			i++;
		}
		System.out.println(lastNonRepeChar);

	}

	public static void main(String[] args) {
		Assignment29 lastNonRepeatativeCharacterInString = new Assignment29();
		lastNonRepeatativeCharacterInString.printLastNonRepeatativeChar("technocredits");
	}

}
