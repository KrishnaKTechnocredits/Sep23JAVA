//WAP to print a string from 1st vowels
//Input: pqrabcgtyes
//Output: abcgtyes

package akshita;

public class String1Vowels {

	String display(String input) {
		String str = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'i' || ch == 'o' || ch == 'e' || ch == 'u') {
				str = str + input.substring(index);
				break;
			}
		}
		return str;
	}

	public static void main(String[] args) {
		String1Vowels string1Vowels = new String1Vowels();
		System.out.println("Print a string from 1st vowels");
		String v1 = "pqrabcgtyes";
		String output = string1Vowels.display(v1);
		System.out.println("Input : " + v1);
		System.out.println("Output : " + output);
	}
}
