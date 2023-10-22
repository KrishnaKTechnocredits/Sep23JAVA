/*WAP to get the vowels from the given string

String str = "technocredits";
output : eoei

String getVowels(String str){
	
}

output : technocredits -> eoei*/

package mohit;

public class Assignment_51 {
	void getVowels(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				output = output + ch;
			}
		}
		System.out.println("The vowels in " + input + " are " + output);
	}

	public static void main(String[] args) {
		Assignment_51 assignment_51 = new Assignment_51();
		String str = "technocredits";
		assignment_51.getVowels(str);
	}
}
