/*WAP to get the vowels from the given string

String str = "technocredits";
output : eoei

String getVowels(String str){
	
}

output : technocredits -> eoei*/

package onkar;

public class Assignment51 {
	
	void getVovels (String input) {
		String output = "";
		for (int index=0; index<input.length(); index++) {
			char ch = input.charAt(index);
			if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				output += ch;
		}
		System.out.println(input+" -> "+output);
	}
	
	public static void main(String[] args) {
		new Assignment51().getVovels("technocredits");
	}
}
