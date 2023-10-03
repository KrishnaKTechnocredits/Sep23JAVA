///WAP  to print a string from 1st repaeting vowels "e" to last repeating vowel "e".
//Input: "technocredits"
//Output: echnocr


package akshita;

public class FirstLastVowel {

	void display(String input) {
		String str="";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch == 'e') {
				str =input.substring(input.indexOf(ch),input.lastIndexOf(ch));
			}	
		}
		System.out.println("Output : " + str);
	}
	
	public static void main(String[] args) {
		FirstLastVowel firstLastVowel = new FirstLastVowel();
		System.out.println("print a string from 1st repaeting vowels 'e' to last repeating vowel ");
		String v1 = "technocredits";
		System.out.println("Input : " + v1);
		firstLastVowel.display(v1);
	}

}
