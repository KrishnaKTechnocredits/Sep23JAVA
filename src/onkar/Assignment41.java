/*WAP to print a string from 1st vowel
Input: pqrabcgtyes
Output: abcgtyes*/

package onkar;

public class Assignment41 {
	
	void processString (String input) {
		int num = 0;
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				num = index;
				break;
			}
		}
		String output = input.substring(num);
		System.out.println(output);
	}
	
	public static void main(String[] args) {
		Assignment41 assignment41 = new Assignment41();
		assignment41.processString("pqrabcgtyes");
	}
}
