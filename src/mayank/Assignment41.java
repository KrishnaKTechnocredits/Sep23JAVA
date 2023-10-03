//Assignment 41: 01-Oct-23
//WAP to print a string from 1st vowel
//Input: pqrabcgtyes
//Output: abcgtres

package mayank;

public class Assignment41 {
		
		void firstStringVowel(String input) {
			String output = "";
			int vowel = 0;
			for (int index =0; index < input.length(); index++) {
				char ch = input.charAt(index);
				if(ch == 'a' || ch == 'A' || ch =='E' || ch =='e' || ch == 'I' || ch =='i'|| ch == 'O' || ch == 'o' || ch == 'U'|| ch == 'u') {
					vowel = input.indexOf(ch);
					output = input.substring(vowel);
					break;
					
				}
			}
			System.out.println(output);
		}

		public static void main(String[] args) {
			Assignment41 assignment41 = new Assignment41();
			assignment41.firstStringVowel("pqrabcgtyes");
		}
}

