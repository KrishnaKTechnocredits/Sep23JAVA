//WAP to print a string from 1st vowel
//Input: pqrabcgtyes
//Output: abcgtres

package pushpa;

public class Assignment41 {

	public void printStringFromFirstVowel(String str) {
		System.out.println("String is: "+str);
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
					|| ch == 'O' || ch == 'U') {
				System.out.println("String from first vowel: " + str.substring(i));
				break;
			}
		}

	}

	public static void main(String[] args) {
		Assignment41 assignment41 = new Assignment41();
		assignment41.printStringFromFirstVowel("pqrabcgtyes");
	}

}
