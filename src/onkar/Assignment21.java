/*Write a program to find character having maximum frequency from given String.
input : aakanksha
output : aakanksha -> a -> 4

input : teecccchnoceredites
output : teecccchnoceredites -> e -> 5*/

package onkar;

public class Assignment21 {
	
	void findMaxCharFreq (String input) {
		char maxCh = ' ';
		int maxCount = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			int count = findCharCount(input, ch);
			if (count>maxCount) {
				maxCount = count;
				maxCh = ch;
			}
		}
		System.out.println("Character '"+maxCh+"' from String "+input+" is repeated maximum times i.e "+maxCount);
	}
	
	int findCharCount(String input, char ch) {
		int count=0;
		for (int innerIndex=0; innerIndex<input.length();innerIndex++) {
			if (input.charAt(innerIndex)==ch) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Assignment21 assignment21 = new Assignment21();
		assignment21.findMaxCharFreq("aakanksha");
		assignment21.findMaxCharFreq("teecccchnoceredites");
	}
}
