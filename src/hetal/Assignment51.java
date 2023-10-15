//*WAP to print vowels in the given String
//*String str = "technocredits";
//*output : eoei


package hetal;

public class Assignment51 {
	
	void printVowels(String input) {
		String output = "";
		for(int index=0;index<input.length();index++) {
			char ch = input.charAt(index);
			if(ch == 'a' || ch == 'e' || ch == 'i'|| ch == 'o'|| ch == 'u') {
				output = output + ch;
			}
		}
		System.out.println("vowels of given string is -->" + output);
	}
	
	public static void main (String[] args) {
		Assignment51 assignment51 = new Assignment51();
		assignment51.printVowels("technocredits");
	}

}
