/*Assignment-21 : 13th Sep'2023
Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5
*/
package deepak;

class Assignment21_MaxFrequency {
	int getCharFrequency(String input, char ch) {
		int rCount = 0;
		for (int index = 0; index < input.length(); index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < input.length(); innerIndex++) {
				if (ch == input.charAt(innerIndex)) {
					count++;
				}
			}
			rCount = count;
			// System.out.println(count);
		}
		return rCount;
	}

	void getMaxCharCount(String input) {
		int count = 0;
		int max = 0;
		char maxChar = ' ';
		System.out.println("Input: " + input);
		for (int index = 0; index < input.length(); index++) {
			count = getCharFrequency(input, input.charAt(index));
			if (max < count) {
				max = count;
				maxChar = input.charAt(index);
			}
		}
		System.out.println("Character with maximum frequecy in the string: " + '"' + input + '"' + " is " + "" + '"'
				+ maxChar + '"' + " and is occuring " + max + " times.");
	}

	public static void main(String[] args) {
		Assignment21_MaxFrequency maxCount = new Assignment21_MaxFrequency();
		maxCount.getMaxCharCount("aakanksha");
		maxCount.getMaxCharCount("teecccchnocteredites");
	}
}